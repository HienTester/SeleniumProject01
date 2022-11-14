package hientester.com.Bai7_WebDriver;

import hientester.com.Common.BaseTest;
import io.netty.handler.codec.http.cookie.Cookie;

public class InterfaceOptions extends BaseTest {
    public static void main(String[] args) {
        createDriver();
//        // Add a new cookie
//
//        Cookie newCookie = new Cookie("customName", "customValue");
//        driver.manage().addCookie(newCookie);
//
//        // Get all cookies
//        Set<Cookie> cookies = driver.manage().getCookies();
//
//        // Delete a cookie by name
//        driver.manage().deleteCookieNamed("CookieName");
//
//        // Delete all cookies
//        driver.manage().deleteAllCookies();


        closeDriver();
    }
}
