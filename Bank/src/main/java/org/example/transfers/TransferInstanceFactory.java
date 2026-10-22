package transfers;

import accounts.GenericAccount;

public class TransferInstanceFactory {
    public TransferInstance createTransferInstance(GenericAccount a1, GenericAccount a2, double amount){
        return new TransferInstance(a1, a2, amount);
    }
}
