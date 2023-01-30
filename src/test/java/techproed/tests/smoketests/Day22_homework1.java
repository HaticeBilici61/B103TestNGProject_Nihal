package techproed.tests.smoketests;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

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

    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US101122_Negative_Login(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("invalid_email_bluecar"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty(""));

        //Driver.getDriver().close();

    }
}
