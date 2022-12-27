package Day3_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Practice {
    //    Go to https://www.linkedin.com/
//    When we write an e-mail without the @ sign in the e-mail box and press enter.
//    Let's test the "Invalid email address" warning.
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();

    }

    @Test
    public void xpathPractice() {
        //1. adım-> linkedine gittik
        driver.get("https://www.linkedin.com/");
        //2. adım email alanına @ sembolu bulunmayan bir mail adresi gir
        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("ebubekirclarusvey.com" + Keys.ENTER);
        //3.adım->hata mesajının görüntülendigini doğrula
        WebElement alerrtMessage = driver.findElement(By.xpath("//p[@class='alert-content']"));
        Assert.assertTrue(alerrtMessage.isDisplayed());
        //  Assert.assertEquals(true,alerrtMessage.isDisplayed());
        //Assert.assertFalse(!alerrtMessage.isDisplayed());


    }


}
