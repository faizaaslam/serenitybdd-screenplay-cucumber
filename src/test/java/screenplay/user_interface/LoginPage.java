package screenplay.user_interface;


import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static Target USERNAME = Target.the("user name field")
            .locatedBy("#user-name");

    public static Target PASSWORD = Target.the("password field")
            .locatedBy("#password");

    public static Target LOGIN = Target.the("login button")
            .locatedBy("#login-button");
}
