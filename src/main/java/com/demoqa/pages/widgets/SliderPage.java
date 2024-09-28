package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage {

    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");

    public void moveSlider(int x, int y) {
        dragAndDropBy(find(slider), x, y);
    }

    public String getSliderValue() {
        return getAttribute(sliderValue, "value");
    }
}
