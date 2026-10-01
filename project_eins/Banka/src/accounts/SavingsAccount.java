package accounts;

import people.AccountOwner;

public class SavingsAccount extends GenericAccount implements Interest {
    
    public SavingsAccount(AccountOwner o){
        //o, minimumBalance, outgoingFee, incomingFee
        super(o, 0, 0, -0.5);
    }
    
    public static double interestRate = 4.9;
    
    public void calculateInterest(){
        double interest = balance * interestRate / 100;
        setBalance(getBalance() + interest);
    }
}
