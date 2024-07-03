package pages.techRo;

import actions.LoginActions;
import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class ECServiceManager_Journalize extends TestDriverActions {
    @FindBy(xpath = "(//a[text()='Financials']//..//following::td/child::div[@class='x193'])[1]")
    public WebElement label_Financial;

    @FindBy(xpath = "//td[text()='Financial Manager']")
    public WebElement label_FinancialManger;

    @FindBy(xpath = "//span[text()='Generate Journals']")
    public WebElement btn_GenerateJournals;

    @FindBy(xpath = "//select[contains(@id,':soc1::content')]")
    WebElement year;

    @FindBy(xpath = "//select[contains(@id,':soc2::content')]")
    WebElement period;

    @FindBy(xpath = "(//input[contains(@id,':sbc1::content')])[1]")
    WebElement closeworkorderexternal;


    @FindBy(xpath = "(//input[contains(@id,'2:sbc1::content')])[1]")
    public WebElement txt_AssertDisposal;

    @FindBy(xpath = "//div[contains(@id,':pte1:cb3')]//span[text()='Generate Journals']")
    public WebElement label_GenerateButton;

    @FindBy(xpath = "(//div[contains(@id,'::db')]/child::table)[1]")
    public WebElement label_NoDataPresent;

   @FindBy(xpath = "(//a[contains(text(),'Service Board')]/parent::div)[1]")
    public WebElement label_ServiceBoard;

   @FindBy(xpath = "(//a[text()='Complete RO'])[1]")
    public WebElement label_CompleteRO;

    @FindBy(xpath = "(//a[contains(text(),'Financial Manager')])[1]")
    public WebElement txt_FinancialManager;

    @FindBy(xpath = "//label[contains(text(),'Show Batches With Errors Only')]/preceding-sibling::input")
    WebElement RadioshowerrorButton;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement Refresh;

    @FindBy(xpath = "(//span[text()='Reference']/parent::div/parent::th/parent::tr/following::div/table/colgroup/following-sibling::tbody/tr/td[2]/child::span)[1]")
    WebElement RoNmber;

    @FindBy(xpath = "(//span[contains(text(),'O0')])[1]")
    public WebElement label_ReferenceNumber;

    @FindBy(xpath = "(//span[contains(.,'GL00')])[1]")
    WebElement BatchHash;

    @FindBy(xpath = "//label[contains(text(),'Reference:')]/parent::td/following-sibling::td/span/child::span")
    WebElement RoNumberText;

    @FindBy(xpath = "//span[contains(text(),'Close')]")
    WebElement close;


    @FindBy(xpath = "//a[text()='Journal Sources']/parent::div[contains(@id,'::_afrTabCnt')]")
    public WebElement label_JournalSources;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;




    /**goto Financials */
    public void gotoFinancials () throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Financials");
        ReusableActions.getActions().clickChildMenu("Financial Manager");
        TestListener.saveScreenshotPNG(driver);


    }

    /** click On Generate Journals Button*/
    public void clickOnGenerateJournals () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GenerateJournals);
        WebElementActions.getActions().clickElement(btn_GenerateJournals);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on year ,period */
    public void clickonyear () throws InterruptedException {
        if (LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(year);
            WebElementActions.getActions().clickElement(year);

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(period);
            WebElementActions.getActions().clickElement(period);

        }
    }

    /** select  On Assert Disposal Boolean*/
    public void clickOnAssertDisposal () throws InterruptedException {
        if(LoginActions.environmentName.contains("QA")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_AssertDisposal);
            WebElementActions.getActions().clickElement(txt_AssertDisposal);
        }
        if(LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(closeworkorderexternal);
            WebElementActions.getActions().clickElement(closeworkorderexternal);

        }

        TestListener.saveScreenshotPNG(driver);
    }
    /** click On Table Generate Journals Button */
    public void clickOnTableGenerateJournalsButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_GenerateButton);
        WebElementActions.getActions().clickElement(label_GenerateButton);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Service Board */
    public void clickOnServiceBoard () throws InterruptedException, FileNotFoundException {

        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Service Board");
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Financial Manager */
    public void clickOnFinancialManagerText () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_FinancialManager);
        WebElementActions.getActions().clickElement(txt_FinancialManager);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On show batch error only radio button */
    public void clickonRadioButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RadioshowerrorButton);
        WebElementActions.getActions().clickElement(RadioshowerrorButton);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Refresh);
        WebElementActions.getActions().clickElement(Refresh);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /** click On Ro Number  */
    public void clickOnRoNumber() throws InterruptedException {
      /*  if (LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(BatchHash);
            WebElementActions.getActions().clickElement(BatchHash);
            WaitActions.getWaits().loadingWait(loder);

       */

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RoNmber);
            WebElementActions.getActions().clickElement(RoNmber);
            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        if(LoginActions.environmentName.contains("QA")){
            System.out.println("Data is not available");
        }
    }
    /**verify Ro Number text */
    public void verifyRoNumbertext () throws InterruptedException {
        if (LoginActions.environmentName.contains("EU")) {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RoNumberText);
             Assert.assertTrue(RoNumberText.isDisplayed());


            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(close);
            WebElementActions.getActions().clickElement(close);


            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);
        }
        if(LoginActions.environmentName.contains("QA")){
            System.out.println("Data is not available");
        }

    }

    /** click On Sign Out */

    public void clickOnSignOut () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);
    }



}


