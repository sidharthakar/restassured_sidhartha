package utilis;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class rest_utilis {

    public static Response performpost(String baseurl, Object request_payload, Map<String,String> headers, String path){
        return    RestAssured.given()
                 .baseUri(baseurl)
                 .headers(headers)
                 .contentType(ContentType.JSON)
                 .when()
                 .body(request_payload)
                 .post(path)
                 .then().extract().response();
    }
    public static Response performget(String baseurl, Map<String,String> headers, String path){
       return RestAssured.given()
                .baseUri(baseurl)
                .headers(headers).contentType(ContentType.JSON)
                .when().get(path)
                .then().extract().response();
    }
}
