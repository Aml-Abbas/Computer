package computer;

import Operand.LongWord;
import Operand.Word;

public class VeryLongMemory implements Memory{

    @Override
    public Word getWord(int address) {
        return new LongWord(0);
    }

    @Override
    public void setWord(int address, Word word) {

    }
}
