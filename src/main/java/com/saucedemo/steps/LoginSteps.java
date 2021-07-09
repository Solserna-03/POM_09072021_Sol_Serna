package com.saucedemo.steps;

import com.saucedemo.pageobject.LoginPageObject;
import com.saucedemo.utils.Datos;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPageObject loginPageObject = new LoginPageObject();
    Datos datos = new Datos();
    String [] datosUsuario = datos.obtenerDatos();

    @Step
    public void abrirNavegador () {
        loginPageObject.open();
    }

    @Step
    public void ingresarUsuario () {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtUserName()).sendKeys(datosUsuario[0]);
    }

    @Step
    public void ingresarClave () {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtPassword()).sendKeys(datosUsuario[1]);
    }

    @Step
    public void clicEnLogin () {
        loginPageObject.getDriver().findElement(loginPageObject.getBtnLogin()).click();
    }


}
