package utilis;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class jsonutilis {
    private static ObjectMapper objmapper = new ObjectMapper();
    public static Map<String,Object> getjsondata(String Jsonfilename) throws IOException {
        String jsonpath= System.getProperty("user.dir")+"/src/test/resources/"+Jsonfilename;
        Map<String,Object> data= objmapper.readValue(new File(jsonpath), new TypeReference<>() {});
        return data;
    }

}
