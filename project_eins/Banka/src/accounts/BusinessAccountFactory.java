package accounts;

import people.AccountOwner;

public class BusinessAccountFactory{
    public BusinessAccount createBusinessAccount(AccountOwner o){
        return new BusinessAccount(o);
    }
}
