package com.saucedemo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPageObject extends PageObject {

    By btnCheckout = By.id("checkout");

    public By getBtnCheckout() {
        return btnCheckout;
    }

    public void setBtnCheckout(By btnCheckout) {
        this.btnCheckout = btnCheckout;
    }
}
