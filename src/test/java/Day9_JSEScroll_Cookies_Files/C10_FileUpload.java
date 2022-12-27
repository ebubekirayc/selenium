package Day9_JSEScroll_Cookies_Files;

import Day07.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C10_FileUpload extends BaseTest {
    @Test
    public void fileUpload() throws InterruptedException {
/*
Go to URL: https://the-internet.herokuapp.com/upload
Find the path of the file that you want to upload.
Click on Upload button.
Verify the upload message.
 */
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement dosyaSec= driver.findElement(By.id("file-upload"));

        dosyaSec.sendKeys("C:\\Users\\ASUS\\Desktop\\fileExist.png");

        WebElement uploadFile=driver.findElement(By.id("file-submit"));
        uploadFile.click();

        WebElement uploadedMessage= driver.findElement(By.tagName("h3"));

        Assert.assertTrue(uploadedMessage.isDisplayed());
        Assert.assertEquals("File Uploaded!",uploadedMessage.getText());




    }
}
