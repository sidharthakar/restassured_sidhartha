package booking;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Map;

public class create_booking extends booking_creats{

    @Test
    public void booking_create() throws IOException {
        Map<String, Object> booking_payload = payload.booking_payload.create_booking_data("Sidzz01", "Kar", 111, "2023-01-01", "2023-01-03");
        Response response = create_new_bookins(booking_payload);
        Assert.assertEquals(response.statusCode(), 200);
        System.out.println(response.asString());

    }

    @Test
    public void booking_happen(){

    }

}
