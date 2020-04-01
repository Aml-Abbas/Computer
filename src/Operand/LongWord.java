package Operand;

import computer.Memory;

public class LongWord implements Word {
    long value;

    public LongWord(long value){
    this.value= value;
    }

    @Override
    public Word getWord(Memory memory) {
        return new LongWord(value);
    }

    @Override
    public Word ADD(Word word1, Word word2) {
        return Add(word1,word2);
    }

    @Override
    public Word MUL(Word word1, Word word2) {
        return null;
    }
}
