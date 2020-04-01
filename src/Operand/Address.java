package Operand;

import computer.Memory;

public class Address implements Operand{
    int address;

    public Address(int address){
    this.address= address;
    }

    public void setWord(long value, Memory memory){
        memory.setWord(address,value);
    }

    public int getIndex(){
        return address;
    }

    @Override
    public Word getWord(Memory memory) {
        return null;
    }
}
