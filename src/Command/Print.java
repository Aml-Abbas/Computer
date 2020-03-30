package Command;

import Address.Address;
import Computer.Counter;
import Memory.Memory;

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
