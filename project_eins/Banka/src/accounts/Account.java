package accounts;

import people.AccountOwner;

public class Account extends GenericAccount {
    
    
    public Account(AccountOwner o){
        //o, minimumBalance, outgoingFee, incomingFee
        super(o, 0, 0, 0);
    }
}
