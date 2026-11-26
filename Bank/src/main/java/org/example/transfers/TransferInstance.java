package transfers;

import accounts.GenericAccount;
import java.util.Date;
import money.BalanceCurrencyExchangable;

public class TransferInstance {
    protected GenericAccount sourceGenericAccount;
    protected GenericAccount destinationGenericAccount;
    protected BalanceCurrencyExchangable amount;
    protected Date date;
    
    public TransferInstance(GenericAccount sourceGenericAccount1, GenericAccount destinationGenericAccount1, BalanceCurrencyExchangable amount1){
        this.sourceGenericAccount = sourceGenericAccount1;
        this.destinationGenericAccount = destinationGenericAccount1;
        this.amount = amount1;
        this.date = new Date();
    }
    
    public GenericAccount getSourceGenericAccount(){
        return sourceGenericAccount;
    }
    public GenericAccount getDestinationGenericAccount(){
        return destinationGenericAccount;
    }
    public BalanceCurrencyExchangable getAmount(){
        return amount;
    }
    public Date getDate(){
        return date;
    }
}
