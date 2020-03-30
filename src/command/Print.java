package command;

import address.Address;
import computer.Counter;
import memory.Memory;

public class Print implements Command {
    Address address;

    public Print(Address address){
        this.address=address;
    }

    @Override
    public void execute(Counter counter, Memory memory) {
        System.out.println(address.getValue(memory));

       counter.increaseCounter();
    }

    @Override
    public String toString() {
        return "PRT ["+address.getIndex()+"]";
    }
}
