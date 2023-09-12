package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreatenewUserInterfaces {
    public static final Target BTN_NUEVO=Target.the("Boton ara ir al modulo de crear usuarios").locatedBy("//button[@class=\"btn btn-success\"]");
    public  static final Target TXT_NOMBRES=Target.the("Escribir nombres").locatedBy("//input[@formcontrolname=\"nombres\"]");
    public  static final Target TXT_APELLIDOS=Target.the("Escribir apellidos").locatedBy("//input[@formcontrolname=\"apellidos\"]");
    public  static final Target SELECT_SEX=Target.the("Selecionar sexo").locatedBy("//mat-select[@formcontrolname=\"genero\"]");
    public  static final Target TXT_EMAIL=Target.the("Escribir email").locatedBy("//input[@type=\"email\"]");
    public  static final Target TXT_EMAIL_ALTERNATIVO=Target.the("Escribir email alternativo").locatedBy("//input[@type=\"correo_alternativo\"]");
    public  static final Target TXT_CIUDAD_RESIDENCIA=Target.the("Escribir ciudad residencia").locatedBy("//input[@formcontrolname=\"ciudad_residencia\"]");
    public  static final Target SLT_AREA=Target.the("Selecionar area").locatedBy("//mat-select[@formcontrolname=\"area_id\"]");
    public  static final Target SLT_PERFIL=Target.the("Selecionar perfil").locatedBy("//mat-select[@formcontrolname=\"perfil_id\"]");
    public  static final Target SLT_CENTRO=Target.the("Selecionar centro").locatedBy("//mat-select[@formcontrolname=\"centro\"]");
    public  static final Target TXT_ID=Target.the("Escribir id").locatedBy("//input[@formcontrolname=\"identificacion\"]");
    public  static final Target TXT_PASS=Target.the("Escribir pass").locatedBy("//input[@formcontrolname=\"contrasena\"]");
    public  static final Target BTN_GUARDAR=Target.the("Enviar datos 1 ").locatedBy("//button[@type=\"submit\"]");
}
