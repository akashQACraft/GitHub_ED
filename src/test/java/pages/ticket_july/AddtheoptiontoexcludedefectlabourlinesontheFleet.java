package pages.ticket_july;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class AddtheoptiontoexcludedefectlabourlinesontheFleet extends TestDriverActions {

    @FindBy(xpath = "//td[contains(@id,':0:ctWoEq')]//span//div/child::div[1]")
    WebElement InternalUnit;

    @FindBy(xpath = "//td[contains(@id,':2:ctWoEq')]//span//div/child::div[1]")
    WebElement externalUnit;

    @FindBy(xpath = "//a[contains(.,'Show Advanced Search')]/child::span")
    WebElement btn_ShowAdvancedSearch;

    @FindBy(xpath = "//label[text()=' Unit Type:']")
    WebElement UnitType;

    @FindBy(xpath = "(//label[contains(.,'Both')]/preceding-sibling::input)[2]")
    WebElement Radio_UnitTypeBoth;

    @FindBy(xpath = "(//label[contains(.,'Both')]/preceding-sibling::input)[3]")
    WebElement Radio_LabourTypeBoth;

    @FindBy(xpath = "(//a[contains(.,'Refresh')]/child::span)[1]")
    WebElement btn_Refresh;

    @FindBy(xpath = "//td[contains(@id,':0:c27')]//span//div/child::div[1]")
    WebElement HistryUnitI;

    @FindBy(xpath = "//td[contains(@id,':1:c27')]//span//div/child::div[1]")
    WebElement Historyunite;

    @FindBy(xpath = "(//label[contains(.,'Internal')]/preceding-sibling::input)[1]")
    WebElement radiobtn_Internal;

    @FindBy(xpath = "//label[contains(.,'External')]/preceding-sibling::input")
    WebElement radiobtn_External;

    @FindBy(xpath = "(//label[contains(.,'Both')]/preceding-sibling::input)[2]")
    WebElement radiobn_Both;

    @FindBy(xpath = "(//label[contains(.,'Internal')]/preceding-sibling::input)[2]")
    WebElement radiobtn_internal;

    @FindBy(xpath = "//label[contains(.,'Sublet')]/preceding-sibling::input")
    WebElement radiobtn_sublet;

    @FindBy(xpath = "(//label[contains(.,'Both')]/preceding-sibling::input)[3]")
    WebElement radio_Both;


    @FindBy(xpath = "//label[contains(.,'Search:')]/parent::td/following-sibling::td/child::input")
    WebElement search_TextArea;

    @FindBy(xpath = "//h3[contains(text(),'HistoryExport')]")
    WebElement ReportHistory;


    @FindBy(xpath = "(//a[contains(.,'Refresh')]/span)[2]")
    WebElement btn_Export;

    @FindBy(xpath = "//td[contains(text(),'Rental Manager')]")
    WebElement RentalManager;

    @FindBy(xpath = "//td[text()='Repair Order']/parent::tr/following-sibling::tr[1]/td[2]")
    WebElement Labor;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to completeRO
     */
    public void gotocompleteRO() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");

    }

    /**
     * varify external and internal unit
     */
    public void varifyunit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(InternalUnit);
        Assert.assertTrue(InternalUnit.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(externalUnit);
        Assert.assertTrue(externalUnit.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * go to History  Screen
     */
    public void goToHistory() throws InterruptedException, FileNotFoundException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Fleet");
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click  On Down Arrow
     */
    public void clickOnDownArrow() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RentalManager);
        Assert.assertTrue(RentalManager.isDisplayed());
        System.out.println("varify the data :" + RentalManager.getText());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", RentalManager);

    }

    /**
     * click On History
     */
    public void clickOnHistory() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickChildMenu("History");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Labour
     */
    public void clickOnLobur() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Labor);
        WebElementActions.getActions().clickElement(Labor);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Show Advance Shearch Search
     */
    public void clickOnShowInAdvanceSearch() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_ShowAdvancedSearch);
        WebElementActions.getActions().clickElement(btn_ShowAdvancedSearch);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify on Unit Type ,Labor
     */
    public void varifyOnUnitType() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitType);
        Assert.assertTrue(UnitType.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Radio_UnitTypeBoth);
        Assert.assertTrue(Radio_UnitTypeBoth.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Radio_LabourTypeBoth);
        Assert.assertTrue(Radio_LabourTypeBoth.isDisplayed());

    }

    /**
     * click On Refresh
     */
    public void clickOnRefresh() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Refresh);
        WebElementActions.getActions().clickElement(btn_Refresh);
        Thread.sleep(3000);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify on external and internal Unit Labor History
     */
    public void varifyexternalandinternal() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(HistryUnitI);
        Assert.assertTrue(HistryUnitI.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Historyunite);
        Assert.assertTrue(Historyunite.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Internal radio button
     */
    public void clickOninternal() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radiobtn_Internal);
        WebElementActions.getActions().clickElement(radiobtn_Internal);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify Unit internal
     */
    public void varifyOnInternalUnit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(HistryUnitI);
        Assert.assertTrue(HistryUnitI.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On External radio button
     */
    public void clickOnExternalradio() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radiobtn_External);
        WebElementActions.getActions().clickElement(radiobtn_External);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Both radio button
     */
    public void clickOnBothradio() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radiobn_Both);
        WebElementActions.getActions().clickElement(radiobn_Both);
    }

    /**
     * click On internal Button
     */
    public void clickOninternalbutton() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radiobtn_internal);
        WebElementActions.getActions().clickElement(radiobtn_internal);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click on Select sublet
     */
    public void clickOnSublet() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radiobtn_sublet);
        WebElementActions.getActions().clickElement(radiobtn_sublet);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Both radio
     */
    public void clickOnBoth() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(radio_Both);
        WebElementActions.getActions().clickElement(radio_Both);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On RefreshandExport
     **/
    public void clickOnRefreshAndExport() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Export);
        WebElementActions.getActions().clickElement(btn_Export);
        Thread.sleep(3000);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

        int count = 0;
        while (count < 20) {
            //           System.out.println("Size of queue is :"+queue.size());
            Thread.sleep(1000);
            count++;
        }

    }
    /**
     * go to Report Setup
     */
    public void gotoReportSetUp() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Perfit");
        ReusableActions.getActions().clickChildMenu("Report Setup");
        WaitActions.getWaits().loadingWait(loder);
    }

    /**
     * enter the Search TextArea
     */
    public void entertheSearch() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(search_TextArea);
        WebElementActions.getActions().inputText(search_TextArea, appProp.getProperty("LaborHistoryExport"));
        WaitActions.getWaits().loadingWait(loder);

    }


    /**varify Report Labour History Export */
    public void varifyLabourHistoryExport () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReportHistory);
        Assert.assertTrue(ReportHistory.isDisplayed());

    }
    /*click On Sign Out **/
    public void clickOnSignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickElement(btn_signOut);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);


    }
}