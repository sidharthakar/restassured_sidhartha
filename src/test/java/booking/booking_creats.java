package booking;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import utilis.rest_utilis;

import java.util.HashMap;
import java.util.Map;

public class booking_creats {

    public Response create_new_bookins(Map<String,Object> create_book_payload) {
       String endpoint = (String) base.getdatafromfile.get("qaendpoint");
        Response response = rest_utilis.performpost(endpoint, create_book_payload, new HashMap<>(), "booking");
        return response;
    }

}
