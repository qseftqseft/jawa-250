package accounts;

import people.AccountOwner;

public class BusinessAccountFactory{
    public BusinessAccount createBusinessAccount(AccountOwner o){
        AccountNumberServiceFactory accountNumberServiceFactory = new AccountNumberServiceFactory();
        AccountNumberService accountNumberService = AccountNumberServiceFactory.createAccountNumberService();
        
        return new BusinessAccount(o, accountNumberService.generateAccountNumber());
    }
}
