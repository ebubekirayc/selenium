package deneme01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme06 {
    //Navigate to https://testpages.herokuapp.com/styled/index.html
// Click on Calculate under Micro Apps.
// Type any number in the first input.
// Type any number in the second input.
// Click on Calculate.
// Get the result.
// Print the result.
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @After
   public void tearDown()
            {
       // driver.quit();
    }
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.name("number1")).sendKeys("47");
        driver.findElement(By.name("number2")).sendKeys("33");
        driver.findElement(By.id("calculate")).click();
        System.out.println(driver.findElement(By.id("answer")).getText());


    }
}
