package accounts;

import people.AccountOwner;
import containers.Container;

public class AccountFactory{
    public Account createAccount(AccountOwner o){
        Container container = new Container();
        return new Account(o, container.accountNumberService.generateAccountNumber());
    }
}
