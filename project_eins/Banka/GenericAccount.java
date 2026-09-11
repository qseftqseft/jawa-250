public abstract class GenericAccount {
    private String uuid;
    private String accountNumber;
    private AccountOwner owner;
    protected double balance;
    
    public GenericAccount(AccountOwner o){
        owner = o;
        balance = 0;
    }
    
    public void unsafeAddBalance(double a){
        balance = balance + a;
    }
}
