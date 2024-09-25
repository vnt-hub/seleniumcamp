package part3_4.com.demoqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckBox();
        formsPage.clickReadingCheckBox();
        formsPage.clickMusicCheckBox();
        formsPage.unclickReadingCheckBox();

        boolean isReadingCheckBoxSelected = formsPage.isReadingCheckBoxSelected();
        Assert.assertFalse(isReadingCheckBoxSelected, "\n Reading CheckBox Is Selected \n");

    }
}
