package Operand;

import computer.Memory;

public abstract class Word implements Operand {

    public abstract void Add(Word word, Address address, Memory memory);
    public abstract void Mul(Word word, Address address, Memory memory);
}
