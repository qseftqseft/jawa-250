package accounts;

import people.AccountOwner;

public class StudentAccountFactory{
    public StudentAccount createStudentAccount(AccountOwner o, String school){
        AccountNumberServiceFactory accountNumberServiceFactory = new AccountNumberServiceFactory();
        AccountNumberService accountNumberService = AccountNumberServiceFactory.createAccountNumberService();
        
        return new StudentAccount(o, school, accountNumberService.generateAccountNumber());
    }
}
