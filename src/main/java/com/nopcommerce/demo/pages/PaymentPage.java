package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {

    By creditCardRadioButton = By.id("paymentmethod_1");

    By continueButton = By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']");
    By creditCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueButton1 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");


    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void selectCreditCardType(int index) {
        selectByIndexFromDropDown(creditCard, index);
    }

    public void inputCardHoldersName(String name) {
        sendTextToElement(cardHolderName, name);
    }

    public void inputCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }

    public void inputExpireMonth(String mon) {
        sendTextToElement(expiryMonth, mon);
    }

    public void inputExpireYear(String yr) {
        sendTextToElement(expiryYear, yr);
    }

    public void inputCardCode(String code) {
        sendTextToElement(cardCode, code);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton);
    }
}
