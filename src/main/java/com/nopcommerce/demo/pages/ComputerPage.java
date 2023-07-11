package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By computersMenu = By.partialLinkText("Computers");
    By desktopLink = By.xpath("//div[@class='block block-category-navigation']/descendant::a[2]");
    By addToCart = By.xpath("//img[@src='https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg']");
    public String getComputersPageText(){
        return getTextFromElement(computersMenu);
    }

    public void clickOnDesktopOptionOfComputerTab(){
        clickOnElement(desktopLink);
    }
    public void clickOnAddToCartForBuildYourOwnComputer(){
        clickOnElement(addToCart);
    }



}




