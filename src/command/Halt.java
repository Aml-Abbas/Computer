package command;

import computer.Computer;
import computer.Memory;

public class Halt implements Instruktion {

    public Halt(){

    }

    @Override
    public void execute(Computer computer, Memory memory) {
        computer.setCounter(-1);
    }

    @Override
    public String toString() {
        return "HLT";
    }
}
