package com.autodesk.pages;

import com.autodesk.utilities.Driver;
import com.autodesk.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

  }