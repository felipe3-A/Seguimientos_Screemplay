package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.InfoGuidelinesUserInterfaces;

public class SeeInfo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(InfoGuidelinesUserInterfaces.BTN_GUIDELINES));
    }
    public static SeeInfo seeInfo(){
        return Tasks.instrumented(SeeInfo.class);
    }
}
