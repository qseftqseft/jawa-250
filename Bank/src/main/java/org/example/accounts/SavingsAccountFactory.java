package accounts;

import people.AccountOwner;

public class SavingsAccountFactory{
    
    public SavingsAccount createSavingsAccount(AccountOwner o){
        AccountNumberServiceFactory accountNumberServiceFactory = new AccountNumberServiceFactory();
        AccountNumberService accountNumberService = AccountNumberServiceFactory.createAccountNumberService();
        
        return new SavingsAccount(o, accountNumberService.generateAccountNumber());
    }
}
