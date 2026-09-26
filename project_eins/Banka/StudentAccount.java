public class StudentAccount extends GenericAccount {
    public String school;
    
    
    
    public StudentAccount(AccountOwner o, String school){
        super(o, -5000, 0, 0);
        this.school = school;
    }
    
    public String getSchool()
    {
        return this.school;
    }
    
    
    
    /*
    public GenericAccount transfer(GenericAccount a, double ammount){
        if(ammount >= -5000){
            if(balance + 5000 < ammount){
                ammount = balance + 5000;
            }
            
            balance = balance - ammount;
            a.unsafeAddBalance(ammount);
        }
        
        return a;
    }
    */
    
}
