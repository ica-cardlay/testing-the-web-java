package com.cardlay.test.pagemodel.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePopup {

    WebDriver driver;

    By buttonAccept = By.id("L2AGLb");

    public GooglePopup(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Click the accept button in the cookie data policy popup.
     */
    public void clickButtonAccept() {
        driver.findElement(buttonAccept).click();
    }

}
