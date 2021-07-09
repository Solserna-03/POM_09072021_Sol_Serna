package com.saucedemo.steps;

import com.saucedemo.pageobject.CompletePageObject;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CompleteSteps {

    CompletePageObject completePageObject = new CompletePageObject();

    public void validarMensajeFinal (){

        Assert.assertThat(completePageObject.getDriver().findElement(completePageObject.getMsjMensajeValidación()).isDisplayed(), Matchers.is(true));
    }
}
