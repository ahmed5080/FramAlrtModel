package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    WebDriver driver;
    Select select;

    public DropdownPage(WebDriver driver) {
        this.driver=driver;
    }
    private final By dropdownList=By.id("dropdown");
    private final By selectValue = By.xpath("//option[@value='2']");
    public void clickOnDropdownList(String visibleText){

        select=new Select(driver.findElement(dropdownList));
        select.selectByVisibleText(visibleText);
    }

    public String getSelect(){
       return driver.findElement(selectValue).getText();
    }
}
