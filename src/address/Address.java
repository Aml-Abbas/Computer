package address;

import memory.Memory;

public class Address {
    int address;

    public Address(int address){
    this.address= address;
    }

    public void setValue(long value, Memory memory){
        memory.setAddress(address,value);
    }

    public long getValue(Memory memory) {
        return memory.getAddress(address);
    }

    public int getIndex(){
        return address;
    }
}
