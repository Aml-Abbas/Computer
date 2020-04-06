package command;

import computer.Computer;
import computer.Memory;

public interface Instruktion {

     void execute(Computer computer, Memory memory);
     String toString();
}
