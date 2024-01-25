package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondPage {
    WebDriver driver;
    WebDriverWait wait;
    public SecondPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By startButton=By.cssSelector("#start button");
    private final By getLoading=By.xpath("//img[@src='/img/ajax-loader.gif']");

    public void clickOnStartButton(){

        driver.findElement(startButton).click();
    }

    public void showGetLoading(){
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(getLoading)));
    }



}
