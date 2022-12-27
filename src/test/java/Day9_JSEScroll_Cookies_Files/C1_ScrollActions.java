package Day9_JSEScroll_Cookies_Files;

import Day07.BaseTest;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class C1_ScrollActions extends BaseTest {
    @Test
    public void scrollPageUpDoxn() throws InterruptedException {
        driver.get("https://www.amazon.com.tr/");

        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_UP).perform();

    }//Scroll test sonu

    @Test
    public void scrollArrowUpDown() throws InterruptedException {
        driver.get("https://www.amazon.com.tr/");

        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_UP).perform();

    }
}
