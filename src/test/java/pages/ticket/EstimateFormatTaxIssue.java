package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import com.google.j2objc.annotations.Weak;
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

public class EstimateFormatTaxIssue extends TestDriverActions {
    @FindBy(xpath = "//span[contains(.,'( corproId=')]")
    WebElement CorproId;
    @FindBy(xpath = "//label[contains(.,'Search ')]/parent::td/following-sibling::td/child::input")
    WebElement searchandSelectCarporation;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement Select;

    @FindBy(xpath = "(//a[contains(text(),'Repair Estimates In Progress')])[2]")
    WebElement RepairEstimatesInProgress;

    @FindBy(xpath = "//h1[contains(.,'Repair Estimates In Progress')]")
    WebElement tital_RepairEstimatesInProgress;

    @FindBy(xpath = "//label[contains(text(),'Estimate Status:')]")
    WebElement EstimateStatus;

    @FindBy(xpath = "(//a[contains(.,'Quick Estimate')])[2]")
    WebElement label_QuickEstimate;

    @FindBy(xpath = "//span[text()='Location']")
    WebElement Location;


    @FindBy(xpath = "//span[text()='Unit Owner']")
    WebElement UnitOwner;

    @FindBy(xpath = "//span[text()='Unit Number']")
    WebElement UnitNumber;

    @FindBy(xpath = "//span[text()='Estimate Date']")
    WebElement EstimateDate;

    @FindBy(xpath = "//span[text()='Total']")
    WebElement Total;

    @FindBy(xpath = "//span[text()='Estimate#']")
    WebElement EstimateHash;

   @FindBy(xpath = "//span[text()='RO#']")
   WebElement ROHash;

   @FindBy(xpath = "(//a[contains(.,'RE00')])[1]")
   WebElement Estimate;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
     WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
     WebElement label_VMRS;

    @FindBy(xpath = "//label[text()='Search:']/parent::td/following-sibling::td//child::input")
    WebElement SearchTextArea;

    @FindBy(xpath = "//img[@title='Air Conditioning, Heating & Ventilating System']")
     WebElement AirConditioning;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    WebElement label_Add;

    @FindBy(xpath = "//input[contains(@id,':ittActEstimatedHours::content')]")
     WebElement EstimateHours;

    @FindBy(xpath = "//span[text()='Add']")
      WebElement label_AddButton;

    @FindBy(xpath = "//a[contains(.,'Air Conditioning, Heating & Ventilating System')]/parent::span/following::a[4]/child::img")
     List<WebElement> img_CrossOne;

    @FindBy(xpath = "//span[contains(text(),'Add Lab')]/following::img[1]")
     WebElement label_Delete1;

    @FindBy(xpath = "//span[text()='Repair Estimate']")
    WebElement RepairEstimate;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
     WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
     WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;

    /**go to  Service Board  Screen*/
    public void goToServiceBoardScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Service Board");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
    /* click PF User in American Body**/
    public void clickOnCorproId() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CorproId);
        WebElementActions.getActions().clickElement(CorproId);
        WaitActions.getWaits().loadingWait(loder);

    }
    /* select  PF User in American Body**/
    public void selectPFUserInAmericanBody () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchandSelectCarporation);
        WebElementActions.getActions().inputText(searchandSelectCarporation, appProp.getProperty("AmericanBody"));
        WaitActions.getWaits().loadingWait(loder);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Select);
        WebElementActions.getActions().clickElement(Select);

    }

    /*click On Repair Estimates In Progress**/
    public void clickonRepairEstimatesInProgess() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RepairEstimatesInProgress);
        WebElementActions.getActions().clickElement(RepairEstimatesInProgress);
        WaitActions.getWaits().loadingWait(loder);


    }
    /*verify Repair Estimate In Progress**/
    public void verifyOnRepairEstimateInProgess () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(tital_RepairEstimatesInProgress);
        Assert.assertTrue(tital_RepairEstimatesInProgress.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(EstimateStatus);
        Assert.assertTrue(EstimateStatus.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_QuickEstimate);
        Assert.assertTrue(label_QuickEstimate.isDisplayed());

    }
   /*verify Location **/
    public void verifyLocation () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitOwner);
        Assert.assertTrue(UnitOwner.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitNumber);
        Assert.assertTrue(UnitNumber.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(EstimateDate);
        Assert.assertTrue(EstimateDate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Total);
        Assert.assertTrue(Total.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(EstimateHash);
        Assert.assertTrue(EstimateHash.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ROHash);
        Assert.assertTrue(ROHash.isDisplayed());
    }
    /*click On Estimate **/
    public void clickOnEstimate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Estimate);
        WebElementActions.getActions().clickElement(Estimate);
        WaitActions.getWaits().loadingWait(loder);
    }
   /*click On Add Labour**/
    public void clickOnAddLabour () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        WebElementActions.getActions().clickElement(label_AddLabor);
        WaitActions.getWaits().loadingWait(loder);


    }
    /*click On VMRs **/
    public void clickOnVMRS () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        WebElementActions.getActions().clickElement(label_VMRS);


    }
    /*enter the SearchTextArea Body Work**/
    public void entertheSearchTextArea  () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions().inputText(SearchTextArea, appProp.getProperty("AirConditioning"));
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Body Work **/
    public void clickOnBodyWork () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AirConditioning);
        WebElementActions.getActions().clickElement(AirConditioning);

    }
   /*click On Add **/
    public void clickOnAdd () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Add);
        WebElementActions.getActions().clickElement(label_Add);

    }
  /*enter the Estimate Hours **/
    public void entertheEstimateHours () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(EstimateHours);
        WebElementActions.getActions().inputText(EstimateHours,appProp.getProperty("EstimateHours"));
        WaitActions.getWaits().loadingWait(loder);

    }
   /*click On Add Button **/
    public void clickOnAddButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddButton);
        WebElementActions.getActions().clickElement(label_AddButton);

    }
  /*clickOnRepairEstimate**/
    public void clickOnRepairEstimate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RepairEstimate);
        WebElementActions.getActions().clickElement(RepairEstimate);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**verify taxes on PDF*/
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

            if(pdfFullText.contains("American Body Company Inc."))
            {
                System.out.println("Estimate Total");

            }

            fis.close();
           WaitActions.getWaits().loadingWait(loder);
        }
    }
    /*click on Cancel  icon**/
     public void clickOncancelIcon () throws InterruptedException {
         if (img_CrossOne.size() > 1) {
             Thread.sleep(2000);
             WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(img_CrossOne.get(1));
             WebElementActions.getActions().clickElement(img_CrossOne.get(1));
             WaitActions.getWaits().loadingWait(loder);

         }

     }
     /*click On Delete icon**/
    public void clickOnDeleteicon () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Delete1);
        WebElementActions.getActions().clickElement(label_Delete1);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Sign OUt**/
    public void clickOnSignOut () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);

    }
   /*click On UserName TextArea**/
   public void clickOnUserNameTextArea () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserName);
       WebElementActions.getActions().clickElement(label_UserName);



   }



}