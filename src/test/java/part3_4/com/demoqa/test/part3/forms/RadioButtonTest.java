package part3_4.com.demoqa.test.part3.forms;

import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleRadioButtonSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected,"\n Female Radio Button Is not Selected \n");
    }
}
