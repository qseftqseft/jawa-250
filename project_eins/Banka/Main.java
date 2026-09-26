import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Notifier Notifier = new ConsoleNotifier();
        TransferService TransferService = new TransferService();
        
        AccountOwner a = new AccountOwner("Já", "ma");
        a.setName("třímetová jámo");
        
        Account acc = new Account(a);
        
        AccountOwner bankOwner = new AccountOwner("šef", "banky");
        Account bankAccount = new Account(bankOwner);
        
        AccountOwner studentO = new AccountOwner("Sud", "vína");
        StudentAccount student = new StudentAccount(studentO, "Nejvyšší škola povýšenosti ÉTA");
        
        SavingsAccount savings = new SavingsAccount(a);
        
        BusinessAccount ihatecapitalism = new BusinessAccount(a);
        
        
        
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




