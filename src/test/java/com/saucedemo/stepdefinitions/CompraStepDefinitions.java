package com.saucedemo.stepdefinitions;

import com.saucedemo.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class CompraStepDefinitions {

    @Steps
    LoginSteps loginSteps;
    @Steps
    AgregarArticuloSteps agregarArticuloSteps;
    @Steps
    CheckoutSteps checkoutSteps;
    @Steps
    InformacionSteps informacionSteps;
    @Steps
    OverviewSteps overviewSteps;
    @Steps
    CompleteSteps completeSteps;


    @Dado("^que el usuario se encuentra en el portal$")
    public void queElUsuarioSeEncuentraEnEnPortal() {
        loginSteps.abrirNavegador();

    }

    @Cuando("^el ingresa usuario y clave$")
    public void elIngresaUsuarioYClave() {
        loginSteps.ingresarUsuario();
        loginSteps.ingresarClave();
        loginSteps.clicEnLogin();


    }

    @Cuando("^el selecciona la maleta de interes y realiza el pago$")
    public void elSeleccionaLaMaletaDeInteresYRealizaElPago() {
        agregarArticuloSteps.seleccionarArticulo();
        agregarArticuloSteps.clicEnCarritoCompras();
        checkoutSteps.clicEnBotonCheckout();
        informacionSteps.ingresarNombre();
        informacionSteps.ingresarApellido();
        informacionSteps.ingresarCodigoPostal();
        informacionSteps.clicEnContinue();
        overviewSteps.clicEnFinish();

    }

    @Entonces("^el visualiza el mensaje de compra exitosa$")
    public void elVisualizaElMensajeDeCompraExitosa() {
        completeSteps.validarMensajeFinal();

    }
}
