package command;

import Operand.Address;
import Operand.Operand;
import Operand.Word;

public class Mul extends arithmeticOperation {
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
    protected Word getOperate(Word nbr1, Word nbr2) {
        return nbr1.MUL(nbr2);
    }

}
