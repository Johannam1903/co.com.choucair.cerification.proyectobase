package co.com.utest.tasks;

import co.com.utest.model.Datos_Personales_Utest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.utest.userinterface.FormularioFinal.*;

public class CompletarFormularioFinal implements Task {

    private List<Datos_Personales_Utest> data;

    public CompletarFormularioFinal(List<Datos_Personales_Utest> data) {
        this.data = data;
    }

    public static CompletarFormularioFinal website(List<Datos_Personales_Utest> data) {
        return Tasks.instrumented(CompletarFormularioFinal.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(data.get(0).getStrPassword()).into(CLAVE),
                    Enter.theValue(data.get(0).getStrPassword()).into(CONFIRMAR_CLAVE),
                    Click.on(CHECK_BOX_STAY_INFORMED),
                    Click.on(CHECK_BOX_TERMINOSYCONDICIONES),
                    Click.on(CHECK_BOX_POLITICADESEGURIDAD),
                    Click.on(BOTON_COMPLETE_SETUP)

            );
    }
}
