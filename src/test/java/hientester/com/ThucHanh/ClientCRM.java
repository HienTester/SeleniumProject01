package hientester.com.ThucHanh;

import hientester.com.Common.BaseTest;
import org.bouncycastle.crypto.engines.EthereumIESEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ClientCRM extends BaseTest {

    //login to CMR system
    public static void signinCRM() {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        sleep(1);


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        sleep(2);
    }

    //Open client page
    public static void openClientPage() {
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(2);

        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        sleep(2);
    }

    //Enter data on Add Client dialog
    public static void enterDataAddClient(String clientName) {
        //Bắt element của button "Add client"
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
        sleep(2);

        //Bắt element của Field "Company name"
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(clientName);

        //Bắt element của DropDown "Owner"
        driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Sara Ann", Keys.ENTER);

        //Bắt element của Field "Address"
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Nghe An");

        //Bắt element của Field "City"
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Vinh");

        //Bắt element của Field "State"
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Độc thân");

        //Bắt element của Field "Zip"
        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("ABC");

        //Bắt element của Field "Country"
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Viet Nam");

        //Cuộn chuột đến element label ở cuối để thấy được các element bị che
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));

        //Bắt element của Field "Phone"
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("12345678");

        //Bắt element của Field "Website"
        driver.findElement(By.xpath("//input[@id='website']")).sendKeys("http://hientesster.com");


        //Bắt element của Field "VAT Number"
        driver.findElement(By.xpath("//input[@id='vat_number']")).sendKeys("10%");

        //Bắt element của DropDown "Clientgroups"
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("VIP", Keys.ENTER);
        sleep(1);

        //Bắt element của DropDown "Currency"
        driver.findElement(By.xpath("//div[@id='s2id_currency']")).click();
          //c1: Nhập sendKey ->Enter
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("AED",Keys.ENTER);
          //c2: Lấy đến value cụ thể ->Click
        //driver.findElement(By.xpath("//div[@id='select2-drop']//div[text()='AFN']")).click();
        sleep(1);

        //Bắt element của Fiel "Currency Symbol"
        driver.findElement(By.xpath("//input[@id='currency_symbol']")).sendKeys("ABCD");
        sleep(1);

        Bắt element của Checkbox "Disable online payment"
        WebElement checkboxDisable = driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']"));
        boolean statuscheckbox = checkboxDisable.isSelected();
        if(statuscheckbox == false) {
            checkboxDisable.click();
            sleep(1);
        }
        System.out.println("Trạng thái checkbox là : " + checkboxDisable.isSelected());

        //Bắt element của button "Save"
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        sleep(1);
    }

    //Search Client after Added
    public static void checkClientAfterAdded(String clientName) {
        sleep(2);
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName);
        sleep(2);
        String clientNameInTable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr[1]//td[2]")).getText();
        System.out.println(clientNameInTable);

    }

    public static void main(String[] args) {
        createDriver();
        signinCRM();
        openClientPage();
        enterDataAddClient("Hien Tester Selenium");
        checkClientAfterAdded("Hien Tester Selenium");
        closeDriver();
    }
}
