package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BuildYourOwnPage extends Utility {
    By buildYourPage = By.xpath( "//div[@class='overview']/div/child::h1" );
    By dropDown1 = By.id("product_attribute_1");
    By dropDown2 = By.id( "product_attribute_2" );
    By radioButton1 = By.id( "product_attribute_3_7" );
    By radioButton2 = By.id( "product_attribute_4_9" );
    By radioButton3 = By.id( "product_attribute_5_12" );
    By totalAmt = By.xpath( "//span[text()='$1,475.00']" );
    By clickAddCart = By.id( "add-to-cart-button-1" );
    By topBarMsg = By.xpath( "//p[text()='The product has been added to your ']" );

    public String getBuildYourOwnText(){
        Reporter.log( "Get build your page text"  +buildYourPage.toString() +"<br>");
        return getTextFromElement( buildYourPage );
    }
    public  void selectProcessorFromDropDownOne(String procesor){
        Reporter.log( "Get DropDownOne Text"  +dropDown1.toString() +"<br>");
        selectByVisibleTextFromDropDown( dropDown1,procesor );

    }
    public  void selectRamFromDropDownTwo(String ram){
        Reporter.log( "Get Select Ram From Dropdown2 Text"  +dropDown2.toString() +"<br>");
        selectByVisibleTextFromDropDown(dropDown2,ram );
    }
    public  void clickOnHDDRadioButton(){
        Reporter.log( "click on radio button hdd text" +radioButton1.toString() +"<br>");
        clickOnElement(radioButton1 );
    }
    public  void clickOSOnRadioButton(){
        Reporter.log( "click on OS radio button 2 text" +radioButton2.toString() +"<br>" );
        clickOnElement( radioButton2 );
    }
    public void clickOnSoftwareCheckBox(){
        Reporter.log( "click on software checkbox  text" +radioButton3.toString()  +"<br>");
        clickOnElement( radioButton3 );
    }
    public String getTotalAmt(){
        Reporter.log( "Get totalamt text" +totalAmt.toString() +"<br>" );
        return getTextFromElement(totalAmt);
    }
    public void clickOnAddToCart(){
        Reporter.log( "click on add to cart text" +clickAddCart.toString()  +"<br>");
        clickOnElement( clickAddCart );
    }
    public String getTopBarMessage(){
        Reporter.log( "Get top bar messsage text" +topBarMsg.toString()  +"<br>");
        return getTextFromElement( topBarMsg );
    }


}
