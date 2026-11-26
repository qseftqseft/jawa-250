package accounts;

import people.AccountOwner;

import accounts.IAccountService;
import java.util.ArrayList;
import java.util.List;
import containers.Container;
import money.BalanceCurrencyExchangable;

public class AccountService implements IAccountService {

    List<GenericAccount> accounts = new ArrayList<>();
    
    
    public Account createAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container) {
        Account account = container.accountFactory.createAccount(owner, container);
        account.setBalance(balance);
        accounts.add(account);

        return account;
    }

    public StudentAccount createStudentAccount(AccountOwner owner, BalanceCurrencyExchangable balance, String school, Container container) {
        StudentAccount studentAccount = container.studentAccountFactory.createStudentAccount(owner, school, container);
        studentAccount.setBalance(balance);
        accounts.add(studentAccount);

        return studentAccount;
    }

    public SavingsAccount createSavingAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container) {
        SavingsAccount savingsAccount = container.savingsAccountFactory.createSavingsAccount(owner, container);
        savingsAccount.setBalance(balance);
        accounts.add(savingsAccount);

        return savingsAccount;
    }

    public BusinessAccount createBusinessAccount(AccountOwner owner, BalanceCurrencyExchangable balance, Container container) {
        BusinessAccount businessAccount = container.businessAccountFactory.createBusinessAccount(owner, container);
        businessAccount.setBalance(balance);
        accounts.add(businessAccount);

        return businessAccount;
    }

    public List<GenericAccount> getAccounts() {
        return accounts;
    }
}
