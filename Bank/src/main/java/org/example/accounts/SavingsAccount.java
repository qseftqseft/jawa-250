package accounts;

import people.AccountOwner;

public class SavingsAccount extends GenericAccount implements Interest {
    
    public SavingsAccount(AccountOwner o, long accountNumber){
        //o, minimumBalance, outgoingFee, incomingFee
        super(o, 0, 0, -0.5, accountNumber);
    }
    
    public static double interestRate = 4.9;
    
    public void calculateInterest(){
        double interest = getBalanceInCzk() * interestRate / 100;
        setBalanceInCzk(getBalanceInCzk() + interest);
    }
}
