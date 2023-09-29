package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioUbicacion {

    public static final Target CIUDAD = Target.the("Campo para la ciudad")
            .located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("Campo para el codigo postal")
            .located(By.id("zip"));
    public static final Target CONTENEDOR_PAIS = Target.the("Contenedor de paises")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target PAIS = Target.the("Lista de paises")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_DIPOSITIVOS = Target.the("Boton para ir a dispositivos")
            .located(By.xpath("//a[@class='btn btn-blue pull-right'"));
}
