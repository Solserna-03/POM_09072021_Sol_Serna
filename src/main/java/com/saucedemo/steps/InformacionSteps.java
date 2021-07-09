package com.saucedemo.steps;

import com.saucedemo.pageobject.InformacionPageObject;
import com.saucedemo.utils.Datos;

public class InformacionSteps {


    InformacionPageObject informacionPageObject = new InformacionPageObject();
    Datos datos = new Datos ();
    String [] datosInformacion = datos.obtenerInformacion();

    public void ingresarNombre () {
        informacionPageObject.getDriver().findElement(informacionPageObject.getTxtFirstName()).sendKeys(datosInformacion[0]);
    }
    public void ingresarApellido () {
        informacionPageObject.getDriver().findElement(informacionPageObject.getTxtLastName()).sendKeys(datosInformacion[1]);
    }
    public void ingresarCodigoPostal () {
        informacionPageObject.getDriver().findElement(informacionPageObject.getTxtZip()).sendKeys(datosInformacion[2]);
    }
    public void clicEnContinue () {
        informacionPageObject.getDriver().findElement(informacionPageObject.getBtnContinue()).click();
    }



}
