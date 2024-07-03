package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
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

public class NonStockPartswithOnhandsReportCorrections extends TestDriverActions {

    @FindBy(xpath = "(//a[contains(text(),'Reports')])[2]")
    WebElement Reports;
    @FindBy(xpath = "//h1[text()='Report Categories']")
    WebElement reportCategories;

    @FindBy(xpath = "//h1[text()='Available Reports For Inventory']")
    WebElement availableReportsForInventory;

    @FindBy(xpath = "//h1[text()='Report Parameters']")
    WebElement reportParameters;

    @FindBy(xpath = "//span[text()='Inventory']")
    WebElement inventory;

    @FindBy(xpath = "//span[text()='Non-Stock Parts With On-Hands']")
    WebElement nonStockPartsWithOnHands;

    @FindBy(xpath = "//span[text()='Schedule Report']")
    WebElement scheduleReport;

    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement runReport;

    @FindBy(xpath = "//label[contains(text(),'From ')]")
    WebElement fromDate;

    @FindBy(xpath = "//label[contains(text(),'To ')]")
    WebElement todate;

    @FindBy(xpath = "//input[contains(@id,':id1::content')]")
    WebElement fromdateTextarea;

    @FindBy(xpath = "//label[contains(.,'Exclude Cores')]")
    WebElement excludecores;

    @FindBy(xpath = "//h1[contains(text(),'Parts List')]")
    WebElement partlist;

    @FindBy(xpath = "//label[contains(text(),'Search:')]")
    WebElement search;

    @FindBy(xpath = "//label[contains(text(),'Search:')]/following::td/child::input")
    WebElement searchInputtextarea;

    @FindBy(xpath = "//span[text()='Part #']")
    WebElement parthash;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement description;

    @FindBy(xpath = "//span[text()='Preferred Vendor']")
    WebElement preferrdVendor;

    @FindBy(xpath = "(//a[contains(text(),'BK')])[1]")
    WebElement PartName;

    @FindBy(xpath = "(//a[contains(@id,'disAcr')])[1]")
    WebElement report;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    /*go to Report**/
    public void gotoReport() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Reports);
        WebElementActions.getActions().clickElement(Reports);
        TestListener.saveScreenshotPNG(driver);

        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * verify Report categories
     */
    public void verifyReportCategories() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportCategories);
        Assert.assertTrue(reportCategories.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(availableReportsForInventory);
        Assert.assertTrue(availableReportsForInventory.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*click on Invantory **/
    public void clickOnInventory() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inventory);
        WebElementActions.getActions().clickElement(inventory);
        TestListener.saveScreenshotPNG(driver);
    }

    /*click on Non-Stock Parts With On-Hands**/
    public void clickOnNonStockPartsWithOnHands() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(nonStockPartsWithOnHands);
        WebElementActions.getActions().clickElement(nonStockPartsWithOnHands);
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

    /*verify From Date and To Date**/
    public void verifyFromDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(fromDate);
        Assert.assertTrue(fromDate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(todate);
        Assert.assertTrue(todate.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter From Date **/
    public void enterfromdate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(fromdateTextarea);
        WebElementActions.getActions().inputText(fromdateTextarea, appProp.getProperty("BK3Z-61278L01-BC"));
        TestListener.saveScreenshotPNG(driver);

    }

    /*click on Run Report**/
    public void clickOnRunReport() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(runReport);
        WebElementActions.getActions().clickElement(runReport);
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
            //       System.out.println(pdfFullText);

            if (pdfFullText.contains("Shop Charges:")) {
                System.out.println("showing full part name BK3Z-61278L01-BC");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);

        }

    }

    /*go to Part Master**/
    public void gotoPartMaster () throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Part Master");
        TestListener.saveScreenshotPNG(driver);

    }
    /*verify Part List**/
    public void verifyPartList () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(partlist);
        Assert.assertTrue(partlist.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(search);
        Assert.assertTrue(search.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /*enter Search TextArea**/
    public void enterSearchTextArea () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchInputtextarea);
        WebElementActions.getActions().inputText(searchInputtextarea,appProp.getProperty("BK3Z"));
        WaitActions.getWaits().loadingWait(loder);




    }
    /*verify Part# , Description ,preferred vendor ,mfg**/
    public void verifyPartHash () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(parthash);
        Assert.assertTrue(parthash.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(description);
        Assert.assertTrue(description.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(preferrdVendor);
        Assert.assertTrue(preferrdVendor.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartName);
        Assert.assertTrue(PartName.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);

    }

    /*enter From Date **/
    public void enterfromdateTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(fromdateTextarea);
        WebElementActions.getActions().inputText(fromdateTextarea, appProp.getProperty("CORETEST3"));
        TestListener.saveScreenshotPNG(driver);

    }
    /*verify Exclude Cores**/
    public void verifyExcludeCore () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(excludecores);
        Assert.assertTrue(excludecores.isDisplayed());

    }
    /*verify Inventory and **/
    public void verifyOnInventory () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inventory);
        WebElementActions.getActions().clickElement(inventory);
        WaitActions.getWaits().loadingWait(loder);

        Assert.assertTrue(inventory.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(nonStockPartsWithOnHands);
        WebElementActions.getActions().clickElement(nonStockPartsWithOnHands);

        Assert.assertTrue(nonStockPartsWithOnHands.isDisplayed());


    }
    /**verify taxes on PDF*/
    public void VerifyTaxesonPDFtwo() throws InterruptedException, IOException {

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

            if(pdfFullText.contains("Shop Charges:"))
            {
                System.out.println("showing full part name CORETEST3");

            }

            fis.close();

        }
    }
    /*enter Search TextArea**/
    public void enterSearchTextAreaTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchInputtextarea);
        WebElementActions.getActions().inputText(searchInputtextarea, appProp.getProperty("CORETEST"));
    }

    /**
     *  verify taxes on PDF
     */
    public void VerifyTaxesonPDFthree() throws InterruptedException, IOException {

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

            if(pdfFullText.contains("Shop Charges:"))
            {
                System.out.println("Total Cost and Total On-Hand not included on the Non-Stock Parts with On-Hand Report");

            }

            fis.close();

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
















































