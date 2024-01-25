package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTests {

@Test(priority = 1)
    public void testSuccessfulLogin(){

       LoginPage loginPage= homePage.clickOnFormAuthenticationLink();
       loginPage.insertUsername("tomsmith");
       loginPage.insertPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage=loginPage.clickLoginBtn();
       String expectedResult ="You logged into a secure area!";
       String actualResult = secureAreaPage.getValidationMassage();
       System.out.println(actualResult);
       assertTrue(actualResult.contains(expectedResult));


}
@Test(priority = 2)
    public void testInvalidUsername(){

    LoginPage loginPage= homePage.clickOnFormAuthenticationLink();
    loginPage.insertUsername("tomsmbbith");
    loginPage.insertPassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage=loginPage.clickLoginBtn();
    String expectedResult ="Your username is invalid!";
    String actualResult = secureAreaPage.getValidationMassage();
    assertTrue(actualResult.contains(expectedResult));

}
@Test(priority = 3)
public void testInvalidPassword(){

    LoginPage loginPage= homePage.clickOnFormAuthenticationLink();
    loginPage.insertUsername("tomsmith");
    loginPage.insertPassword("SuperSecretPasmmmsword!");
    SecureAreaPage secureAreaPage=loginPage.clickLoginBtn();
    String expectedResult ="Your password is invalid!";
    String actualResult = secureAreaPage.getValidationMassage();
    assertTrue(actualResult.contains(expectedResult));
}


}
