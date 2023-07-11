package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShippingOptionPage extends Utility {
    By radioButton2ndDayAir = By.id("shippingoption_2");
    By radioButtonNextDayAir = By.id("shippingoption_1");
    By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void clickOnButton2ndDayAir(){
        clickOnElement(radioButton2ndDayAir);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirButton(){
        clickOnElement(radioButtonNextDayAir);
    }
}
