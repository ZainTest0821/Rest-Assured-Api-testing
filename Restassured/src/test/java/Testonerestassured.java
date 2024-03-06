import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class Testonerestassured {
   /* @Test
    public void Test(){
        Response response= get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("Content-type"));

        // Use assertion
       int response1= response.getStatusCode();
        Assert.assertEquals(response1,200);
    }
    @Test
   public void testget() {
       baseURI = "https://reqres.in/api";
       given()
               .get("/users?page=2")
               .then()
               .statusCode(200)
               .body("data[1].first_name", equalTo("Lindsay"))
               .body("data.first_name", hasItems("Tobias", "Rachel" ,"Byron"));
   }

    @Test
    public void testpost() {

        Map<String, Object> map = new HashMap<String, Object>();

        JSONObject json = new JSONObject();
      json.put("name","Zain");
        json.put("Job","SQA");
        System.out.println(json.toString());
        baseURI="https://reqres.in/api";
        given().body(json.toJSONString()).when()
                .post("/api/users" ).then()
                .statusCode(201);
        }
    @Test
    void testdelete(){

        baseURI="https://reqres.in";
     when()
                .delete("/api/users/2" ).then()
                .statusCode(204).log().all();
    }




    // Test on local api

    @Test
    void testlocal(){
        baseURI="http://localhost:3000/";
        given().get("/users").then().statusCode(200).log().all();

    }

    @Test
    void postcheck(){

        JSONObject requestJson = new JSONObject();
        requestJson.put("firstname", "Thomas");
        requestJson.put("lastname", "Godan");
        requestJson.put("subjectid", 1);

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestJson.toJSONString())
                .when()
                .post("/users") // Replace with the actual endpoint
                .then()
                .statusCode(201).log().all(); // Replace with the expected status code
    }


    @Test
    void puttest(){

        JSONObject requestJson = new JSONObject();
        requestJson.put("firstname", "Tdd");
        requestJson.put("lastname", "Godan");
        requestJson.put("subjectid", 1);

        baseURI="http://localhost:3000/";

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestJson.toJSONString())
                .when()
                .put("/users/4") // Replace with the actual endpoint
                .then()
                .statusCode(200).log().all(); // Replace with the expected status code
    }

    @Test
    void patchtest() {

        JSONObject requestJson = new JSONObject();

        requestJson.put("lastname", "gyadiii");

        baseURI = "http://localhost:3000/";

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestJson.toJSONString())
                .when()
                .patch("/users/4") // Replace with the actual endpoint
                .then()
                .statusCode(200).log().all(); // Replace with the expected status code
    }

    @Test
    void deletetest(){
        baseURI="http://localhost:3000/";
        when().delete("/users/5").then().statusCode(200);
    }*/


    @Test
    public void testjsonschema() {
        baseURI = "https://reqres.in";
        given()
                .get("/api/users?page=2")
                .then()
                .assertThat().body(matchesJsonSchemaInClasspath("schema.json.txt"))
                .statusCode(200).log().all();

    }
}

