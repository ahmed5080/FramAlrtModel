package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavascriptAlertsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JSAlertsTest extends BaseTests {

    @Test
    public void testJsAlerts(){
        JavascriptAlertsPage javascriptAlertsPage=homePage.clickJavascriptAlertsLink();
        javascriptAlertsPage.clickOnJSAlertBtn();
        javascriptAlertsPage.acceptAlert();
        String expectedResult ="You successfully clicked an alert";
        String actualResult = javascriptAlertsPage.getValidationMessage();
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testJSConfirm(){
        JavascriptAlertsPage javascriptAlertsPage=homePage.clickJavascriptAlertsLink();
        javascriptAlertsPage.clickOnJSConfirmBtn();
        javascriptAlertsPage.dismissAlert();
        String expectedResult ="You clicked: Cancel";
        String actualResult = javascriptAlertsPage.getValidationMessage();
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testJSConfirmBtn(){
        JavascriptAlertsPage javascriptAlertsPage=homePage.clickJavascriptAlertsLink();
        javascriptAlertsPage.clickOnJSPromptBtn();
        javascriptAlertsPage.sendKeyAlert("ahmed");
        javascriptAlertsPage.acceptAlert();
        String expectedResult ="You entered: ahmed";
        String actualResult = javascriptAlertsPage.getValidationMessage();
        assertEquals(actualResult,expectedResult);
    }


}
