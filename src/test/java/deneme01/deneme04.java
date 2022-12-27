package deneme01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme04 {
    //    Go to URL: https://demoqa.com/
//    Click on Elements.
//    Click on Checkbox.
//    Verify if Home checkbox is selected.//Ana Sayfa onay kutusunun seçili olup olmadığını doğrulayın.
//    Verify that "You have selected" is visible.//"Seçtiniz" ifadesinin görünür olduğunu doğrulayın.
WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void demoqaTest(){
        driver.get("https://demoqa.com");

    }


}
