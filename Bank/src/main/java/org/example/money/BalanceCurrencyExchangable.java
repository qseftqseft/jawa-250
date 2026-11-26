package money;

public class BalanceCurrencyExchangable{
    private double balanceInCzk;
    private String currency;
    private double rate;
    
    public BalanceCurrencyExchangable (double Balance, String Currency, double Rate){
        balanceInCzk = Balance / Rate;
        currency = Currency;
        rate = Rate;
    }
    
    public double getBalance(){
        return balanceInCzk * rate;
    }
    public double getBalanceInCzk(){
        return balanceInCzk;
    }
    public void setBalance(double balance){
        balanceInCzk = balance / rate;
    }
    public void setBalanceInCzk(double balance){
        balanceInCzk = balance;
    }
    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String newCurrency){
        currency = newCurrency;
    }
    public double getRate(){
        return rate;
    }
    public void setRate(double newRate){
        balanceInCzk = (balanceInCzk * rate) / newRate;
        rate = newRate;
    }
    public static BalanceCurrencyExchangable create(double ammount, String name, double rate1){
        return new BalanceCurrencyExchangable(ammount, name, rate1);
    }
}
