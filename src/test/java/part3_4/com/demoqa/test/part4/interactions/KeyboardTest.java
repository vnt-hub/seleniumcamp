package part3_4.com.demoqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testTextBox () {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Viktar");
        textBoxPage.setEmail("sadwqe@gmail.com");
        textBoxPage.setCurrentAddressInput("1234 avenue");
        textBoxPage.setCurrentAddressInput("suite 1111");
        textBoxPage.setCurrentAddressInput("Texas");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("suite 1111"),
                "\n Actual Address Doesn't Contain suite 1111 \n");
    }
}
