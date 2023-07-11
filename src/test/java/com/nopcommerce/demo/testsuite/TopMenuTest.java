package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputerPage computersPage=new ComputerPage();

    @Test

            public void verifyPageNavigation(){

        homePage.selectMenu("Computers");
        String expectedMessage1 = "Computers";

        Assert.assertEquals(computersPage.getComputersPageText(), expectedMessage1, "Page not found");
        homePage.selectMenu("Electronics");
        homePage.selectMenu("Apparel");
        homePage.selectMenu("Digital downloads");
        homePage.selectMenu("Books");
        homePage.selectMenu("Jewelry");
        homePage.selectMenu("Gift Cards");




            }

    }

