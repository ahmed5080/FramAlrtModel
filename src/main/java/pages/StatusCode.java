package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode {
    WebDriver driver;

    public StatusCode(WebDriver driver) {
        this.driver=driver;

    }

    private final By statusCode200 = By.xpath("//a[@href='status_codes/200']");

    private final By statusCode301 = By.xpath("//a[@href='status_codes/301']");

    private final By statusCode404 = By.xpath("//a[@href='status_codes/404']");
    private final By statusCode500 =By.xpath("//a[@href='status_codes/500']");

    private final By validationMessage =By.xpath("//div[@class='example']");
    public void clickOnStatusCode200(){
        driver.findElement(statusCode200).click();
    }
    public void clickOnStatusCode301(){
        driver.findElement(statusCode301).click();
    }
    public void clickOnStatusCode404(){
        driver.findElement(statusCode404).click();
    }
    public void clickOnStatusCode500(){
        driver.findElement(statusCode500).click();
    }
    public String getValidationMessage(){

        return driver.findElement(validationMessage).getText();
    }




}
