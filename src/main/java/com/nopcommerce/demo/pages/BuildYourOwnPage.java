package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnPage extends Utility {
    private static final Logger log = LogManager.getLogger( BuildYourOwnPage.class.getName());


    @FindBy(xpath = "//div[@class='overview']/div/child::h1")
    WebElement buildYourPage;
    @FindBy(id = "product_attribute_1")
    WebElement dropDown1;
    @FindBy(id = "product_attribute_2")
    WebElement dropDown2;
    @FindBy(id ="product_attribute_3_7" )
    WebElement radioButton1;
    @FindBy(id = "product_attribute_4_9")
    WebElement radioButton2;
    @FindBy(id = "product_attribute_5_12" )
    WebElement radioButton3;
    @FindBy(xpath ="//span[text()='$1,475.00']" )
    WebElement totalAmt;
    @FindBy(id="add-to-cart-button-1" )
    WebElement clickAddCart;
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement topBarMsg;

    public String getBuildYourOwnText(){
        Reporter.log( "Get build your page text"  +buildYourPage.toString() +"<br>");
        log.info( "Get build your page text"  +buildYourPage.toString()  );
        return getTextFromElement( buildYourPage );


    }
    public  void selectProcessorFromDropDownOne(String procesor){
        Reporter.log( "Get DropDownOne Text"  +dropDown1.toString() +"<br>");
        selectByVisibleTextFromDropDown( dropDown1,procesor );
        log.info( "Get DropDownOne Text"  +dropDown1.toString() );

    }
    public  void selectRamFromDropDownTwo(String ram){
        Reporter.log( "Get Select Ram From Dropdown2 Text"  +dropDown2.toString() +"<br>");
        selectByVisibleTextFromDropDown(dropDown2,ram );
        log.info( "Get Select Ram From Dropdown2 Text"  +dropDown2.toString() );
    }
    public  void clickOnHDDRadioButton(){
        Reporter.log( "click on radio button hdd text" +radioButton1.toString() +"<br>");
        clickOnElement(radioButton1 );
        log.info("click on radio button hdd text" +radioButton1.toString()   );
    }
    public  void clickOSOnRadioButton(){
        Reporter.log( "click on OS radio button 2 text" +radioButton2.toString() +"<br>" );
        clickOnElement( radioButton2 );
        log.info( "click on OS radio button 2 text" +radioButton2.toString() );
    }
    public void clickOnSoftwareCheckBox(){
        Reporter.log( "click on software checkbox  text" +radioButton3.toString()  +"<br>");
        clickOnElement( radioButton3 );
        log.info( "click on software checkbox  text" +radioButton3.toString() );
    }
    public String getTotalAmt(){
        Reporter.log( "Get totalamt text" +totalAmt.toString() +"<br>" );
        log.info( "Get totalamt text" +totalAmt.toString() );
        return getTextFromElement(totalAmt);
    }
    public void clickOnAddToCart(){
        Reporter.log( "click on add to cart text" +clickAddCart.toString()  +"<br>");
        clickOnElement( clickAddCart );
        log.info( "click on add to cart text" +clickAddCart.toString()  );
    }
    public String getTopBarMessage(){
        Reporter.log( "Get top bar messsage text" +topBarMsg.toString()  +"<br>");
        log.info( "Get top bar messsage text" +topBarMsg.toString()  );
        return getTextFromElement( topBarMsg );
    }


}
