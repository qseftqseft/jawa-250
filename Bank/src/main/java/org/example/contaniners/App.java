package containers;

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


public class App {
    public static void run(){
        Container container = new Container();
        AccountOwner a = container.accountOwnerFactory.createAccountOwner("Já", "ma");
        a.setName("třímetová jámo");
        
        GenericAccount acc = container.accountServiceWithLoginAndTimeLogin.createAccount(a, 1000);
        GenericAccount businessAccount = container.accountServiceWithLoginAndTimeLogin.createBusinessAccount(a, 1000);
        GenericAccount studentAccount = container.accountServiceWithLoginAndTimeLogin.createStudentAccount(a, 100, "Vyšší než nejvyšší škola povýšenosti PÉTA");
        
        
        AccountOwner bankOwner = container.accountOwnerFactory.createAccountOwner("šef", "banky");
        Account bankAccount = container.accountFactory.createAccount(bankOwner);
        AccountOwner studentO = container.accountOwnerFactory.createAccountOwner("Sud", "vína");
        StudentAccount student = container.studentAccountFactory.createStudentAccount(studentO, "Nejvyšší škola povýšenosti ÉTA");
        SavingsAccount savings = container.savingsAccountFactory.createSavingsAccount(a);
        BusinessAccount ihatecapitalism = container.businessAccountFactory.createBusinessAccount(a);
        
        
        
        
        
        
        TransferService.add(acc, 1000);
        
        TransferService.transfer(acc, ihatecapitalism, 500);
        container.transferInstanceFactory.createTransferInstance(acc, ihatecapitalism, 500);
        
        container.Notifier.notify(acc.getBalance());
        container.Notifier.notify(ihatecapitalism.getBalance());
        
        
        TransferService.transfer(ihatecapitalism, savings, 250);
        container.transferInstanceFactory.createTransferInstance(ihatecapitalism, savings, 250);
        
        
        container.Notifier.notify(ihatecapitalism.getBalance());
        container.Notifier.notify(savings.getBalance());
        
        
        
        container.Notifier.notify(container.genericAccountJsonSerializationService.serialize(container.genericAccountSerializableFactory.createGenericAccountSerializable(ihatecapitalism)));
        
        
        List<GenericAccountSerializable> l = new ArrayList<GenericAccountSerializable>();
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(acc));
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(bankAccount));
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(student));
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(savings));
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(ihatecapitalism));
    }
    public static void TestLogging(AccountOwner a, Container container){
        System.out.println("---");
        System.out.println("LOGGING");
        GenericAccount acc = container.accountServiceWithLogin.createAccount(a, 1000);
        System.out.println("---");
        System.out.println("LOGGING WITH TIME");
        GenericAccount businessAccount = container.accountServiceWithTimeLogin.createBusinessAccount(a, 1000);
        System.out.println("---");
        System.out.println("LOGGING AND LOGGING WITH TIME");
        GenericAccount studentAccount = container.accountServiceWithLoginAndTimeLogin.createStudentAccount(a, 100, "Vyšší než nejvyšší škola povýšenosti PÉTA");
        System.out.println("---");
    }
}
