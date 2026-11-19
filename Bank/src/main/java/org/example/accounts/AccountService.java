package accounts;

import people.AccountOwner;

import accounts.IAccountService;
import java.util.ArrayList;
import java.util.List;
import containers.Container;

public class AccountService implements IAccountService {

    List<GenericAccount> accounts = new ArrayList<>();
    
    
    public Account createAccount(AccountOwner owner, double balance) {
        Container container = new Container();
        
        Account account = container.accountFactory.createAccount(owner);
        accounts.add(account);

        return account;
    }

    public StudentAccount createStudentAccount(AccountOwner owner, double balance, String school) {    
        Container container = new Container();
        
        StudentAccount studentAccount = container.studentAccountFactory.createStudentAccount(owner, school);
        accounts.add(studentAccount);

        return studentAccount;
    }

    public SavingsAccount createSavingAccount(AccountOwner owner, double balance) {
        Container container = new Container();
        
        SavingsAccount savingsAccount = container.savingsAccountFactory.createSavingsAccount(owner);
        accounts.add(savingsAccount);

        return savingsAccount;
    }

    public BusinessAccount createBusinessAccount(AccountOwner owner, double balance) {
        Container container = new Container();
        
        BusinessAccount businessAccount = container.businessAccountFactory.createBusinessAccount(owner);
        accounts.add(businessAccount);

        return businessAccount;
    }

    public List<GenericAccount> getAccounts() {
        return accounts;
    }
}
