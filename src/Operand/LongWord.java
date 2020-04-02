package Operand;

import computer.Memory;

public class LongWord extends Word {
    private long value;

    public LongWord(long value) {
        this.value = value;
    }

    @Override
    public Word getWord(Memory memory) {
        return new LongWord(value);
    }

    @Override
    public void Add(Word word, Address address, Memory memory) {
        long result = value + ((LongWord) word).value;
        address.setWord(new LongWord(result),memory);
    }

    @Override
    public void Mul(Word word, Address address, Memory memory) {
        long result = value * ((LongWord) word).value;
        address.setWord(new LongWord(result),memory);
    }

    @Override
    public String toString() {
        return Long.toString(value);
    }
}
