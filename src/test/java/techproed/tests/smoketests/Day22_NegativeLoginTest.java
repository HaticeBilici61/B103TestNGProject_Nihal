package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day22_NegativeLoginTest {
    /*
    •Name:
	•US100208_Negative_Login
	•Description:
	•Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
	•Acceptance Criteria
	•
	•Customer email: fake@bluerentalcars.com
	•Customer password: fakepass
	•
	•User with email fake@bluerentalcars.com not found
     */
    BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();
    BlueRentalLoginPage blueRentalLoginPage = new BlueRentalLoginPage();

    @Test
    public void US100208_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("fake_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("fake_pass"));
        blueRentalLoginPage.loginButton.click();
        Thread.sleep(2000);

        Assert.assertEquals(blueRentalLoginPage.error_message_1.getText(),"User with email fake@bluerentalcars.com not found");
    }
}
