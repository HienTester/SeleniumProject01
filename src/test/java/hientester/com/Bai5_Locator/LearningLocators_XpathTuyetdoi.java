package hientester.com.Bai5_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearningLocators_XpathTuyetdoi {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo Browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Bắt xpath tuyệt đối của trang Login
          //Mở trang HRSALE
        driver.get("https://app.hrsale.com/");
        Thread.sleep(1000);

           //Điền username
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("frances.burns");

        //Điền Password
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("frances.burns");

          //Click Login
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[3]/div[1]/button/span[1]")).click();

        //Bắt xpath menu Projects
          //Click Projects
         driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[10]/a/span[2]")).click();

        //Bắt xpath hết Form của trang Add New Project
          //Click Add Prọject
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/nav/div/a[3]")).click();

         //Điền title
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[1]/div/input")).sendKeys("Hien");

        //Chọn Client
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[2]/div/span/span[1]/span/span[1]")).click();

        //Chọn Estimated Hour
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[1]/form/div[1]/div/div[2]/div/div[3]/div/div/input")).click();

        Thread.sleep(600);
        //Tắt browser
        driver.quit();
    }
}
