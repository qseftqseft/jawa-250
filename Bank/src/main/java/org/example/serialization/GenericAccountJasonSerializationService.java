package serialization;

import accounts.GenericAccount;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.util.ArrayList;
import java.util.List;
import accounts.*;




public class GenericAccountJasonSerializationService {
    XmlMapper xmlMapper = new XmlMapper();
    
    public String serialize(serialization.GenericAccountSerializable bankAccount) {
        //xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try{
            String xml = xmlMapper.writeValueAsString(bankAccount);
            return xml;
        }
        catch(Exception e){}
        return "";

    }
    
    public String serializeAll(List<GenericAccountSerializable> bankAccounts) {
        //xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try{
            String xml = xmlMapper.writeValueAsString(bankAccounts);
            return xml;
        }
        catch(Exception e){}
        return "";
    }
}
