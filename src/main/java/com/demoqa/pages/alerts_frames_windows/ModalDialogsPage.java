package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends AlertsFramesWindowsPage {

    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public String getSmallModalText() {
        scrollToElementJS(smallModalText);
        return find(smallModalText).getText();
    }

    public void clickCloseButton() {
        scrollToElementJS(smallModalText);
        click(closeButton);
    }


}
