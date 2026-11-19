package accounts;

import people.AccountOwner;

import accounts.IAccountService;
import java.util.ArrayList;
import java.util.List;
import containers.Container;

public class AccountService implements IAccountService {

    List<GenericAccount> accounts = new ArrayList<>();
    
    
    public Account createAccount(AccountOwner owner, double balance, Container container) {
        Account account = container.accountFactory.createAccount(owner, container);
        accounts.add(account);

        return account;
    }

    public StudentAccount createStudentAccount(AccountOwner owner, double balance, String school, Container container) {
        StudentAccount studentAccount = container.studentAccountFactory.createStudentAccount(owner, school, container);
        accounts.add(studentAccount);

        return studentAccount;
    }

    public SavingsAccount createSavingAccount(AccountOwner owner, double balance, Container container) {
        SavingsAccount savingsAccount = container.savingsAccountFactory.createSavingsAccount(owner, container);
        accounts.add(savingsAccount);

        return savingsAccount;
    }

    public BusinessAccount createBusinessAccount(AccountOwner owner, double balance, Container container) {
        BusinessAccount businessAccount = container.businessAccountFactory.createBusinessAccount(owner, container);
        accounts.add(businessAccount);

        return businessAccount;
    }

    public List<GenericAccount> getAccounts() {
        return accounts;
    }
}
