package Day6;

import Day07.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C05_SeleniumWaits extends BaseTest {

    @Test
    public void webDriverWait(){
        //ADIM 1-> WEBDRİVERWAİT OBJEMİZ OLUŞTURULDU
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));


        //wait.until(ExpectedConditions.elementToBeClickable())
    }
}
