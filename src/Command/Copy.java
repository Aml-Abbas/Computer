package Command;

import Address.Address;
import Computer.Counter;
import Memory.Memory;
import Word.Word;

public class Copy implements Command {
    Object ob;
    Address address;

    public Copy(Address ob, Address address){
    this.ob= ob;
    this.address= address;
    }
    public Copy(Word ob, Address address){
        this.ob= ob;
        this.address= address;
    }

    @Override
    public void execute(Counter counter, Memory memory) {
        long nbr;
        if (ob instanceof Address){
            nbr= ((Address) ob).getValue(memory);
        }else {
            nbr= ((Word) ob).getValue();
        }
        address.setValue(nbr, memory);

        counter.increaseCounter();
    }
    @Override
    public String toString() {
        String object="";
        if (ob instanceof Address){
            object+="["+((Address) ob).getIndex()+"]";
        }else {
            object+=((Word) ob).getValue();
        }

        return "CPY "+object+" ["+address.getIndex()+"]";
    }
}
