package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavascriptAlertsPage {
    WebDriver driver;

    public JavascriptAlertsPage(WebDriver driver) {
         this.driver= driver;

    }
    private final By jSAlertBtn=By.xpath("//button[contains(text(),'JS Alert')]");

    private final By JSConfirmBtn=By.xpath("//button[contains(text(),'JS Confirm')]");
    private final By JSPromptBtn=By.xpath("//button[contains(text(),'JS Prompt')]");


    private final By validationMessage=By.id("result");




    public void clickOnJSAlertBtn(){
        driver.findElement(jSAlertBtn).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }
    public void clickOnJSConfirmBtn(){
        driver.findElement(JSConfirmBtn).click();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void clickOnJSPromptBtn(){
        driver.findElement(JSPromptBtn).click();
    }
    public void sendKeyAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }


}
