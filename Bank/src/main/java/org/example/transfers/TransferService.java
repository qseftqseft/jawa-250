package transfers;

import accounts.GenericAccount;
import money.BalanceCurrencyExchangable;

public class TransferService {
    public static void withdraw(GenericAccount genericAccount, BalanceCurrencyExchangable Bammount){
        double ammount = Bammount.getBalanceInCzk();
        double ammountToWithdraw = ammount + (outgoingFee(genericAccount) / 100 * ammount);
        double newBalance = balance(genericAccount) - ammountToWithdraw;
        
        if(newBalance < bottomLimit(genericAccount)){
            throw new RuntimeException("Insufficient funds.");
        }
        
        genericAccount.setBalanceInCzk(newBalance);
    }
    
    public static void add(GenericAccount genericAccount, BalanceCurrencyExchangable Bammount){
        double ammount = Bammount.getBalanceInCzk();
        double ammountToAdd = ammount - (incomingFee(genericAccount) / 100 * ammount);
        double newBalance = balance(genericAccount) + ammountToAdd;
        
        genericAccount.setBalanceInCzk(newBalance);
    }
    
    public static void transfer(GenericAccount outgoingGenericAccount, GenericAccount incomingGenericAccount, BalanceCurrencyExchangable ammount){
        if(ammount.getBalanceInCzk() < 0) return;
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
        return genericAccount.getBalanceInCzk();
    }
    
    
}
