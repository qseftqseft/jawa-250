package accounts;

import accounts.GenericAccount;
import people.AccountOwner;

import java.util.List;

public interface IAccountService {

    public GenericAccount createAccount(AccountOwner owner, double balance);

    public GenericAccount createStudentAccount(AccountOwner owner, double balance, String school);

    public GenericAccount createSavingAccount(AccountOwner owner, double balance);

    public GenericAccount createBusinessAccount(AccountOwner owner, double balance);

    public List<GenericAccount> getAccounts();

}
