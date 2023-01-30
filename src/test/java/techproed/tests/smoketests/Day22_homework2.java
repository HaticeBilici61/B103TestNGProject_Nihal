package techproed.tests.smoketests;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;

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

    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US101122_Negative_Login() {
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
    }
}
