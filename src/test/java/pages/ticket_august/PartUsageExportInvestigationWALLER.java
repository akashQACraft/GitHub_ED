package pages.ticket_august;

import actions.LoginActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

public class PartUsageExportInvestigationWALLER extends TestDriverActions {

    @FindBy(xpath = "(//a[contains(text(),'Reports')])[2]")
    WebElement Reports;

    @FindBy(xpath = "//a[contains(text(),'Reports')]")
    WebElement Report;

    @FindBy(xpath = "//h1[text()='Report Categories']")
    WebElement reportCategories;

    @FindBy(xpath = "//h1[text()='Available Reports For Inventory']")
    WebElement availableReportsForInventory;

    @FindBy(xpath = "//span[text()='Inventory']")
    WebElement inventory;

    @FindBy(xpath = "(//td[contains(.,'Inventory')]/span)[1]")
    WebElement Inventory;

    @FindBy(xpath = "//td[contains(.,'Parts Usage Export')]/span")
    WebElement PartUsageExport;

    @FindBy(xpath = "//span[text()='Schedule Report']")
    WebElement scheduleReport;

    @FindBy(xpath = "//label[contains(.,'From Date:')]/preceding-sibling::span")
    WebElement Required_FromDate;

    @FindBy(xpath = "//label[contains(.,'From Date:')]")
    WebElement FromDate;

    @FindBy(xpath = "//label[contains(.,'From Date:')]/parent::td/following-sibling::td/child::input")
    WebElement FromDate_TextArae;

    @FindBy(xpath = "//label[contains(.,'To Date:')]/preceding-sibling::span")
    WebElement Required_ToDate;

    @FindBy(xpath = "//label[contains(.,'To Date:')]")
    WebElement ToDate;

    @FindBy(xpath = "//label[contains(.,'To Date:')]/parent::td/following-sibling::td/child::input")
    WebElement ToDate_TextArrea;

    @FindBy(xpath = "(//label[text()='Location:'])[1]")
    WebElement Location;

    @FindBy(xpath = "//img[contains(@id,':cilF::icon')]")
    WebElement search_icon;

    @FindBy(xpath = "(//a[contains(.,'Search')])[2]")
    WebElement btn_Search;

    @FindBy(xpath = "//a[contains(.,'Search')]")
    WebElement btn_SearchTwo;

    @FindBy(xpath = "(//a[contains(.,'Select')]/span)[1]")
    WebElement btn_Select;

    @FindBy(xpath = "//label[text()='Preferred Vendors:']")
    WebElement PreferredVendors;

    @FindBy(xpath = "//img[contains(@id,':cilV::icon')]")
    WebElement Search_iconTwo;

    @FindBy(xpath = "//label[text()='Name']/preceding-sibling::input")
    WebElement Name_Textarea;

    @FindBy(xpath = "(//a[contains(.,'Select')]/span)[2]")
    WebElement btn_selectAll;

    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement runReport;

    @FindBy(xpath = "//div[@class='toast-item-text']")
    List<WebElement> queue;

    @FindBy(xpath = "(//a[text()='Report History'])[1]")
    WebElement reportHistory_btn;

    @FindBy(xpath = "//span[contains(text(),'Refresh')]")
    WebElement refresh_btn;

    @FindBy(xpath = "(//a[contains(text(),'View')])[4]")
    WebElement view;

    @FindBy(xpath = "//td[contains(@id,':0:c18')]/span")
    WebElement startDate;

    @FindBy(xpath = "//td[contains(@id,':0:c10')]/span")
    WebElement completedDate;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;


    /*go to Report**/
    public void gotoReport() throws FileNotFoundException, InterruptedException {
        if(LoginActions.environmentName.contains("QA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Reports);
            WebElementActions.getActions().clickElement(Reports);
        }
         if(LoginActions.environmentName.contains("NA")){
             WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Report);
             WebElementActions.getActions().clickElement(Report);
         }
        TestListener.saveScreenshotPNG(driver);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * verify Report categories
     */
    public void verifyReportCategories() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportCategories);
        Assert.assertTrue(reportCategories.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*click on Invantory **/
    public void clickOnInventory() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inventory);
        WebElementActions.getActions().clickElement(inventory);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click On Part Usage Export
     */
    public void clickOnPartUsageExport() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PartUsageExport);
        WebElementActions.getActions().clickElement(PartUsageExport);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify Report Parameters**/
    public void verifyreportParameters() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(scheduleReport);
        Assert.assertTrue(scheduleReport.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(runReport);
        Assert.assertTrue(runReport.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify Required and From Date **/
    public void verifyFromDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_FromDate);
        Assert.assertTrue(Required_FromDate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FromDate);
        Assert.assertTrue(FromDate.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * enter The From Date TextArea
     */
    public void enterTheFromDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FromDate_TextArae);
        WebElementActions.getActions().inputText(FromDate_TextArae, appProp.getProperty("fromdate"));
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify Required and To Date
     */
    public void varifyTODate() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_ToDate);
        Assert.assertTrue(Required_ToDate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ToDate);
        Assert.assertTrue(ToDate.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * enter The To Date TextArea
     */
    public void enterTheToDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ToDate_TextArrea);
        WebElementActions.getActions().inputText(ToDate_TextArrea, appProp.getProperty("Todate"));
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify Location
     */
    public void varifyLocation() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Search Icon
     */
    public void clickOnSearchIcon() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_icon);
        WebElementActions.getActions().clickElement(search_icon);
        TestListener.saveScreenshotPNG(driver);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Search Icon
     */
    public void clickOnSearchButton() throws InterruptedException {
        if(LoginActions.environmentName.contains("QA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Search);
            WebElementActions.getActions().clickElement(btn_Search);
        }
        if(LoginActions.environmentName.contains("NA")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SearchTwo);
            WebElementActions.getActions().clickElement(btn_SearchTwo);
        }
        TestListener.saveScreenshotPNG(driver);
        WaitActions.getWaits().loadingWait(loder);
    }

    /**click on Select Button */
    public void clickOnSelectButtonTwo () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Select);
        WebElementActions.getActions().clickElement(btn_Select);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**
     * varify prefered Vendor
     */
    public void varifyPreferdVendor() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PreferredVendors);
        Assert.assertTrue(PreferredVendors.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click on preferred vendor search icon
     */
    public void clickOnPrefferdSearchIcon() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Search_iconTwo);
        WebElementActions.getActions().clickElement(Search_iconTwo);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * enter the Name All
     */
    public void enterTheName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Name_Textarea);
        WebElementActions.getActions().inputText(Name_Textarea, appProp.getProperty("All"));
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click On Search Button
     */
    public void clickOnSelectButton() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_selectAll);
        WebElementActions.getActions().clickElement(btn_selectAll);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click on Run Report
     */
    public void clickOnRunReport() throws InterruptedException {
        if(LoginActions.environmentName.contains("QA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(runReport);
            WebElementActions.getActions().clickElement(runReport);

            WaitActions.getWaits().loadingWait(ToDate);
            TestListener.saveScreenshotPNG(driver);

            int count = 0;
            while (count < 20) {
                //           System.out.println("Size of queue is :"+queue.size());
                Thread.sleep(1000);
                count++;
                if (queue.size() > 0) {

                    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportHistory_btn);
                    WebElementActions.getActions().clickElement(reportHistory_btn);

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

                    break;

                }

            }
        }
        if(LoginActions.environmentName.contains("NA")){
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(runReport);
            WebElementActions.getActions().clickElement(runReport);

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(reportHistory_btn);
            WebElementActions.getActions().clickElement(reportHistory_btn);

            WaitActions.getWaits().loadingWait(ToDate);
            TestListener.saveScreenshotPNG(driver);
        }
    }
    /**varify The Report history Start date*/
    public void varifyReporthistoryStratDate () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(startDate);
        Assert.assertTrue(startDate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(completedDate);
        Assert.assertTrue(completedDate.isDisplayed());

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




