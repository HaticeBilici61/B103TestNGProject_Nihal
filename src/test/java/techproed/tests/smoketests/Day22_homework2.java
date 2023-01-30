package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day22_homework2 {
//    Name:
//    US101122_Negative_Login
//    Description:
//    Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
//    Acceptance Criteria:
//    Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
//    Error Message: email must be a valid email
//    Dogru email uzantisi girildiğinde hata mesajı alınmamalı
//    https://email-verify.my-addr.com/list-of-most-popular-email-domains.php

    BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();
    BlueRentalLoginPage blueRentalLoginPage= new BlueRentalLoginPage();
    @Test
    public void US101122_Negative_Login() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("invalid_email"));
        ReusableMethods.verifyElementDisplayed(blueRentalLoginPage.emailmessage);
        ReusableMethods.getScreenshot("Email Hata Mesaji Var");
        ReusableMethods.waitFor(2);
        blueRentalLoginPage.emailBox.clear();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));
        ReusableMethods.verifyElementNotDisplayed(blueRentalLoginPage.emailmessage);
        ReusableMethods.getScreenshot("Email Hata Mesaji Yok");
    }
}
