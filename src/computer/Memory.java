package computer;

import Operand.Word;

public interface Memory {
    Word getWord(int index);
    void setWord(int index, Word word);
}
