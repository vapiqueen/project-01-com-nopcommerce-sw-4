package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterationPage extends Utility {

    By registerMessage = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By randomEmail = By.cssSelector("#Email");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");

    By registrationCompleteMessage = By.xpath("//div[@class='result']");
    By continueTab = By.xpath("//a[contains(text(),'Continue')]");


    public String getTextFromRegisterMessage() {
        return getTextFromElement(registerMessage);
    }


    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastName, lName);
    }

    public void enterEmail(String email) {
        sendTextToElement(randomEmail, toString());
    }

    public void enterPassword(String pWord) {
        sendTextToElement(password, pWord);
    }

    public void enterConfirmPassword(String cPWord) {
        sendTextToElement(confirmPassword, cPWord);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getTextFromRegisterationCompleteMessage() {
        return getTextFromElement(registrationCompleteMessage);

    }


    public void clickOnTheContinueButton() {
        clickOnElement(continueTab);
    }
}
