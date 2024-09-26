package part3_4.com.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;
import static utilities.SwitchUtility.*;

@Test

public class AlertsTest extends BaseTest {

    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindows().clickAlertsMenuItem();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual & Expected Messages Doesn't match \n");
        acceptAlert();
    }

    public void testTimerAlert() {
        String expectedAlertText = "This alert appeared after 5 seconds";
        var alertsPage = homePage.goToAlertsFramesWindows().clickAlertsMenuItem();
        alertsPage.clickTimerAlertButton();
        delay(5000);
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual & Expected Messages Doesn't match  \n");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        var alertsPage = homePage.goToAlertsFramesWindows().clickAlertsMenuItem();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResults();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n You Didn't Not Select Cancel \n");
    }

    public void testPromptAlert() {
        String alertText = "Selenium With Java";
        String expectedResults = "You entered " + alertText;
        var alertsPage = homePage.goToAlertsFramesWindows().clickAlertsMenuItem();
        alertsPage.clickPromptAlertButton();
        inputAlert(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptResults();
        Assert.assertEquals(actualResult, expectedResults,
                "\n Actual & Expected Results Don't Match \n");
    }
}
