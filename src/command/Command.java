package command;

import computer.Counter;
import memory.Memory;

public interface Command {

     void execute(Counter counter, Memory memory);
     String toString();
}
