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

public class SugestedOrderReporttrucatePartNumber extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(.,'Suggested Orders')])[1]")
    WebElement suggestedOrders;

    @FindBy(xpath = "//h1[text()='Restocks']")
    WebElement restocks;

    @FindBy(xpath = "//span[text()='Generate Orders']")
    WebElement GenerateOrders;

    @FindBy(xpath = "(//label[text()='Vendor:']/parent::td/following::td/child::input)[2]")
    WebElement vendorTextArea;

    @FindBy(xpath = "(//a[contains(.,'Generate')])[3]")
    WebElement Generate;


    @FindBy(xpath = "(//span[text()='Vendor'])[1]")
    WebElement vendor;

    @FindBy(xpath = "(//span[contains(@class,'data-container')])[1]")
    WebElement vendorName;

    @FindBy(xpath = "//span[text()='Part #']")
    WebElement PartHash;

    @FindBy(xpath = "//span[text()='Vendor Part #']")
    WebElement vendorPartHash;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement Description;

    @FindBy(xpath = "//span[text()='Suggested Quantity']")
    WebElement SuggestedQuantity;

    @FindBy(xpath = "//span[text()='Quantity to Order']")
    WebElement QuantitytoOrder;

    @FindBy(xpath = "//span[text()='UOM']")
    WebElement UOM;

    @FindBy(xpath = "//span[text()='Stock UOM']")
    WebElement StockUOM;

    @FindBy(xpath = "//span[text()='Conv']")
    WebElement Conv;

   @FindBy(xpath = "//span[text()='Unit Cost']")
    WebElement UnitCost;

   @FindBy(xpath = "(//a[@title='Expand']/parent::td/following-sibling::td/child::span)[1]")
   WebElement PartName;


   @FindBy(xpath = "//h1[text()='Parts List']")
   WebElement PartList;

    @FindBy(xpath = "//label[text()='Search:']/parent::td/following-sibling::td/child::input")
    WebElement SearchTextArea;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath = "//span[text()='Active']/following::td[1]/span/a")
    WebElement hyperlink_partNumber;

     @FindBy(xpath = "//span[text()='Part #']//parent::div/parent::th/parent::tr/th[11]/following::div/table/tbody/tr/td[2]/child::span")
     WebElement PartValue;

     @FindBy(xpath = "//span[text()='Submit / Print PO']")
    WebElement SubmitPrintPO;


     @FindBy(xpath = "//span[text()='Edit PO']")
    WebElement EditPO;

     @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement SaveExit;

     @FindBy(xpath = "(//span[text()='Print List'])[3]")
      WebElement PrintList;

     @FindBy(xpath = "(//span[text()='Cancel'])[1]")
     WebElement Cancel;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

      @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
      List<WebElement> loder;

    /**goto order parts Screen*/
    public static void gotoOrderPartsScreen() throws FileNotFoundException, InterruptedException {

        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Order Parts");
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on Suggested Orders*/
    public void clickOnSuggestedOrders () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(suggestedOrders);
        WebElementActions.getActions().clickElement(suggestedOrders);
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /*verify Restocks and verify Vendor**/
    public void verifyRestocks () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(restocks);
        Assert.assertTrue(restocks.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }
    /*click on Genrate Orders**/
    public void clickOnGenrateOrder () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GenerateOrders);
        WebElementActions.getActions().clickElement(GenerateOrders);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*enter on vendorTextArea **/
    public void enterVendorTextArea () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(vendorTextArea);
        WebElementActions.getActions().inputText(vendorTextArea,appProp.getProperty("acme"));
        vendorTextArea.sendKeys(Keys.ENTER);
        WaitActions.getWaits().loadingWait(loder);
    }
    /* click on Generate Button **/
    public void clickOnGenerate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Generate);
        WebElementActions.getActions().clickElement(Generate);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*click on vendor Name **/
    public void clickonVendorName () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(vendorName);
        WebElementActions.getActions().clickElement(vendorName);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*verify Part #, vendor Part# **/
   public void veifypartHash () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartHash);
       Assert.assertTrue(PartHash.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(vendorPartHash);
       Assert.assertTrue(vendorPartHash.isDisplayed());

   }
   /*verify Description ,Suggested Quantity **/
    public void verifyDescription () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description);
        Assert.assertTrue(Description.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SuggestedQuantity);
        Assert.assertTrue(SuggestedQuantity.isDisplayed());

    }
    /*verify Quantity to order and UOM  **/
    public void verifyUOM () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UOM);
        Assert.assertTrue(UOM.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);
    }
  /*verify Stock UOM and Conv and UnitCost**/
    public void verifyStockUOM () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(StockUOM);
        Assert.assertTrue(StockUOM.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Conv);
        Assert.assertTrue(Conv.isDisplayed());
    }
      /*verify UnitCost **/
     public void verifyUnitCost () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitCost);
        Assert.assertTrue(UnitCost.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartName);
        Assert.assertTrue(PartName.isDisplayed());

        System.out.println(PartName.getText());
         WaitActions.getWaits().loadingWait(loder);


    }
      /*verify submit po and Edit PO **/
    public void verifysubmitPO () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SubmitPrintPO);
        Assert.assertTrue(SubmitPrintPO.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(EditPO);
        Assert.assertTrue(EditPO.isDisplayed());


    }
        /*verify SAVE Exit and Print List**/
        public void verifySaveExit () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SaveExit);
        Assert.assertTrue(SaveExit.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PrintList);
        Assert.assertTrue(PrintList.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Cancel);
        Assert.assertTrue(Cancel.isDisplayed());

    }
   /*click on Print List**/
    public void clickOnPrintList () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PrintList);
        WebElementActions.getActions().clickElement(PrintList);
        Thread.sleep(7000);
       String OriginalWindow =driver.getWindowHandle();
        WaitActions.getWaits().loadingWait(loder);



    }
    /**
     *  verify taxes on PDF
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

            if(pdfFullText.contains("6304F2AS1AU0"))
            {
                System.out.println("Random part generated 12 characters");

            }
            fis.close();
        }
    }
    /**click on Cancel button */
    public void clickOnCancel () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Cancel);
        WebElementActions.getActions().clickElement(Cancel);
        WaitActions.getWaits().loadingWait(loder);


    }
     /*go to Part Master **/
    public void gotoPartMaster () throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Part Master");


    }
    /*verify PartList **/
    public void  verifyPartLsit () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartList);
        Assert.assertTrue(PartList.isDisplayed());

    }
    /**enter part Number*/
    public void enterPartNumber () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions().inputText(SearchTextArea,appProp.getProperty("partname"));

    }
   /*click on Refresh**/
    public void clickOnRefresh () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_refresh);
        WebElementActions.getActions().clickElement(btn_refresh);
    }
    /* verify PartName**/
    public void verifyPartName () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(hyperlink_partNumber);
        Assert.assertTrue(hyperlink_partNumber.isDisplayed());

    }
    /*click on signout **/
   public void clickOnSignOut () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
       WebElementActions.getActions().clickElement(btn_signOut);
   }
   /*click on UserName **/
    public void clickOnUserName () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);
    }
}
