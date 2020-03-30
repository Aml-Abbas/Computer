package command;

import address.Address;
import computer.Counter;
import memory.Memory;
import word.Word;

abstract public class Operation implements Command {
   Object ob1,ob2;
   Address address;

    Operation(Address address1, Address address2, Address address){
        this.ob1= address1;
        this.ob2= address2;
        this.address=address;
    }
    Operation(Word w1, Word w2, Address address){
        this.ob1=w1;
        this.ob2=w2;
        this.address=address;
    }
    Operation(Address address1, Word w2, Address address){
        this.ob1= address1;
        this.ob2=w2;
        this.address=address;
    }
    Operation(Word w1, Address address2, Address address){
        this.ob1=w1;
        this.ob2=address2;
        this.address=address;
    }

    @Override
    public void execute(Counter counter, Memory memory) {
        long nbr1, nbr2;
        if (ob1 instanceof Address){
            nbr1= ((Address) ob1).getValue(memory);
        }else {
            nbr1= ((Word) ob1).getValue();
        }
        if (ob2 instanceof Address){
            nbr2= ((Address) ob2).getValue(memory);
        }else {
            nbr2= ((Word) ob2).getValue();
        }
        long result= getOperation(nbr1,nbr2);
        address.setValue(result, memory);

        counter.increaseCounter();

    }

    @Override
    public String toString() {

        String object1="", object2="";
        if (ob1 instanceof Address){
            object1+="["+((Address) ob1).getIndex()+"]";
        }else {
            object1+=((Word) ob2).getValue();
        }
        if (ob2 instanceof Address){
            object2+="["+((Address) ob2).getIndex()+"]";
        }else {
            object2+= ((Word) ob2).getValue();
        }

        return getString()+object1+" "+object2+" "+"["+address.getIndex()+"]";
    }
    protected abstract String getString();
    protected abstract long getOperation(long nbr1, long nbr2);

}
