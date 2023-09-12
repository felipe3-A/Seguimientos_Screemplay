package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PQRSUserInterfaces {

    public static final Target BTN_PQRS=Target.the("ir a PQRS").locatedBy("//a[@href=\"#contacto\"]");
    public static final Target TXT_CORREO=Target.the("escribir el correo").locatedBy("//input[@type=\"email\"]");
    public static final Target TXT_ASUNTO=Target.the("escribir el asunto").locatedBy("//input[@name=\"asunto\"]");
    public static final Target TXT_MENSAJE=Target.the("escribir el mensaje").locatedBy("//input[@name=\"message\"]");
    public static final Target BTN_ENVIAR=Target.the("boton para enviar el mensaje").locatedBy("//button[@type=\"submit\"]");
    public static final Target TXT_VERIFICACION=Target.the("texto de verificacion").locatedBy("(//h2[text()=\"Mensaje enviado\"])");
    public static final Target TXT_VERIFICACION_INCORRECT=Target.the("texto de verificacion").locatedBy("(//h2[text()=\"Error\"])");
}
