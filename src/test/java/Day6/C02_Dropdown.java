package Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_Dropdown {
    WebDriver driver;

    @Before
    public void setup() {
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        //driver.quit();
    }

    @Test
    public void selectedByIndex() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement drpDown = driver.findElement(By.name("country"));

        Select select = new Select(drpDown);
        select.selectByIndex(1);//ALGERİA
        //selectByIndex() metodu 0 ile başlar


    }

    @Test
    public void selectedByValue() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement drpDown = driver.findElement(By.name("country"));

        Select select = new Select(drpDown);
        select.selectByValue("TURKEY");
    }

    @Test
    public void selectedVisibleText() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement drpDown = driver.findElement(By.name("country"));

        Select select = new Select(drpDown);
        select.selectByVisibleText("NEPAL");
        System.out.println(select.isMultiple());//false

    }

    @Test
    public void multpleSlect() {
        driver.get("https://output.jsbin.com/osebed/2");
        //dropdown locate ediliyor
        Select select = new Select(driver.findElement(By.id("fruits")));
        System.out.println(select.isMultiple());
        select.selectByValue("apple");
        select.selectByIndex(3);
    }

    @Test
    public void getOptions() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select select = new Select(driver.findElement(By.name("country")));
        //getOptions() metodu select elementinin tüm seceneklerini optionlarını bir liste icerisinde bize verir
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    @Test
    public void getFirstSelectedOption() {
        driver.get("https://output.jsbin.com/osebed/2");
        Select select = new Select(driver.findElement(By.id("fruits")));
        select.selectByIndex(3);//grape
        select.selectByIndex(2);//orange
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println(selectedOption.getText());
        //etFirstSelectedOption() metodu seçili olan ilk option elentini bize verir. seçtiğimiz ilk option değil!!

    }
    @Test
    public void getAllSelectedOptions(){
        driver.get("https://output.jsbin.com/osebed/2");

        Select select=new Select(driver.findElement(By.id("fruits")));
        select.selectByValue("banana");
        select.selectByValue("apple");
        List<WebElement> selectedOptions=select.getAllSelectedOptions();
        selectedOptions.forEach(x-> System.out.println(x.getText()));
    }


}