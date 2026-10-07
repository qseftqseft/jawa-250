package transfers;

import accounts.GenericAccount;
import java.util.Date;

public class TransferInstance {
    protected GenericAccount sourceGenericAccount;
    protected GenericAccount destinationGenericAccount;
    protected double amount;
    protected Date date;
    
    public TransferInstance(GenericAccount sourceGenericAccount1, GenericAccount destinationGenericAccount1, double amount1){
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
    public double getAmount(){
        return amount;
    }
    public Date getDate(){
        return date;
    }
}
