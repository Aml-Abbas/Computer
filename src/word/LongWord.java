package word;

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
