package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputersPage extends Utility {
    private static final Logger log = LogManager.getLogger( ComputersPage.class.getName());
    HomePage homepage = new HomePage();
  /*  By clickOnDesktop = By.xpath( "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]" );
    By desktop = By.xpath( "//div[@class='item-grid']/div/div/div[2]/child::h2" );*/

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement clickOnDesktop;

    @FindBy(xpath = "//div[@class='item-grid']/div/div/div[2]/child::h2" )
    WebElement desktop;


    public void clickOnComputersTab() {
        Reporter.log( "Getting welcome text" + homepage.toString() );
        homepage.selectMenu( "Computers" );
        log.info("Getting welcome text" + homepage.toString());

    }

    public void clickOnDesktopOption() throws InterruptedException {
        Thread.sleep( 2000 );
        Reporter.log( " clicking on Desktop " + clickOnDesktop.toString() );
        clickOnElement( clickOnDesktop );
        log.info( " clicking on Desktop " + clickOnDesktop.toString());

    }

    public void verifyproductsSortByGivenOrder() {
        Reporter.log( "Get Sort By As Reverse text" + desktop.toString() );
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']/div/div/div[2]/child::h2"));//verifying sort by products are in 'z to a'
        List<String> productName = new ArrayList<>();
        for (WebElement deskTop : deskTopList) {
            productName.add( deskTop.getText() );
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll( productName );

        Collections.sort( tempList, Collections.reverseOrder() );
        Collections.sort( productName, Collections.reverseOrder() );
        System.out.println( productName );
        System.out.println( tempList );
        Assert.assertEquals( productName, tempList );

    }
}



