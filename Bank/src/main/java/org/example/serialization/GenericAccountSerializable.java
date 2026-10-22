package serialization;

import accounts.*;

public class GenericAccountSerializable {
    public long accountNumber;
    
    public GenericAccountSerializable(GenericAccount a){
        accountNumber = a.getAccountNumber();
    }
}
