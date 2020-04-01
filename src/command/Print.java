package command;

import Operand.Address;
import computer.Counter;
import computer.Memory;

public class Print implements Instruktion {
    Address address;

    public Print(Address address){
        this.address=address;
    }

    @Override
    public void execute(Counter counter, Memory memory) {
        System.out.println(address.getWord(memory));

       counter.increaseCounter();
    }

    @Override
    public String toString() {
        return "PRT ["+address.getIndex()+"]";
    }
}
