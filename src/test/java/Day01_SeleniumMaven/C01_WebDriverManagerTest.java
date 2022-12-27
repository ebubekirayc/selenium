package Day01_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {
    // Set Path.
// Create chrome driver.
// Maximize the window.
// Open google home page https://www.google.com/
// Verify that you are Google in the title.

    public static void main(String[] args) {
        //System.setProperty()<-eskisi, yenisi->webdriver manager classin kullanarak chromedriver binary lerimizi indirdik
        WebDriverManager.chromedriver().setup();
        //driver objemizi oluşturduk
        WebDriver driver = new ChromeDriver();
        //windowu maximize ettik
        driver.manage().window().maximize();

        //google anasayfamızı ctık
        driver.get("https://www.google.com/");
        //title imizi alıyoruz
        String title = driver.getTitle();

        //titleimizi doğruladık
        if (title.equals("Google")) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        driver.quit();

    }
}
