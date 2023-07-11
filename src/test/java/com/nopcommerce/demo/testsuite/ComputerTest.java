package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ComputerPage computersPage = new ComputerPage();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    ShoppingCart shoppingCart = new ShoppingCart();

    SignInPage signInPage = new SignInPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfrimOrderPage confirmOrderPage = new ConfrimOrderPage();
    WelcomeToOurStorePage welcomeToOurStorePage = new WelcomeToOurStorePage();


    @Test
    public void testComputersPage() throws InterruptedException {

        homePage.selectMenu("Computers");
        computersPage.clickOnDesktopOptionOfComputerTab();
        Thread.sleep(2000);
        //desktopPage.selectSortByZToAFromDropDownMenu("Name: Z to A");
        desktopPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();
    }

    @Test
    public void verifyProductAddedToShoppinCartSuccessfully() throws InterruptedException {
        homePage.selectMenu("Computers");
        Thread.sleep(2000);
        computersPage.clickOnDesktopOptionOfComputerTab();
        desktopPage.clickOnAddToCartForBuildYourOwnComputer();
        buildYourComputerPage.getTextFromBuildYourOwnComputerMessage();
        Thread.sleep(2000);
        buildYourComputerPage.selectGhzIntelPentiumDualCore();
        Thread.sleep(2000);
        buildYourComputerPage.selectRamAs8Gb(3);
        buildYourComputerPage.selectHDDRadio();
        buildYourComputerPage.selectOSRadioButton();
        buildYourComputerPage.clickOnTotalCommander();
        //  String expectedPrice = "$1,420.00";
        // Assert.assertEquals(buildYourOwnComputer.verifyThePrice(),expectedPrice,"PriceText not Matched");

        buildYourComputerPage.clickOnAddToCartButton();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourComputerPage.verifyTheMessage(), expectedText, " not Matched");

        buildYourComputerPage.closeTheBarByClickingOnCrossButton();
        Thread.sleep(2000);
        // buildYourOwnComputer.clickOnGoToCartButton();
        buildYourComputerPage.mouseHoverOnShoppingCart();
        Thread.sleep(2000);

        shoppingCart.getTextFromDisplayMessage();
        shoppingCart.clearTheQuantityField();
        shoppingCart.updateTheQuantityField("2");
        shoppingCart.clickOnUpdateShoppingCart();
        shoppingCart.getTextFromAmountElement();
        String expectedAmount = "$2,950.00";
        Assert.assertEquals(shoppingCart.getTextFromAmountElement(), expectedAmount, "Price not matched");
        shoppingCart.clickOnTermsAndConditionsAgreeBox();
        shoppingCart.clickOnCheckoutButton();

        signInPage.getTextFromWelcomeMessage();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(signInPage.getTextFromWelcomeMessage(), expectedMessage, "Message is not displyed");
        signInPage.clickOnCheckOutAsAGuestTab();

        checkOutPage.enterNameInTheFirstNameField("prime");
        checkOutPage.enterLastNameInTheLastNameField("Testing");
        checkOutPage.enterRandomEmailInTheEmailField("prime@gmail.com");
        checkOutPage.selectDataFromCountryDropDown(3);
        checkOutPage.enterDataInTheCityField("London");
        checkOutPage.enterDataInTheAddress1Field("123 something");
        checkOutPage.enterDataInTheZipPostalCodeField("HA12CD");
        checkOutPage.enterDataInTheMobileNumberField("07692312602");
        checkOutPage.clickOnContinueButton();
        checkOutPage.clickOnNextDayRadioButton();
        checkOutPage.clickOnContinueButton1();
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnContinueButton2();

        paymentInfoPage.selectCreditCardType(1);
        paymentInfoPage.inputCardHoldersName("Queen");
        paymentInfoPage.inputCardNumber("5555 5555 5555 4444");
        paymentInfoPage.inputExpireMonth("11");
        paymentInfoPage.inputExpireYear("2025");
        paymentInfoPage.inputCardCode("456");
        paymentInfoPage.clickOnContinueButton();

        confirmOrderPage.getTextFromPaymentMethodText();
        String expectedMessage2 = "Credit Card";
        Assert.assertEquals(confirmOrderPage.getTextFromPaymentMethodText(), expectedMessage2, "option is not displyed");
        confirmOrderPage.getTextFromShippingMethodText();
        String expectedMessage3 = "Next Day Air";
        Assert.assertEquals(confirmOrderPage.getTextFromShippingMethodText(), expectedMessage3, "Shipping method is not displyed");
        confirmOrderPage.getTextFromTotalAmountComputersField();
        String expectedMessage4 = "$2,950.00";
        Assert.assertEquals(confirmOrderPage.getTextFromTotalAmountComputersField(), expectedMessage4, "Total is incorrect");
        confirmOrderPage.clickOnConfirmButton();

        checkOutPage.getTextFromThankYouMessage();
        String expectedMessage5 = "Thank you";
        Assert.assertEquals(checkOutPage.getTextFromThankYouMessage(), expectedMessage5, "Message is displayed incorrectly");
        checkOutPage.getTextFromOrderProcessedSuccessfullyMessage();
        String expectedMessage6 = "Your order has been successfully processed!";
        Assert.assertEquals(checkOutPage.getTextFromOrderProcessedSuccessfullyMessage(), expectedMessage6, "Message is displayed incorrectly");
        checkOutPage.clickOnButton();

        welcomeToOurStorePage.getTextFromWelcomeToStore();
        String expectedMessage7 = "Welcome to our store";
        Assert.assertEquals(welcomeToOurStorePage.getTextFromWelcomeToStore(), expectedMessage7, "Message is displayed incorrectly");


    }
    }

