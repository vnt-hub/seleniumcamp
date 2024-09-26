package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchUtility extends Utility {

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    public static void inputAlert(String text) {
        switchTo().alert().sendKeys(text);
    }
}
