package command;

import Operand.Address;
import computer.Computer;
import computer.Memory;

public class Print implements Instruktion {
    private Address address;

    public Print(Address address){
        this.address=address;
    }

    @Override
    public void execute(Computer computer, Memory memory) {
        System.out.println(address.getWord(memory).getValue());

       computer.increaseCounter();
    }

    @Override
    public String toString() {
        return "PRT "+address.toString();
    }
}
