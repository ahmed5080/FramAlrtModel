package forgetPassword;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgetPassword;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTests extends BaseTests {

    @Test
    public void testSuccessfulForgetPasswordSu(){

        //driver.findElement(By.xpath("//a[@href='/forgot_password']")).click();
       // driver.findElement(By.id("email")).sendKeys("ahmed@gmail.com");
      //  driver.findElement(By.id("form_submit")).click();
       // String expectedResult ="Internal Server Error";
       // String actualResult = driver.findElement(By.tagName("h1")).getText();
       // Assert.assertEquals(expectedResult,actualResult);

        ForgetPassword forgetPassword= homePage.clickOnForgetPassword();
        forgetPassword.insertEmail("a.shaker@gmail.com");
        forgetPassword.clickOnRetrievePasswordBtn();
        String actualResult=forgetPassword.getValidationMessage();
        String expectedResult ="Internal Server Error";
        Assert.assertEquals(expectedResult,actualResult);






    }
}
