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
        
        AccountOwner a = container.accountOwnerFactory.createAccountOwner("Já", "ma");
        a.setName("třímetová jámo");
        
        BalanceCurrencyExchangable balanceCurrencyExchangable = new BalanceCurrencyExchangable(0, "CZK", 1);
        
        GenericAccount acc = container.accountService.createAccount(a, balanceCurrencyExchangable.create(50, "EUR", 0.04), container);
        GenericAccount businessAccount = container.accountServiceWithLoginAndTimeLogin.createBusinessAccount(a, BalanceCurrencyExchangable.create(1000, "CZK", 1), container);
        GenericAccount studentAccount = container.accountServiceWithLoginAndTimeLogin.createStudentAccount(a, BalanceCurrencyExchangable.create(100, "CZK", 1), "Vyšší než nejvyšší škola povýšenosti PÉTA", container);
        
        
        AccountOwner bankOwner = container.accountOwnerFactory.createAccountOwner("šef", "banky");
        Account bankAccount = container.accountFactory.createAccount(bankOwner, container);
        AccountOwner studentO = container.accountOwnerFactory.createAccountOwner("Sud", "vína");
        StudentAccount student = container.studentAccountFactory.createStudentAccount(studentO, "Nejvyšší škola povýšenosti ÉTA", container);
        SavingsAccount savings = container.savingsAccountFactory.createSavingsAccount(a, container);
        BusinessAccount ihatecapitalism = container.businessAccountFactory.createBusinessAccount(a, container);
        
        
        //am.setBalance(100);
        //acc.setBalance(am);
        
        container.Notifier.notify("EUR: " + acc.getBalance().getBalance());
        container.Notifier.notify("CZK: " + acc.getBalanceInCzk());
        
        
        
        TransferService.add(acc, BalanceCurrencyExchangable.create(1000, "CZK", 1));
        
        
        TransferService.transfer(acc, ihatecapitalism, BalanceCurrencyExchangable.create(500, "CZK", 1));
        container.transferInstanceFactory.createTransferInstance(acc, ihatecapitalism, BalanceCurrencyExchangable.create(500, "CZK", 1));
        
        container.Notifier.notify(acc.getBalance().getBalance());
        container.Notifier.notify(ihatecapitalism.getBalance().getBalance());
        
        
        TransferService.transfer(ihatecapitalism, savings, BalanceCurrencyExchangable.create(498, "CZK", 1));
        container.transferInstanceFactory.createTransferInstance(ihatecapitalism, savings, BalanceCurrencyExchangable.create(500, "CZK", 1));
        
        
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
