package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalHomePage {
    public BlueRentalHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Login")
    public WebElement loginLink;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement OK;

    //odev
    @FindBy(xpath = "//div[text()='email must be a valid email']")
    public WebElement emailmessage;


    @FindBy(xpath = "//select[@name='car']")
    public WebElement dropDown;

    @FindBy(name = "pickUpLocation")
    public WebElement pickUp;

    @FindBy(xpath = "//*[text()='Please first login']")
    public WebElement firstLoginMassage;


}
