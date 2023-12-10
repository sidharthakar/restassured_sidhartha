package booking;

import utilis.jsonutilis;

import java.io.IOException;
import java.util.Map;

public class base {
    public static Map<String,Object> getdatafromfile;
    static {
        try {
            getdatafromfile= jsonutilis.getjsondata("qa_app.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
