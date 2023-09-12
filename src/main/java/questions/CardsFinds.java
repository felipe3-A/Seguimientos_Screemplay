package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.InfoGuidelinesUserInterfaces;

public class CardsFinds implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(InfoGuidelinesUserInterfaces.TXT_V_1).viewedBy(actor).asString();
    }
    public  static CardsFinds cardsFinds(){
        return new CardsFinds();
    }
}
