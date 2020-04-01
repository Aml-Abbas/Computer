package computer;

import Operand.Word;

public class LongMemory implements Memory{
    private Word[] list;

    public LongMemory(int nbr){
        list= new Word[nbr];
    }

    @Override
    public Word getWord(int address) {
        return list[address];
    }

    @Override
    public void setWord(int address, Word word) {
        list[address]= word;
    }
}
