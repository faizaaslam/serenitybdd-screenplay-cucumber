package screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.model.Users;

import static screenplay.user_interface.LoginPage.*;


public class Login {
    public static Performable asA(Users standarduser){
        return Task.where("{0} attempts to login with " + standarduser,
                Enter.theValue(standarduser.username())
                        .into(USERNAME),
                Enter.theValue(standarduser.password())
                        .into(PASSWORD),
                Click.on(LOGIN));
    }
}
