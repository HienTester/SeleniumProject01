package hientester.com.Bai8_CheckboxRadioDropdown;

import hientester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get( "https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //Kiểm tra check box mặc định
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        //Check lần 1, khi chưa click
        boolean checkboxStatusBefore = checkboxOne.isSelected();
        System.out.println("Trạng thái checkbox trước khi thực hiện click: " + checkboxStatusBefore);
        sleep(1);

        //Nếu checkbox chưa chọn, thì thực hiện click
        if(checkboxStatusBefore == false) {
            checkboxOne.click();
        }

        //Check lần 2, sau khi đã thực hiện click
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println("Trạng thái checkbox sau khi thực hiện click: " + checkboxStatusAfter);
        sleep(1);

        //Kiểm tra thông báo liên quan kết quả khi checkbox đã được chọn
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Trạng thái message đã được hiển thị chưa: " + message.isDisplayed());
        System.out.println(message.getText());

        closeDriver();
    }

}
