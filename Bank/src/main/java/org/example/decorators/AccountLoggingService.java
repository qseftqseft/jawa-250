package decorators;

import accounts.GenericAccount;
import accounts.IAccountService;
import people.AccountOwner;
import containers.Container;

import java.time.LocalTime;
import java.util.List;

public class AccountLoggingService implements IAccountService {

    IAccountService service;

    public AccountLoggingService(IAccountService service) {
        this.service = service;
    }

    @Override
    public GenericAccount createAccount(AccountOwner owner, double balance, Container container) {
        this.logStart();
        GenericAccount account = this.service.createAccount(owner, balance, container);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createStudentAccount(AccountOwner owner, double balance, String school, Container container) {
        this.logStart();
        GenericAccount account = this.service.createStudentAccount(owner, balance, school, container);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createSavingAccount(AccountOwner owner, double balance, Container container) {
        this.logStart();
        GenericAccount account = this.service.createSavingAccount(owner, balance, container);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createBusinessAccount(AccountOwner owner, double balance, Container container) {
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
        System.out.println("accounting now");
    }

    private void logEnd() {
        System.out.println("account's accounter can account knowing that the account is accounted for in our account accounting account");
    }
}
