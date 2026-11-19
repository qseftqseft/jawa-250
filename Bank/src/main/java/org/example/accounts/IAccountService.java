package accounts;

import accounts.GenericAccount;
import people.AccountOwner;
import containers.Container;

import java.util.List;

public interface IAccountService {

    public GenericAccount createAccount(AccountOwner owner, double balance, Container container);

    public GenericAccount createStudentAccount(AccountOwner owner, double balance, String school, Container container);

    public GenericAccount createSavingAccount(AccountOwner owner, double balance, Container container);

    public GenericAccount createBusinessAccount(AccountOwner owner, double balance, Container container);

    public List<GenericAccount> getAccounts();

}
