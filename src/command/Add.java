package command;

import Operand.Address;
import Operand.Operand;
import Operand.Word;

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
    protected Word getOperate(Word nbr1, Word nbr2) {
        return nbr1.ADD(nbr2);
    }

}
