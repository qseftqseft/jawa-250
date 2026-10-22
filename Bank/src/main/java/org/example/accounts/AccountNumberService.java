package accounts;

import java.util.Random;

public class AccountNumberService{
    public long generateAccountNumber(){
        Random generator = new Random();
        long r = generator.nextInt(588235294);
        
        r = r * 17;
        
        long num = r;
        long sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        
        r = r * 100 + sum; 
        return r;
    }
}
