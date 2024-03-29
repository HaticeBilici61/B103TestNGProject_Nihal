package techproed.tests.listeners;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.Driver;
@Listeners(techproed.utilities.Listeners.class)
public class Day27_ListenersTest4 {

    //1. Failed test caseleri tekrar run etme islemini testNG xml file ile tum test caselere automatic olarak uygulayabiliriz.
    //Util class olustur : ListenersRetryAnalyzer
    //Implement IAnnotationTransformer interface
    //transform metotunu olustur
    //Metot da setRetryAnalyzer kullan: annotation.setRetryAnalyzer(ListenersRetry.class)
    //2. xml file da bu util classi test caselerle ilişkilerdir
    //<listeners>
    //    <listener class-name=“techproed.utilities.ListenersRetryAnalyzer"></listener>
    //</listeners>
    //3. When I run this class
    @Test
    public void test1(){
        System.out.println("PASS");
        Assert.assertTrue(true);
    }
    @Test
    public void test2(){
        System.out.println("FAIL");
//        throw new NoSuchElementException("No Such Element Exception");
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().findElement(By.xpath("asdgadfhadfgnh"));//FAIL ETSIN
    }
    @Test
    public void test3(){
        System.out.println("SKIP");
        throw new SkipException("Metotu Atla");
    }
    @Test
    public void test4(){
        System.out.println("EXCEPTION");
//        throw new NoSuchElementException("No Such Element Exception");
        Driver.getDriver().get("https://www.techproeducation.com");
        Driver.getDriver().findElement(By.xpath("asdgadfhadfgnh"));//FAIL ETSIN
    }
}
