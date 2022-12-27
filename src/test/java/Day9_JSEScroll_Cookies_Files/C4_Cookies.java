package Day9_JSEScroll_Cookies_Files;

import Day07.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C4_Cookies extends BaseTest {
    /*
    19
Go to URL: https://kitchen.applitools.com/ingredients/cookie
Get Cookie.
Find the total number of cookies.
Print all the cookies.
Add Cookie.
Edit Cookie.
Delete Cookie.
Delete All Cookies.
     */


    @Test
    public void testCookie() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        System.out.println("test get cookie");
        Cookie cookie = driver.manage().getCookieNamed("protein");//cookie yi isimle cağırdık
        Assert.assertEquals("chicken", cookie.getValue());

        //Find the total number of cookies.
        Set<Cookie> allCookies = driver.manage().getCookies();
        int numOfCookies = allCookies.size();
        System.out.println("numOfCookies = " + numOfCookies);

        //Print all the cookies.
        for (Cookie each : allCookies) {
            System.out.println("each cookie : " + each);
            System.out.println("each cookie name : " + each.getName());
            System.out.println("each cookie value : " + each.getValue());

        }
        //Add Cookie.
        System.out.println("Add Cookie.");
        Cookie cookie1 = new Cookie("fruit", "apple");//cookie oluşturduk
        driver.manage().addCookie(cookie1);
        Assert.assertEquals("it does not match", cookie1.getValue(), driver.manage().getCookieNamed(cookie1.getName()).getValue());
        allCookies = driver.manage().getCookies();//sayfada var olan cookielrei döndürür
        System.out.println("allCookies = " + allCookies.size());
        //Edit Cookie.

        System.out.println("Edit Cookie.");
        Cookie editedCookie = new Cookie(cookie1.getName(), "mango");
        driver.manage().addCookie(editedCookie);
        Assert.assertEquals(editedCookie.getValue(), driver.manage().getCookieNamed(cookie1.getName()).getValue());
        System.out.println(driver.manage().getCookieNamed(cookie1.getName()).getValue());


    }
    @Test
    public void deleteCookies() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        System.out.println("delete cookies");
        Cookie addedCookie=new Cookie("drinks","ayran");
        driver.manage().addCookie(addedCookie);
        driver.manage().deleteCookie(addedCookie);
        Assert.assertNull("cookie halen var",driver.manage().getCookieNamed(addedCookie.getName()));
        driver.manage().deleteAllCookies();//browserdan hepsi sildik

    }
}
