package Command;

import Computer.Counter;
import Memory.Memory;

public class Jump implements Command {
    int toCommand;

    public Jump(int toCommand){
    this.toCommand=toCommand;

    }

    @Override
    public void execute(Counter counter, Memory memory) {
        counter.setCounter(toCommand);
    }

    @Override
    public String toString() {
        return "JMP "+toCommand;
    }
}
