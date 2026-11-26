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
import money.*;

public class App {
    public static void run(){
        Container container = new Container();
        
        
        BalanceCurrencyExchangable am = new BalanceCurrencyExchangable(0, "CZK", 1);
        
        
        
        AccountOwner a = container.accountOwnerFactory.createAccountOwner("Já", "ma");
        a.setName("třímetová jámo");
        
        
        am.setBalance(1000);
        GenericAccount acc = container.accountService.createAccount(a, am, container);
        GenericAccount businessAccount = container.accountServiceWithLoginAndTimeLogin.createBusinessAccount(a, am, container);
        
        am.setBalance(100);
        GenericAccount studentAccount = container.accountServiceWithLoginAndTimeLogin.createStudentAccount(a, am, "Vyšší než nejvyšší škola povýšenosti PÉTA", container);
        
        
        AccountOwner bankOwner = container.accountOwnerFactory.createAccountOwner("šef", "banky");
        Account bankAccount = container.accountFactory.createAccount(bankOwner, container);
        AccountOwner studentO = container.accountOwnerFactory.createAccountOwner("Sud", "vína");
        StudentAccount student = container.studentAccountFactory.createStudentAccount(studentO, "Nejvyšší škola povýšenosti ÉTA", container);
        SavingsAccount savings = container.savingsAccountFactory.createSavingsAccount(a, container);
        BusinessAccount ihatecapitalism = container.businessAccountFactory.createBusinessAccount(a, container);
        
        
        
        
        
        am.setBalance(1000);
        TransferService.add(acc, am);
        
        
        am.setBalance(500);
        TransferService.transfer(acc, ihatecapitalism, am);
        container.transferInstanceFactory.createTransferInstance(acc, ihatecapitalism, am);
        
        container.Notifier.notify(acc.getBalance().getBalance());
        container.Notifier.notify(ihatecapitalism.getBalance().getBalance());
        
        
        am.setBalance(250);
        TransferService.transfer(ihatecapitalism, savings, am);
        container.transferInstanceFactory.createTransferInstance(ihatecapitalism, savings, am);
        
        
        container.Notifier.notify(ihatecapitalism.getBalance().getBalance());
        container.Notifier.notify(savings.getBalance().getBalance());
        
        
        
        container.Notifier.notify(container.genericAccountJsonSerializationService.serialize(container.genericAccountSerializableFactory.createGenericAccountSerializable(ihatecapitalism)));
        
        
        List<GenericAccountSerializable> l = new ArrayList<GenericAccountSerializable>();
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(acc));
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(bankAccount));
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(student));
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(savings));
        l.add(container.genericAccountSerializableFactory.createGenericAccountSerializable(ihatecapitalism));
        
    }
    /*public static void TestLogging(AccountOwner a, Container container){
        System.out.println("---");
        System.out.println("LOGGING");
        
        
        am.setBalance(1000);
        GenericAccount acc = container.accountServiceWithLogin.createAccount(a, am, container);
        System.out.println("---");
        System.out.println("LOGGING WITH TIME");
        
        GenericAccount businessAccount = container.accountServiceWithTimeLogin.createBusinessAccount(a, am, container);
        System.out.println("---");
        System.out.println("LOGGING AND LOGGING WITH TIME");
        
        am.setBalance(100);
        GenericAccount studentAccount = container.accountServiceWithLoginAndTimeLogin.createStudentAccount(a, am, "Vyšší než nejvyšší škola povýšenosti PÉTA", container);
        System.out.println("---");
    }*/
}
