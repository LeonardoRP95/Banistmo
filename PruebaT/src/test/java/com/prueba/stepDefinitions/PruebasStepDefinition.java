package com.prueba.stepDefinitions;

import com.prueba.steps.AerocivilStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class PruebasStepDefinition {
    @Steps
    AerocivilStep aerocivilStep;

    @Given("^navego en la aplicación$")
    public void navegoEnLaAplicacion() throws InterruptedException {
        aerocivilStep.abrirWeb();
    }
    @When("^ingreso a la opcion transparencia$")
    public void ingresoALaOpcionTransparencia() throws InterruptedException {
        aerocivilStep.ingresoALaOpcionTransparencia();

    }

    @When("^selecciono la opcion presupuesto$")
    public void seleccionoLaOpcionPresupuesto() throws InterruptedException {
        aerocivilStep.seleccionoLaOpcionPresupuesto();

    }

    @When("^ingreso a la opcion plan de accion$")
    public void ingresoALaOpcionPlanDeAccion() throws InterruptedException {
        aerocivilStep.ingresoALaOpcionPlanDeAccion();
    }

    @When("^selecciono la opcion plan de accion$")
    public void seleccionoLaOpcionPlanDeAccion() throws InterruptedException {
        aerocivilStep.seleccionoLaOpcionPlanDeAccion();

    }

    @When("^selecciono el boton modo lectura del documento$")
    public void seleccionoElBotonModoLecturaDelDocumento() throws InterruptedException {
        aerocivilStep.seleccionoElBotonModoLecturaDelDocumento();

    }

    @Then("^valido que el pdf generado sea el correcto$")
    public void validoQueElPdfGeneradoSeaElCorrecto() throws Exception {
        aerocivilStep.validoQueElPdfGeneradoSeaElCorrecto();

    }

}