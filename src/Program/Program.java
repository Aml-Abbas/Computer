package Program;

import Command.Command;

import java.util.ArrayList;

abstract public class Program extends ArrayList<Command> {


    public String toString(){
        StringBuilder sb= new StringBuilder();
        for (Command command: this){
            sb.append(this.indexOf(command)+" ");
            sb.append(command.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
