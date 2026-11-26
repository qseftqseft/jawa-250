package accounts;

import people.AccountOwner;
import transfers.Withdraw;
import money.BalanceCurrencyExchangable;

public abstract class GenericAccount implements Withdraw {
    private String uuid;
    private long accountNumber;
    private AccountOwner owner;
    protected BalanceCurrencyExchangable balance;
    
    public double minimumBalance;
    public double outgoingFee;
    public double incomingFee;
    
    
    public GenericAccount(AccountOwner o, double minimumBalance1, double outgoingFee1, double incomingFee1, long accountNumber1){
        owner = o;
        balance = new BalanceCurrencyExchangable (0, "CZK", 1);
        this.minimumBalance = minimumBalance1;
        this.outgoingFee = outgoingFee1;
        this.incomingFee = incomingFee1;
        this.accountNumber = accountNumber1;
    }
    
    public BalanceCurrencyExchangable getBalance(){
        return balance;
    }
    public double getBalanceInCzk(){
        return balance.getBalanceInCzk();
    }
    public void setBalance(BalanceCurrencyExchangable ammount){
        balance = ammount;
    }
    public void setBalanceInCzk(double ammount){
        balance.setBalanceInCzk(ammount);
    }
    public long getAccountNumber(){
        return accountNumber;
    }
}
