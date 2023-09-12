package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InfoGuidelinesUserInterfaces {
    public static final Target BTN_GUIDELINES=Target.the("ir a lineamientos").locatedBy("//a[@href=\"#lienamientos\"]");
    public static final Target TXT_V_1=Target.the("Verificar").locatedBy("(//h3[text()=\"1\"])");
    public static final Target TXT_V_2=Target.the("Verificar").locatedBy("(//h3[text()=\"2\"])");
    public static final Target TXT_V_3=Target.the("Verificar").locatedBy("(//h3[text()=\"3\"])");
}
