package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryAdPage {
    WebDriver driver;
    public EntryAdPage(WebDriver driver) {
        this.driver= driver;
    }
    private final By closeBtn=By.xpath("//div[@class='modal-footer']//p");
    private final By hereButton=By.id("restart-ad");
    private final By entryAd=By.xpath("//div[@class='example']//h3");


    public void clickOnCloseBtn() throws InterruptedException {

        //driver.findElement(hereBtn).click();
        Thread.sleep(5000);
        for (int i = 0; i <= 10; i++) {
            try {
                driver.findElement(closeBtn).click();
                break;
            }
            catch (Exception a){
                driver.findElement(hereButton).click();
                System.out.println("shaker");
                Thread.sleep(200);

            }
            /*if (driver.findElement(closeBtn).isDisplayed() == true) {
                driver.findElement(closeBtn).click();
                System.out.println("dooooo");
                break;
            } else {
                System.out.println("shaker");
                driver.findElement(hereBtn).click();
                Thread.sleep(200);
            }
*/
        }

    }

    public WebElement getElement(){

        return driver.findElement(entryAd);
    }
}
