package UsersTest.Api;

import UsersTest.models.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UsersApi {
    public static Response GetUser(User user){

               return given()
                        .baseUri("https://reqres.in")
                        .contentType(ContentType.JSON)
                        .body(user)
                        .when()
                        .get("/api/users/3")
                        .then()
                        .log()
                        .all().extract().response();
    }
    public static Response GetThePage(User user){
      return   given().
                baseUri("https://reqres.in/api").
                when().
                get("/users?page=2").
                then().extract().response();
    }
    public static Response PostNewUser(User user){
        return  given().
                baseUri("https://reqres.in/api").
                contentType(ContentType.JSON)
                .body(user).
                when().
                post("/users").
                then().extract().response();
    }
    public static Response PutFunction(User user){
        return         given().
                baseUri("https://reqres.in/api").
                contentType(ContentType.JSON).
                body(user).
                when().
                put("/users/2").
                then().extract().response();
    }
    public static Response DeleteFunction(User user){
        return  given().
                baseUri("https://reqres.in/api").
                when().
                delete("/users/2").
                then().statusCode(204)
                .extract().response();
    }

}
