package tasks;

import models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginUserInterfaces;

public class LoginTasks implements Task {
    Credentials credentials;

    public LoginTasks(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(LoginUserInterfaces.A_GO_LOGIN));
        actor.wasAbleTo(Enter.theValue(credentials.getId()).into(LoginUserInterfaces.TXT_ID));
        actor.wasAbleTo(Enter.theValue(credentials.getPass()).into(LoginUserInterfaces.TXT_PASS));
        actor.wasAbleTo(Click.on(LoginUserInterfaces.BTN_LOGIN));
    }
    public static LoginTasks loginTasks(Credentials credentials){
        return Tasks.instrumented(LoginTasks.class,credentials);
    }
}
