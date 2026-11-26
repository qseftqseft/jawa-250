package transfers;

import money.BalanceCurrencyExchangable;

public interface Withdraw {
    public BalanceCurrencyExchangable balance = new BalanceCurrencyExchangable(0, "CZK", 1);
    public double minimumBalance = 0;
    public double outgoingFee = 0;
    public double incomingFee = 0;
    
    public double getBalanceInCzk();
    public void setBalanceInCzk(double ammount);
}
