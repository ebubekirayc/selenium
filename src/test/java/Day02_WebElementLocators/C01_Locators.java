package Day02_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {

    WebDriver driver;

    @Before
    public void setup() {

        //Driver olusturuldu
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //LinkedIn sitesine gidildi
        driver.get("https://www.linkedin.com/");

        // driver imiz maximize edildi
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        // driver imiz kapatildi
        //driver.quit();
    }


    @Test
    public void idLocator() {
        // id Locator -> "session_key"

        WebElement email = driver.findElement(By.id("session_key"));
        email.sendKeys("Clarusway selenium dersinden selamlar");

    }

    @Test
    public void nameLocator() {
        // name locator -> "session_password"

        WebElement password = driver.findElement(By.name("session_password"));

        password.sendKeys("Sifre");
    }

    @Test
    public void classLocator() {
//input__input-> clas locator

        WebElement email = driver.findElement(By.className("input__input"));
        email.sendKeys("clas loctor test");

    }

    @Test
    public void tagLocator() {
        List<WebElement> emailList = driver.findElements(By.tagName("input"));
//2. elemetimiz email text alanımız buyüzden bu elmanı email değişkenine
        WebElement email = emailList.get(1);
        email.sendKeys("tag locator test");
    }

    @Test
    public void linkTextLocator() {
        //Şifrenizi mi unuttunuz?->linkText

        WebElement forgotPwd = driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));
        forgotPwd.click();
    }

    @Test
    public void partiallinkTextLocator() {
        //Şifrenizi mi unuttunuz?->linkText

        WebElement forgotPwd = driver.findElement(By.partialLinkText("Şifre"));
        forgotPwd.click();
    }
    @Test
    public  void absoluteXpath(){
        WebElement email=driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/div[1]/input"));
        email.sendKeys("ebubekir absolute konusunu gayet başarılı tamamladı");
    }

    @Test
    public void relativeXpath(){
        WebElement email=driver.findElement(By.xpath("//input[@name='session_key']"));
        email.sendKeys("ebubekir relative konusunu gayet başarılı tamamladı");
    }
    @Test
    public void multipleAttributeXpath(){
        WebElement email=driver.findElement(By.xpath("//input[@class='input__input'][@name='session_key']"));
        email.sendKeys("Ebubekir relative xpath konusunu gayet başarılı tamamladı");

    }
    @Test
    public void andOrXpath(){
        WebElement email=driver.findElement(By.xpath("//input[@class='input__input'and@name='session_key']"));
        email.sendKeys("Ebubekir relative xpath konusunu gayet başarılı tamamladı");


    }
    @Test
    public void andOr1Xpath(){
        WebElement email=driver.findElement(By.xpath("//input[@id='session_key'or@id='session_passxword']"));
        email.sendKeys("Ebubekir relative xpath konusunu gayet başarılı tamamladı");


    }
    @Test
    public void containsXpath(){
        WebElement email=driver.findElement(By.xpath("//input[contains(@name,'key')]"));
        email.sendKeys("Ebubekir relative xpath konusunu gayet başarılı tamamladı");


    }
    @Test
    public void startsWithXpath(){
        WebElement email=driver.findElement(By.xpath("//input[contains(@name,'key')]"));
        email.sendKeys("Ebubekir relative xpath konusunu gayet başarılı tamamladı");


    }
}