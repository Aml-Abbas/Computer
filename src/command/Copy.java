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
        Word nbr= op.getWord(memory);
        address.setWord(nbr, memory);

        counter.increaseCounter();
    }
    @Override
    public String toString() {
        String object= op.toString();
        return "CPY "+object+" ["+address.getIndex()+"]";
    }
}
