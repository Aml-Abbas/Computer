package command;

import Operand.Address;
import Operand.Operand;
import computer.Counter;
import computer.Memory;
import Operand.Word;

public class Copy implements Instruktion {
    Operand op;
    Address address;

    public Copy(Operand op, Address address){
    this.op= op;
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
