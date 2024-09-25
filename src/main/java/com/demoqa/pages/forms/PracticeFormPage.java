package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsCheckBox = By.id("hobbies-checkbox-1");
    private By readingCheckBox = By.id("hobbies-checkbox-2");
    private By musicCheckBox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckBox() {
        if (!find(sportsCheckBox).isSelected()) {
            scrollToElementJS(sportsCheckBox);
            clickJS(sportsCheckBox);
        }
    }

    public void clickReadingCheckBox() {
        if (!find(readingCheckBox).isSelected()) {
            scrollToElementJS(readingCheckBox);
            clickJS(readingCheckBox);
        }
    }

    public void unclickReadingCheckBox() {
        if (find(readingCheckBox).isSelected()) {
            scrollToElementJS(readingCheckBox);
            clickJS(readingCheckBox);
        }
    }

    public void clickMusicCheckBox() {
        if (!find(musicCheckBox).isSelected()) {
            scrollToElementJS(musicCheckBox);
            clickJS(musicCheckBox);
        }
    }

    public boolean isReadingCheckBoxSelected () {
        return  find(readingCheckBox).isSelected();
    }

}
