package command;

import computer.Counter;
import computer.Memory;

public class Halt implements Instruktion {

    public Halt(){

    }

    @Override
    public void execute(Counter counter, Memory memory) {
        counter.setCounter(-1);
    }

    @Override
    public String toString() {
        return "HLT";
    }
}
