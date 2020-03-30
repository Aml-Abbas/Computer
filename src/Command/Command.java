package Command;

import Computer.Counter;
import Memory.Memory;

public interface Command {

     void execute(Counter counter, Memory memory);
     String toString();
}
