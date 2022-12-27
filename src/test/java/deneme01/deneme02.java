package deneme01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme02 {
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
        // driver.quit();
    }

    @Test
    public void test() {
        driver.get("https://www.etikmen.com/");
        WebElement aramaİkon = driver.findElement(By.xpath("//i[@class='lnr lnr-magnifier']"));
        aramaİkon.click();

        driver.findElement(By.id("txtbxArama")).sendKeys("46653538450160" + Keys.ENTER);
        WebElement gomlek = driver.findElement(By.xpath("/html/body/form/div[6]/div[3]/div/div[2]/div[4]/div[1]/div/div/div[2]/div[2]/a"));
        gomlek.click();
        WebElement beden = driver.findElement(By.xpath("//span[@rel='5']"));
        beden.click();
        WebElement siparisEkle=driver.findElement(By.xpath("//input[@class='Addtobasket button btnAddBasketOnDetail']"));
        siparisEkle.click();


    }

}
