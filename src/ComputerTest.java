import Computer.Computer;
import Memory.LongMemory;
import Program.Program;
import Program.Factorial;

public class ComputerTest {
    public static void main(String[] args) {
        Program factorial = new Factorial();
        System.out.println(factorial.toString());
        Computer computer = new Computer(new LongMemory(1024));
        computer.load(factorial);
        computer.run();
    }
}
