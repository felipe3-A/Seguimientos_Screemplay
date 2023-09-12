package tasks;

import models.Dates_Aprendice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.CreatednewAprendice;

public class NewAprendice implements Task {
    Dates_Aprendice datesAprendice;

    public NewAprendice(Dates_Aprendice datesAprendice) {
        this.datesAprendice = datesAprendice;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Enter.theValue(datesAprendice.getNombre()).into(CreatednewAprendice.TXT_NOMBRES));
        actor.wasAbleTo(Enter.theValue(datesAprendice.getApellidos()).into(CreatednewAprendice.TXT_APELLIDOS));

    }
}
