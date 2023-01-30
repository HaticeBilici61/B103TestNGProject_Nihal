package techproed.tests.smoketests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day22_homework3 {
    //Name:
    //US101201_Negative_Login
    //Description:
    //Geçerli giriş yapmadan rezervasyon yapamamalı
    //Acceptance Criteria:
    //Kullanici arac bilgilerini girip CONTINUE RESERVATION butonuna tikladiginda
    //Ve giris yapilmadiginda
    //Hata mesaji almali : Please first login
    //Giris yapildiginda hata mesaji alınmamalı
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test
    public void US101201_Negative_Login() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        Select select = new Select(blueRentalHomePage.dropDown);
        select.selectByValue("9");//Audi q8
        blueRentalHomePage.pickUp.sendKeys("Florida Pensacola", Keys.TAB, "Oregon Albany", Keys.TAB, "12.12.2023", Keys.TAB, "100",
                Keys.TAB, "14.12.2023", Keys.TAB, "100", Keys.TAB, Keys.ENTER);
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(blueRentalHomePage.firstLoginMassage);
        ReusableMethods.getScreenshot("Ekran Goruntusu");
        ReusableMethods.waitFor(2);

//login yaptiktan sonra
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_sifre"));
        blueRentalLoginPage.loginButton.click();
        ReusableMethods.waitFor(2);
        Select select2 = new Select(blueRentalHomePage.dropDown);
        select2.selectByValue("9");//Audi q8
        blueRentalHomePage.pickUp.sendKeys("Florida Pensacola", Keys.TAB, "Oregon Albany", Keys.TAB, "12.12.2023", Keys.TAB, "100",
                Keys.TAB, "14.12.2023", Keys.TAB, "100", Keys.TAB, Keys.ENTER);
        ReusableMethods.verifyElementNotDisplayed(blueRentalHomePage.firstLoginMassage);
        ReusableMethods.getScreenshot("Ekran Goruntusu");

    }
}
