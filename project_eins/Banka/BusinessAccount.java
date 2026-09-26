public class BusinessAccount extends GenericAccount {
    
    
    public BusinessAccount(AccountOwner o){
        super(o, 0, 1, 0);
    }
    
    
    
    /*
    public GenericAccount transfer(GenericAccount a, double ammount){
        //ammount to remove
        double decAmount = ammount + (ammount * 0.01);
        
        //if it adds, something has gone wrong
        if(decAmount < 0) return a;
        
        //if funds are insufficient, make the transferred ammount smaller
        if(balance < decAmount){
            ammount = balance - (balance * 0.01);
            decAmount = ammount + (ammount * 0.01);
        }
        
        //transfer
        balance = balance - decAmount;
        a.unsafeAddBalance(ammount);
        
        return a;
    }
    */
    
}
