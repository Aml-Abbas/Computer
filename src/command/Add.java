package command;

import Operand.Address;
import Operand.Operand;
import Operand.Word;
import computer.Memory;

public class Add extends arithmeticOperation {

    Operand op1,op2;
    Address address;

    public Add(Operand op1, Operand op2, Address address) {
        super(op1, op2, address);
    }


    @Override
    protected String getString() {
        return "ADD ";
    }

    @Override
    protected void operate(Word word1, Word word2, Word word3) {
         word3.add(word1, word2);
    }

}
