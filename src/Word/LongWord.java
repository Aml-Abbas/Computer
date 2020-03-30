package Word;

import Memory.Memory;

public class LongWord implements Word {
    long value;

    public LongWord(long value){
    this.value= value;
    }


    @Override
    public long getValue() {
        return value;
    }
}
