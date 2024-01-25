package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {

    WebDriver driver;
    public DynamicLoading(WebDriver driver) {
        this.driver=driver;

    }
    private final By exampleLoadLink=By.xpath("//a[contains(text(),'Example 1')]");
    private final By exampleLoadLink2=By.xpath("//a[contains(text(),'Example 1')]");


    public OnePage ClickExampleLoadLink(){
        driver.findElement(exampleLoadLink).click();
        return new OnePage(driver);
    }
    public SecondPage ClickExampleLoadLink2(){
        driver.findElement(exampleLoadLink2).click();
        return new SecondPage(driver);
    }
}
