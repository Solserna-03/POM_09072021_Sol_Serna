package com.saucedemo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InformacionPageObject extends PageObject {

    By txtFirstName = By.id("first-name");
    By txtLastName = By.id("last-name");
    By txtZip = By.id("postal-code");
    By btnContinue = By.id("continue");

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public void setTxtFirstName(By txtFirstName) {
        this.txtFirstName = txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public void setTxtLastName(By txtLastName) {
        this.txtLastName = txtLastName;
    }

    public By getTxtZip() {
        return txtZip;
    }

    public void setTxtZip(By txtZip) {
        this.txtZip = txtZip;
    }

    public By getBtnContinue() {
        return btnContinue;
    }

    public void setBtnContinue(By btnContinue) {
        this.btnContinue = btnContinue;
    }
}
