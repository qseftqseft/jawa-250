package serialization;

import java.util.ArrayList;
import java.util.List;
import accounts.*;

public class GenericAccountXmlSerializationService {
    public String serialize(GenericAccountSerializable a){
        StringBuilder b = new StringBuilder();
        b.append("<account");
        b.append(" account-number=\"" + a.accountNumber + "\" ");
        b.append("/>");
        
        return "" + b;
    }
    public String serializeAll(List<GenericAccountSerializable> l){
        StringBuilder b = new StringBuilder();
        b.append("<accounts>");
        for (int i = 0; i < l.size(); i++){
            b.append(serialize(l.get(i)));
        }
        b.append("</accounts>");
        return "" + b;
    }
}
