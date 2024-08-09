package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class PMInspectionReading extends TestDriverActions {
    String TitleUnit = WebElementActions.getActions().randomAlphaNumeric(10);

    @FindBy(xpath = "//a[contains(.,'New RO')]/span")
    WebElement NewRO;

    @FindBy(xpath = "//h1[text()='New Repair Order']")
    WebElement NewRepairOrder;

    @FindBy(xpath = "(//label[contains(text(),'Search Unit:')])[1]")
    WebElement Search;

    @FindBy(xpath = "//label[contains(text(),'Search Unit:')]/preceding-sibling::input")
    WebElement SearchUnit;

    @FindBy(xpath = "(//span[text()='Select'])[1]")
    WebElement btn_Select;

    @FindBy(xpath = "//label[text()='Unit #:']/parent::span/following::div[1]")
    WebElement Unit_Value;

    @FindBy(xpath = "//label[contains(.,'Odometer:')]/parent::td/following-sibling::td/child::table")
    WebElement Odometer_Values;

    @FindBy(xpath = "//span[text()='Reading Type']")
    WebElement ReadingType;

    @FindBy(xpath = "//label[contains(.,'Odometer:')]")
    WebElement Odometer;

    @FindBy(xpath = "(//a[contains(text(),'PM Inspection Setup')])[1]")
    WebElement PmInspectionSetUp;

    @FindBy(xpath = "//a[contains(.,'Add')]/span")
    WebElement Add;

    @FindBy(xpath = "(//span[contains(.,'Setup Task and Reason')])[2]")
    WebElement SetupTaskAndReason;

    @FindBy(xpath = "//label[text()='Task:']")
    WebElement Task;

    @FindBy(xpath = "//select[contains(@id,':soc1::content')]")
    WebElement TaskValue;

    @FindBy(xpath = "//label[contains(.,'Code:')]/preceding-sibling::span")
    WebElement RequiredCode;

    @FindBy(xpath = "//label[contains(.,'Code:')]")
    WebElement Code;

    @FindBy(xpath = "//label[contains(.,'Code:')]/parent::td/following-sibling::td/child::input")
    WebElement Code_TextArea;

    @FindBy(xpath = "//label[contains(text(),'Title:')]/preceding-sibling::span")
    WebElement ReqiredTitle;

    @FindBy(xpath = "//label[contains(text(),'Title:')]")
    WebElement Title;

    @FindBy(xpath = "//label[contains(text(),'Title:')]/parent::td/following-sibling::td/child::input")
    WebElement TitalTextArea;

    @FindBy(xpath = "(//a[contains(.,'Ne')]/child::span)[2]")
    WebElement Next;

    @FindBy(xpath = "//a[contains(.,'Ne')]/child::span")
    WebElement Next1;

    @FindBy(xpath = "//a[contains(.,'Add New Section')]/span")
    WebElement  AddNewSection;

    @FindBy(xpath = " //td[contains(@id,':AddInsAreaDialog::tb')]/div")
    WebElement InspectionReportSection;

    @FindBy(xpath = "//label[contains(.,'Description')]/preceding-sibling::span")
    WebElement RequiredDescription;

    @FindBy(xpath = "//label[contains(.,'Description')]")
    WebElement Description;

    @FindBy(xpath = "//input[contains(@id,':it6::content')]")
    WebElement DescriptionTextArea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[2]")
    WebElement btn_Cancel;

    @FindBy(xpath = "(//span[text()='OK'])[1]")
    WebElement btn_OK;

    @FindBy(xpath = "(//a[contains(text(),'Add')])[1]")
    WebElement Add1;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    WebElement AccessoriesGroup;

    @FindBy(xpath = "//img[contains(@id,':0:ciAddVmrs::icon')]")
    WebElement plusIcon;

    @FindBy(xpath = "(//span[text()='Add'])[2]")
    WebElement btn_Add;

    @FindBy(xpath = "//a[@title='Expand']")
    WebElement clickOnArrow;

    @FindBy(xpath = "//label[contains(text(),'Search:')]/parent::td/following-sibling::td/child::input")
    WebElement SearchTextArea;

    @FindBy(xpath = "//img[@title='Annual DOT Inspection']")
    WebElement AnnualDotInspection;

    @FindBy(xpath = "(//input[contains(@id,':it1::content')])[2]")
    WebElement Text;

    @FindBy(xpath = "(//select[contains(@id,':soc1::content')])[1]")
    WebElement Type;

    @FindBy(xpath = "//select[contains(@id,'soc2::content')]")
    WebElement Configure;

    @FindBy(xpath = "(//a[contains(.,'Ne')]/child::span)[2]")
    WebElement btn_Next;

    @FindBy(xpath = "//a[contains(.,'Ne')]/child::span")
    WebElement NextThree;

    @FindBy(xpath = "//a[contains(.,'Activate Inspection')]/span")
    WebElement Activateinspection;

    @FindBy(xpath = "//a[contains(.,'Tech RO')]")
    WebElement TechRo;

    @FindBy(xpath = "//input[contains(@id,':itEmployeeNumber::content')]")
    WebElement TechROName;

    @FindBy(xpath = "//span[text()='Go']")
    WebElement btn_Go;

    @FindBy(xpath = "//a[contains(.,'More Units')]/span")
    WebElement btn_MoreUnits;

    @FindBy(xpath = "//label[contains(text(),'Search Unit:')]/preceding-sibling::input")
    WebElement Unit;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement SelectButton;
    @FindBy(xpath = "//a[contains(.,'U555')]/span")
    WebElement UnitValue;

    @FindBy(xpath = "(//a[contains(.,'Readings')])[1]")
    WebElement Readings;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement btn_SaveAndExit;

    @FindBy(xpath = "//span[text()='More Work ...']")
    WebElement MoreWork;

    @FindBy(xpath = "(//a[contains(.,'VMRS')])[1]")
    WebElement VMRS;

    @FindBy(xpath = "//img[contains(@id,':0:cilvmrsys::icon')]")
    WebElement img_AnnualDOTInspection;



    @FindBy(xpath = "//span[text()='Add']")
    WebElement  AddButton;

    @FindBy(xpath = "(//img[@title='Annual DOT Inspection'])[1]")
    WebElement clickOnImgDOT;

    @FindBy(xpath = "(//a[contains(@id,':clPopupWoact')]/span)[1]")
    WebElement link_AnnualDOTInspection;

   @FindBy(xpath = "//img[contains(@id,':0:ciDWoAct1::icon')]")
   WebElement Cancel;

   @FindBy(xpath = "//a[contains(.,'Yes')]")
   WebElement btn_Yes;

   @FindBy(xpath = "(//span[text()='Select'])[1]")
   WebElement btn_SelectTwo;
    @FindBy(xpath = "//a[contains(.,'Tires')]/span")
    WebElement Tires;

    @FindBy(xpath = "//input[contains(@id,':0:itValueNumeric::content')]")
    WebElement FrontRightTired;


   @FindBy(xpath = "//input[contains(@id,':1:itValueNumeric::content')]")
   WebElement FrontLeftTired;

   @FindBy(xpath = "//span[contains(@id,':itValueReading')]")
   WebElement OdometerReading;

   @FindBy(xpath = "//span[text()='Done / Validate']")
   WebElement btn_DoneAndValidate;

   @FindBy(xpath = "//a[contains(.,'Brakes')]/span")
   WebElement Breaks;

   @FindBy(xpath = "//a[contains(.,'Fluids')]/span")
   WebElement Fluids;

   @FindBy(xpath = "//a[contains(.,'Lights')]/span")
   WebElement Lights;

    @FindBy(xpath = "//span[contains(.,'Defect Summary')]")
    WebElement DefectSummary;

  @FindBy(xpath = "//h1[text()='Defect Summary']")
  WebElement DefectSummarySign;

  @FindBy(xpath = "(//a[contains(.,'Sign')])[2]")
  WebElement Sign;

  @FindBy(xpath = "//span[contains(.,'Technician Signature')]")
  WebElement TechnicianSignature;

  @FindBy(xpath = "//div[contains(@id,':psl12::c')]/child::input/following::canvas")
  WebElement Canvas;

  @FindBy(xpath = "//a[contains(.,'Continue')]")
  WebElement Continue;

  @FindBy(xpath = "//label[text()='Search Unit:']/preceding-sibling::input")
  WebElement UnitNo;

  @FindBy(xpath = "(//a[contains(.,'Print')])[1]")
  WebElement btn_Print;

  @FindBy(xpath = "//a[contains(.,'More Info')]")
  WebElement MoreInfo;


  @FindBy(xpath = "(//a[contains(.,'WO00')])[1]")
  WebElement InspectedBy;

  @FindBy(xpath = "//label[contains(.,'Unit #:')]/parent::span/parent::div/following-sibling::div//a/child::span")
  WebElement UnitValueOne;

  @FindBy(xpath = "//label[contains(.,'Odometer:')]")
  WebElement OdometerOne;

  @FindBy(xpath = "//span[contains(@id,':0:itCurReadingValueId')]/parent::td/parent::tr")
  WebElement OdometerValue;

  @FindBy(xpath = "//span[contains(.,'Back to Inspection History')]")
  WebElement BackTOInspectionHistory;

  @FindBy(xpath = "(//span[contains(.,'Exit')])[3]")
  WebElement Exit;


  @FindBy(xpath = "(//a[text()='Readings'])[1]")
  WebElement ReadingsTwo;

  @FindBy(xpath = "//td[contains(@id,':terh:0:c4')]/span")
  WebElement ReadingValues;

  @FindBy(xpath = "(//span[text()='KM'])[1]")
  WebElement Km;

  @FindBy(xpath = "//span[contains(@id,':0:clWON::text')]")
  WebElement Referance ;

  @FindBy(xpath = "(//a[contains(.,'Save / Exit')])[2]")
  WebElement SaveAndExit;

  @FindBy(xpath = "//a[contains(.,'Save / Exit')]/span")
  WebElement SaveAndExitOne;

  @FindBy(xpath = "(//a[contains(.,'Tech RO')])[2]")
  WebElement TechROOne;

  @FindBy(xpath = "(//a[contains(.,'Summary')])[1]")
  WebElement Summary;


  @FindBy(xpath = "//input[contains(@id,'alueId::content')]")
  WebElement OdometerValueSummaryTab;

  @FindBy(xpath = "//input[contains(@id,':itSearch::content')]")
  WebElement SearchTextAreaRefe;

  @FindBy(xpath = "//span[text()='Refresh']")
  WebElement  Refresh;

   @FindBy(xpath = "(//a[contains(.,'WO00')])[1]")
   WebElement ReferanceOne;

   @FindBy(xpath = "//label[text()='Odometer:']/parent::td/following-sibling::td/child::table")
   WebElement OdometerROvalue;

   @FindBy(xpath = "//a[contains(@id,':0:clWON')]/parent::div/parent::div")
   WebElement ROHash;


    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;


























    /**
     * go to completeRO
     */
    public void gotoCompleteRO() throws FileNotFoundException, InterruptedException {
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");

    }

    /**
     * click on New RO
     */
    public void clickOnNewRo() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NewRO);
        WebElementActions.getActions().clickElement(NewRO);

    }

    /**
     * verify New Repair Order
     */
    public void verifyOnNewRepairOrder() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NewRepairOrder);
        Assert.assertTrue(NewRepairOrder.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Search);
        Assert.assertTrue(Search.isDisplayed());

    }

    /**
     * enter SearchTextArea
     */
    public void enterSearchTextArea() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchUnit);
        WebElementActions.getActions().inputText(SearchUnit, appProp.getProperty("Unit"));


    }

    /**
     * click On Select Button
     */
    public void clickOnSelectButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Select);
        WebElementActions.getActions().clickElement(btn_Select);

    }

    /**
     * verify unitValue Odiometer Reading
     */
    public void verifyUnitValue() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Unit_Value);
        Assert.assertTrue(Unit_Value.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Odometer_Values);
        Assert.assertTrue(Odometer_Values.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReadingType);
        Assert.assertTrue(ReadingType.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Odometer);
        Assert.assertTrue(Odometer.isDisplayed());

    }

    /**
     * go to PM Inspector Manager
     */
    public void gotoPMInspectorManager() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("PM Inspection Manager");

    }

    /**
     * click On PM Inspction SetUp
     */
    public void clickOnPmInspectionSetUp() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PmInspectionSetUp);
        WebElementActions.getActions().clickElement(PmInspectionSetUp);

    }

    /**
     * click On Add
     */
    public void clickOnAdd() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Add);
        WebElementActions.getActions().clickElement(Add);

    }

    /**
     * Varify Setup task And Reson
     */
    public void varifySetupTaskAndReson() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SetupTaskAndReason);
        Assert.assertTrue(SetupTaskAndReason.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Task);
        Assert.assertTrue(Task.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(TaskValue);
        Assert.assertTrue(TaskValue.isDisplayed());

    }

    /**
     * varify Required code
     */
    public void varifyRequiredCode() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredCode);
        Assert.assertTrue(RequiredCode.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Code);
        Assert.assertTrue(Code.isDisplayed());

    }

    /**
     * enter the CodeTestArea
     */
    public void enterTheCodeTextArea() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Code_TextArea);
        WebElementActions.getActions().clickUsingJS(Code_TextArea);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        Code_TextArea.sendKeys("U555" + randomInt );


    }
    /**varify Required Tital ,Title */
   public void varifyRequiredTital () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReqiredTitle);
       Assert.assertTrue(ReqiredTitle.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Title);
       Assert.assertTrue(Title.isDisplayed());


   }
   /**enter the TitalTextArea */
    public void entertheTitalTextArea () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(TitalTextArea);
        WebElementActions.getActions().inputText(TitalTextArea,TitleUnit);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click On Next Button*/
    public void clickOnNextOne () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Next1);
        WebElementActions.getActions().clickElement(Next1);
        WaitActions.getWaits().loadingWait(loder);

    }


        /**click On Next Button*/
    public void clickOnNext () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Next);
        WebElementActions.getActions().clickElement(Next);
        WaitActions.getWaits().loadingWait(loder);


    }
    /*click On Add New Section**/
    public void clickOnAddNewSection () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddNewSection);
        WebElementActions.getActions().clickElement(AddNewSection);

    }
   /**varify  Inspection Report Section */
   public void varifyOnInspectionReportSection () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(InspectionReportSection);
       Assert.assertTrue(InspectionReportSection.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredDescription);
       Assert.assertTrue(RequiredDescription.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description);
       Assert.assertTrue(Description.isDisplayed());


   }
   /**enter the Description TextArea*/
   public void enterTheDescription () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(DescriptionTextArea);
       WebElementActions.getActions().inputText(DescriptionTextArea,appProp.getProperty("Description"));

   }
   /**varify cancel Button  */
   public void varifyOnCancel () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_Cancel);
       Assert.assertTrue(btn_Cancel.isDisplayed());

   }
   /**click On Ok */
    public void clickOnOk () throws InterruptedException {
     WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_OK);
     WebElementActions.getActions().clickElement(btn_OK);

 }
 /**click On Add1*/
   public void clickOnAdd1 () throws InterruptedException {
     WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Add1);
     WebElementActions.getActions().clickElement(Add1);
 }
  /**click On Accerioes Group */
  public void clickOnAccerioesGroup () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AccessoriesGroup);
      WebElementActions.getActions().clickElement(AccessoriesGroup);

  }
    /**click On Plus Icon */
     public void clickOnPlusIcon () throws InterruptedException {
         WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(plusIcon);
         WebElementActions.getActions().clickElement(plusIcon);

     }
    /**click On Add */
    public void clickOnAdd2 () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Add);
        WebElementActions.getActions().clickElement(btn_Add);


    }
   /**click On Arrow*/
   public void clickOnArrow () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(clickOnArrow);
       WebElementActions.getActions().clickElement(clickOnArrow);


   }
   /**enter Search TextArea*/
   public void enterSearchTextAreaTWo () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
       WebElementActions.getActions().inputText(SearchTextArea,appProp.getProperty("Search"));

   }
   /**click On Annual DOT Inspection */
   public void clickOnAnnualDOTInspection () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AnnualDotInspection);
       WebElementActions.getActions().clickElement(AnnualDotInspection);

   }

   /**enter the Text name */
   public void entertheTextName ( ) throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Text);
       WebElementActions.getActions().inputText(Text,appProp.getProperty("Odometer"));



   }
   /**Select DropDown Reading*/
   public void selectDropdrown () throws InterruptedException {
       Select obj =new Select(Type);
       obj.selectByVisibleText("Reading");
       WaitActions.getWaits().loadingWait(loder);

   }
   /**select Odeometer Configure*/
   public void selectOdeometerConfigure() throws InterruptedException {
       Select src=new Select(Configure);
       src.selectByVisibleText("ODOMETER");
       WaitActions.getWaits().loadingWait(loder);


   }
   /**click On Next Button*/
   public void clickOnNextTwo () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Next);
       WebElementActions.getActions().clickElement(btn_Next);


   }
   /**click On Next Three */
   public void clickOnNextThree () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NextThree);
       WebElementActions.getActions().clickElement(NextThree);

   }
   /**click On Activate Inspection */
   public void clickOnActivateInspection () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Activateinspection);
       WebElementActions.getActions().clickElement(Activateinspection);

   }
   /**click On Tech RO*/
   public void clickOnTechRo () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(TechRo);
       WebElementActions.getActions().clickElement(TechRo);

   }
   /**enter Tech RO Name */
   public void enterTechRo() throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(TechROName);
       WebElementActions.getActions().inputText(TechROName,appProp.getProperty("TechRO"));

   }
   /**click On GO Button */
   public void clickOnGO () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Go);
       WebElementActions.getActions().clickElement(btn_Go);

   }
   /**click On More Units*/
   public void clickOnMoreUnits () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_MoreUnits);
       WebElementActions.getActions().clickElement(btn_MoreUnits);
       WaitActions.getWaits().loadingWait(loder);

   }
   /**enter the Unit */
   public void enterTheUnit () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Unit);
       WebElementActions.getActions().inputText(Unit,appProp.getProperty("Unit"));


   }
    /**click On Select Button */
    public void clickOnSelect () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SelectButton);
        WebElementActions.getActions().clickElement(SelectButton);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**varify Unit # Value */
    public void varifyUnitHashValue () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitValue);
        Assert.assertTrue(UnitValue.isDisplayed());

    }
    /**click On Unit Value */
    public void clickOnUnitValue () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitValue);
        WebElementActions.getActions().clickElement(UnitValue);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click On Readings*/
    public void clickOnReadings () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Readings);
        WebElementActions.getActions().clickElement(Readings);


    }
    /**click On Save/Exit */
    public void clickOnSaveAndExitButton () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveAndExit);
        WebElementActions.getActions().clickElement(btn_SaveAndExit);



    }

    /**click On More Work */
    public void clickOnMoreWork () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MoreWork);
        WebElementActions.getActions().clickElement(MoreWork);

    }
    /**click On VMRs */
    public void clickOnVMRS () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(VMRS);
        WebElementActions.getActions().clickElement(VMRS);

    }
    /**Search the labour*/
    public void enterTheLabour () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions().inputText(SearchTextArea,appProp.getProperty("Search"));

    }
    /**click On Annual DOT Inspection */
    public void clickOnAnnualDOTInspectionOne () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_AnnualDOTInspection);
        WebElementActions.getActions().clickElement(img_AnnualDOTInspection);
        Thread.sleep(3000);
        WaitActions.getWaits().loadingWait(loder);


    }


    /**click On Add Button */
    public void clickOnAddButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddButton);
        WebElementActions.getActions().clickElement(AddButton);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**click On Annual Dot Inspection */
    public void clickOnAnnualDOTInspectionIMG () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(clickOnImgDOT);
        WebElementActions.getActions().clickElement(clickOnImgDOT);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click on Cross icon*/
    public void clickOnCancel () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Cancel);
        WebElementActions.getActions().clickElement(Cancel);
        WaitActions.getWaits().loadingWait(loder);


    }
    /**click On Yes Button */
    public void clickOnYes () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Yes);
        WebElementActions.getActions().clickElement(btn_Yes);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**click On Select */
    public void clickOnSelectOne () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SelectTwo);
        WebElementActions.getActions().clickElement(btn_SelectTwo);
        WaitActions.getWaits().loadingWait(loder);


    }

    /**click On Annual DOT Inspection hyperlink*/
    public void clickOnAnnualDoTInspection () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(link_AnnualDOTInspection);
        WebElementActions.getActions().clickElement(link_AnnualDOTInspection);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**click On Tires*/
    public void clickOnTires () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Tires);
        WebElementActions.getActions().clickElement(Tires);

    }
    /**enter the Front Tired Depth */
    public void enterTheFrontTiredDepth () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FrontRightTired);
        WebElementActions.getActions().inputText(FrontRightTired,appProp.getProperty("Right"));

    }
    /**enter the Front Left Tired Depth  */
    public void enterTheFrontLeftTiredDepth () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FrontLeftTired);
        WebElementActions.getActions().inputText(FrontLeftTired,appProp.getProperty("Left"));

    }
    /**varify OdeoMeter Reading */
    public void varifyOdeometerReading () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(OdometerReading);
        Assert.assertTrue(OdometerReading.isDisplayed());
        System.out.println("Odometer Reading :"+OdometerReading);

    }

   /**click On Done /Validate*/
   public void clickOnDoneAndValidate () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_DoneAndValidate);
       WebElementActions.getActions().clickElement(btn_DoneAndValidate);


   }
   /**click On Breakes*/
   public void clickOnBreaks () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Breaks);
       WebElementActions.getActions().clickElement(Breaks);

   }
  /**click On Fluids Tab*/
  public void clickOnFluids () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Fluids);
      WebElementActions.getActions().clickElement(Fluids);


  }
  /**click On Lights*/
  public void clickOnLights () throws InterruptedException {

      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Lights);
      WebElementActions.getActions().clickElement(Lights);

  }
  /**click On Defect Summary*/
  public void clickOnDefectSummary () throws InterruptedException {

      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(DefectSummary);
      WebElementActions.getActions().clickElement(DefectSummary);

  }
 /**varify Defect Summary*/
 public void varifyDefectSummary () throws InterruptedException {
     WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DefectSummarySign);
     Assert.assertTrue(DefectSummarySign.isDisplayed());


 }
 /**click On Sign  */
 public void clickOnSign () throws InterruptedException {

     WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Sign);
     WebElementActions.getActions().clickElement(Sign);
 }

     /**varify Technician Signature*/
     public void varifyOnTechnicianSignature () throws InterruptedException {

         WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(TechnicianSignature);
         Assert.assertTrue(TechnicianSignature.isDisplayed());
         WaitActions.getWaits().loadingWait(loder);

     }

 /**Techanician Signature*/
 public void handleSignature () throws InterruptedException {

     int canvas_Width = Canvas.getSize().getWidth();
     int canvas_Height = Canvas.getSize().getHeight();
     int canvas_Center_X = canvas_Width/2;
     int canvas_Center_Y = canvas_Height/2;
     int y_Offset = (canvas_Center_Y/5)*4;
     System.out.println(canvas_Center_X);
     System.out.println(canvas_Center_Y);
     System.out.println(y_Offset);
     WaitActions.getWaits().loadingWait(loder);
     Thread.sleep(3000);
     Actions action = new Actions(driver);
     action.dragAndDropBy(Canvas, 317,100).build().perform();
     action.dragAndDropBy(Canvas, 417,100).build().perform();
     action.moveToElement(Canvas,417,100).build().perform();
     action.moveToElement(Canvas).click();
     TestListener.saveScreenshotPNG(driver);


 }
/**click On Continue*/
public void clickOnContinue () throws InterruptedException {

    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Continue);
    WebElementActions.getActions().clickElement(Continue);
    WaitActions.getWaits().loadingWait(loder);

}

/**goto Unit history */
public void  gotoUnitHistory () throws FileNotFoundException, InterruptedException {
    WaitActions.getWaits().loadingWait(loder);
    Thread.sleep(3000);
    ReusableActions.getActions().clickParentMenu("Fleet");
    ReusableActions.getActions().clickChildMenu("PM Inspection Manager");

}
/**enter the Unit Hash */
public void entertheUnit () throws InterruptedException {

    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitNo);
    WebElementActions.getActions().inputText(UnitNo,appProp.getProperty("Unit"));

}
/**click On Print */
public void clickOnPrint () throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Print);
    WebElementActions.getActions().clickElement(btn_Print);

}
/**click On more Info*/
public void clickOnMoreInfo () throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MoreInfo);
    WebElementActions.getActions().clickElement(MoreInfo);


}
    /**click On Readings */
    public void clickOnReadingsTwo () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ReadingsTwo);
        WebElementActions.getActions().clickElement(ReadingsTwo);

}

/**click On Inspect By */
public void clickOnInspectedBy () throws InterruptedException {

    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(InspectedBy);
    WebElementActions.getActions().clickElement(InspectedBy);

}
/**varify Unit Hash Value */
public void varifyOnUnitHash () throws InterruptedException {

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitValueOne);
    Assert.assertTrue(UnitValueOne.isDisplayed());

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(OdometerOne);
    Assert.assertTrue(OdometerOne.isDisplayed());

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(OdometerValue);
    Assert.assertTrue(OdometerValue.isDisplayed());
    System.out.println("Odometer Value :"+OdometerValue);

}

    /**click On Unit Value */
    public void clickOnUnit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitValueOne);
        WebElementActions.getActions().clickElement(UnitValueOne);
        WaitActions.getWaits().loadingWait(loder);
    }
/** click On Back To Inspection History*/
public void clickOnBackTOInspectionHistory () throws InterruptedException {

    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(BackTOInspectionHistory);
    WebElementActions.getActions().clickElement(BackTOInspectionHistory);
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

            if (pdfFullText.contains("Odometer Reading")) {
                System.out.println("50000 KM");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);
        }
    }

/**varify Reading Value ,UOM ,RO#*/
public void varifyReadingValue  () throws InterruptedException {

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReadingValues);
    Assert.assertTrue(ReadingValues.isDisplayed());

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Km);
    Assert.assertTrue(Km.isDisplayed());

    }
   /**clickOn Save And Exit */
       public void clickOnSaveAndExit () throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveAndExit);
    WebElementActions.getActions().clickElement(SaveAndExit);

        }
    /**click On Save /Exit*/
        public void clickOnSaveAndExitTwo () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveAndExitOne);
            WebElementActions.getActions().clickElement(SaveAndExitOne);


       }
    /**click On Tech Ro */
    public void clickOnTechRO () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(TechROOne);
        WebElementActions.getActions().clickElement(TechROOne);


    }
    /**click On Summary Tab*/
    public void clickOnSummaryTab () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Summary);
        WebElementActions.getActions().clickElement(Summary);

    }
    /**varify Odometer vamule in Summary Tab*/
    public void varifyOnOdometerValue () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(OdometerValueSummaryTab);
        Assert.assertTrue(OdometerValueSummaryTab.isDisplayed());
        System.out.println("Summsry Tab Odometer Value :"+OdometerValueSummaryTab);


    }

    /**search Referance Number */
    public void searchTheReferanceNumber () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextAreaRefe);
        WebElementActions.getActions().inputText(SearchTextAreaRefe,appProp.getProperty("Referance"));

    }
    /**click On Refresh */
    public void clickOnRefresh () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Refresh);
        WebElementActions.getActions().clickElement(Refresh);

    }

    /**click On Referance Number */
    public void clickOnReferance  () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ReferanceOne);
        WebElementActions.getActions().clickElement(ReferanceOne);

    }

    /**varify Odometer value*/
    public void varifyOdometerValue () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(OdometerROvalue);
        Assert.assertTrue(OdometerROvalue.isDisplayed());

    }


    /*click on SignOut **/
    public void clickonSignOut() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickElement(btn_signOut);
        TestListener.saveScreenshotPNG(driver);
    }

    /**click on UserName*/
    public void clickonUsername() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);

    }




      }
