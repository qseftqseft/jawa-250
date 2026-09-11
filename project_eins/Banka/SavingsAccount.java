public class SavingsAccount extends GenericAccount {
    
    
    public SavingsAccount(AccountOwner o){
        super(o);
    }
    
    
    public double getBalance(){
        return balance;
    }
    
    @Override
    public void unsafeAddBalance(double a){
        balance = balance + a + (a * 0.005);
    }
    
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
    
}
