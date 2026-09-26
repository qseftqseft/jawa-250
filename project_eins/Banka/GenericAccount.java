public abstract class GenericAccount implements Withdraw {
    private String uuid;
    private String accountNumber;
    private AccountOwner owner;
    protected double balance;
    
    public double minimumBalance;
    public double outgoingFee;
    public double incomingFee;
    
    
    public GenericAccount(AccountOwner o, double minimumBalance1, double outgoingFee1, double incomingFee1){
        owner = o;
        balance = 0;
        this.minimumBalance = minimumBalance1;
        this.outgoingFee = outgoingFee1;
        this.incomingFee = incomingFee1;
    }
    
    public double getBalance(){
        return balance;
    }
    public void setBalance(double ammount){
        balance = ammount;
    }
    
}
