package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioFinal {

    public static final Target CLAVE = Target.the("Campo para la clave de usuario")
            .located(By.id("password"));

    public static final Target CONFIRMAR_CLAVE = Target.the("Campo para confirmar la clave de usuario")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_BOX_STAY_INFORMED = Target.the("Check bpox para recibir noticias")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECK_BOX_TERMINOSYCONDICIONES = Target.the("Check bpox para " +
                    "aceptar terminos y condiciones")
            .located(By.id("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_BOX_POLITICADESEGURIDAD = Target.the("Check bpox para aceptar" +
                    "politica de seguridad")
            .located(By.id("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BOTON_COMPLETE_SETUP = Target.the("Boton para finalizar registro")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
