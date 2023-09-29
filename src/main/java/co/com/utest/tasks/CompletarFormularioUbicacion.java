package co.com.utest.tasks;

import co.com.utest.model.Datos_Personales_Utest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.utest.userinterface.FormularioUbicacion.*;

public class CompletarFormularioUbicacion implements Task {

    private List<Datos_Personales_Utest> data;

    public CompletarFormularioUbicacion(List<Datos_Personales_Utest> data) {
        this.data = data;
    }


    public static CompletarFormularioUbicacion website(List<Datos_Personales_Utest> data) {
        return Tasks.instrumented(CompletarFormularioUbicacion.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                Enter.theValue(data.get(0).getStrZipPostalCode()).into(CODIGO_POSTAL),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(data.get(0).getStrCountry()).into(PAIS),
                Click.on(BOTON_DIPOSITIVOS));




    }
}
