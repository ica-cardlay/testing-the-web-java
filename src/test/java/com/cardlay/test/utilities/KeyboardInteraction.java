package com.cardlay.test.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardInteraction {

    public void pressKey(WebDriver driver, Keys key) {
        Actions action = new Actions(driver);
        action.sendKeys(key).perform();
    }

}
