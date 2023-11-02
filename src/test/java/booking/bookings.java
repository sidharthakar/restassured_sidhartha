package booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payload.booking_payload;
import utilis.jsonutilis;
import utilis.rest_utilis;
import utilis.rest_utilis.*;
import payload.booking_payload.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class bookings {

    @Test
    public void get_allbooking() throws IOException {
        Map<String,Object> data= jsonutilis.getjsondata("QA/qa_app.json");
       Response response = rest_utilis.performget((String) data.get("qaendpoint"),new HashMap<>(),"booking");
       Assert.assertEquals(response.statusCode(),200,"Validate Status Code");

    }
    @Test
    public void create_booking() throws IOException {
        Map<String,Object> data= jsonutilis.getjsondata("QA/qa_app.json");
        String payload=booking_payload.create_booking_payload("Sidhartha","Kar");
       Response response= rest_utilis.performpost((String) data.get("qaendpoint"), payload,new HashMap<>(),"booking");
       Assert.assertEquals(response.statusCode(),200,"Asserted Status Code");


    }
    @Test
    public void booking_create() throws IOException {
        Map<String,Object> data= jsonutilis.getjsondata("QA/qa_app.json");
        Map<String,Object> booking_payload= payload.booking_payload.create_booking_data("Sidzz","Kar",111,"2023-01-01","2023-01-03");
        Response response=rest_utilis.performpost((String) data.get("qaendpoint"),booking_payload,new HashMap<>(),"booking");
        Assert.assertEquals(response.statusCode(),200);

    }
}
