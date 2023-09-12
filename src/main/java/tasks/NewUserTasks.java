package tasks;

import models.Dates_new_1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.CreatenewUserInterfaces;
import userinterfaces.MainUserInterfaces;

public class NewUserTasks implements Task {
    Dates_new_1 dates_new_1;

    public NewUserTasks(Dates_new_1 dates_new_1) {
        this.dates_new_1 = dates_new_1;
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(MainUserInterfaces.BTN_USUARIOS));
        actor.wasAbleTo(Click.on(CreatenewUserInterfaces.BTN_NUEVO));
        actor.wasAbleTo(Enter.theValue(dates_new_1.getNombres()).into(CreatenewUserInterfaces.TXT_NOMBRES));
        actor.wasAbleTo(Enter.theValue(dates_new_1.getApellidos()).into(CreatenewUserInterfaces.TXT_APELLIDOS));
        actor.wasAbleTo(Enter.theValue(dates_new_1.getCorreo()).into(CreatenewUserInterfaces.TXT_EMAIL));
        actor.wasAbleTo(Enter.theValue(dates_new_1.getID()).into(CreatenewUserInterfaces.TXT_ID));
        actor.wasAbleTo(Enter.theValue(dates_new_1.getCorreo_alternativo()).into(CreatenewUserInterfaces.TXT_EMAIL_ALTERNATIVO));
        actor.wasAbleTo(Enter.theValue(dates_new_1.getResidencia()).into(CreatenewUserInterfaces.TXT_CIUDAD_RESIDENCIA));
    }

    public static NewUserTasks newUserTasks(Dates_new_1 newUserTasks){
        return Tasks.instrumented(NewUserTasks.class,newUserTasks);
    }
}
