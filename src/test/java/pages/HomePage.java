package pages;

import org.openqa.selenium.By;

import static helper.Utility.webDriver;

public class HomePage {

    By menuButtonContainer = By.id("menu_button_container");

    public boolean verifyPageIsDisplayed(){
        webDriver.findElement(menuButtonContainer).isDisplayed();
        return true;
    }
}
