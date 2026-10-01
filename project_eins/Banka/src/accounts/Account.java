package accounts;

import people.AccountOwner;

public class Account extends GenericAccount {
    
    
    public Account(AccountOwner o, long accountNumber){
        //o, minimumBalance, outgoingFee, incomingFee
        super(o, 0, 0, 0, accountNumber);
    }
}
