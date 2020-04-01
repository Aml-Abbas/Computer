package command;

import Operand.Address;
import Operand.Operand;
import Operand.Word;

public class Mul extends arithmeticOperation {
    Operand op1,op2;
    Address address;

    public Mul(Operand op1, Operand op2, Address address) {
        super(op1, op2, address);
    }


    @Override
    protected String getString() {
        return "MUL ";
    }

    @Override
    protected long getOperate(long nbr1, long nbr2) {
        return nbr1*nbr2;
    }

}
