package command;

import computer.Computer;
import computer.Memory;

public interface Instruction {

     void execute(Computer computer, Memory memory);
     String toString();
}
