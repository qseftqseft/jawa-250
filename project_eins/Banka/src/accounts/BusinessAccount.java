package accounts;

import people.AccountOwner;

public class BusinessAccount extends GenericAccount {
    public BusinessAccount(AccountOwner o, long accountNumber){
        //o, minimumBalance, outgoingFee, incomingFee
        super(o, 0, 0.3, 0, accountNumber);
    }
}
