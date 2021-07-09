package com.saucedemo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OverviewPageObject extends PageObject {

    By btnFinish = By.id("finish");

    public By getBtnFinish() {
        return btnFinish;
    }

    public void setBtnFinish(By btnFinish) {
        this.btnFinish = btnFinish;
    }
}
