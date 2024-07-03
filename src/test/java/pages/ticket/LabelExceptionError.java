package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.util.List;

public class LabelExceptionError extends TestDriverActions {

    @FindBy(xpath = "//span[contains(text(),' New Count')]")
    WebElement AddNewCount;

    @FindBy(xpath = "(//td[contains(.,'Select Warehouse')]/div)[2]")
    WebElement Select_Warehouse;

    @FindBy(xpath = "//label[text()='Warehouse:']/preceding-sibling::span")
    WebElement Required_Warehouse;

    @FindBy(xpath = "(//label[text()='Warehouse:']/parent::td/label)[2]")
    WebElement Warehouse;

    @FindBy(xpath = "//label[contains(text(),' Type:')]")
    WebElement ContentType;

    @FindBy(xpath = "//label[contains(.,'Standard')]/../input")
    WebElement Required_Standard;

    @FindBy(xpath = "//label[contains(.,'Standard')]")
    WebElement Standard;

    @FindBy(xpath = "//label[contains(.,'Serialized')]")
    WebElement  Serialized;

    @FindBy(xpath = "//label[contains(.,'Tires')]")
    WebElement Tires;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement Cancel;

    @FindBy(xpath = "(//a[contains(.,'OK')])[1]")
    WebElement Ok;

    @FindBy(xpath = "//td[contains(@id,':tb')]/div[contains(.,'PC00')]")
    WebElement Pysical_Count;

    @FindBy(xpath = "(//label[contains(.,'Type:')])[2]")
    WebElement Type;

    @FindBy(xpath = "(//label[contains(.,'Type:')]/following::div[1])[2]")
    WebElement TypeValue;

    @FindBy(xpath = "//label[contains(.,'Location:')]")
    WebElement Location;

    @FindBy(xpath = "//label[text()='Part#:']")
    WebElement PartHash;

    @FindBy(xpath = "//input[contains(@id,':itSearchPartSelect::content')]")
    WebElement PartInputTextArea;

    @FindBy(xpath = "//label[contains(.,'Quantity:')]")
    WebElement Quantity;

    @FindBy(xpath = "//input[contains(@id,':insQty::content')]")
    WebElement QuanityTextArea;

    @FindBy(xpath = "//div[contains(@id,':cbCount')]/a/span")
    WebElement Count;

    @FindBy(xpath = "(//label[contains(.,'Warehouse:')])[3]")
    WebElement WarehouseOne;

    @FindBy(xpath = "//a[contains(.,'Generate List of Parts')]")
    WebElement GenerateListOfParts;

    @FindBy(xpath = "//span[text()='Part #']")
    WebElement Part;

    @FindBy(xpath = "(//span[text()='Description'])[2]")
    WebElement Description;

    @FindBy(xpath = "//span[text()='Room|Row|Shelf|Bin']")
    WebElement RoomRow;

    @FindBy(xpath = "//span[contains(.,'On Hand')]")
    WebElement OnHand;

    @FindBy(xpath = "(//span[text()='Count'])[2]")
    WebElement CountTwo;

    @FindBy(xpath = "//a[contains(.,'Match Count')]")
    WebElement MatchCount;

    @FindBy(xpath = "//img[@title='Print Label']")
    WebElement PrinterIcon;

    @FindBy(xpath = "//div[contains(@id,'::popup-container')]/div[2]/following::div[1]")
    WebElement ScrollBar;

    @FindBy(xpath = "//span[text()='Bin']")
    WebElement Bin;


    @FindBy(xpath = "//span[contains(.,'Add UPC Barcode')]")
    WebElement AddUPCBarCode;

    @FindBy(xpath = "//span[text()='Void']")
    WebElement btn_void;

    @FindBy(xpath = "//span[text()='Resort List']")
    WebElement btn_ResortList;

    @FindBy(xpath = "//span[text()='Print Count Sheet']")
    WebElement btn_PrintCountSheet;

    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement btn_SaveAndExit;

    @FindBy(xpath = "//span[text()='Post']")
    WebElement btn_Post;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;





    /**go to Pyshical Count*/
    public void gotoPysicalCount () throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Physical Count");

    }

   /*click on Add New Count **/
    public void clickOnAddNewCount () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddNewCount);
        WebElementActions.getActions().clickElement(AddNewCount);

    }
    /*verify Select Warehouse **/
    public void verifyOnSelectWarehouse () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Select_Warehouse);
        Assert.assertTrue(Select_Warehouse.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Warehouse);
        Assert.assertTrue(Required_Warehouse.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Warehouse);
        Assert.assertTrue(Warehouse.isDisplayed());

    }
    /** varify On Content Type*/
    public void verifyOnContentTYpe () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ContentType);
        Assert.assertTrue(ContentType.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Standard);
        Assert.assertTrue(Required_Standard.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Standard);
        Assert.assertTrue(Standard.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Serialized);
        Assert.assertTrue(Serialized.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Tires);
        Assert.assertTrue(Tires.isDisplayed());


    }
    /*verify Ok and Cancel Button **/
    public void verifyOnOk() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Cancel);
        Assert.assertTrue(Cancel.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Ok);
        Assert.assertTrue(Ok.isDisplayed());

    }
    /*click On Ok Button  **/
    public void clickOnok () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Ok);
        WebElementActions.getActions().clickElement(Ok);

    }
    /**verify Phycial count */
    public void verifyOnphysicalCount () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Pysical_Count);
        Assert.assertTrue(Pysical_Count.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Type);
        Assert.assertTrue(Type.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(TypeValue);
        Assert.assertTrue(TypeValue.isDisplayed());

    }
    /**verify Location */
   public void verifyOnLocation () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location);
       Assert.assertTrue(Location.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartHash);
       Assert.assertTrue(PartHash.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartInputTextArea);
       Assert.assertTrue(PartInputTextArea.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Quantity);
       Assert.assertTrue(Quantity.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(QuanityTextArea);
       Assert.assertTrue(QuanityTextArea.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Count);
       Assert.assertTrue(Count.isDisplayed());

   }
   /**enter the part # */
   public void enterthePartTextArea () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PartInputTextArea);
       WebElementActions.getActions().inputText(PartInputTextArea, appProp.getProperty("Part"));
       PartInputTextArea.sendKeys(Keys.ENTER);

   }
   /**click On Count Button  */
   public void clickOnCountButton () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Count);
       WebElementActions.getActions().clickElement(Count);
       WaitActions.getWaits().loadingWait(loder);

   }
   /** varify On Warehouse */
   public void clickOnWarehouse () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(WarehouseOne);
       Assert.assertTrue(WarehouseOne.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(GenerateListOfParts);
       Assert.assertTrue(GenerateListOfParts.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Part);
       Assert.assertTrue(Part.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description);
       Assert.assertTrue(Description.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RoomRow);
       Assert.assertTrue(RoomRow.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(OnHand);
       Assert.assertTrue(OnHand.isDisplayed());

   }
   /**verify On CountTwo */
   public void verifyOnMatchCount() throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CountTwo);
       Assert.assertTrue(CountTwo.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(MatchCount);
       Assert.assertTrue(MatchCount.isDisplayed());

      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PrinterIcon);
       Assert.assertTrue(PrinterIcon.isDisplayed());




   }
   /**click On Printer ICon */
  public void clickOnPrinterIcon () throws InterruptedException {

      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PrinterIcon);
      Assert.assertTrue(PrinterIcon.isDisplayed());

  }

  /* verify Add UPC Bar Code**/
   public void verifyOnAddUPCBarCode () throws InterruptedException {

       WebElementActions.getActions().moveOnTargetElement(Bin);

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AddUPCBarCode);
       Assert.assertTrue(AddUPCBarCode.isDisplayed());

       WebElementActions.getActions().moveOnTargetElement(btn_void);

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_void);
       Assert.assertTrue(btn_void.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_ResortList);
       Assert.assertTrue(btn_ResortList.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_PrintCountSheet);
       Assert.assertTrue(btn_PrintCountSheet.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_SaveAndExit);
       Assert.assertTrue(btn_SaveAndExit.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Post);
       Assert.assertTrue(btn_Post.isDisplayed());

   }
   /**click On Save /Exit */
   public void clickOnSaveAndExit () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveAndExit);
       WebElementActions.getActions().clickElement(btn_SaveAndExit);


   }

    /*click on SignOut **/
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
