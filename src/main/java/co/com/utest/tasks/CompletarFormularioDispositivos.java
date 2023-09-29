package co.com.utest.tasks;

import co.com.utest.model.Datos_Personales_Utest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.utest.userinterface.FormularioDispositivos.*;
import static org.openqa.selenium.Keys.*;


public class CompletarFormularioDispositivos implements Task {
    private List<Datos_Personales_Utest> data;

    public CompletarFormularioDispositivos(List<Datos_Personales_Utest> data) {
        this.data = data;
    }

    public static CompletarFormularioDispositivos website(List<Datos_Personales_Utest> data) {
        return Tasks.instrumented(CompletarFormularioDispositivos.class);

    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTENEDOR_PC),
                Enter.theValue(data.get(0).getStrPc()).into(PC).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(VERSION).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_LENGUAJE),
                Enter.theValue(data.get(0).getStrLanguage()).into(LENGUAJE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_MOVIL),
                Enter.theValue(data.get(0).getStrMobileDevice()).into(MOVIL).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_MODELO),
                Enter.theValue(data.get(0).getStrModel()).into(MODELO).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_SO),
                Enter.theValue(data.get(0).getStrSO()).into(SO).thenHit(ARROW_DOWN, ENTER)

        );
        
    }
}
