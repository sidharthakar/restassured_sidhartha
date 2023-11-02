package payload;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class booking_payload {

    public static String create_booking_payload(String fname,String lname){
        return "{\n" +
                "    \"firstname\" : \""+fname+"\",\n" +
                "    \"lastname\" : \""+lname+"\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
    }

    public static Map<String, Object> create_booking_data(String fname, String lname,int totalprice,String checkin,String checkout){
        Map<String, Object> newpayload= new HashMap<>();
        newpayload.put("firstname",fname);
        newpayload.put("lastname",lname);
        newpayload.put("totalprice",totalprice);
        newpayload.put("depositpaid",true);

        Map<String,Object> bookingdates = new HashMap<>();
        bookingdates.put("checkin",checkin);
        bookingdates.put("checkout",checkout);

        newpayload.put("bookingdates",bookingdates);
        newpayload.put("additionalneeds","Breakfast");

return newpayload;
    }
}
