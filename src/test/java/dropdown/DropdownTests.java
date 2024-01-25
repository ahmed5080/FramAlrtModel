package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;

public class DropdownTests extends BaseTests {


    @Test
    public void TestDropdown(){
        DropdownPage dropdownPage= homePage.clickOnDropdownLink();
        dropdownPage.clickOnDropdownList("Option 2");
        String expectedText="Option 2";
        String actualText =dropdownPage.getSelect();
        assertEquals(actualText,expectedText);



    }
}
