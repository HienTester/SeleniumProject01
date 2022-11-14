package hientester.com.Bai7_WebDriver;

import hientester.com.Common.BaseTest;
import org.openqa.selenium.WindowType;

public class AdvancedBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://anhtester.com");

        //Mở tab mới trong trình duyệt
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
        sleep(2);

        //Mở cửa sổ mới trong trình duyệt
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://anhtester.com/lesson/selenium-java-bai-7-su-dung-cac-ham-co-ban-cua-webdriver");
        sleep(2);

        closeDriver();
    }
}
