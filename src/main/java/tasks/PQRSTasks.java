package tasks;

import models.DatesfeorPQRS;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.PQRSUserInterfaces;

public class PQRSTasks implements Task {
    DatesfeorPQRS datesfeorPQRS;

    public PQRSTasks(DatesfeorPQRS datesfeorPQRS) {
        this.datesfeorPQRS = datesfeorPQRS;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(PQRSUserInterfaces.BTN_PQRS));
        actor.wasAbleTo(Enter.theValue(datesfeorPQRS.getEmail()).into(PQRSUserInterfaces.TXT_CORREO));
        actor.wasAbleTo(Enter.theValue(datesfeorPQRS.getAffair()).into(PQRSUserInterfaces.TXT_ASUNTO));
        actor.wasAbleTo(Enter.theValue(datesfeorPQRS.getMenssage()).into(PQRSUserInterfaces.TXT_MENSAJE));
        actor.wasAbleTo(Click.on(PQRSUserInterfaces.BTN_ENVIAR));
    }
    public static PQRSTasks pqrsTasks(DatesfeorPQRS datesfeorPQRS){
        return Tasks.instrumented(PQRSTasks.class,datesfeorPQRS);
    }
}
