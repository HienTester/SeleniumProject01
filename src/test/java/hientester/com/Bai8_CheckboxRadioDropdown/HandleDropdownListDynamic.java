package hientester.com.Bai8_CheckboxRadioDropdown;

import hientester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListDynamic extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(2);


        //Click vào dropdown Category - Lấy xpath của nút dropdown
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        sleep(2);

        //Search giá trị cần chọn - Lấy xpath của ô text bên trong đó
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hotels");
        sleep(2);

        //Click chọn text đã search - Lấy xpath vào giá trị cụ thể
        driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click(); //Cách 1: dùng click
        //@class='active-result highlighted : chỉ xuất hiện khi di chuột vào một trong những select thì mới có, chứ nó không xuất hiện cố định trên devtool
        sleep(2);

        //Cách 2 dùng Enter
        //Actions action = new Actions(driver);
        //action.sendKeys(Keys.ENTER).perform(); //Cách ENTER chỉ dùng cho TH chỉ hiển thị 1 giá trị lựa chọn


        closeDriver();
    }

}
