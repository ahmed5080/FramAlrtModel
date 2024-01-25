package frame;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FrameTests extends BaseTests {

    @Test
    public void testFrame() {
       WYSIWYGEditorPage wysiwygEditorPage= homePage.clickWYSIWYGEditor();
       wysiwygEditorPage.clearEditor();
       wysiwygEditorPage.insertEditor("ahmed");
       String actualResult=wysiwygEditorPage.getElement().getText();
       wysiwygEditorPage.clickIncreaseIndentButton();
       String expectedResult="ahmed";
        Assert.assertEquals(expectedResult,actualResult);
    }
}
