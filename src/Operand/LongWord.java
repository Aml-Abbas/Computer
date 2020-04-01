package Operand;

import computer.Memory;

public class LongWord implements Word {
    private long value;

    public LongWord(long value){
    this.value= value;
    }

    @Override
    public Word getWord(Memory memory) {
        return new LongWord(value);
    }

    @Override
    public Word ADD(Word word) {
        long result= value + word.getValue();
        return new LongWord(result);
    }

    @Override
    public Word MUL(Word word) {
        long result= value * word.getValue();
        return new LongWord(result);
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Long.toString(value);
    }
}
