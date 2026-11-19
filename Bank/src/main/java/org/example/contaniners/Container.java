package containers;

import accounts.*;
import decorators.*;
import people.AccountOwner;
import people.AccountOwnerFactory;
import transfers.*;
import notifiers.*;
import serialization.*;
import logging.*;


public class Container {
        //industry, Production, FACTORES EVERYWHERE!!!
        public ConsoleNotifierFactory consoleNotifierFactory = new ConsoleNotifierFactory(); //fac
        public AccountFactory accountFactory = new AccountFactory(); //fac
        public AccountOwnerFactory accountOwnerFactory = new AccountOwnerFactory(); //fac
        public StudentAccountFactory studentAccountFactory = new StudentAccountFactory(); //fac
        public SavingsAccountFactory savingsAccountFactory = new SavingsAccountFactory(); //fac
        public BusinessAccountFactory businessAccountFactory = new BusinessAccountFactory(); //fac
        public TransferInstanceFactory transferInstanceFactory = new TransferInstanceFactory(); //fac
        public GenericAccountSerializableFactory genericAccountSerializableFactory = new GenericAccountSerializableFactory(); //fac
        
        public Notifier Notifier = consoleNotifierFactory.createConsoleNotifier();
        public GenericAccountJsonSerializationService genericAccountJsonSerializationService = new GenericAccountJsonSerializationService();
        public GenericAccountXmlSerializationService genericAccountXmlSerializationService = new GenericAccountXmlSerializationService();
        public GenericAccountGsonSerializationService genericAccountGsonSerializationService = new GenericAccountGsonSerializationService();
        public GenericAccountJasonSerializationService genericAccountJasonSerializationService = new GenericAccountJasonSerializationService();
        
        public IAccountService accountService = new AccountService();
        public IAccountService accountServiceWithLogin = new AccountLoggingService(accountService);
        public IAccountService accountServiceWithTimeLogin = new AccountLoggingWithTimeService(accountService);
        public IAccountService accountServiceWithLoginAndTimeLogin= new AccountLoggingService(accountServiceWithTimeLogin);
        
        public AccountNumberService accountNumberService = new AccountNumberService();
}
