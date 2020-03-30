package Command;

import Computer.Counter;
import Memory.Memory;

public class Halt implements Command {

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
