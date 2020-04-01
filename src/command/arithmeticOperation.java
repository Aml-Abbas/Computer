package command;

import Operand.Address;
import Operand.Operand;
import computer.Counter;
import computer.Memory;
import Operand.Word;


abstract public class arithmeticOperation implements Instruktion {
   private Operand op1,op2;
   private Address address;

    arithmeticOperation(Operand op1, Operand op2, Address address){
        this.op1= op1;
        this.op2= op2;
        this.address=address;
    }


    @Override
    public void execute(Counter counter, Memory memory) {
        Word result= getOperate(op1.getWord(memory),op2.getWord(memory));
        address.setWord(result,memory);

        counter.increaseCounter();
    }

    @Override
    public String toString() {

        String object1= op1.toString(), object2=op2.toString();
        return getString()+object1+" "+object2+" "+address.toString();
    }

    protected abstract String getString();

    protected abstract Word getOperate(Word nbr1, Word nbr2);

}
