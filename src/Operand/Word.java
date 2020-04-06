package Operand;

public abstract class Word implements Operand {
    protected long value;

    public Word(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public abstract void add(Word w1, Word w2);

    public abstract void mul(Word w1, Word w2);

    public abstract boolean equals(Word w);

    public abstract String toString();
}
