package checkBoxes;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckBoxes;

import static org.testng.Assert.assertTrue;

public class CheckBoxesTest extends BaseTests {
    @Test

    public void testSuccessfulCheckbox(){
        CheckBoxes checkBoxes=homePage.clickOnCheckBoxes();
        checkBoxes.clickCheckBox1();
        checkBoxes.clickCheckBox2();

    }




}
