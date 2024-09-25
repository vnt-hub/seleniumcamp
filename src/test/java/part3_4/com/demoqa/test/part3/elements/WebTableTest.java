package part3_4.com.demoqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test

    public void testWebTable() {
        String email = "kierra@example.com";
        String expectedAge = "34";
        var webTablesPage = homePage.goToElements().clickWebTables();
        webTablesPage.clickEdit(email);
        webTablesPage.setAge("34");
        webTablesPage.clickSubmitButton();
        String actualAge = webTablesPage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge, "\n Actual & Expected Do Not Match \n");
    }
}
