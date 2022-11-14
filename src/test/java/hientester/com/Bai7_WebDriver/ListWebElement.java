package hientester.com.Bai7_WebDriver;

import hientester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://app.hrsale.com/erp/login");
        driver.findElement(By.xpath("//button[normalize-space()='Super Admin']")).click();

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(6000);

        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@class='pc-navbar']/li"));

        //C1: Muốn click trực tiếp vào 1 item thứ 3
        System.out.println(listMenu.get(3).getText());
        driver.findElement(By.xpath("//li//a//span[normalize-space()='Core HR'")).click();

        //c2: Click vào chuỗi list menu
        for (int i = 0; i <listMenu.size(); i++)
            System.out.println(listMenu.get(i).getText()); // get(i) : trả về vị trí; getText(): trả về giá trị


        closeDriver();
    }
}
