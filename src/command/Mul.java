package command;

import Operand.Address;
import Operand.Operand;
import Operand.Word;

public class Mul extends ArithmeticOperation {
    private Operand op1,op2;
    private Address address;

    public Mul(Operand op1, Operand op2, Address address) {
        super(op1, op2, address);
    }


    @Override
    protected String getString() {
        return "MUL ";
    }

    @Override
    protected void operate(Word word1, Word word2, Word word3) {
         word3.mul(word1,word2);
    }

}
