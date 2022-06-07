package com.cardlay.test.features.web.google;

import com.cardlay.test.pagemodel.web.GoogleSearchPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class GoogleSearchTest {


    public String getDriverPath() throws URISyntaxException {
        URL res = getClass().getClassLoader().getResource("geckodriver.exe");
        File file = Paths.get(res.toURI()).toFile();
        return file.getAbsolutePath();

    }

    @Test
    public void GoogleTest() throws URISyntaxException {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver", getDriverPath());

        WebDriver driver = new FirefoxDriver();

        // basic URL
        String baseUrl = "https://google.com/";

        // Expected title
        String expectedTitle = "mybadtitle";

        // Launch browser
        driver.get(baseUrl);

        // Something will happen here since WebDriver starts in incognito mode
        // What will happen and how could we overcome it?

        // Initialize a page from the Page Object Model
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);


        // get the actual value of the title
        String actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        // Close driver
        driver.close();

    }

    @Test
    public void GoogleInputTest() throws URISyntaxException {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver", getDriverPath());

        WebDriver driver = new FirefoxDriver();

        // basic URL
        String baseUrl = "https://google.com/";

        // Launch browser
        driver.get(baseUrl);

        // Something will happen here since WebDriver starts in incognito mode
        // What will happen and how could we overcome it?

        // Initialize a page from the Page Object Model
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

        // What to do here?
        googleSearchPage.setSeachInputFieldTo("");

        // What should we assert? How do we know this works?

        // Close driver
        driver.close();

    }

}
