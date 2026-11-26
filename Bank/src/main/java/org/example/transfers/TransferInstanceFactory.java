package transfers;

import accounts.GenericAccount;
import money.BalanceCurrencyExchangable;

public class TransferInstanceFactory {
    public TransferInstance createTransferInstance(GenericAccount a1, GenericAccount a2, BalanceCurrencyExchangable amount){
        return new TransferInstance(a1, a2, amount);
    }
}
