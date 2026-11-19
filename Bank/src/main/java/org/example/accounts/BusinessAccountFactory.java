package accounts;

import people.AccountOwner;
import containers.Container;

public class BusinessAccountFactory{
    public BusinessAccount createBusinessAccount(AccountOwner o, Container container){
        return new BusinessAccount(o, container.accountNumberService.generateAccountNumber());
    }
}
