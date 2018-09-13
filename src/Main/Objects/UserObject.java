package Main.Objects;

public class UserObject {

    public String username;
    public String password;

    public static final String User_Name = "testing121";
    public static final String User_Password = "Letmein1234!!";

    public UserObject withName(String username) {
        this.username = username;
        return this;
    }

    public UserObject withPassword(String password) {
        this.password = password;
        return this;
    }
}
