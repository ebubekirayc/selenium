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

import java.time.Duration;
import java.util.List;

public class C04_Checkboxes {
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
     //  driver.quit();
    }

    @Test
    public void checkboxes() {
        //    Go to https://the-internet.herokuapp.com/checkboxes
//    Locate the elements of checkboxes.
//    Then click on checkbox 1 if box is not selected.
//    Then click on checkbox 2 if box is not selected.
//    Then verify that checkbox 1 and checkbox 2 are checked.

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes=driver.findElements(By.xpath("(//input[@type=\"checkbox\"])"));
        WebElement chbx1=checkboxes.get(0);
        WebElement chbx2=checkboxes.get(1);
        //checkbox 1 secili değilse tıklıyoruz
        if (!chbx1.isSelected()){
            chbx1.click();
        }
        //checkbox 2 secili değilse tıklıyoruz
        if (!chbx2.isSelected()){
            chbx2.click();
        }
//checkbox ların secili olduğunun kontrolu gerçekleştirildi
        Assert.assertTrue(chbx1.isSelected());
        Assert.assertTrue(chbx2.isSelected());
   }

}
