package logging;

import accounts.*;
import people.*;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



public class LogAccount{
    AccountFactory accountFactory = new AccountFactory();
    
    
    public void logBefore (){
        System.out.println("Creating Account");
    }
    public Account log (Account a){
        System.out.println("Account created");
        return a;
    }
    public void logTimeBefore (){ 
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Creating Account " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss SSS")));
    }
    public Account logTime (Account a){ 
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Account created " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss SSS")));
        return a;
    }
    
}
