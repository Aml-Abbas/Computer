package command;

import Operand.Address;
import Operand.Operand;
import computer.Counter;
import computer.Memory;

abstract public class arithmeticOperation implements Instruktion {
    Operand op1,op2;
   Address address;

    arithmeticOperation(Operand op1, Operand op2, Address address){
        this.op1= op1;
        this.op2= op2;
        this.address=address;
    }


    @Override
    public void execute(Counter counter, Memory memory) {

        counter.increaseCounter();

    }

    @Override
    public String toString() {

        String object1="", object2="";

        return getString()+object1+" "+object2+" "+"["+address.getIndex()+"]";
    }
    protected abstract String getString();
    protected abstract long getOperation(long nbr1, long nbr2);

}
