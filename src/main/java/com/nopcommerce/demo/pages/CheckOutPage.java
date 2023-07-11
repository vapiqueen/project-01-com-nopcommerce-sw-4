package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.cssSelector("#BillingNewAddress_Email");

    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.cssSelector("#BillingNewAddress_City");
    By address1 = By.cssSelector("#BillingNewAddress_Address1");
    By zipPostalCode = By.cssSelector("#BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadio = By.id("shippingoption_1");
    By creditCardButton=By.id("paymentmethod_1");
    By continueButton1=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By continueButton2=By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']");

    By totalAmount = By.xpath("//span[contains(text(),'$698.00')]");
    By totalAmountComputers = By.xpath("//span[contains(text(),'$2,950.00')]");

    By thankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");
    By successfulOrderMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By creditCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");





    public void selectDataFromCountryDropDown(int index) {
        selectByIndexFromDropDown(country, index);
    }

    public void enterDataInTheCityField(String cityName) {
        sendTextToElement(city, cityName);
    }

    public String getTextFromTotalAmountComputersField(){
        return getTextFromElement(totalAmountComputers);
    }


    public void enterDataInTheAddress1Field(String add1) {
        sendTextToElement(address1, add1);
    }

    public void enterDataInTheZipPostalCodeField(String pCode) {
        sendTextToElement(zipPostalCode, pCode);
    }

    public void enterDataInTheMobileNumberField(String mobile) {
        sendTextToElement(phoneNumber, mobile);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void enterNameInTheFirstNameField(String name) {
        sendTextToElement(firstName, name);

    }

    public void enterLastNameInTheLastNameField(String lastname) {
        sendTextToElement(lastName, lastname);

    }

    public void enterRandomEmailInTheEmailField(String email) {
        sendTextToElement(emailField, email);
    }



    public void clickOnNextDayRadioButton() {
        clickOnElement(nextDayAirRadio);
    }


    public void clickOnCreditCard() {
        clickOnElement(creditCardButton);
    }
    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }
    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }
    public String getTextFromThankYouMessage() {
        return getTextFromElement(thankYouMessage);
    }


    public String getTextFromOrderProcessedSuccessfullyMessage() {
        return getTextFromElement(successfulOrderMessage);
    }


    public void clickOnButton() {
        clickOnElement(continueButton);
    }

    public void selectCreditCardType(int index){
        selectByIndexFromDropDown(creditCard, index);
    }

    public void inputCardHoldersName(String name){
        sendTextToElement(cardHolderName, name);
    }

    public void inputCardNumber(String num){
        sendTextToElement(cardNumber, num);
    }

    public void inputExpireMonth(String mon){
        sendTextToElement(expiryMonth, mon);
    }

    public void inputExpireYear(String yr){
        sendTextToElement(expiryYear, yr);
    }

    public void inputCardCode(String code) {
        sendTextToElement(cardCode, code);
    }


}

