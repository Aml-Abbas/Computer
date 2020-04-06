package command;

import Operand.Address;
import Operand.Operand;
import computer.Computer;
import computer.Memory;
import Operand.Word;


abstract public class arithmeticOperation implements Instruktion {
    private Operand op1, op2;
    private Address address;

    arithmeticOperation(Operand op1, Operand op2, Address address) {
        this.op1 = op1;
        this.op2 = op2;
        this.address = address;
    }


    @Override
    public void execute(Computer computer, Memory memory) {
        operate(op1.getWord(memory), op2.getWord(memory), address.getWord(memory));
        computer.increaseCounter();
    }

    @Override
    public String toString() {

        String object1 = op1.toString(), object2 = op2.toString();
        return getString() + object1 + " " + object2 + " " + address.toString();
    }

    protected abstract String getString();

    protected abstract void operate(Word word1, Word word2, Word word3);

}
