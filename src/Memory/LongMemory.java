package Memory;

import java.util.ArrayList;
import java.util.List;

public class LongMemory implements Memory{
    long[] list;

    public LongMemory(int nbr){
        list= new long[nbr];
    }

    @Override
    public long getAddress(int address) {
        return list[address];
    }

    @Override
    public void setAddress(int address, long value) {
        list[address]= value;
    }
}
