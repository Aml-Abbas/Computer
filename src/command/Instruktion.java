package command;

import computer.Counter;
import computer.Memory;

public interface Instruktion {

     void execute(Counter counter, Memory memory);
     String toString();
}
