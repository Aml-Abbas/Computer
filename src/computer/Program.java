package computer;

import command.Instruktion;

import java.util.ArrayList;

abstract public class Program extends ArrayList<Instruktion> {


    public String toString(){
        StringBuilder sb= new StringBuilder();
        for (Instruktion command: this){
            sb.append(this.indexOf(command)+" ");
            sb.append(command.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
