package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

//Name:
//        US100402_Negative_Login
//        Description:
//        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
//        Acceptance Criteria:
//        Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
//        Hata Mesaji:
//        Bad credentials
//        Test Data:
//        Customer email: jack@gmail.com
//        Customer password: fakepass

public class Day22_homework1 {

    BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();
    BlueRentalLoginPage blueRentalLoginPage= new BlueRentalLoginPage();
    @Test
    public void US101122_Negative_Login(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("fake_pass"));
        blueRentalLoginPage.loginButton.click();
        ReusableMethods.waitForVisibility(blueRentalLoginPage.error_message_1,7);
        ReusableMethods.verifyElementDisplayed(blueRentalLoginPage.error_message_1);

        //Driver.getDriver().close();

    }
}
