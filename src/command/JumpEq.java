package command;

import Operand.Address;
import Operand.Operand;
import computer.Counter;
import computer.Memory;
import Operand.Word;

public class JumpEq implements Instruktion {
    int toCommand;
    Operand op1,op2;

    public JumpEq(int toCommand, Operand op1, Operand op2){
        this.toCommand=toCommand;
        this.op1=op1;
        this.op2=op2;
    }


    @Override
    public void execute(Counter counter, Memory memory) {
        long nbr1, nbr2;

        if (ob1 instanceof Address){
            nbr1= ((Address) ob1).getValue(memory);
        }else {
            nbr1= ((Word) ob1).getValue();
        }
        if (ob2 instanceof Address){
            nbr2= ((Address) ob2).getValue(memory);
        }else {
            nbr2= ((Word) ob2).getValue();
        }
        if (nbr1==nbr2){
            counter.setCounter(toCommand);
        }else {
            counter.increaseCounter();
        }
    }

    @Override
    public String toString() {
        String object1="", object2="";
        if (ob1 instanceof Address){
            object1+="["+((Address) ob1).getIndex()+"]";
        }else {
            object1+=((Word) ob2).getValue();
        }
        if (ob2 instanceof Address){
            object2+="["+((Address) ob2).getIndex()+"]";
        }else {
            object2+= ((Word) ob2).getValue();
        }

        return "JEQ "+toCommand+" "+object1+" "+object2;
    }
}
