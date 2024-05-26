package UsersTest.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
//@JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;


    private String name;
    private String email;
@JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")

    private String lastName;
    private String avatar;
public User(){}
    public User (String id , String email , String firstName , String lastName , String avatar ){
        this.id = id ;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar= avatar;
    }

    public User ( String name , String email  ){
        this.email = email;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonProperty
    public String getFirst_name() {
        return firstName;
    }
    @JsonProperty
    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }
    @JsonProperty
    public String getLast_name() {
        return lastName;
    }
    @JsonProperty
    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
