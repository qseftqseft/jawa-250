public class Account extends GenericAccount {
    
    
    public Account(AccountOwner o){
        super(o, 0, 0, 0);
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
