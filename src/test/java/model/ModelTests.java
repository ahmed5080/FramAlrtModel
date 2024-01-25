package model;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class ModelTests extends BaseTests {

    @Test
    public void modelTest() throws InterruptedException {
       EntryAdPage entryAdPage= homePage.clickOnEntryAd();
       entryAdPage.clickOnCloseBtn();
       String expectedResult="Entry Ad";
       String actualResult=entryAdPage.getElement().getText();
        Assert.assertEquals(actualResult,expectedResult);

    }
}
