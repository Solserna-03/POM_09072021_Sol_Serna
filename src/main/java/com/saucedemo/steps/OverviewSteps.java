package com.saucedemo.steps;

import com.saucedemo.pageobject.OverviewPageObject;

public class OverviewSteps {

    OverviewPageObject overviewPageObject = new OverviewPageObject();

    public void clicEnFinish () {
        overviewPageObject.getDriver().findElement(overviewPageObject.getBtnFinish()).click();
    }

}
