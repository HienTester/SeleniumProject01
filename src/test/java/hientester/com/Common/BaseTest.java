package hientester.com.Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    //Khởi tạo Browser
    public static void createDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //Đóng Browser
    public static void closeDriver() {
       sleep(2);
        driver.quit(); //quit: tắt luôn chương trình
    }

    public static void sleep(double seconds) {
        try{
            Thread.sleep((long)(1000 * seconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
