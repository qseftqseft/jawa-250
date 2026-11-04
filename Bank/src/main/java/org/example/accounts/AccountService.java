package accounts;

import people.AccountOwner;

import accounts.IAccountService;
import java.util.ArrayList;
import java.util.List;

public class AccountService implements IAccountService {

    List<GenericAccount> accounts = new ArrayList<>();

    AccountFactory accountFactory = new AccountFactory();
    StudentAccountFactory studentAccountFactory = new StudentAccountFactory();
    SavingsAccountFactory savingsAccountFactory = new SavingsAccountFactory();
    BusinessAccountFactory businessAccountFactory = new BusinessAccountFactory();
    
    public Account createAccount(AccountOwner owner, double balance) {
        Account account = accountFactory.createAccount(owner);
        accounts.add(account);

        return account;
    }

    public StudentAccount createStudentAccount(AccountOwner owner, double balance, String school) {
        StudentAccount studentAccount = studentAccountFactory.createStudentAccount(owner, school);
        accounts.add(studentAccount);

        return studentAccount;
    }

    public SavingsAccount createSavingAccount(AccountOwner owner, double balance) {
        SavingsAccount savingsAccount = savingsAccountFactory.createSavingsAccount(owner);
        accounts.add(savingsAccount);

        return savingsAccount;
    }

    public BusinessAccount createBusinessAccount(AccountOwner owner, double balance) {
        BusinessAccount businessAccount = businessAccountFactory.createBusinessAccount(owner);
        accounts.add(businessAccount);

        return businessAccount;
    }

    public List<GenericAccount> getAccounts() {
        return accounts;
    }
}
