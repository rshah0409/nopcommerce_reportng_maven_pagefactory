package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class DeskTopPage extends Utility {
    By clickOnDesktop = By.xpath( "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]" );
    By selectAToZ = By.xpath( "//select[@id='products-orderby']" );
    By addTocart = By.xpath( "//div[@class='add-info']/child::div[1]/child::span[text()='$1,200.00']/following::div[1]/child::button[text()='Add to cart']" );

    public void clickOnDesktopOption() throws InterruptedException {
        Thread.sleep( 1000 );
        Reporter.log( "clicking on desktop" +clickOnDesktop.toString() +"<br>");
        clickOnElement(clickOnDesktop);
    }

    public void selectFromDropdown(String sortBy) {
        Reporter.log( "select A to Z text"  +selectAToZ.toString()  +"<br>" );

        selectByVisibleTextFromDropDown( selectAToZ, sortBy );
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep( 2000 );
        Reporter.log( "clicking on Add to cart button"  +addTocart.toString() +"<br>");

        clickOnElement( addTocart );
    }

}
