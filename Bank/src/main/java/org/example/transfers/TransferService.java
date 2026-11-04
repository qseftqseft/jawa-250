package transfers;

import accounts.GenericAccount;

public class TransferService {
    public static void withdraw(GenericAccount genericAccount, double ammount){
        double ammountToWithdraw = ammount + (outgoingFee(genericAccount) / 100 * ammount);
        double newBalance = balance(genericAccount) - ammountToWithdraw;
        
        if(newBalance < bottomLimit(genericAccount)){
            throw new RuntimeException("Insufficient funds.");
        }
        
        genericAccount.setBalance(newBalance);
    }
    
    public static void add(GenericAccount genericAccount, double ammount){
        double ammountToAdd = ammount - (incomingFee(genericAccount) / 100 * ammount);
        double newBalance = balance(genericAccount) + ammountToAdd;
        
        genericAccount.setBalance(newBalance);
    }
    
    public static void transfer(GenericAccount outgoingGenericAccount, GenericAccount incomingGenericAccount, double ammount){
        if(ammount < 0) return;
        withdraw(outgoingGenericAccount, ammount);
        add(incomingGenericAccount, ammount);
    }
    
    
    public static double bottomLimit(GenericAccount genericAccount){
        return genericAccount.minimumBalance;
    }
    
    public static double outgoingFee(GenericAccount genericAccount){
        return genericAccount.outgoingFee;
    }
    
    public static double incomingFee(GenericAccount genericAccount){
        return genericAccount.incomingFee;
    }
    
    public static double balance(GenericAccount genericAccount){
        return genericAccount.getBalance();
    }
    
    
}
