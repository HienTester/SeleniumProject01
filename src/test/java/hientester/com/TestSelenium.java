package hientester.com;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium {
 public static void main(String[] args) {

  //Khởi tạo browser với Chrome
  WebDriver driver;
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  //Mở trang AnhTester
  driver.get("https://anhtester.com");

  //Tắt browser
  driver.quit();
 }
}

