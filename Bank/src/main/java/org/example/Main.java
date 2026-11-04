import java.util.ArrayList;
import java.util.List;

import accounts.*;
import decorators.*;
import people.AccountOwner;
import people.AccountOwnerFactory;
import transfers.*;
import notifiers.*;
import serialization.*;
import logging.*;

public class Main {
    public static void main(String[] args) {
        //industry, Production, FACTORES EVERYWHERE!!!
        ConsoleNotifierFactory consoleNotifierFactory = new ConsoleNotifierFactory(); //fac
        AccountFactory accountFactory = new AccountFactory(); //fac
        AccountOwnerFactory accountOwnerFactory = new AccountOwnerFactory(); //fac
        StudentAccountFactory studentAccountFactory = new StudentAccountFactory(); //fac
        SavingsAccountFactory savingsAccountFactory = new SavingsAccountFactory(); //fac
        BusinessAccountFactory businessAccountFactory = new BusinessAccountFactory(); //fac
        TransferInstanceFactory transferInstanceFactory = new TransferInstanceFactory(); //fac
        GenericAccountSerializableFactory genericAccountSerializableFactory = new GenericAccountSerializableFactory(); //fac
        
        
        Notifier Notifier = consoleNotifierFactory.createConsoleNotifier();
        GenericAccountJsonSerializationService genericAccountJsonSerializationService = new GenericAccountJsonSerializationService();
        GenericAccountXmlSerializationService genericAccountXmlSerializationService = new GenericAccountXmlSerializationService();
        GenericAccountGsonSerializationService genericAccountGsonSerializationService = new GenericAccountGsonSerializationService();
        GenericAccountJasonSerializationService genericAccountJasonSerializationService = new GenericAccountJasonSerializationService();
        
        
        
        AccountOwner a = accountOwnerFactory.createAccountOwner("Já", "ma");
        a.setName("třímetová jámo");
        
        
        
        IAccountService accountService = new AccountService();
        IAccountService accountServiceWithLogin = new AccountLoggingService(accountService);
        IAccountService accountServiceWithTimeLogin = new AccountLoggingWithTimeService(accountService);
        IAccountService accountServiceWithLoginAndTimeLogin= new AccountLoggingService(accountServiceWithTimeLogin);
        
        System.out.println("---");
        
        System.out.println("LOGGING");
        GenericAccount acc = accountServiceWithLogin.createAccount(a, 1000);
        System.out.println("---");
        
        System.out.println("LOGGING WITH TIME");
        GenericAccount businessAccount = accountServiceWithTimeLogin.createBusinessAccount(a, 1000);
        System.out.println("---");
        
        System.out.println("LOGGING AND LOGGING WITH TIME");
        GenericAccount studentAccount = accountServiceWithLoginAndTimeLogin.createStudentAccount(a, 100, "Vyšší než nejvyšší škola povýšenosti PÉTA");
        System.out.println("---");
        
        
        AccountOwner bankOwner = accountOwnerFactory.createAccountOwner("šef", "banky");
        Account bankAccount = accountFactory.createAccount(bankOwner);
        AccountOwner studentO = accountOwnerFactory.createAccountOwner("Sud", "vína");
        StudentAccount student = studentAccountFactory.createStudentAccount(studentO, "Nejvyšší škola povýšenosti ÉTA");
        SavingsAccount savings = savingsAccountFactory.createSavingsAccount(a);
        BusinessAccount ihatecapitalism = businessAccountFactory.createBusinessAccount(a);
        
        
        
        
        
        
        TransferService.add(acc, 1000);
        
        TransferService.transfer(acc, ihatecapitalism, 500);
        transferInstanceFactory.createTransferInstance(acc, ihatecapitalism, 500);
        
        Notifier.notify(acc.getBalance());
        Notifier.notify(ihatecapitalism.getBalance());
        
        
        TransferService.transfer(ihatecapitalism, savings, 250);
        transferInstanceFactory.createTransferInstance(ihatecapitalism, savings, 250);
        
        
        Notifier.notify(ihatecapitalism.getBalance());
        Notifier.notify(savings.getBalance());
        
        
        
        Notifier.notify(genericAccountJsonSerializationService.serialize(genericAccountSerializableFactory.createGenericAccountSerializable(ihatecapitalism)));
        
        
        List<GenericAccountSerializable> l = new ArrayList<GenericAccountSerializable>();
        l.add(genericAccountSerializableFactory.createGenericAccountSerializable(acc));
        l.add(genericAccountSerializableFactory.createGenericAccountSerializable(bankAccount));
        l.add(genericAccountSerializableFactory.createGenericAccountSerializable(student));
        l.add(genericAccountSerializableFactory.createGenericAccountSerializable(savings));
        l.add(genericAccountSerializableFactory.createGenericAccountSerializable(ihatecapitalism));
        
        //Notifier.notify(genericAccountGsonSerializationService.serializeAll(l));
        //Notifier.notify(genericAccountJasonSerializationService.serializeAll(l));
        
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




