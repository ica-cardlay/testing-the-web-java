package com.cardlay.test.pagemodel.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

    WebDriver driver;

    By searchInput = By.name("q");

    By buttonSearch = By.name("btnK");

    By buttonLuck = By.className("");

    By login = By.name("btnLogin");

    public GoogleSearchPage(WebDriver driver) {

        this.driver = driver;

    }

    public void setSearchInputFieldTo(String value) {
        driver.findElement(searchInput).sendKeys(value);
    }

    public void clickButtonSearch() {
        driver.findElement(buttonSearch).click();
    }

}
