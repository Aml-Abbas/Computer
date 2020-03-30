import computer.Computer;
import memory.LongMemory;
import program.Program;
import program.Factorial;

public class ComputerTest {
    public static void main(String[] args) {
        Program factorial = new Factorial();
        System.out.println(factorial.toString());
        Computer computer = new Computer(new LongMemory(1024));
        computer.load(factorial);
        computer.run();
    }
}
