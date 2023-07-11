package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.tagName("h1");
    By emailField = By.id("BillingNewAddress_Email");

    By passwordField = By.id("password");
}
