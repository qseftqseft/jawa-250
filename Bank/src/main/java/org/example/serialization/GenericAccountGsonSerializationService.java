package serialization;

import java.util.ArrayList;
import java.util.List;
import accounts.*;
import com.google.gson.Gson;


public class GenericAccountGsonSerializationService {
    
    Gson gson = new Gson();
    GenericAccountSerializableFactory bankAccountSerializeFactory = new GenericAccountSerializableFactory();
    
    public String serialize(serialization.GenericAccountSerializable bankAccount) {
        return gson.toJson(bankAccount);
    }
    
    public String serializeAll(List<GenericAccountSerializable> bankAccounts) {
        return gson.toJson(bankAccounts);
    }
}
