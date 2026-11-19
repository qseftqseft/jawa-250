package accounts;

import people.AccountOwner;
import containers.Container;

public class StudentAccountFactory{
    public StudentAccount createStudentAccount(AccountOwner o, String school, Container container){
        return new StudentAccount(o, school, container.accountNumberService.generateAccountNumber());
    }
}
