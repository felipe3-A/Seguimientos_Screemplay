package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterfaces {
    public  static final Target A_GO_LOGIN=Target.the("Ir al modulo login").locatedBy("//a[@href=\"#/login\"]");
    public  static final Target TXT_ID=Target.the("Ingresar id").locatedBy("//input[@id=\"identificacion_usuario\"]");
    public  static final Target TXT_PASS=Target.the("Ingresa pass").locatedBy("//input[@id=\"password_usuario\"]");
    public  static final Target BTN_LOGIN=Target.the("Ir al modulo del usuario").locatedBy("//button[@id=\"usuario\"]");
}
