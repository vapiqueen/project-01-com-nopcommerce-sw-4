package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By nokiaLumia1020DisplayText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By Price = By.xpath("//span[@id='price-value-20']");
    By Quantity = By.id("product_enteredQuantity_20");
    By AddToCartButton = By.id("add-to-cart-button-20");
    By AddToCartGreenMessage = By.xpath("//p[@class='content']");
    By MessageClosingCrossButton = By.cssSelector("span[title='Close']");
    By ShoppingCartButton = By.xpath("//span[text()='Shopping cart']");
    By ShoppingCartButtonsGoToCartOption = By.xpath("//button[text()='Go to cart']");


    public String getTextFromNokiaLumiaDisplayText(){
        return getTextFromElement(nokiaLumia1020DisplayText);
    }



    public String getTextFromPrice(){
        return getTextFromElement(Price);
    }


    public void clearTheQuantityField() {
        driver.findElement(Quantity).clear();
    }

    public void UpdatedQuantity0(String quantity){
        sendTextToElement(Quantity, quantity);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(AddToCartButton);
    }
    public String getProductAddedToCartMessage(){
        return getTextFromElement(AddToCartGreenMessage);
    }


    public void closeTheGreenBarByClickingTheCrossButton(){
        clickOnElement(MessageClosingCrossButton);
    }

    public void mouseHoverOnShoppingCartButton(){
        mouseHoverToElement(ShoppingCartButton);
    }

    public void clickOnGoToCartButton(){
        clickOnElement(ShoppingCartButtonsGoToCartOption);
    }
}
