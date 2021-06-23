package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DeskTopPage extends Utility {
    private static final Logger log = LogManager.getLogger( DeskTopPage.class.getName());

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]" )
    WebElement clickOnDesktop;

    @FindBy(xpath = "//select[@id='products-orderby']" )
    WebElement selectAToZ;

    @FindBy(xpath = "//div[@class='add-info']/child::div[1]/child::span[text()='$1,200.00']/following::div[1]/child::button[text()='Add to cart']")
    WebElement addTocart;

    public void clickOnDesktopOption() throws InterruptedException {
        Thread.sleep( 1000 );
        Reporter.log( "clicking on desktop" +clickOnDesktop.toString() +"<br>");
        clickOnElement( clickOnDesktop );
        log.info( "clicking on desktop" +clickOnDesktop.toString()  );
    }

    public void selectFromDropdown(String sortBy) {
        Reporter.log( "select A to Z text"  +selectAToZ.toString()  +"<br>" );
        selectByVisibleTextFromDropDown( selectAToZ, sortBy );
        log.info( "select A to Z text"  +selectAToZ.toString()  );
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep( 2000 );
        Reporter.log( "clicking on Add to cart button"  +addTocart.toString() +"<br>");
        clickOnElement( addTocart );
        log.info("clicking on Add to cart button"  +addTocart.toString());
    }

}
