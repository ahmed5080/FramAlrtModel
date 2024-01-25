package statusCode;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StatusCode;

import static org.testng.Assert.assertTrue;

public class testStatusCode extends BaseTests {

    @Test(priority = 1)
    public void testStatusCode200(){

        StatusCode statusCode=homePage.clickOnStatusCode();
        statusCode.clickOnStatusCode200();
        String expectedResult ="This page returned a 200 status code.";
        String actualResult =driver.findElement(By.tagName("p")).getText();
        assertTrue(actualResult.contains(expectedResult));



    }
    @Test(priority = 2)
    public void testStatusCode301(){

        StatusCode statusCode=homePage.clickOnStatusCode();
        statusCode.clickOnStatusCode301();
        String expectedResult ="This page returned a 301 status code.";
        String actualResult =statusCode.getValidationMessage();
        assertTrue(actualResult.contains(expectedResult));

    }
    @Test(priority = 3)
    public void testStatusCode404(){

        StatusCode statusCode=homePage.clickOnStatusCode();
        statusCode.clickOnStatusCode404();
        String expectedResult ="This page returned a 404 status code.";
        String actualResult =statusCode.getValidationMessage();
        assertTrue(actualResult.contains(expectedResult));



    }

    @Test(priority = 4)
    public void testStatusCode500(){

        StatusCode statusCode=homePage.clickOnStatusCode();
        statusCode.clickOnStatusCode500();
        String expectedResult ="This page returned a 500 status code.";
        String actualResult =statusCode.getValidationMessage();
        assertTrue(actualResult.contains(expectedResult));



    }





}
