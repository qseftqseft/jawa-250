package accounts;

import people.AccountOwner;

public class AccountFactory{
    public Account createAccount(AccountOwner o){
        return new Account(o);
    }
}
