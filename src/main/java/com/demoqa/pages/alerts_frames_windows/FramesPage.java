package com.demoqa.pages.alerts_frames_windows;


import org.openqa.selenium.By;

import static utilities.SwitchUtility.*;

public class FramesPage extends AlertsFramesWindowsPage {

    private By textInFrame = By.id("sampleHeading");
    private String iframeBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");


    private void switchToBigBox() {
        switchToFrameString(iframeBigBox);
    }

    private void switchToSmallBox() {
        //switchToFrameIndex(2);
        switchToWebElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
