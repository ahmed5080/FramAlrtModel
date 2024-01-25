package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPassword {
    WebDriver driver;

    public ForgetPassword(WebDriver driver) {
        this.driver=driver;

    }

    private final By emailFiled=By.xpath("//input[@type='text']");
    private final By retrievePasswordBtn = By.xpath("//button[@type='submit']");
    private final By validationMessage=By.xpath("//h1");



    public void insertEmail(String email){

        driver.findElement(emailFiled).sendKeys(email);
    }
    public void clickOnRetrievePasswordBtn(){

        driver.findElement(retrievePasswordBtn).click();
    }
    public String getValidationMessage(){
      return driver.findElement(validationMessage).getText();
    }


}
