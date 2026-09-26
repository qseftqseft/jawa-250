public class TransferService {
    public void withdraw(GenericAccount genericAccount, double ammount){
        double ammountToWithdraw = ammount + (outgoingFee(genericAccount) / 100 * ammount);
        double newBalance = balance(genericAccount) - ammountToWithdraw;
        
        if(newBalance < bottomLimit(genericAccount)){
            throw new RuntimeException("Insufficient funds.");
        }
        
        genericAccount.setBalance(newBalance);
    }
    
    public void add(GenericAccount genericAccount, double ammount){
        double ammountToAdd = ammount - (incomingFee(genericAccount) / 100 * ammount);
        double newBalance = balance(genericAccount) + ammountToAdd;
        
        genericAccount.setBalance(newBalance);
    }
    
    public void transfer(GenericAccount outgoingGenericAccount, GenericAccount incomingGenericAccount, double ammount){
        if(ammount < 0) return;
        withdraw(outgoingGenericAccount, ammount);
        add(incomingGenericAccount, ammount);
    }
    
    
    public double bottomLimit(GenericAccount genericAccount){
        return genericAccount.minimumBalance;
    }
    
    public double outgoingFee(GenericAccount genericAccount){
        return genericAccount.outgoingFee;
    }
    
    public double incomingFee(GenericAccount genericAccount){
        return genericAccount.incomingFee;
    }
    
    public double balance(GenericAccount genericAccount){
        return genericAccount.balance;
    }
    
    
}
