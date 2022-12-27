package Day9_JSEScroll_Cookies_Files;

import Day07.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class C3_RobotClass extends BaseTest {
    @Test
    public void test() throws AWTException, InterruptedException {
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement input = driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\ASUS\\IdeaProjects\\CWJunitSelenium\\src\\test\\java\\re\\robot.txt");

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);//keyPress tusa basili tutar, ctrl ye bastık
        robot.keyPress(KeyEvent.VK_S);//s tusuna bastık
Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_CONTROL);//keyRelease tusu serbest birakır
        robot.keyRelease(KeyEvent.VK_S);//keyRelease tusu serbest birakır
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);//enter tuşuna bastık
        robot.keyRelease(KeyEvent.VK_ENTER);//enter tuşunu bıraktık
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_LEFT);//SOL OK
        robot.keyRelease(KeyEvent.VK_LEFT);//SOL OK
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);



    }
}
