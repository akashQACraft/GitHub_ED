package pages.ticket_july;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

public class ConvertNonDedicatedreportstofullXLSXformat extends TestDriverActions {

    @FindBy(xpath = "//label[contains(.,'Search:')]/parent::td/following-sibling::td/child::input")
    WebElement search_TextArea;

    @FindBy(xpath = "(//span[contains(.,'Effective Date')])[1]]")
    WebElement EffectivaDate;

    @FindBy(xpath = "//h3[contains(.,'GlAccountHistoryExport')]")
    WebElement GlAccountExport;

    @FindBy(xpath = "//label[text()='Year:']")
    WebElement Year;

    @FindBy(xpath = "//label[text()='Year:']/preceding-sibling::span")
    WebElement RequiredYear;

    @FindBy(xpath = "(//td[contains(.,'Year End')])[3]")
    WebElement YearEnd;
    @FindBy(xpath = "(//td[contains(.,'GL Account History')]/span)[1]")
    WebElement title_GlAccountHistory;

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

    @FindBy(xpath = "//a[contains(.,'Display Totals')]/child::span")
    WebElement btn_DisplayTools;

    @FindBy(xpath = "//table[contains(@id,':plam1')]")
    WebElement tools_value;

    @FindBy(xpath = "//span[contains(.,'Columns Frozen')]")
    WebElement columnsFronze;

    @FindBy(xpath = "//a[contains(.,'Export')]/span")
    WebElement btn_Export;

    @FindBy(xpath = "(//a[contains(text(),'Reports')])[2]")
    WebElement Reports;

    @FindBy(xpath = "(//a[contains(.,'Report History')])[2]")
    WebElement ReportHistory;

    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;

    @FindBy(xpath = "(//a[text()='Report History'])[1]")
    WebElement reportHistory_btn;

    @FindBy(xpath = "//span[contains(text(),'Refresh')]")
    WebElement refresh_btn;

    @FindBy(xpath = "(//a[contains(text(),'View')])[4]")
    WebElement view;


    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /**
     * go to Report Setup
     */
    public void gotoReportSetUp() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Perfit");
        ReusableActions.getActions().clickChildMenu("Report Setup");
        WaitActions.getWaits().loadingWait(loder);
    }

    /**
     * enter the Search TextArea
     */
    public void entertheSearch() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_TextArea);
        WebElementActions.getActions().inputText(search_TextArea, appProp.getProperty("GLaccount"));
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify Report Labour History Export
     */
    public void varifyLabourHistoryExport() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(EffectivaDate);
        Assert.assertTrue(EffectivaDate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(GlAccountExport);
        Assert.assertTrue(GlAccountExport.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

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
        src.selectByVisibleText("2");
        WaitActions.getWaits().loadingWait(loder);

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
        str.selectByVisibleText("3");
        WaitActions.getWaits().loadingWait(loder);
    }

    /**
     * click on Refresh
     */
    public void clickOnRefresh() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Refresh);
        WebElementActions.getActions().clickElement(btn_Refresh);
        WaitActions.getWaits().loadingWait(loder);
    }
    /**
     * click on export
     */
    public void clickOnExport() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Export);
        WebElementActions.getActions().clickElement(btn_Export);
        WaitActions.getWaits().loadingWait(loder);
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

    /*go to Report**/
    public void gotoReport() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Reports);
        WebElementActions.getActions().clickElement(Reports);
        TestListener.saveScreenshotPNG(driver);

        WaitActions.getWaits().loadingWait(loder);



    }
   /**click on Report History*/
   public void clickOnReportHistory () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ReportHistory);
       WebElementActions.getActions().clickElement(ReportHistory);
       WaitActions.getWaits().loadingWait(loder);

       TestListener.saveScreenshotPNG(driver);

               for (int i = 0; i < 13; i++) {
                   //               System.out.println("Iteration :"+i);

                   try {
                       // Use FluentWait to define custom conditions and polling intervals
                       new FluentWait<>(driver)
                               .withTimeout(Duration.ofSeconds(120))
                               .pollingEvery(Duration.ofSeconds(30))
                               .ignoring(Exception.class)
                               .until(drv -> refresh_btn.isEnabled());
                   } catch (Exception e) {
                       e.printStackTrace();
                   }

                   if (refresh_btn.isEnabled()) {
                       //           System.out.println("Button is ENABLED in iteration " + i);
                       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(refresh_btn);
                       WebElementActions.getActions().clickElement(refresh_btn);
                       Thread.sleep(2000);
                       if (view.isEnabled()) {
                           WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(view);
                           WebElementActions.getActions().clickElement(view);

                           TestListener.saveScreenshotPNG(driver);

                           break;

                       }

                   } else {
                       System.out.println("Button is DISABLED in iteration " + i);
                   }
               }

               WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(view);
               WebElementActions.getActions().clickElement(view);

               TestListener.saveScreenshotPNG(driver);



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
