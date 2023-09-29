package co.com.utest.stepdefinitions;

import co.com.utest.model.Datos_Personales_Utest;
import co.com.utest.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class utestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Johanna would like to register with Utest")
    public void johannaWouldLikeToRegisterWithUtest() throws Exception{
        theActorCalled("Johanna").wasAbleTo(AbrirWebsiteUtest.website());

    }
    @When("Enter the data required by the system")
    public void enterTheDataRequiredByTheSystem(List<Datos_Personales_Utest>data) throws Exception {
        theActorInTheSpotlight().attemptsTo(CompletarFormularioConDatosPersonales.website(data), CompletarFormularioUbicacion.website(data), CompletarFormularioDispositivos.website(data), CompletarFormularioFinal.website(data));

    }
    @Then("Registration is successfully completed")
    public void registrationIsSuccessfullyCompleted() throws Exception {

    }
}
