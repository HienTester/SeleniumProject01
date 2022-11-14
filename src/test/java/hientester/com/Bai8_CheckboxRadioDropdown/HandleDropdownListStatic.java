package hientester.com.Bai8_CheckboxRadioDropdown;

import hientester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListStatic extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //Khở tạo đối tượng select và giá trị là một WebElement của thẻ select trong HTML
        Select select = new Select(selectElement);

        System.out.println(select.getFirstSelectedOption().getText()); //Kiểm tra giá trị trong dropdown hiển thị đúng sau khi đã chọn thành công
        System.out.println("Kiểm tra kiểu của select: " + select.isMultiple());
        System.out.println("Số lượng Option trong select: " + select.getOptions().size());


        select.selectByVisibleText("Tuesday");
        sleep(2);
        System.out.println(select.getFirstSelectedOption().getText());//Kiểm tra giá trị trong dropdown hiển thị đúng sau khi đã chọn thành công

        select.selectByValue("Thursday");
        sleep(2);
        System.out.println(select.getFirstSelectedOption().getText());//Kiểm tra giá trị trong dropdown hiển thị đúng sau khi đã chọn thành công

        select.selectByIndex(6);
        sleep(2);
        System.out.println(select.getFirstSelectedOption().getText());//Kiểm tra giá trị theo lựa chọn vị trí trong dropdown hiển thị đúng sau khi đã chọn thành công

        closeDriver();
    }
}
