package utilis;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class jsonutilis {

    private static ObjectMapper objmapper = new ObjectMapper();
    /*--Method to fetch data from the Json file for endpoint -- */
    public static Map<String,Object> getjsondata(String Jsonfilename) throws IOException {

        /*Pass the enviorment details through comand line */
        String env=System.getProperty("env")==null?"QA" :System.getProperty("env");
        String jsonpath= System.getProperty("user.dir")+"/src/test/resources/"+env+"/"+Jsonfilename;
        Map<String,Object> data= objmapper.readValue(new File(jsonpath), new TypeReference<>() {});
        return data;
    }

}
