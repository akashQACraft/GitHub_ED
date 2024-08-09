package pages.ticket_july;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ShowTechnicianParameternotworking extends TestDriverActions {

    @FindBy(xpath = "(//a[contains(text(),'Global System Parameters')])[1]")
    WebElement GlobalSystemParameter;

    @FindBy(xpath = "(//label[contains(text(),'Search:')]/parent::td/following-sibling::td/child::input)[1]")
    WebElement search_TextArea;

    @FindBy(xpath = "//h2[contains(text(),'SHOW_TECHNICIAN_ON_WOINV')]")
    WebElement showTechnician;

    @FindBy(xpath = "//h1[contains(text(),'Corporation For This Parameter')]")
    WebElement corporationForThisParameter;

    @FindBy(xpath = "//a[contains(.,'905 Truck and Trailer Repair')]/span")
    WebElement name_905TruckAndTrailer;

    @FindBy(xpath = "//label[contains(.,'System Value:')]/preceding-sibling::span")
    WebElement required_SystemValue;

    @FindBy(xpath = "(//label[contains(.,'System Value:')])[2]")
    WebElement label_SystemValue;

    @FindBy(xpath = "//label[contains(.,'System Value:')]/parent::td/following-sibling::td/child::textarea")
    WebElement SystemValue_TetArea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[2]")
    WebElement btn_Cancel;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement btn_SaveAndExit;

    @FindBy(xpath = "//a[contains(.,'New RO')]/child::span")
    WebElement NewRO;

    @FindBy(xpath = "//a[contains(.,'WO002640')]")
    WebElement Referance;

    @FindBy(xpath = "//label[contains(text(),'Search Unit:')]/preceding-sibling::input")
    WebElement searchUnit_TextArea;

    @FindBy(xpath = "(//a[contains(.,'Select')]/child::span)[1]")
    WebElement btn_Select;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement label_VMRS;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    WebElement AccessoriesGroup;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement label_AddButton;

    @FindBy(xpath = "//a[contains(@id,':clActualHours')]//span/child::span")
    WebElement ActualHours;

    @FindBy(xpath = "//a[contains(.,'Add Technician Time')]/child::span")
    WebElement AddTechnicianTime;

    @FindBy(xpath = "//label[contains(.,'Technician:')]/preceding-sibling::span")
    WebElement required_Technician;

    @FindBy(xpath = "//label[contains(.,'Technician:')]")
    WebElement Technician;

    @FindBy(xpath = "//input[contains(@id,':itSearchEmployeeSelect::content')]")
    WebElement technician_TextArea;


    @FindBy(xpath = "//label[contains(text(),'Start:')]/preceding-sibling::span")
    WebElement required_Start;

    @FindBy(xpath = "//label[contains(text(),'Start:')]")
    WebElement Start;

    @FindBy(xpath = "//input[contains(@id,':idStartTime::content')]")
    WebElement startDate_TextArea;

    @FindBy(xpath = "//a[contains(@id,':idStartTime::glyph')]")
    WebElement clickOniconStart;

    @FindBy(xpath = "(//a[contains(@id,'::cd::ys::decrement')])[2]")
    WebElement decrementStart;

    @FindBy(xpath = "(//button[contains(@id,'::pop::dlg::ok')])[3]")
    WebElement OkButton;

    @FindBy(xpath = "//label[text()='Finish:']/preceding-sibling::span")
    WebElement required_Finish;

    @FindBy(xpath = "//label[text()='Finish:']")
    WebElement Finish;

    @FindBy(xpath = "//input[contains(@id,':idToTime::content')]")
    WebElement Finish_TextArea;

    @FindBy(xpath = "//label[text()='Actual Hours:']")
    WebElement Actual_hours;

    @FindBy(xpath = "//label[text()='Actual Hours:']/parent::span/parent::div/following-sibling::div/child::span")
    WebElement ActualHours_value;

    @FindBy(xpath = "(//a[contains(.,'Cancel')]/child::span)[1]")
    WebElement Cancel;

    @FindBy(xpath = "(//a[contains(.,'Add Technician Time')]/span)[2]")
    WebElement btn_AddTechnicianTime;

    @FindBy(xpath = "(//a[contains(.,'Close')])[3]")
    WebElement btn_Close;

    @FindBy(xpath = "//input[contains(@id,':it7::content')]")
    WebElement CutomerPO_TextArea;

    @FindBy(xpath = "(//a[contains(.,'Invoice')])[1]")
    WebElement btn_Invoice;

    @FindBy(xpath = "//select[contains(@id,':soc1::content')]")
    WebElement TendorOne;

    @FindBy(xpath = "//select[contains(@id,':soc2::content')]")
    WebElement TendorTwo;

    @FindBy(xpath = "//select[contains(@id,':soc3::content')]")
    WebElement TendorThree;

    @FindBy(xpath = "(//a[contains(.,'Cancel')]/span)[1]")
    WebElement btn_cancel;

    @FindBy(xpath = "(//a[contains(.,'Invoice')]/span)[3]")
    WebElement Invoice;

    @FindBy(xpath = "(//a[@title='Close Tab'])[4]")
    WebElement close_CompleteRO;

    @FindBy(xpath = "//span[text()='Back to Complete RO']")
    WebElement BackToCompleteRO;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to Security Setup
     */
    public void gotoSecuritySetup() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Perfit");
        ReusableActions.getActions().clickChildMenu("Security Setup");

    }

    /**
     * click On Global Systems Parameter
     */
    public void clickOnGlobalSystemParameter() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GlobalSystemParameter);
        WebElementActions.getActions().clickElement(GlobalSystemParameter);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * Search System Parameter
     */
    public void searchSystemParameter() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(search_TextArea);
        WebElementActions.getActions().inputText(search_TextArea, appProp.getProperty("SystemsParameters"));
        search_TextArea.sendKeys(Keys.ENTER);
    }

    /**
     * varify On Parameter
     */
    public void variyfyOnParameter() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(showTechnician);
        Assert.assertTrue(showTechnician.isDisplayed());
    }

    /**
     * varify On Corporation This Parameter
     */
    public void varifyOnCorporationOnthisParamter() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(corporationForThisParameter);
        Assert.assertTrue(corporationForThisParameter.isDisplayed());

    }

    /**
     * click On Name
     */
    public void clickOnName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(name_905TruckAndTrailer);
        WebElementActions.getActions().clickElement(name_905TruckAndTrailer);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify required System value ,System value
     */
    public void varifyRequiredsystemValue() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(required_SystemValue);
        Assert.assertTrue(required_SystemValue.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SystemValue);
        Assert.assertTrue(label_SystemValue.isDisplayed());


    }

    /**enter the System value TestArea Y */
    public void enterTheSystemValuey() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SystemValue_TetArea);
        WebElementActions.getActions().inputText(SystemValue_TetArea, appProp.getProperty("Y"));
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify cancel and SaveAndExit
     */
    public void varifyCancel() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Cancel);
        Assert.assertTrue(btn_Cancel.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_SaveAndExit);
        Assert.assertTrue(btn_SaveAndExit.isDisplayed());

    }

    /**
     * click On Save/Exit
     */
    public void clickOnSaveAndExit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveAndExit);
        WebElementActions.getActions().clickElement(btn_SaveAndExit);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * go to Complete RO
     */
    public void gotoCompleteRO() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On New RO
     */
    public void clickOnNewRo() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NewRO);
        WebElementActions.getActions().clickElement(NewRO);
        WaitActions.getWaits().loadingWait(loder);

//        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Referance);
//        WebElementActions.getActions().clickElement(Referance);
//        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * enter the Sreach Unit
     */
    public void entertheSearchunit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(searchUnit_TextArea);
        WebElementActions.getActions().inputText(searchUnit_TextArea, appProp.getProperty("Unit"));
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Select
     */
    public void clickOnSelect() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Select);
        WebElementActions.getActions().clickElement(btn_Select);
        WaitActions.getWaits().loadingWait(loder);


    }

    /**
     * click On add Labour
     */
    public void clickOnAddLabour() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddLabor);
        WebElementActions.getActions().clickElement(label_AddLabor);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On VMRS
     */
    public void clickOnVMRS() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_VMRS);
        WebElementActions.getActions().clickElement(label_VMRS);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Acessories Group
     */
    public void clickOnAcessoriesGroup() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AccessoriesGroup);
        WebElementActions.getActions().clickElement(AccessoriesGroup);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Plus Icon
     */
    public void clickOnPlusIcon() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions().clickElement(label_Add);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Add Button
     */
    public void clickOnAdd() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddButton);
        WebElementActions.getActions().clickElement(label_AddButton);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Actual Hours value
     */
    public void clickOnActalValue() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ActualHours);
        WebElementActions.getActions().clickElement(ActualHours);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Add Technician Time
     */
    public void clickOnAddTechnicianTime() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddTechnicianTime);
        WebElementActions.getActions().clickElement(AddTechnicianTime);
        WaitActions.getWaits().loadingWait(loder);
    }

    /**
     * varify Required Techanican  ,techanican
     */
    public void varifyRequiredTechanican() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(required_Technician);
        Assert.assertTrue(required_Technician.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Technician);
        Assert.assertTrue(Technician.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);


    }

    /**
     * enter te Technician
     */
    public void enterTheTechnician() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(technician_TextArea);
        WebElementActions.getActions().inputText(technician_TextArea, appProp.getProperty("John"));
        technician_TextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify Required Start and start
     */
    public void varifyRequiredStart() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(required_Start);
        Assert.assertTrue(required_Start.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Start);
        Assert.assertTrue(Start.isDisplayed());

    }

    /**
     * enter The start Date
     */
    public void enterTheStartDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(startDate_TextArea);
        WebElementActions.getActions().inputText(startDate_TextArea, appProp.getProperty("StartDate"));
        startDate_TextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);


    }

    /**
     * varify Required Finish Date
     */
    public void varifyFinish() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(required_Finish);
        Assert.assertTrue(required_Finish.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Finish);
        Assert.assertTrue(Finish.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * enter The Finish Date
     */
    public void enterTheFinish() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Finish_TextArea);
        WebElementActions.getActions().inputText(Finish_TextArea, appProp.getProperty("FinishDate"));
        Finish_TextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify Actual Hours and Actual hours Value
     */
    public void varifyActualhours() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Actual_hours);
        Assert.assertTrue(Actual_hours.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ActualHours_value);
        Assert.assertTrue(ActualHours_value.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Add Techanician Time Button
     */
    public void clickOnAddTechnicianTimeButton() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_AddTechnicianTime);
        WebElementActions.getActions().clickElement(btn_AddTechnicianTime);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On close
     */
    public void clickOnClose() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Close);
        WebElementActions.getActions().clickElement(btn_Close);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * Random Customer PO
     */
    String CutomerPo = WebElementActions.getActions().randomAlphaNumeric(10);

    /**
     * enter The Cutomer PO
     */
    public void enterTheCutomerPO() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CutomerPO_TextArea);
        WebElementActions.getActions().inputText(CutomerPO_TextArea, CutomerPo);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click On Invoice
     */
    public void clickOnInvoice() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Invoice);
        WebElementActions.getActions().clickElement(btn_Invoice);
        Thread.sleep(7000);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * select First Tendor
     */
    public void selectFirstTendor() throws InterruptedException {
        Select obj1 = new Select(TendorOne);
        obj1.selectByVisibleText("ACCOUNT");
        Thread.sleep(5000);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * select second Tendor
     */
    public void selectSecondTendor() throws InterruptedException {
        Select obj2 = new Select(TendorTwo);
        obj2.selectByVisibleText("CASH");
        Thread.sleep(5000);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * select Third Tendor
     */
    public void selectThirdTendor() throws InterruptedException {
        Select obj3 = new Select(TendorThree);
        obj3.selectByVisibleText("CHEQUE");
        Thread.sleep(5000);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * varify cancel and Invoice Button
     */
    public void varifyOnInvoiceButton() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_cancel);
        Assert.assertTrue(btn_cancel.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Invoice);
        Assert.assertTrue(Invoice.isDisplayed());
        Thread.sleep(5000);

        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On Invoice
     */
    public void clickOnInvoicebtn() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Invoice);
        WebElementActions.getActions().clickElement(Invoice);
        WaitActions.getWaits().loadingWait(loder);


    }

    /**
     * verify taxes on PDF Three
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
            //       System.out.println(pdfFullText);

            if (pdfFullText.contains("905 Truck and Trailer Repair")) {
                System.out.println("Not Visiable Technician ");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);
            Thread.sleep(3000);

        }

    }
    /**go to Security SetUp */
    public void gotoSecuritySetUpTwo () throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Perfit");
        ReusableActions.getActions().clickChildMenu("Security Setup");

    }


    /**
     * enter the System value TestArea Y
     */
    public void enterTheSystemValue() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SystemValue_TetArea);
        WebElementActions.getActions().inputText(SystemValue_TetArea, appProp.getProperty("N"));

    }

    /**click On Back to completed Order */
    public void clickOnBackCompleteOrderRO () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(BackToCompleteRO);
        WebElementActions.getActions().clickElement(BackToCompleteRO);

    }


    /**
     * click on sign out button
     * verify username
     */
    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickUsingJS(label_SignOut);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserName);
        Assert.assertTrue(label_UserName.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
}
