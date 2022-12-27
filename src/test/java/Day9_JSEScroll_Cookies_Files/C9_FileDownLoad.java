package Day9_JSEScroll_Cookies_Files;

import Day07.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C9_FileDownLoad extends BaseTest {
  /*  Go to URL: https://opensource-demo.orangehrmlive.com/
    Login page valid credentials.
    Download sample CSV file.
    Verify if the file downloaded successfully.
    */

    @Test
    public void fileDownload() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
//indirileck dosya için gerekli adımlar
        WebElement PIM=driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]"));
        PIM.click();

        WebElement congfigurationTab=driver.findElement(By.xpath("//span[text()='Configuration ']"));
        congfigurationTab.click();

        WebElement dataImport=driver.findElement(By.linkText("Data Import"));
        dataImport.click();

        WebElement downloadLink=driver.findElement(By.className("download-link"));
        downloadLink.click();

        Thread.sleep(5000);//dosyanın inmesi için bekliyoruz
//indirilen dosyamızın pathı
        String downloadPath="C:\\Users\\ASUS\\Downloads\\importData.csv";
        //dosyanın indirildiğnii kontrol ediyoruz
        Assert.assertTrue("indirilen dosya bulunamadı",Files.exists(Paths.get(downloadPath)));



    }
}
