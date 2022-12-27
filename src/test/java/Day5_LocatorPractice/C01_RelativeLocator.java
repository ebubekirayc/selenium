package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C01_RelativeLocator {
    // Go to http://www.bestbuy.com
// Verify that the page title contains "Best" Also, using Relative Locator.
// LogoTest  Verify if the BestBuy logo is displayed.
// mexicoLinkTest  Verify if the link is displayed.
    WebDriver driver;

    @Before
    public void setup() {
        //driver ile ilgili her türlü initial(baslangıc) islemi burada yapılır
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


    }

    @After
    public void terDown() {
        //test sonrasında driver kapatmak (varsa raporları dosyalamak ) için kullanılır
        driver.quit();
    }


    @Test
    public void relativeLocator() {

        // Go to http://www.bestbuy.com

        driver.get("http://www.bestbuy.com");
        // Verify that the page title contains "Best" Also, using Relative Locator.
        Assert.assertTrue("Title Best kelimesini içermiyor.", driver.getTitle().contains("Best"));

// LogoTest  Verify if the BestBuy logo is displayed.
        By logoLocator = RelativeLocator.with(By.tagName("img")).above(By.xpath("//div[.='Hello!']"));
        WebElement logo = driver.findElement(logoLocator);
        Assert.assertTrue(logo.isDisplayed());
// mexicoLinkTest  Verify if the link is displayed.
        By mexicoLinkLocator=RelativeLocator.with(By.tagName("a")).toRightOf(By.xpath("//div[@lang='en']//a[@class='us-link']"));
WebElement mexicoLink= driver.findElement(mexicoLinkLocator);
Assert.assertTrue(mexicoLink.isDisplayed());


    }


}
