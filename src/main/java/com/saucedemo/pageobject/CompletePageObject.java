package com.saucedemo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CompletePageObject extends PageObject {

    By msjMensajeValidación = By.xpath("//h2[contains(.,'THANK YOU FOR YOUR ORDER')]");

    public By getMsjMensajeValidación() {
        return msjMensajeValidación;
    }

    public void setMsjMensajeValidación(By msjMensajeValidación) {
        this.msjMensajeValidación = msjMensajeValidación;
    }
}
