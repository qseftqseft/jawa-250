package transfers;

import accounts.GenericAccount;

public class TransferServiceFactory {
    public TransferService creteTransferService() {
        return new TransferService();
    }
}
