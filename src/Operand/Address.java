package Operand;

import computer.Memory;

public class Address implements Operand {
    private int index;

    public Address(int address) {
        this.index = address;
    }

    @Override
    public Word getWord(Memory memory) {
        return memory.getWord(index);
    }

    @Override
    public String toString() {
        return "[" + index + "]";
    }

    public int getIndex() {
        return index;
    }
}
