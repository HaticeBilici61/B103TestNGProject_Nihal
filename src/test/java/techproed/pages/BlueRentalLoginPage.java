package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalLoginPage {
    public BlueRentalLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="formBasicEmail")
    public WebElement emailBox;

    @FindBy(id="formBasicPassword")
    public WebElement passwordBox;

    @FindBy(xpath="//button[text()=' Login']")
    public WebElement loginButton;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement error_message_1;

    @FindBy(xpath = "//div[text()='email must be a valid email']")
    public WebElement emailmessage;
}
