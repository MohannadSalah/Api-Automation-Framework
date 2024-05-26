package UsersTest;


import UsersTest.Api.UsersApi;
import UsersTest.Data.dataProviders;
import UsersTest.models.User;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Feature("Users Feature")
public class UsersTestCases {


@Story("Get a User")
    @Test(description = "Should Be Able To Get User" )
    public void shouldBeAbleToGetUser() {


        User user = new User("3" ,
                "emma.wong@reqres.in" ,
                "Emma" ,
                "Wong" ,
                "https://reqres.in/img/faces/3-image.jpg");
        Response response= UsersApi.GetUser(user);

        assertThat(response.statusCode() , equalTo(200));
        assertThat(response.path("data.first_name") , equalTo("Emma"));

    }


@Story("Get a Page")
    @Test(description = "Should Be Able To Get All Pages" )
    public void shouldBeAbleToGetAllPages() {
        User user = new User();
        Response response = UsersApi.GetThePage(user);

        assertThat(response.statusCode() , equalTo(200));
        assertThat(response.path("page") , equalTo(2));
        assertThat(response.path("data") , hasSize(6));
       // assertThat(response.path("data") , everyItem(containsString("@reqres.in")));

    }


@Story("Create a User")
    @Test(description = "Should Be Able To Create User" )
    public void shouldBeAbleToCreateUser() {
        User user = new User(
                "mohannad" ,
                "mohannadsalah228@gmail.com" );
Response response =
       UsersApi.PostNewUser(user);
        assertThat(response.statusCode() , equalTo(201));
        assertThat(response.path("name") , equalTo("mohannad"));
        assertThat(response.path("email") , equalTo("mohannadsalah228@gmail.com"));

    }


@Story("Put a User")
    @Test(description = "Should Be Able To Put User" )
    public void shouldBeAbleToPutUser() {
        User user = new User(
                "mohannad" ,
                "mohannadsalah228@gmail.com" );
        Response response =
UsersApi.PutFunction(user);
        assertThat(response.statusCode() , equalTo(200));
        assertThat(response.path("name") , equalTo("mohannad"));
        assertThat(response.path("email") , equalTo("mohannadsalah228@gmail.com"));
    }


@Story( "Delete a User" )
    @Test(description = "Should Be Able To Delete User" )
    public void shouldBeAbleToDeleteUser(){
        User user = new User();
       UsersApi.DeleteFunction(user);


    }


}
