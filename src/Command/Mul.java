package Command;

import Address.Address;
import Computer.Counter;
import Memory.Memory;
import Word.Word;

public class Mul extends Operation {
    Object ob1,ob2;
    Address address;

    public Mul(Address address1, Address address2, Address address) {
        super(address1, address2, address);
    }

    Mul(Word w1, Word w2, Address address) {
        super(w1, w2, address);
    }

    Mul(Address address1, Word w2, Address address) {
        super(address1, w2, address);
    }

    Mul(Word w1, Address address2, Address address) {
        super(w1, address2, address);
    }


    @Override
    protected String getString() {
        return "MUL ";
    }

    @Override
    protected long getOperation(long nbr1, long nbr2) {
        return nbr1*nbr2;
    }

}
