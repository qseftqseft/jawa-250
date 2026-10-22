package accounts;

import people.AccountOwner;

public class AccountFactory{
    public Account createAccount(AccountOwner o){
        AccountNumberServiceFactory accountNumberServiceFactory = new AccountNumberServiceFactory();
        AccountNumberService accountNumberService = AccountNumberServiceFactory.createAccountNumberService();
        
        return new Account(o, accountNumberService.generateAccountNumber());
    }
}
