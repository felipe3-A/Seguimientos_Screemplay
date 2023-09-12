package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.PQRSUserInterfaces;

public class MessageSend implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PQRSUserInterfaces.TXT_VERIFICACION).viewedBy(actor).asString();
    }
    public static MessageSend messageSend(){
       return new MessageSend();
    }
}
