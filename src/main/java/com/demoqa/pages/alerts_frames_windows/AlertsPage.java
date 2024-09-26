package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFramesWindowsPage {
    private By informationAlertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResults = By.id("confirmResult");
    private By promptAlertButton = By.id("promtButton");
    private By promptResults = By.id("promptResult");

    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }

    public void clickTimerAlertButton() {
        click(timerAlertButton);
    }

    public void clickConfirmationAlertButton() {
        click(confirmationAlertButton);
    }

    public String getConfirmationResults() {
        return find(confirmationResults).getText();
    }

    public void clickPromptAlertButton() {
        click(promptAlertButton);
    }

    public String getPromptResults() {
        return find(promptResults).getText();
    }

}
