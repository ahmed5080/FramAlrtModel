package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoading;
import pages.OnePage;
import pages.SecondPage;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testExplicitWait(){
       DynamicLoading dynamicLoading= homePage.clickOnDynamicLoadingLink();
        OnePage onePage=dynamicLoading.ClickExampleLoadLink();
        onePage.clickOnStartButton();
        String expectedText="Hello World!";
        String actualText =onePage.getValidationMessage();
        assertEquals(expectedText,actualText);

    }

    @Test
    public void testExplicitWait1(){
        DynamicLoading dynamicLoading= homePage.clickOnDynamicLoadingLink();
        SecondPage secondPage=dynamicLoading.ClickExampleLoadLink2();
        secondPage.clickOnStartButton();
        secondPage.showGetLoading();




    }


}
