package com.saucedemo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarArticuloPageObject extends PageObject {

    By btnAddToCart = By.id("add-to-cart-sauce-labs-backpack");
    By lnkCart = By.id("shopping_cart_container");

    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    public void setBtnAddToCart(By btnAddToCart) {
        this.btnAddToCart = btnAddToCart;
    }

    public By getLnkCart() {
        return lnkCart;
    }

    public void setLnkCart(By lnkCart) {
        this.lnkCart = lnkCart;
    }
}
