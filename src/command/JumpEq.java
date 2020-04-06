package command;

import Operand.Operand;
import computer.Computer;
import computer.Memory;
import Operand.Word;

public class JumpEq implements Instruktion {
    private int toCommand;
    private Operand op1,op2;

    public JumpEq(int toCommand, Operand op1, Operand op2){
        this.toCommand=toCommand;
        this.op1=op1;
        this.op2=op2;
    }


    @Override
    public void execute(Computer computer, Memory memory) {
        Word nbr1, nbr2;
        nbr1= op1.getWord(memory);
        nbr2= op2.getWord(memory);

        if (nbr1.getValue()==nbr2.getValue()){
            computer.setCounter(toCommand);
        }else {
            computer.increaseCounter();
        }
    }

    @Override
    public String toString() {
        String object1= op1.toString(), object2= op2.toString();
        return "JEQ "+toCommand+" "+object1+" "+object2;
    }
}
