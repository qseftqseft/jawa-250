import java.util.ArrayList;
import java.util.List;

import accounts.*;
import people.AccountOwner;
import people.AccountOwnerFactory;
import transfers.TransferService;
import transfers.TransferServiceFactory;
import notifiers.*;


public class Main {
    public static void main(String[] args) {
        //industry, Production, FACTORES EVERYWHERE!!!
        ConsoleNotifierFactory consoleNotifierFactory = new ConsoleNotifierFactory(); //fac
        TransferServiceFactory transferServiceFactory = new TransferServiceFactory(); //fac
        AccountOwnerFactory accountOwnerFactory = new AccountOwnerFactory(); //fac
        AccountFactory accountFactory = new AccountFactory(); //fac
        StudentAccountFactory studentAccountFactory = new StudentAccountFactory(); //fac
        SavingsAccountFactory savingsAccountFactory = new SavingsAccountFactory(); //fac
        BusinessAccountFactory businessAccountFactory = new BusinessAccountFactory(); //fac
        
        
        
        Notifier Notifier = consoleNotifierFactory.createConsoleNotifier();
        
        TransferService TransferService = transferServiceFactory.creteTransferService();
        
        AccountOwner a = accountOwnerFactory.createAccountOwner("Já", "ma");
        a.setName("třímetová jámo");
        
        Account acc = accountFactory.createAccount(a);
        
        AccountOwner bankOwner = accountOwnerFactory.createAccountOwner("šef", "banky");
        
        Account bankAccount = accountFactory.createAccount(bankOwner);
        
        AccountOwner studentO = accountOwnerFactory.createAccountOwner("Sud", "vína");
        StudentAccount student = studentAccountFactory.createStudentAccount(studentO, "Nejvyšší škola povýšenosti ÉTA");
        
        SavingsAccount savings = savingsAccountFactory.createSavingsAccount(a);
        
        BusinessAccount ihatecapitalism = businessAccountFactory.createBusinessAccount(a);
        
        
        
        TransferService.add(acc, 1000);
        
        TransferService.transfer(acc, ihatecapitalism, 500);
        
        Notifier.notify(acc.getBalance());
        Notifier.notify(ihatecapitalism.getBalance());
        
        
        TransferService.transfer(ihatecapitalism, savings, 250);
        
        Notifier.notify(ihatecapitalism.getBalance());
        Notifier.notify(savings.getBalance());
        
        
        
        //bankAccount = (Account)acc.transfer(bankAccount, 42.9);
        
        //System.out.println( acc.getBalance() );
        //System.out.println( bankAccount.getBalance() );
        
        
        
        
        
        
        //acc = (Account)student.transfer(acc, 4990);
        
        //System.out.println( acc.getBalance() );
        //System.out.println( student.getBalance() );
        
        
        
        
        
        //savings = (SavingsAccount)acc.transfer(savings, 1000);
        
        //System.out.println( acc.getBalance() );
        
        
        
        
        
        //ihatecapitalism.unsafeAddBalance(10);
        
        //Notifier.notify("Savings: " + savings.getBalance() );
        //Notifier.notify("ihatecapitalism: " + ihatecapitalism.getBalance() );
        
        //savings = (SavingsAccount)ihatecapitalism.transfer(savings, 1000);
        
        //Notifier.notify( "Transfered 1000 from ihatecapitalism to savings" );
        //Notifier.notify("Savings: " + savings.getBalance() );
        //Notifier.notify("ihatecapitalism: " + ihatecapitalism.getBalance() );
        
        
        
        //Notifier.notify("Savings: " + savings.getBalance() );
        
        //interest
        /*
        List<GenericAccount> accounts = new ArrayList<>();
        accounts.add(ihatecapitalism);
        accounts.add(savings);
        
        for (GenericAccount account : accounts) {
            if (account instanceof Interest) {
                ((Interest)account).calculateInterest();
            }
        }
        */
        
        //Notifier.notify("Savings: " + savings.getBalance() );
        
    }
}




