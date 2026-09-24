public class Main {
    public static void main(String[] args) {
        Notifier Notifier = new ConsoleNotifier();
        
        AccountOwner a = new AccountOwner("Já", "ma");
        a.setName("třímetová jámo");
        
        Account acc = new Account(a);
        
        AccountOwner bankOwner = new AccountOwner("šef", "banky");
        Account bankAccount = new Account(bankOwner);
        
        acc.unsafeAddBalance(400);
        
        bankAccount = (Account)acc.transfer(bankAccount, 42.9);
        
        //System.out.println( acc.getBalance() );
        //System.out.println( bankAccount.getBalance() );
        
        
        
        
        AccountOwner studentO = new AccountOwner("Sud", "vína");
        StudentAccount student = new StudentAccount(studentO, "Nejvyšší škola povýšenosti ÉTA");
        
        acc = (Account)student.transfer(acc, 4990);
        
        //System.out.println( acc.getBalance() );
        //System.out.println( student.getBalance() );
        
        
        
        SavingsAccount savings = new SavingsAccount(a);
        
        savings = (SavingsAccount)acc.transfer(savings, 1000);
        
        //System.out.println( acc.getBalance() );
        
        
        
        
        
        BusinessAccount ihatecapitalism = new BusinessAccount(a);
        //ihatecapitalism.unsafeAddBalance(10);
        
        Notifier.notify("Savings: " + savings.getBalance() );
        Notifier.notify("ihatecapitalism: " + ihatecapitalism.getBalance() );
        
        savings = (SavingsAccount)ihatecapitalism.transfer(savings, 1000);
        
        Notifier.notify( "Transfered 1000 from ihatecapitalism to savings" );
        Notifier.notify("Savings: " + savings.getBalance() );
        Notifier.notify("ihatecapitalism: " + ihatecapitalism.getBalance() );
    }
}




