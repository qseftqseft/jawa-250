public class BusinessAccount extends GenericAccount {
    
    
    public BusinessAccount(AccountOwner o){
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
        double decAmount = ammount + (ammount * 0.01);
        if(decAmount >= 0){
            if(balance < decAmount){
                ammount = balance - (ammount * 0.01);
                decAmount = ammount + (ammount * 0.01);
            }
            
            balance = balance - decAmount;
            a.unsafeAddBalance(ammount);
        }
        
        return a;
    }
    
}
