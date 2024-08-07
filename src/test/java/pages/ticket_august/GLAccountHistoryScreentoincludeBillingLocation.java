package pages.ticket_august;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class GLAccountHistoryScreentoincludeBillingLocation extends TestDriverActions {

      @FindBy(xpath = "(//a[contains(.,'Global System Parameters')])[1]")
      WebElement GlobalSystemParameter;

      @FindBy(xpath = "(//label[contains(.,'Search:')]/parent::td/following-sibling::td/child::input)[1]")
      WebElement SearchTextArea;

      @FindBy(xpath = "(//span[contains(.,'GROUND')])[1]")
      WebElement code_Ground;

      @FindBy(xpath = "(//span[contains(.,'GROUND TEST')])[1]")
      WebElement name_GroundTest;

      @FindBy(xpath = "(//span[contains(.,'Y')]/parent::td)[3]")
      WebElement systemvalue_Y;

      @FindBy(xpath = "(//td[contains(.,'Year End')])[3]")
       WebElement YearEnd;

    @FindBy(xpath = "(//td[contains(.,'GL Account History')]/span)[1]")
    WebElement title_GlAccountHistory;

    @FindBy(xpath = "//label[text()='Year:']")
    WebElement Year;

    @FindBy(xpath = "//label[text()='Year:']/preceding-sibling::span")
    WebElement RequiredYear;

    @FindBy(xpath = "//select[contains(@id,':soc1::content')]")
    WebElement year;

    @FindBy(xpath = "//label[text()='From Period:']/preceding-sibling::span")
    WebElement  Required_FromPeriod;

    @FindBy(xpath = "//label[text()='From Period:']")
    WebElement FromPeriod;

    @FindBy(xpath = "//select[contains(@id,':soc2::content')]")
    WebElement from_period;
    @FindBy(xpath = "//label[text()='To Period:']/preceding-sibling::span")
    WebElement RequiredToPeriod;

    @FindBy(xpath = "//label[text()='To Period:']")
    WebElement Toperiod;

    @FindBy(xpath = "//select[contains(@id,':soc3::content')]")
    WebElement To_Period;

    @FindBy(xpath = "//a[contains(.,'Refresh')]/child::span")
    WebElement btn_Refresh;
    @FindBy(xpath = "//a[contains(.,'Export')]/span")
    WebElement btn_Export;
    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    /**
     * go to Security Setup
     */
    public void gotoSecuritySetUp() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Perfit");
        ReusableActions.getActions().clickChildMenu("Security Setup");
        TestListener.saveScreenshotPNG(driver);
        WaitActions.getWaits().loadingWait(loder);

    }
     /**click On Globel System Parameter*/
     public void clickOnGlobalSystemParameter () throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GlobalSystemParameter);
         WebElementActions.getActions().clickElement(GlobalSystemParameter);
         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);

     }
     /**enter the System Parameter*/
     public void enterTheSystemParamter () throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
         WebElementActions.getActions().inputText(SearchTextArea,appProp.getProperty("Show_billing"));
         WaitActions.getWaits().loadingWait(loder);
         TestListener.saveScreenshotPNG(driver);

     }
    /**varify Corporation for this parameter */
    public void varifyCorporationForthisParamter () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(code_Ground);
        Assert.assertTrue(code_Ground.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(name_GroundTest);
        Assert.assertTrue(name_GroundTest.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(systemvalue_Y);
        Assert.assertTrue(systemvalue_Y.isDisplayed());

    }
    /**
     * go to GL Account  History
     */
    public void gotoGLAccount() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Financials");
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click  On Down Arrow
     */
    public void clickOnDownArrow() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(YearEnd);
        Assert.assertTrue(YearEnd.isDisplayed());
        System.out.println("varify the data :" + YearEnd.getText());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", YearEnd);

    }
    /**
     * click On History
     */
    public void clickOnGLAccountHistory() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickChildMenu("GL Account History");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**varify  Gl account History Title*/
    public void varifyGlAccountHistory () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(title_GlAccountHistory);
        Assert.assertTrue(title_GlAccountHistory.isDisplayed());


    }
    /**varify Year */
    public void varifyYear () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredYear);
        Assert.assertTrue(RequiredYear.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Year);
        Assert.assertTrue(Year.isDisplayed());

    }
    /**
     * select Year
     */
    public void selectYear() throws InterruptedException {
        Select obj = new Select(year);
        obj.selectByVisibleText("2023");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**varify from Period */
    public void varifyFromPeriod () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_FromPeriod);
        Assert.assertTrue(Required_FromPeriod.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FromPeriod);
        Assert.assertTrue(FromPeriod.isDisplayed());

    }

    /**
     * Select From period
     */
    public void selectFromPeriod() throws InterruptedException {
        Select src = new Select(from_period);
        src.selectByVisibleText("12");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**varify TO Period */
    public void varifyToPeriod () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredToPeriod);
        Assert.assertTrue(RequiredToPeriod.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Toperiod);
        Assert.assertTrue(Toperiod.isDisplayed());

    }

    /**
     * select To period
     */
    public void Toperiod() throws InterruptedException {

        Select str = new Select(To_Period);
        str.selectByVisibleText("12");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Refresh
     */
    public void clickOnRefresh() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Refresh);
        WebElementActions.getActions().clickElement(btn_Refresh);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /**
     * click on export
     */
    public void clickOnExport() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Export);
        WebElementActions.getActions().clickElement(btn_Export);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
        Thread.sleep(3000);
        int count = 0;
        while (count < 20) {
//            System.out.println("Size of queue is :" + queue.size());
            Thread.sleep(1000);
            count++;
            if (queue.size() > 0) {

                WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Export);
                WebElementActions.getActions().clickElement(btn_Export);
                break;
            }
        }
    }
    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickUsingJS(btn_signOut);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        Assert.assertTrue(inputbox_Username.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }



}
