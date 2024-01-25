package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WYSIWYGEditorPage {
    WebDriver driver;
    WebDriverWait wait;

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver=driver;
    }
    private final String frame="mce_0_ifr";

    private final By editor= By.xpath("//body[@id='tinymce']//p");
    private final By increaseIndentButton =By.cssSelector("[aria-label='Increase indent']");



    private void switchToFrame(){
        driver.switchTo().frame(frame);
    }
    private void switchToParent(){
        driver.switchTo().parentFrame();
    }
    public void insertEditor(String text){
        switchToFrame();
        driver.findElement(editor).sendKeys(text);
    }
    public void clearEditor(){
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        switchToFrame();
        wait.until(ExpectedConditions.visibilityOfElementLocated(editor));
        driver.findElement(editor).clear();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(editor));
        switchToParent();
    }
    public void clickIncreaseIndentButton(){
        switchToParent();

        driver.findElement(increaseIndentButton).click();

    }

    public WebElement getElement(){

        return driver.findElement(editor);
    }

}
