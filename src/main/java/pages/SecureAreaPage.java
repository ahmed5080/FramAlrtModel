package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver=driver;
    }
    private final By validationMassage = By.xpath("//div[@id='flash']");

    public String getValidationMassage(){
       return driver.findElement(validationMassage).getText();

    }
}
