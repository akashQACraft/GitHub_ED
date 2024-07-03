package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

//	WO045208
public class HideShopSuppliesonWOInvoiceParameternotworking extends TestDriverActions {

    @FindBy(xpath = "//a[contains(.,'AMERICANBODY )')]/child::span")
    WebElement corpId;

    @FindBy(xpath = "//label[contains(.,' Select Corporation:')]/parent::td/following-sibling::td/child::input")
    WebElement SelectCorporation;


    @FindBy(xpath = "//a[contains(.,'Select')]")
    WebElement Select;


    @FindBy(xpath = "//label[contains(text(),'Invoiced')]//../input")
    WebElement InvoiceBoolean;

    @FindBy(xpath = "//input[contains(@id,':itSearch::content')]")
    WebElement serachTextArea;

    @FindBy(xpath = "//a[contains(.,'Refresh')]")
    WebElement Refresh;

    @FindBy(xpath = "(//a[contains(.,'WO0')])[1]")
    WebElement referance;

    @FindBy(xpath = "(//span[contains(text(),'Customer Invoice')])[2]")
    WebElement Customerinvoice;


    @FindBy(xpath = "//span[text()='Back to Complete RO']")
    WebElement BackToCompleteRo;


    @FindBy(xpath = "(//a[contains(.,'Global System Parameters')])[1]")
    WebElement GlobalSystemParameters;

    @FindBy(xpath = "(//label[contains(text(),'Search:')]/following::td/child::input)[1]")
    WebElement SearchTextArea;

    @FindBy(xpath = "//span[contains(text(),'905 Truck and Trailer Repair')]")
    WebElement TrailerRepair;

    @FindBy(xpath = "//h1[contains(.,'SHOW_SHOP_SUPPLIES_ON_WO_INVOICE')]")
    WebElement tital_SHOW_SHOP;

    @FindBy(xpath = "//td[contains(.,'Active:')]/child::label")
    WebElement Active;

    @FindBy(xpath = "(//td[contains(.,'Active:')]/child::label/following::td/child::span)[1]")
    WebElement Active_Value;

    @FindBy(xpath = "//label[text()='System Value:']")
    WebElement SystemInput;

    @FindBy(xpath = "(//label[contains(.,'System Value:')]/following::td)[1]")
    WebElement Systemvalue;

    @FindBy(xpath = "(//label[text()='System Value:'])/preceding-sibling::span")
    WebElement RequiredSystemValue;

    @FindBy(xpath = "(//label[text()='System Value:'])[2]")
    WebElement SystemValue;

    @FindBy(xpath = "//label[text()='System Value:']/parent::td/following-sibling::td/child::textarea")
    WebElement SystemValue_Textarea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[2]")
    WebElement Cancel;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveExit;

    @FindBy(xpath = "//span[text()='Delete Customer Invoice']")
    WebElement DeleteCustomerInvoice;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    /**
     * go to complete ro screen
     */
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
    }

    /*click On CorPoId**/
    public void clickOnCorPoId() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(corpId);
        WebElementActions.getActions().clickElement(corpId);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*enterCorporation**/
    public void enterCorporation() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SelectCorporation);
        WebElementActions.getActions().inputText(SelectCorporation, appProp.getProperty("1145"));
    }

    /*click on Select Button **/
    public void clickOnSelect() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Select);
        WebElementActions.getActions().clickElement(Select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /*click on invoice**/
    public void clickOnInvoice() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(InvoiceBoolean);
        WebElementActions.getActions().clickElement(InvoiceBoolean);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter Ro Invoice Number **/
    public void enterRoInvoiceNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(serachTextArea);
        WebElementActions.getActions().inputText(serachTextArea, appProp.getProperty("invoiceRO"));

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*click on Refresh Button **/
    public void clickOnRefresh() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Refresh);
        WebElementActions.getActions().clickElement(Refresh);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*verify InvoiceRo**/
    public void verifyInvoiceRO() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(referance);
        Assert.assertTrue(referance.isDisplayed());
    }

    /*click On InnvoiceRO **/
    public void clickOnInvoiceRO() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(referance);
        WebElementActions.getActions().clickElement(referance);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }


    /*clilck On customer invoice **/
    public void clickOnCustomerInvoice() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Customerinvoice);
        WebElementActions.getActions().clickElement(Customerinvoice);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * verify taxes on PDF
     */
    public void VerifyTaxesonPDF() throws InterruptedException, IOException {
        Thread.sleep(10000);
        File dir = new File(System.getProperty("user.dir") + "\\downloadFiles");
        File[] dirContents = dir.listFiles();
        String fileName = dirContents[0].getName();
        String url = System.getProperty("user.dir") + "\\downloadFiles\\" + fileName;
        if (url.contains(".pdf")) {
            File file = new File(url);
            FileInputStream fis = new FileInputStream(file);
            PDDocument document = null;
            document = PDDocument.load(fis);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String pdfFullText = pdfStripper.getText(document);
            //      System.out.println(pdfFullText);

            if (pdfFullText.contains("Shop Charges:")) {
                System.out.println("All taxes are visible and the being calculated properly.");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);

        }
    }
    /*click On Back To complete Ro**/
    public void clickOnBackToCompleteRO () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(BackToCompleteRo);
        WebElementActions.getActions().clickElement(BackToCompleteRo);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*go to Security Setup **/
    public void gotoSecuritySetup () throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Perfit");
        ReusableActions.getActions().clickChildMenu("Security Setup");

    }
    /*click on Global System Parameter**/
    public void clickOnGlobalSystemParameter () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GlobalSystemParameters);
        WebElementActions.getActions().clickElement(GlobalSystemParameters);
        WaitActions.getWaits().loadingWait(loder);
    }
     /*enter the Search SHOW_SHOP_SUPPLIES_ON_WO_INVOICE **/
    public void entertheShowshopSupplies () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions().inputText(SearchTextArea, appProp.getProperty("show"));
        SearchTextArea.sendKeys(Keys.ENTER);
       WaitActions.getWaits().loadingWait(loder);

    }

    /*verify the tital**/
    public void verifytital () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(tital_SHOW_SHOP);
        Assert.assertTrue(tital_SHOW_SHOP.isDisplayed());

    }
    /*verify Active and system value **/
    public void verifyActive () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Active);
        Assert.assertTrue(Active.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Active_Value);
        Assert.assertTrue(Active_Value.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SystemInput);
        Assert.assertTrue(SystemInput.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Systemvalue);
        Assert.assertTrue(Systemvalue.isDisplayed());


    }
    /*click On 905Truck and Trailer **/
    public void  clickOn905TruckandTrailerRepair () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(TrailerRepair);
        WebElementActions.getActions().clickElement(TrailerRepair);
    }

    /*verify RequiredSystemValue ,SystemValue**/
    public void RequiredSystemValue () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredSystemValue);
        Assert.assertTrue(RequiredSystemValue.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SystemValue);
        Assert.assertTrue(SystemValue.isDisplayed());


    }
    /*enter the SystemValue **/
    public void enterSystemValue () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SystemValue_Textarea);
        WebElementActions.getActions().inputText(SystemValue_Textarea, appProp.getProperty("N"));

    }

   /*click On Save/Exit **/
    public void clickOnSaveExit () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveExit);
        WebElementActions.getActions().clickElement(SaveExit);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*verify delete customer invoice**/
    public void verifyDeleteCustomerInvoice () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DeleteCustomerInvoice);
        Assert.assertTrue(DeleteCustomerInvoice.isDisplayed());
    }

    /*click on Singout **/
    public void clickOnsignOut () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickElement(btn_signOut);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*click on UserName **/
    public void clickOnUserName () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);


    }

}




