package transfers;

import accounts.GenericAccount;
import java.util.ArrayList;
import java.util.List;

public class TransferLoggerService {
    private ArrayList<TransferInstance> transferHistory;
    
    public TransferLoggerService(){
        transferHistory = new ArrayList<TransferInstance>();
    }
    
    public void log(TransferInstance t){
        transferHistory.add(t);
    }
    
    //prob. unsafe, you shouldn't be able to just 'get' all of the transactions but oh well...
    public ArrayList<TransferInstance> getTransferHistory(){
        return transferHistory;
    }
}
