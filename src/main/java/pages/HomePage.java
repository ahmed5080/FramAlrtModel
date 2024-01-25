package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {


    WebDriver driver;
    public HomePage (WebDriver driver){

        this.driver=driver;
    }

    private final By formAuthenticationLink =By.xpath("//*[@id=\"content\"]/ul/li[21]/a");

    private final By forgetPasswordLink = By.xpath("//a[@href='/forgot_password']");
    private  final By uploadFileLink = By.xpath("//a[@href='/upload']");

    private final  By checkBoxes = By.cssSelector("a[href='/checkboxes']");

    private final By statusCodeLink = By.xpath("//a[@href='/status_codes']");

    private  final  By dynamicLoadingLink =By.xpath("//a[@href='/dynamic_loading']");
    private final By dropdownLink = By.xpath("//a[@href='/dropdown']");
    private final By javaScriptAlertsLink =By.xpath("//a[@href='/javascript_alerts']");
    private final By entryAdLink = By.xpath("//a[@href='/entry_ad']");
    private final By wYSIWYGEditor =By.xpath("//a[@href='/tinymce']");







    private void clickOnLink(By locator){
           driver.findElement(locator).click();

     }


    public  LoginPage clickOnFormAuthenticationLink (){
    clickOnLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public ForgetPassword clickOnForgetPassword(){
        clickOnLink(forgetPasswordLink);
        return new ForgetPassword (driver);
    }

    public UploadFile clickOnUploadFile(){
        clickOnLink(uploadFileLink);
        return new UploadFile(driver);
    }
    public CheckBoxes clickOnCheckBoxes(){
        clickOnLink(checkBoxes);
        return new CheckBoxes(driver);
    }

    public StatusCode clickOnStatusCode(){
        clickOnLink(statusCodeLink);
        return new StatusCode(driver);
    }

    public DynamicLoading   clickOnDynamicLoadingLink(){
        clickOnLink(dynamicLoadingLink);
        return new DynamicLoading(driver);

    }
    public DropdownPage clickOnDropdownLink(){
           clickOnLink(dropdownLink);
           return new DropdownPage(driver);
    }
    public JavascriptAlertsPage clickJavascriptAlertsLink(){
        clickOnLink(javaScriptAlertsLink);
        return new JavascriptAlertsPage(driver);

    }
    public EntryAdPage clickOnEntryAd(){
        clickOnLink(entryAdLink);
        return new EntryAdPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditor(){
        clickOnLink(wYSIWYGEditor);
        return new WYSIWYGEditorPage(driver);
    }

}
