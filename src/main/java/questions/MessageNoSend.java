package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.PQRSUserInterfaces;

public class MessageNoSend implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PQRSUserInterfaces.TXT_VERIFICACION_INCORRECT).viewedBy(actor).asString();
    }
    public static MessageNoSend messagenoSend(){
       return new MessageNoSend();
    }
}
