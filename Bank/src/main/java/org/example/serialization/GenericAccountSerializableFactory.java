package serialization;

import accounts.*;

public class GenericAccountSerializableFactory {
    public GenericAccountSerializable createGenericAccountSerializable(GenericAccount a){
        return new GenericAccountSerializable(a);
    }
}
