package deneme01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme01 {
    WebDriver driver;

    @Before
    public void setup() {

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //LinkedIn sitesine gidildi
        driver.get("https://www.sahibinden.com/");

        // driver imiz maximize edildi
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        // driver imiz kapatildi
        //driver.quit();
    }

    @Test
    public void search() {
        WebElement idSearch = driver.findElement(By.id("searchText"));
        idSearch.sendKeys("volvo 2. el ne kadar");

        WebElement idAra = driver.findElement(By.xpath("//button[@type='submit']"));
        idAra.submit();
    }

    @Test
    public void nameSearc() {
        WebElement idSearch = driver.findElement(By.name("query_text"));
        idSearch.sendKeys("volvo 2. el ne kadar");

        WebElement idAra = driver.findElement(By.xpath("//button[@type='submit']"));
        idAra.submit();
    }

    @Test
    public void xpathSearc() {
        WebElement idSearch = driver.findElement(By.name("query_text"));
        idSearch.sendKeys("volvo ");

        WebElement idAra = driver.findElement(By.xpath("//button[@type='submit']"));
        idAra.submit();
    }


}
