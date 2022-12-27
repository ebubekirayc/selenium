package Day08_WindowHandles_Actions;

import Day07.BaseTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;


public class C01_WindowHandleSe4 extends BaseTest {
    // https://testproject.io/

// https://blog.testproject.io/

    @Override
    public void tearDown() {

    }

    @Test
    public void newWindow() {

        driver.get("https://testproject.io/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://blog.testproject.io/");


    }

    @Test
    public void newTab() {
//ana sekmemizden tetsproject acıldı
        driver.get("https://testproject.io/");
        //yeni bir sekme oluşturuldu
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        //yeni sekmeden amazona gidildi
        newTab.get("https://www.amazon.com/");
        //aktip tab in title i yazdırıldı->aktif tab imiz=yeni oluşturuluan tab
        System.out.println(driver.getTitle());


    }

    @Test
    public void handleWindows() {
        //ana sekmemizde amazon açılıyor
        driver.get("https://www.amazon.com/");
        //getWindowHandle() getWindowHandles
        String homePageHandle = driver.getWindowHandle();
        //
        driver.switchTo().newWindow(WindowType.TAB);
        //yeni sekmemizde amazon tr yi actık
        driver.get("https://www.amazon.com.tr/");
//yeni pencere oluşturduk
        driver.switchTo().newWindow(WindowType.WINDOW);
        //yeni pencerede google i actık
        driver.get("https://www.google.com/");

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> i = handles.iterator();

        while (i.hasNext()) {

            String currentTab = i.next();
            driver.switchTo().window(currentTab);
            System.out.println(driver.getTitle());
//1.yol->
          // if (!driver.getWindowHandle().equals(homePageHandle)) {
          //     driver.close();
          // }
            //2.yol
            if (!driver.getTitle().contains("Spend")){
                driver.close();
            }
        }
    }
}

