package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnPage;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DeskTopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Listeners(CustomListeners.class)

public class TestSuite extends TestBase {
    HomePage homepage;
    ComputersPage computersPage ;
    DeskTopPage deskTopPage ;
    BuildYourOwnPage buildYourOwnPage ;

    @BeforeMethod(alwaysRun = true)
    public void setPageUp() {
        homepage = new HomePage();
        computersPage = new ComputersPage();
        deskTopPage = new DeskTopPage();
        buildYourOwnPage = new BuildYourOwnPage();

    }

    @Test(groups = {"sanity", "regression"},priority = 3)

    public void clickOnAllTopMenuTabs() {
        homepage.selectMenu("Computers");
    }

    @Test(groups = {"sanity", "smoke", "regression"},priority = 2)
    public void clickOnComputersAndDeskTopAndVerifysortby() throws InterruptedException {
        homepage.selectMenu( "Computers" );
        computersPage.clickOnComputersTab();
        computersPage.clickOnDesktopOption();
        computersPage.verifyproductsSortByGivenOrder();

    }

    @Test(groups = {"smoke", "regression"},priority = 1)
    public void clickOnDeskTopAndSortbyAndAddToCart() throws InterruptedException {
        homepage.selectMenu( "Computers" );
        computersPage.clickOnComputersTab();
        deskTopPage.clickOnDesktopOption();
        deskTopPage.selectFromDropdown( "Name: A to Z" );
        deskTopPage.clickOnAddToCart();

    }

    @Test(groups = {"regression"},priority = -1)
    public void clickOnDesktopAndBuildYourComputerAndAddProducttoCart() throws InterruptedException {
        homepage.selectMenu( "Computers" );
        computersPage.clickOnComputersTab();
        deskTopPage.clickOnDesktopOption();
        deskTopPage.selectFromDropdown( "Name: A to Z" );
        deskTopPage.clickOnAddToCart();
        SoftAssert softAssert = new SoftAssert();
        String expectedPagetext = "Build your own computer";  //verify build your own page
        String actualPageText = buildYourOwnPage.getBuildYourOwnText();
        Assert.assertEquals( actualPageText, expectedPagetext );
        softAssert.assertTrue( true );
        buildYourOwnPage.selectProcessorFromDropDownOne( "2.2 GHz Intel Pentium Dual-Core E2200" );
        buildYourOwnPage.selectRamFromDropDownTwo( "8GB [+$60.00]" );
        buildYourOwnPage.clickOnHDDRadioButton();
        buildYourOwnPage.clickOSOnRadioButton();
        buildYourOwnPage.clickOnSoftwareCheckBox();
        String expectedtotal = "$1,475.00";          //Verifying Total
        String actualTotal = buildYourOwnPage.getTotalAmt();
        Assert.assertEquals( actualTotal, expectedtotal );
        softAssert.assertTrue( true );
        buildYourOwnPage.clickOnAddToCart();
        String expectedBarMessage = "The product has been added to your shopping cart";
        String actualBarMessage = buildYourOwnPage.getTopBarMessage();
        Assert.assertEquals( actualBarMessage, expectedBarMessage );
        softAssert.assertTrue( true );
        softAssert.assertAll();


    }

}

