package accounts;

import people.AccountOwner;
import containers.Container;

public class SavingsAccountFactory{
    
    public SavingsAccount createSavingsAccount(AccountOwner o, Container container){
        return new SavingsAccount(o, container.accountNumberService.generateAccountNumber());
    }
}
