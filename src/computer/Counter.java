package computer;

public class Counter {
    private int counter;

    public Counter(){
        counter=0;
    }
    public void setCounter(int counter){
        this.counter=counter;
    }
    public int getCounter(){
        return counter;
    }
    public void increaseCounter(){
        counter++;
    }
}
