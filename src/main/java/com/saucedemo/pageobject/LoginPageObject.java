package com.saucedemo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPageObject extends PageObject {

    By txtUserName = By.id("user-name");
    By txtPassword = By.id("password");
    By btnLogin = By.id("login-button");

    public By getTxtUserName() {
        return txtUserName;
    }

    public void setTxtUserName(By txtUserName) {
        this.txtUserName = txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(By txtPassword) {
        this.txtPassword = txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(By btnLogin) {
        this.btnLogin = btnLogin;
    }
}
