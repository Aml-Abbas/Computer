package computer;

public class Computer {
    private Memory memory;
    private Program program;
    private Counter counter;

    public Computer(Memory memory){
        this.memory= memory;
        counter= new Counter();
    }
    public void load(Program program){
        this.program= program;
    }

    public void run(){

        while (counter.getCounter()>=0){
            program.get(counter.getCounter()).execute(counter,memory);
        }
    }


}
