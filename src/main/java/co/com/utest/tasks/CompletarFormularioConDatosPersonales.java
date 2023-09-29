package co.com.utest.tasks;

import co.com.utest.model.Datos_Personales_Utest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.util.List;

import static co.com.utest.userinterface.PaginaDatosPersonales.*;

public class CompletarFormularioConDatosPersonales implements Task {

    private final List<Datos_Personales_Utest> data;

    public CompletarFormularioConDatosPersonales(List<Datos_Personales_Utest> data) {
        this.data = data;
    }

    public static CompletarFormularioConDatosPersonales website(List<Datos_Personales_Utest> data) {
        return Tasks.instrumented(CompletarFormularioConDatosPersonales.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(NOMBRE),
                Enter.theValue(data.get(0).getStrLastName()).into(APELLIDO),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonthBirth()).from(MES_DE_NACIMIENTO),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthDay()).from(DIA_DE_NACIMIENTO),
                SelectFromOptions.byVisibleText(data.get(0).getStrYearBirth()).from(ANIO_DE_NACIMIENTO),
                Click.on(BOTON_DE_UBICACION)
        );

    }
}
