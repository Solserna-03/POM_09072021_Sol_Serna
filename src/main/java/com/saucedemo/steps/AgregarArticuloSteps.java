package com.saucedemo.steps;

import com.saucedemo.pageobject.AgregarArticuloPageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgregarArticuloSteps {

    AgregarArticuloPageObject agregarArticuloPageObject = new AgregarArticuloPageObject();



    public void seleccionarArticulo () {
        WebDriverWait wait = new WebDriverWait(agregarArticuloPageObject.getDriver(),30);
        wait.until(ExpectedConditions.elementToBeClickable(agregarArticuloPageObject.getBtnAddToCart()));
        agregarArticuloPageObject.getDriver().findElement(agregarArticuloPageObject.getBtnAddToCart()).click();

    }

    public void clicEnCarritoCompras () {
        agregarArticuloPageObject.getDriver().findElement(agregarArticuloPageObject.getLnkCart()).click();
    }

}
