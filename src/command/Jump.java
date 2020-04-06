package command;

import computer.Computer;
import computer.Memory;

public class Jump implements Instruction {
   private int toCommand;

    public Jump(int toCommand){
    this.toCommand=toCommand;

    }

    @Override
    public void execute(Computer computer, Memory memory) {
        computer.setCounter(toCommand);
    }

    @Override
    public String toString() {
        return "JMP "+toCommand;
    }
}
