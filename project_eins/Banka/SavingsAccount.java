public class SavingsAccount extends GenericAccount implements Interest {
    
    public SavingsAccount(AccountOwner o){
        super(o, 0, 0, -0.5);
    }
    
    public static double interestRate = 4.9;
    
    public void calculateInterest(){
        double interest = balance * interestRate / 100;
        setBalance(getBalance() + interest);
    }
    
    /*
    public GenericAccount transfer(GenericAccount a, double ammount){
        if(ammount >= 0){
            if(balance < ammount){
                ammount = balance;
            }
            
            balance = balance - ammount;
            a.unsafeAddBalance(ammount);
        }
        
        return a;
    }
    */
}
