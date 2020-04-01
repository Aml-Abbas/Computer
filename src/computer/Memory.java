package computer;

import Operand.Word;

public interface Memory {
    Word getWord(int address);
    void setWord(int address, Word word);
}
