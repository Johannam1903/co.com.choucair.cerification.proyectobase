package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDatosPersonales {
    public static final Target NOMBRE = Target.the("Campo para el nombre del usuario")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Campo para el apellido del usuario")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Campo para el email del usuario")
            .located(By.id("email"));
    public static final Target MES_DE_NACIMIENTO = Target.the("Campo para el mes de nacimiento del usuario")
            .located(By.id("birthMonth"));
    public static final Target DIA_DE_NACIMIENTO = Target.the("Campo para el dia de nacimiento del usuario")
            .located(By.id("birthDay"));
    public static final Target ANIO_DE_NACIMIENTO = Target.the("Campo para el año de nacimiento del usuario")
            .located(By.id("birthYear"));
    public static final Target BOTON_DE_UBICACION = Target.the("Boton para ir a la ubicacion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
