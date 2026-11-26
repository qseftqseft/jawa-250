package decorators;

import accounts.GenericAccount;
import accounts.IAccountService;
import people.AccountOwner;
import containers.Container;
import money.BalanceCurrencyExchangable;

import java.time.LocalTime;
import java.util.List;

public class AccountLoggingWithTimeService implements IAccountService {

    IAccountService service;

    public AccountLoggingWithTimeService(IAccountService service) {
        this.service = service;
    }

    @Override
    public GenericAccount createAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container) {
        this.logStart();
        GenericAccount account = this.service.createAccount(owner, balance, container);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createStudentAccount(AccountOwner owner, BalanceCurrencyExchangable balance, String school, Container container) {
        this.logStart();
        GenericAccount account = this.service.createStudentAccount(owner, balance, school, container);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createSavingAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container) {
        this.logStart();
        GenericAccount account = this.service.createSavingAccount(owner, balance, container);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createBusinessAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container) {
        this.logStart();
        GenericAccount account = this.service.createBusinessAccount(owner, balance, container);
        this.logEnd();

        return account;
    }

    @Override
    public List<GenericAccount> getAccounts() {
        return this.service.getAccounts();
    }

    private void logStart() {
        System.out.println("Creating account started, " + LocalTime.now());
    }

    private void logEnd() {
        System.out.println("Creating account finished, " + LocalTime.now());
    }
}
