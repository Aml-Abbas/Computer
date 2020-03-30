package Command;

import Address.Address;
import Computer.Counter;
import Memory.Memory;
import Word.Word;

public class JumpEq implements Command {
    int toCommand;
    Object ob1,ob2;

    public JumpEq(int toCommand, Address ob1, Address ob2){
        this.toCommand=toCommand;
        this.ob1=ob1;
        this.ob2=ob2;
    }
    public JumpEq(int toCommand, Address ob1, Word ob2){
        this.toCommand=toCommand;
        this.ob1=ob1;
        this.ob2=ob2;
    }
    public JumpEq(int toCommand, Word ob1, Word ob2){
        this.toCommand=toCommand;
        this.ob1=ob1;
        this.ob2=ob2;
    }
    public JumpEq(int toCommand, Word ob1, Address ob2){
        this.toCommand=toCommand;
        this.ob1=ob1;
        this.ob2=ob2;
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
        if (nbr1==nbr2){
            counter.setCounter(toCommand);
        }else {
            counter.increaseCounter();
        }
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

        return "JEQ "+toCommand+" "+object1+" "+object2;
    }
}
