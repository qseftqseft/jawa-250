package decorators;

import accounts.GenericAccount;
import accounts.IAccountService;
import people.AccountOwner;

import java.time.LocalTime;
import java.util.List;

public class AccountLoggingWithTimeService implements IAccountService {

    IAccountService service;

    public AccountLoggingWithTimeService(IAccountService service) {
        this.service = service;
    }

    @Override
    public GenericAccount createAccount(AccountOwner owner, double balance) {
        this.logStart();
        GenericAccount account = this.service.createAccount(owner, balance);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createStudentAccount(AccountOwner owner, double balance, String school) {
        this.logStart();
        GenericAccount account = this.service.createStudentAccount(owner, balance, school);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createSavingAccount(AccountOwner owner, double balance) {
        this.logStart();
        GenericAccount account = this.service.createSavingAccount(owner, balance);
        this.logEnd();

        return account;
    }

    @Override
    public GenericAccount createBusinessAccount(AccountOwner owner, double balance) {
        this.logStart();
        GenericAccount account = this.service.createBusinessAccount(owner, balance);
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
