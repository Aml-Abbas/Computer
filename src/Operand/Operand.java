package Operand;

import computer.Memory;

public interface Operand {
    Word getWord(Memory memory);
    String toString();
}
