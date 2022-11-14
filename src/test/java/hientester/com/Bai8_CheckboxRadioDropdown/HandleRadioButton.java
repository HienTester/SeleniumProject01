package hientester.com.Bai8_CheckboxRadioDropdown;

import hientester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[normalize-space()='Male']"));
        System.out.println(radioButton.isSelected());
        sleep(1);

        //Check lần 1 xem đã được click chưa? Nếu chưa click thì tiến hành click
        if (radioButton.isSelected() == false) {
            radioButton.click();
        }
        System.out.println(radioButton.isSelected());
        sleep(1);



        closeDriver();
    }
}
