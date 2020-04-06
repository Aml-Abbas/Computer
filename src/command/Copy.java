package command;

import Operand.Address;
import Operand.Operand;
import computer.Computer;
import computer.Memory;

public class Copy implements Instruktion {
   private Operand op;
    private Address address;

    public Copy(Operand op, Address address){
    this.op= op;
    this.address= address;
    }


    @Override
    public void execute(Computer computer, Memory memory) {
        memory.setWord(address.getIndex(), op.getWord(memory));
        computer.increaseCounter();
    }
    @Override
    public String toString() {
        String object= op.toString();
        return "CPY "+object+" "+address.toString();
    }
}

