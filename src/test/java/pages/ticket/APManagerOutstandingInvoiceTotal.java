package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;



public class APManagerOutstandingInvoiceTotal extends TestDriverActions {

    String invoiceName = WebElementActions.getActions().randomAlphaNumeric(7);



    @FindBy(xpath = "//span[contains(.,'( corproId=')]")
    WebElement CorproId;
    @FindBy(xpath = "//label[contains(.,'Search ')]/parent::td/following-sibling::td/child::input")
    WebElement searchandSelectCarporation;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement Select;

    @FindBy(xpath = "//span[contains(text(),'Add New')]")
    WebElement label_AddNewMiscInvoice;

    @FindBy(xpath = "(//label[contains(text(),'Vendor:')])[3]")
    WebElement label_SearchandSelectVendor;

    @FindBy(xpath = "//span[text()='New Vendor']")
    WebElement label_NewVendor;

    @FindBy(xpath = "//span[text()='Name']")
    WebElement label_Name;

    @FindBy(xpath = "//span[text()='Code']")
    WebElement label_Code;

    @FindBy(xpath = "//span[text()='Address']")
    WebElement label_Address;

    @FindBy(xpath = "//span[text()='Phone']")
    WebElement label_Phone;

    @FindBy(xpath = "(//span[text()='Cancel'])[1]")
    WebElement label_cancel;

    @FindBy(xpath = "//input[contains(@id,':it2::content')]")
   WebElement  txt_SerachandselectVendor;

    @FindBy(xpath = "//span[text()='Search']")
    WebElement btn_Search;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement btn_Select;

    @FindBy(xpath = "(//td[contains(.,'Vendor Misc Invoice')])[2]")
    WebElement label_VendorMiscInvoice;

    @FindBy(xpath = "//label[text()='Vendor:']/preceding-sibling::span")
    WebElement label_RequiredVendor;

    @FindBy(xpath = "(//label[text()='Vendor:'])[3]")
    WebElement label_Vendor;

    @FindBy(xpath = "//a[contains(.,'905TRUCK')]")
    WebElement label_905TRUCK;

    @FindBy(xpath = "//label[contains(text(),'Invoice #:')]/preceding-sibling::span")
    WebElement label_RequiredInvoice;

    @FindBy(xpath = "(//td[contains(.,'Invoice #:')]/child::label)[2]")
    WebElement label_Invoice;

    @FindBy(xpath = "//input[contains(@id,':it3::content')]")
    WebElement label_InvoiceTextArea;

    @FindBy(xpath = "//label[text()='Type:']/preceding-sibling::span")
    WebElement label_RequiredType;

    @FindBy(xpath = "//label[text()='Type:']")
    WebElement label_type;

    @FindBy(xpath = "//select[contains(@id,':soc2::content')]")
    WebElement label_typeTextarea;

    @FindBy(xpath = "//span[contains(text(),'Add Line Item')]")
    WebElement label_AddLineItems;

    @FindBy(xpath = "//label[contains(.,'Account#:')]/preceding-sibling::span")
    WebElement label_RequiredAccount;

    @FindBy(xpath = "//label[contains(.,'Account#:')]")
    WebElement label_AccountHash;

    @FindBy(xpath = "//select[contains(@id,':soc4::content')]")
    WebElement label_AccountTextArea;

    @FindBy(xpath = "//label[text()='Division:']/preceding-sibling::span")
    WebElement label_RequiredDevision;

    @FindBy(xpath = "//label[text()='Division:']")
    WebElement label_Devision;

    @FindBy(xpath = "(//select[contains(@id,':soc1::content')])[2]")
    WebElement input_DevisionTextArea;

    @FindBy(xpath = "//label[contains(.,'Description:')]/preceding-sibling::span")
    WebElement label_RequiredDescription;

    @FindBy(xpath = "(//label[contains(.,'Description:')])[2]")
    WebElement label_Description;

    @FindBy(xpath = "//input[contains(@id,':it9::content')]")
    WebElement label_DescriptionTextArea;

    @FindBy(xpath ="//label[text()='Unit Cost:']/preceding-sibling::span")
    WebElement label_RequiredUnitCost;

    @FindBy(xpath = "//label[text()='Unit Cost:']")
    WebElement label_UnitCost;

    @FindBy(xpath = "//label[text()='Unit Cost:']/parent::td/following-sibling::td/child::input")
    WebElement label_UnitCostTextArea;

    @FindBy(xpath = "//label[text()='UOM:']")
    WebElement label_UOM;

    @FindBy(xpath = "//select[contains(@id,':soc3::content')]")
    WebElement label_UOMTextArea;

    @FindBy(xpath = "//label[text()='Extended:']")
    WebElement label_Extended;

    @FindBy(xpath ="(//label[text()='Extended:']/parent::td/following::td/child::span)[1]")
    WebElement label_extendedValue;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[2]")
    WebElement btn_cancel;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[2]")
    WebElement btn_SaveExit;

    @FindBy(xpath = "(//a[contains(.,'Delete')])[2]")
    WebElement btn_Delete;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[2]")
    WebElement btn_SaveExit2;

    @FindBy(xpath = "(//a[contains(.,'Finalize')])[2]")
    WebElement btn_Finalize;

    @FindBy(xpath = "//a[contains(.,'Display Totals')]")
    WebElement btn_DisplayTotals;

    @FindBy(xpath = "//span[contains(text(),'Current')]")
    WebElement label_Current;

    @FindBy(xpath = "//td[contains(@id,':c4')]/span")
    List<WebElement> label_CurrentValue1;

    @FindBy(xpath = "//td[contains(@id,':c8')]")
    List<WebElement> label_30to60;

    @FindBy(xpath = "(//td[contains(@id,':0:c4')]/span)[1]")
    WebElement label_Currentvalue2;

    @FindBy(xpath = "(//td[contains(@id,':1:c4')]/span)[1]")
    WebElement label_Currentvalue3;

    @FindBy(xpath = "//span[contains(@id,':0:tsi:obc1')]")
    WebElement label_CurrentTotal;

    @FindBy(xpath = "//span[contains(@id,':0:tsi:ot13')]")
    WebElement getLabel_30to90Total;

    @FindBy(xpath = "(//td[contains(.,'905 Truck ')])[3]")
    WebElement label_Location;

    @FindBy(xpath = "//a[contains(.,'Un-Finalize')]")
    WebElement  label_UnFinalize;

    @FindBy(xpath = "(//a[contains(.,'Finalize')])[1]")
    WebElement Finalize;


    @FindBy(xpath = "(//a[contains(.,'Delete')])[1]")
    WebElement label_Delete;

    @FindBy(xpath = "//a[contains(.,'Yes')]")
    WebElement btn_Yes;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;


    /*go to AP  Manager **/
    public void gotoApManager() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Financials");
        ReusableActions.getActions().clickChildMenu("AP Manager");

    }

    /* click PF User in American Body**/
    public void clickPFCorproID () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CorproId);
        WebElementActions.getActions().clickElement(CorproId);
        WaitActions.getWaits().loadingWait(loder);

    }
    /* select  PF User in American Body**/
    public void selectPFUser () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchandSelectCarporation);
        WebElementActions.getActions().inputText(searchandSelectCarporation, appProp.getProperty("PFUser"));
        WaitActions.getWaits().loadingWait(loder);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Select);
        WebElementActions.getActions().clickElement(Select);

    }


    /*click on add new MISC Invoice**/
    public void clickOnNewInvoice () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddNewMiscInvoice);
        WebElementActions.getActions().clickElement(label_AddNewMiscInvoice);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*verify Search and Select Vendor **/
    public void verifySearchAndSelectVendor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SearchandSelectVendor);
        Assert.assertTrue(label_SearchandSelectVendor.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_NewVendor);
        Assert.assertTrue(label_NewVendor.isDisplayed());

    }
      public void  verifyName () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Name);
        Assert.assertTrue(label_Name.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Code);
        Assert.assertTrue(label_Code.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Address);
        Assert.assertTrue(label_Address.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Phone);
        Assert.assertTrue(label_Phone.isDisplayed());

    }
    /*enter vendors name **/
  public void entervendorName () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(txt_SerachandselectVendor);
      WebElementActions.getActions().inputText(txt_SerachandselectVendor,appProp.getProperty("vendorsName"));
      TestListener.saveScreenshotPNG(driver);
  }
  /*click on Search **/
    public void clickOnSearch () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Search);
        WebElementActions.getActions().clickElement(btn_Search);

    }
    /*click on Select button **/
    public void clickOnSelectbutton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Select);
        WebElementActions.getActions().clickElement(btn_Select);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*verify Tital Vendor Misc Invoice**/
    public void verifyVendorMiscInvoice () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VendorMiscInvoice);
        Assert.assertTrue(label_VendorMiscInvoice.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredVendor);
        Assert.assertTrue(label_RequiredVendor.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Vendor);
        Assert.assertTrue(label_Vendor.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_905TRUCK);
        Assert.assertTrue(label_905TRUCK.isDisplayed());

    }
    /*verify Required invoice ,invoice invoice value **/
    public void verifyRequiredInvoice () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredInvoice);
        Assert.assertTrue(label_RequiredInvoice.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Invoice);
        Assert.assertTrue(label_Invoice.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_InvoiceTextArea);
        Assert.assertTrue(label_InvoiceTextArea.isDisplayed());
    }
    /*verify Required Type ,type,typeTextArea**/
    public void verifyRequiredtype () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredType);
        Assert.assertTrue(label_RequiredType.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_type);
        Assert.assertTrue(label_type.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_typeTextarea);
        Assert.assertTrue(label_typeTextarea.isDisplayed());

    }

    /*enter the Invoice # **/
    public void enterInvoiceHash () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_InvoiceTextArea);
        WebElementActions.getActions().inputText(label_InvoiceTextArea,invoiceName);
        TestListener.saveScreenshotPNG(driver);

    }
    /*select dropdown  type **/
    public void selecType() throws InterruptedException {
        Select objselect= new Select(label_typeTextarea);
        objselect.selectByVisibleText("ADMIN - Administration");
        WaitActions.getWaits().loadingWait(loder);

    }
    /*click on Add Line Item**/
    public void clickOnAddLineItem () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddLineItems);
        WebElementActions.getActions().clickElement(label_AddLineItems);

    }
    /*verify Required Account,Account Hash,AccountTextArea**/
    public void verifyRequiredAccount () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredAccount);
        Assert.assertTrue(label_RequiredAccount.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AccountHash);
        Assert.assertTrue(label_AccountHash.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AccountTextArea);
        Assert.assertTrue(label_AccountTextArea.isDisplayed());

    }
    /*select dropdown  Account Hash**/
    public void verifyAccountHash () throws InterruptedException {
        Select objselect=new Select(label_AccountTextArea);
        objselect.selectByVisibleText("1230 Inventory, Special Order");

    }
    /*verify Required Devision ,Devision,DevisionTextArea **/
    public void verifyRequiredDevision () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredDevision);
        Assert.assertTrue(label_RequiredDevision.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Devision);
        Assert.assertTrue(label_Devision.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(input_DevisionTextArea);
        Assert.assertTrue(input_DevisionTextArea.isDisplayed());

    }
    /*select dropdown Devision**/
    public void selectDevision () {
        Select objselect =new Select(input_DevisionTextArea);
        objselect.selectByVisibleText("ADMIN");

    }
    /*verify RequiredDescription ,Description,DescriptionTextArea**/
    public void verifyRequiredDescription () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredDescription);
        Assert.assertTrue(label_RequiredDescription.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Description);
        Assert.assertTrue(label_Description.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_DescriptionTextArea);
        Assert.assertTrue(label_DescriptionTextArea.isDisplayed());
    }
     /*verify Required UnitCost ,UnitCost,UnitCostTextArea**/
    public void verifyRequiredUnitCost () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_RequiredUnitCost);
        Assert.assertTrue(label_RequiredUnitCost.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitCost);
        Assert.assertTrue(label_UnitCost.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitCostTextArea);
        Assert.assertTrue(label_UnitCostTextArea.isDisplayed());

    }
    /*enter Unit Quantity **/
    public void enterUnitQuantity () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_UnitCostTextArea);
        WebElementActions.getActions().inputText(label_UnitCostTextArea,appProp.getProperty("UnitCost"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*verify Extend and ExtendValue **/
    public void verifyExtend () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Extended);
        Assert.assertTrue(label_Extended.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_extendedValue);
        Assert.assertTrue(label_extendedValue.isDisplayed());

    }
    /*verify Cancel ,save/Exit **/
    public void verifyCancel () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_cancel);
        Assert.assertTrue(btn_cancel.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_SaveExit);
        Assert.assertTrue(btn_SaveExit.isDisplayed());
    }
    /*click On Save/Exit **/
    public void clickOnSaveExit () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveExit);
        WebElementActions.getActions().clickElement(btn_SaveExit);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*verify Delete ,Save/Exit,Fanalize **/
    public void verifyDelete () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Delete);
        Assert.assertTrue(btn_Delete.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_SaveExit2);
        Assert.assertTrue(btn_SaveExit2.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Finalize);
        Assert.assertTrue(btn_Finalize.isDisplayed());

    }
    /*click on Finalize **/
    public void clickOnFinalize () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Finalize);
        WebElementActions.getActions().clickElement(btn_Finalize);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*click on Display Totals**/
    public void clickonDisplayTotals () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_DisplayTotals);
        WebElementActions.getActions().clickElement(btn_DisplayTotals);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*String Current Value **/
    public void addingcurrentValue () throws InterruptedException {
        for (int i = 0; i > label_CurrentValue1.size(); i++) {
            String count = String.valueOf(label_CurrentValue1.get(i).getText());
            System.out.println("Name of element in current" + count);

            int b = 0;
            b = b + i;
            System.out.println("Sum of element in current :" + b);

        }
    }
    /*adding 30to60 **/
    public void adding30to60 () {
        for (int i = 0; i > label_30to60.size(); i++) {
            String count = String.valueOf(label_30to60.get(i).getText());
            System.out.println("Name of element in 30 to 60" + count);

            int b = 0;
            b = b + i;
            System.out.println("Sum of element in 30 to 60 :" + b);
        }
    }

        /*verify Display Total Values**/
        public void verifyDisplayTotalValues() throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_CurrentTotal);
            Assert.assertTrue(label_CurrentTotal.isDisplayed());

            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(getLabel_30to90Total);
            Assert.assertTrue(getLabel_30to90Total.isDisplayed());
            WaitActions.getWaits().loadingWait(loder);

        }
        /*click On Location**/
         public void clickOnlocation  () throws InterruptedException {
             WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Location);
             WebElementActions.getActions().clickElement(label_Location);
             WaitActions.getWaits().loadingWait(loder);
         }

        /*click on Finalize**/
     public void clickOnFinalize2 () throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Finalize);
         WebElementActions.getActions().clickElement(Finalize);
         WaitActions.getWaits().loadingWait(loder);
     }

      /*click on Unfinalized**/
        public void clickOnUnfinalized () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_UnFinalize);
            WebElementActions.getActions().clickElement(label_UnFinalize);
            WaitActions.getWaits().loadingWait(loder);
        }
      /*click on Delete **/
     public void clickOnDelete () throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Delete);
         WebElementActions.getActions().clickElement(label_Delete);
         WaitActions.getWaits().loadingWait(loder);

     }
     /*click on Yes **/
    public void clickOnYes () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Yes);
        WebElementActions.getActions().clickElement(btn_Yes);
        WaitActions.getWaits().loadingWait(loder);

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














