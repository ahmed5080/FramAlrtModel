package fileUploader;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadFile;

public class FileUploaderTests extends BaseTests {
String path ="C:\\Users\\Evntoo Testing\\IdeaProjects\\Frist\\uploded\\12.jpg";
    @Test
    public void testSuccessfulFileUploader(){
        UploadFile uploadFile=homePage.clickOnUploadFile();
        uploadFile.uploadImage(path);
        uploadFile.clickOnUploadBtn();
        String expectedResult ="File Uploaded!";
        String actualResult =uploadFile.getValidationMassage();
        Assert.assertEquals(expectedResult,actualResult);


    }

  //  @Test
    public void testSuccessfulFileUploader2(){
        driver.findElement(By.xpath("//a[@href='/upload']")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Evntoo Testing\\IdeaProjects\\Frist\\uploded\\12.jpg");
        driver.findElement(By.id("file-submit")).click();
        String expectedResult ="File Uploaded!";
        String actualResult = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(expectedResult,actualResult);
}
}