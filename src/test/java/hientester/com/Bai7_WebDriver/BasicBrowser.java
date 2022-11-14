package hientester.com.Bai7_WebDriver;

import hientester.com.Common.BaseTest;
import org.openqa.selenium.By;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.navigate().to("https://anhtester.com/");
        sleep(2);
        driver.findElement(By.id("btn-login")).click();
        sleep(1);

//        //Điều hướng về lịch sử trang trước đó
//        driver.navigate().back();
//        sleep(1);
//        //Làm mới trang hiện tại
//        driver.navigate().refresh();
//        sleep(2);
//        //Điều hướng đến trang tiếp theo
//        driver.navigate().forward();
//        sleep(2);

        // Get the title of the page
        System.out.println(driver.getTitle());
        // Get the current URL
        String url = driver.getCurrentUrl();
        // Get the current page HTML source
        String html = driver.getPageSource();


        closeDriver();
    }

}
