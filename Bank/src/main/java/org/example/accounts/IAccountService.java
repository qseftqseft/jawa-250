package accounts;

import accounts.GenericAccount;
import people.AccountOwner;
import containers.Container;
import money.BalanceCurrencyExchangable;

import java.util.List;

public interface IAccountService {

    public GenericAccount createAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container);

    public GenericAccount createStudentAccount(AccountOwner owner, BalanceCurrencyExchangable balance, String school, Container container);

    public GenericAccount createSavingAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container);

    public GenericAccount createBusinessAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container);

    public List<GenericAccount> getAccounts();

}
