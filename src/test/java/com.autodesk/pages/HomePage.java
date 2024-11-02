package com.autodesk.pages;

import com.autodesk.utilities.Driver;
import com.autodesk.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    //============================= elements =====================================

    @FindBy(xpath = "textarea[@class='gLFyf']")
    WebElement searchBar;
    @FindBy(xpath = "//div[@tabindex='0'][@aria-label='equals']")
    WebElement equals;
    @FindBy(xpath = "//div[@tabindex='0'][@aria-label='plus']")
    WebElement plus;
    @FindBy(xpath = "div[@tabindex='0'][@class='minus']")
    WebElement minus;
    @FindBy(xpath = "//div[@tabindex='0'][@aria-label='multiply']")
    WebElement multiply;
    @FindBy(xpath = "//div[@tabindex='0'][@aria-label='divide']")
    WebElement divide;
    @FindBy(xpath = "div[@tabindex='0'][@class='M2vV3 vOY7J']")
    WebElement numberZero;
    @FindBy(xpath = "//div[@jsname='N10B9'][@class='XRsWPe AOvabd']")
    WebElement numberOne;
    @FindBy(xpath = "//div[@jsname='lVjWed'][@class='XRsWPe AOvabd']")
    WebElement numberTwo;
    @FindBy(xpath = "//div[@jsname='KN1kY'][@class='XRsWPe AOvabd']")
    WebElement numberThree;
    @FindBy(xpath = "//div[@jsname='xAP7E'][@class='XRsWPe AOvabd']")
    WebElement numberFour;
    @FindBy(xpath = "//div[@jsname='Ax5wH'][@class='XRsWPe AOvabd']")
    WebElement numberFive;
    @FindBy(xpath = "//div[@jsname='abcgof'][@class='XRsWPe AOvabd']")
    WebElement numberSix;
    @FindBy(xpath = "div[@jsname='rk7bOd'][@class='XRsWPe AOvabd']")
    WebElement numberSeven;
    @FindBy(xpath = "//div[@jsname='T7PMFe'][@class='XRsWPe AOvabd']")
    WebElement numberEight;
    @FindBy(xpath = "//div[@jsname='XoxYJ'][@class='XRsWPe AOvabd']")
    WebElement numberNine;
    @FindBy(xpath = "//div[@jsname='SLn8gc'][@class='XRsWPe AOvabd']")
    WebElement allClear;

    @FindBy(xpath = "//button[@aria-label='Stay signed out']")
    WebElement staySignedOutButton;


    //===========================methods/functions==============================
    public void addTextToTextBarInHomePage() {
        searchBar.sendKeys("Calculator");

    }

    public void clickEnterOnKeyboard() {
        searchBar.sendKeys(Keys.ENTER);
    }
    public void clickStaySignedOutButton() {
        staySignedOutButton.click();
    }

    public void clickOnSearchBar() {
        searchBar.click();
    }

    public boolean isPlusDisplayed() {
        logger.info("Checking if element is displayed");
        SeleniumUtils.waitForVisibilityOfElement(plus);
        return plus.isDisplayed();
    }

    public boolean isMinusDisplayed() {
        logger.info("Checking if element is displayed");
        return minus.isDisplayed();
    }

    public boolean isMultiplyDisplayed() {
        logger.info("Checking if element is displayed");
        return multiply.isDisplayed();
    }

    public boolean isDivideDisplayed() {
        logger.info("Checking if element is displayed");
        return divide.isDisplayed();
    }

    public boolean isNumberOneDisplayed() {
        logger.info("Checking if element is displayed");
        return numberOne.isDisplayed();
    }

    public boolean isNumberTwoDisplayed() {
        logger.info("Checking if element is displayed");
        return numberTwo.isDisplayed();

    }
    public boolean isNumberThreeDisplayed() {
        logger.info("Checking if element is displayed");
        return numberThree.isDisplayed();
    }

    public boolean isNumberFourDisplayed() {
        logger.info("Checking if element is displayed");
        return numberFour.isDisplayed();

    }
    public boolean isNumberFiveDisplayed() {
        logger.info("Checking if element is displayed");
        return numberFive.isDisplayed();
    }

    public boolean isNumberSixDisplayed() {
        logger.info("Checking if element is displayed");
        return numberSix.isDisplayed();

    }
    public boolean isNumberSevenDisplayed() {
        logger.info("Checking if element is displayed");
        return numberSeven.isDisplayed();
    }

    public boolean isNumberEightDisplayed() {
        logger.info("Checking if element is displayed");
        return numberEight.isDisplayed();

    }
    public boolean isNumberNineDisplayed() {
        logger.info("Checking if element is displayed");
        return numberNine.isDisplayed();
    }
    public boolean isNumberZeroDisplayed() {
        logger.info("Checking if element is displayed");
        return numberZero.isDisplayed();
    }
    public boolean isEqualsDisplayed() {
        logger.info("Checking if element is displayed");
        return equals.isDisplayed();
    }

    public boolean isAllClearDisplayed() {
        logger.info("Checking if element is displayed");
        return allClear.isDisplayed();

    }
}