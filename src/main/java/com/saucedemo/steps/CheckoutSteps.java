package com.saucedemo.steps;

import com.saucedemo.pageobject.CheckoutPageObject;

public class CheckoutSteps {

    CheckoutPageObject checkoutPageObject = new CheckoutPageObject();

    public void clicEnBotonCheckout () {
        checkoutPageObject.getDriver().findElement(checkoutPageObject.getBtnCheckout()).click();
    }
}
