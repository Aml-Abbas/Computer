package Operand;

import computer.Memory;

public class LongWord extends Word {

    public LongWord(long value) {
        super(value);
    }

    @Override
    public void add(Word w1, Word w2) {
        value= w1.getValue()+w2.getValue();
    }

    @Override
    public void mul(Word w1, Word w2) {
        value= w1.getValue()*w2.getValue();

    }

    @Override
    public boolean equals(Word w) {
        return value== w.getValue();
    }

    @Override
    public Word getWord(Memory memory) {
        return this;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
