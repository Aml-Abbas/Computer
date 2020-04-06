package computer;

import command.Instruction;

import java.util.ArrayList;

abstract public class Program extends ArrayList<Instruction> {


    public String toString(){
        StringBuilder sb= new StringBuilder();
        for (Instruction command: this){
            sb.append(this.indexOf(command)+" ");
            sb.append(command.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
