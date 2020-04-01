package Operand;

import computer.Memory;

public class Address implements Operand{
    private int address;

    public Address(int address){
    this.address= address;
    }

    public void setWord(Word word, Memory memory){
        memory.setWord(address,word);
    }

    public int getIndex(){
        return address;
    }

    @Override
    public Word getWord(Memory memory) {
        return memory.getWord(address);
    }
    @Override
    public String toString() {
        return "["+address+"]";
    }
}
