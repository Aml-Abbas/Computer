package command;

import computer.Counter;
import computer.Memory;

public class Jump implements Instruktion {
   private int toCommand;

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
