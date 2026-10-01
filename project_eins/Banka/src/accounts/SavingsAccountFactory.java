package accounts;

import people.AccountOwner;

public class SavingsAccountFactory{
    
    public SavingsAccount createSavingsAccount(AccountOwner o){
        return new SavingsAccount(o);
    }
}
