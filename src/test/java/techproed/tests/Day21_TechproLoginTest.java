package techproed.tests;
import org.testng.annotations.Test;
import techproed.pages.TechproLoginPage;
import techproed.utilities.Driver;

public class Day21_TechproLoginTest {
//    https://testcenter.techproeducation.com/index.php?page=form-authentication
//    Page object Model kullanarak sayfaya giriş yapildigini test edin
//    Sayfadan cikis yap ve cikis yapildigini test et
//    techproed
//            SuperSecretPassword
//    TechproLoginPage
//            userName
//    password
//            submitButton
//    TechproHomePage
//            homeHeader
//    homeLogoutButton
//    TEST:
//    Class: TechproLoginTest
//    Metot : loginTest()


    @Test
    public void loginTest() {
        Driver.getDriver().get("https://testcenter.techproeducation.com/index.php?page=form-authentication");
        TechproLoginPage techproLoginPage = new TechproLoginPage();
        techproLoginPage.username.sendKeys("techproed");
        techproLoginPage.password.sendKeys("SuperSecretPassword");
        techproLoginPage.submitButton.click();
    }
}
