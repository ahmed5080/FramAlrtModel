package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {

        this.driver=driver;
    }

    private final By usernameFiled=By.id("username");
    private final By passwordFiled=By.id("password");
    private final By loginBtn =By.cssSelector(".radius");

    public void insertUsername(String username){

        driver.findElement(usernameFiled).sendKeys(username);
    }
    public void insertPassword(String password){
        driver.findElement(passwordFiled).sendKeys(password);
    }
    public SecureAreaPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return new  SecureAreaPage(driver);
    }




}
