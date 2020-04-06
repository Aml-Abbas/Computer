package computer;

public class Computer {
    private Memory memory;
    private Program program;
    private int counter;

    public Computer(Memory memory){
        this.memory= memory;
        counter= 0;
    }
    public void increaseCounter(){
        counter++;
    }
    public void setCounter(int counter){
        this.counter= counter;
    }
    public void load(Program program){
        this.program= program;
    }

    public void run(){

        while (counter>=0){
            program.get(counter).execute(this ,memory);
        }
    }


}
