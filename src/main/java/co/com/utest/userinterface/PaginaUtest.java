package co.com.utest.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/")

public class PaginaUtest extends PageObject {

    public static final Target BOTON_JOIN = Target.the("Boton para iniciar registro de usuario nuevo")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));


}
