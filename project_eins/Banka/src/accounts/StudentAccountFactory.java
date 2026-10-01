package accounts;

import people.AccountOwner;

public class StudentAccountFactory{
    public StudentAccount createStudentAccount(AccountOwner o, String school){
        return new StudentAccount(o, school);
    }
}
