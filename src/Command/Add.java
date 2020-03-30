package Command;

import Address.Address;
import Computer.Counter;
import Memory.Memory;
import Word.Word;

public class Add extends Operation {

    Object ob1,ob2;
    Address address;

    Add(Address address1, Address address2, Address address) {
        super(address1, address2, address);
    }

    Add(Word w1, Word w2, Address address) {
        super(w1, w2, address);
    }

    public Add(Address address1, Word w2, Address address) {
        super(address1, w2, address);
    }

    Add(Word w1, Address address2, Address address) {
        super(w1, address2, address);
    }


    @Override
    protected String getString() {
        return "ADD ";
    }

    @Override
    protected long getOperation(long nbr1, long nbr2) {
        return nbr1+nbr2;
    }

}
