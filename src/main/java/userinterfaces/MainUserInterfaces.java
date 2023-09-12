package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MainUserInterfaces {
    public static final Target TXT_VERIFICAICION =Target.the("Texto de verificacion").locatedBy("//p[text()=\"SuperAdministrador\"]");
    public static final Target BTN_NOTIFICATIONS =Target.the("Ir a las notificaciones").locatedBy("//span[text()=\"Notificaciones\"]");
    public static final Target BTN_PERFIL =Target.the("Ir a  perfil").locatedBy("((//a[@href=\"#/user-data\"]))[2]");
    public static final Target BTN_REPORTES =Target.the("Ir a reportes").locatedBy("//a[@href=\"#/reporte-aprendices\"]");
    public static final Target BTN_APRENDICES_POR_CERTIFICAR=Target.the("Ir a aprendices por aprobar").locatedBy("//a[@href=\"#/lista-aprendices-por-certificar\"]");
    public static final Target BTN_USUARIOS=Target.the("Ir a usuarios").locatedBy("//a[@href=\"#/vistausuarios\"]");
    public static final Target BTN_LISTA_APRENDICES=Target.the("Ir a lista de aprendices").locatedBy("//a[@href=\"#/list-aprendices\"]");
    public static final Target BTN_ASIGNACIONES=Target.the("Ir a asignaciones").locatedBy("//a[@href=\"#/list-assignments\"]");
    public static final Target BTN_MIS_ASIGNACIONES=Target.the("Ir a mis asignaciones").locatedBy("//a[@href=\"#/list-my-assignments\"]");
    public static final Target BTN_REPORTES_USUARIOS =Target.the("Ir a reportes").locatedBy("//a[@href=\"#/reporte-usuarios\"]");;

}
