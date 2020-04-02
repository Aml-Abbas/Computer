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
    protected void getOperate(Word nbr1, Word nbr2, Address address, Memory memory) {
         nbr1.Add(nbr2, address, memory);
    }

}
