package no.stelar7.api.l4j8.basic.serializer;

import com.google.gson.*;
import no.stelar7.api.l4j8.basic.constants.types.*;

import java.lang.reflect.Type;
import java.util.*;

public class RoleTypeDeserializer implements JsonDeserializer<RoleType>
{
    
    @Override
    @SuppressWarnings("unchecked")
    public RoleType deserialize(JsonElement json, Type t, JsonDeserializationContext context)
    {
        String          id     = json.getAsString();
        List<CodedEnum> values = Arrays.asList(((Class<CodedEnum>) t).getEnumConstants());
        Optional<Object> retu = values.stream()
                                      .map(v -> v.getFromCode(id))
                                      .filter(Optional::isPresent)
                                      .map(Optional::get)
                                      .findFirst();
        
        return retu.map(o -> (RoleType) o).orElseGet(() -> (RoleType) CodedEnum.printError(t, id));
    }
}
