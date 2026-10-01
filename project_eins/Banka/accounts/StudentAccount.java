package accounts;

import people.AccountOwner;

public class StudentAccount extends GenericAccount {
    public String school;
    
    
    
    public StudentAccount(AccountOwner o, String school){
        //o, minimumBalance, outgoingFee, incomingFee
        super(o, -5000, 0, 0);
        this.school = school;
    }
    
    public String getSchool()
    {
        return this.school;
    }
    
}
