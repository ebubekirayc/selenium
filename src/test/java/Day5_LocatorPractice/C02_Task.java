package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Task {
//https://www.teknosa.com/ adresine gidiniz.
// Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
// Sonuç sayısını yazdırınız.
// Çıkan ilk ürüne tıklayınız.
// Sepete ekleyiniz.
// Sepetime gite tıklayınız.
// Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
// Alışverişi tamamlayınız.
// Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
// Driver'ı kapatınız.

    WebDriver driver;

    @Test
    public void teknosa() {
        //https://www.teknosa.com/ adresine gidiniz.
        driver.get("https://www.teknosa.com/");

        // Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
        WebElement aramaAlanı = driver.findElement(By.name("s"));////input[@name='s']
        aramaAlanı.sendKeys("oppo" + Keys.ENTER);

        //sonuç sayısı yazdırıldı
        WebElement sonucSayisi = driver.findElement(By.className("plp-info"));
        System.out.println(sonucSayisi.getText());

        //ilk urune tiklanıp sepete eklendi
        WebElement ilkÜrün = driver.findElement(By.className(".prd-link"));
        ilkÜrün.click();

        //sepete ekle butonuna tıklandı
        WebElement sepeteEkleButton = driver.findElement(By.id("addToCartButton"));
        sepeteEkleButton.click();

        //sepete git butonuna tiklandı
        WebElement sepeteGitButton= driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
sepeteGitButton.click();
        //sipariş özeti texi yazdırıldı
        WebElement siparisÖzet= driver.findElement(By.xpath("//div[@class='cart-sum-body']"));
        System.out.println(siparisÖzet.getText());
        //

        WebElement alisverisTamamlaButton= driver.findElement(By.partialLinkText("Alışverişi Tamamla"));
        alisverisTamamlaButton.click();
        //
        WebElement hosgeldiniz= driver.findElement(By.xpath("//div[@class='lrp-title']"));
        System.out.println(hosgeldiniz.getText());


// Sonuç sayısını yazdırınız.
// Çıkan ilk ürüne tıklayınız.
// Sepete ekleyiniz.
// Sepetime gite tıklayınız.
// Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
// Alışverişi tamamlayınız.
// Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
// Driver'ı kapatınız.

    }


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
        driver.quit();
    }


}
