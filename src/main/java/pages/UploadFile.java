package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UploadFile {
    WebDriver driver;
    public UploadFile(WebDriver driver) {
        this.driver=driver;
    }

    private final By chooseFile =By.xpath("//input[@id='file-upload']");

    private final By uploadBtn =By.id("file-submit");

    private  final By validationMassage = By.xpath("//h3");



    public void uploadImage(String imagePath){
        driver.findElement(chooseFile).sendKeys(imagePath);
    }
    public void clickOnUploadBtn(){
        driver.findElement(uploadBtn).click();
    }
    public String getValidationMassage (){
       return driver.findElement(validationMassage).getText();

    }

}



