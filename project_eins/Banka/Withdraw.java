public interface Withdraw {
    public double balance = 0;
    public double minimumBalance = 0;
    public double outgoingFee = 0;
    public double incomingFee = 0;
    
    public double getBalance();
    public void setBalance(double ammount);
}
