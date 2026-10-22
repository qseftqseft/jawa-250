package serialization;

import java.util.ArrayList;
import java.util.List;
import accounts.*;

public class GenericAccountJsonSerializationService {
    public String serialize(GenericAccountSerializable a){
        StringBuilder b = new StringBuilder();
        b.append("{");
        b.append("\"accountNumber\":\"" + a.accountNumber + "\"");
        b.append("}");
        
        return "" + b;
    }
    public String serializeAll(List<GenericAccountSerializable> l){
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i = 0; i < l.size(); i++){
            b.append(serialize(l.get(i)));
            if(i != l.size()-1) b.append(",");
        }
        b.append("]");
        return "" + b;
    }
}
