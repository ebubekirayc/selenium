package deneme01;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme05 {
    //https://id.heroku.com/login sayfasına gidiniz.
//Bir mail adresi giriniz.
//Bir password giriniz.
//Login butonuna tıklayınız.
//"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
//Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
//Tüm sayfaları kapatınız.
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        // driver.quit();
    }

    @Test
    public void herokuTest() {
        driver.get("https://id.heroku.com/login");

       WebElement name=driver.findElement(By.xpath("//input[@class='form-control']"));
       name.sendKeys("bekir3@gmail");
       driver.findElement(By.id("password")).sendKeys("bekir" + Keys.ENTER);

       WebElement hata=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
       if (hata.isDisplayed()){
           System.out.println("kayıt yapılamadı");
       }else System.out.println("kayıt yapıldı");



        }
    }

