package pages.ticket_july;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

public class DispatchGLMappingExceptionError extends TestDriverActions {

    @FindBy(xpath = "(//a[contains(.,'Dispatch')])[2]")
    WebElement  Dispatch;

    @FindBy(xpath = "(//a[contains(.,'Billing Codes')])[1]")
    WebElement BillingCodes;

    @FindBy(xpath = "//a[contains(.,'TESTCODE')]/parent::span/parent::td/following-sibling::td[3]/child::span/table//a/child::img")
    WebElement CrossIcon;

    @FindBy(xpath = "(//img[contains(@id,':citrash::icon')])[1]")
    WebElement Trash_Delete;
    @FindBy(xpath = "//span[contains(.,'Add Billing Code')]")
    WebElement AddBillingCode;

    @FindBy(xpath = "(//td[contains(.,'Add Billing Code')]/child::div)[3]")
    WebElement AddBillingCode_Tital;

    @FindBy(xpath = "//label[contains(.,'Code:')]/preceding-sibling::span")
    WebElement Required_Code;

    @FindBy(xpath = "(//label[contains(.,'Code:')])[1]")
    WebElement label_Code;

    @FindBy(xpath = "//label[contains(.,'Code: (Required)')]/preceding-sibling::input")
    WebElement Code_TextArea;

    @FindBy(xpath = "//label[contains(.,'Description:')]/preceding-sibling::span")
    WebElement Required_Description;

    @FindBy(xpath = "//label[contains(.,'Description:')]")
    WebElement Description;

    @FindBy(xpath = "//input[contains(@id,':it3::content')]")
    WebElement Description_TextArea;

    @FindBy(xpath = "//a[contains(.,'Save/Exit')]")
    WebElement btn_SaveExit;

    @FindBy(xpath = "//a[contains(.,'TESTCODE')]/parent::span/parent::td/parent::tr")
    WebElement TestCode;

   @FindBy(xpath = "(//a[contains(.,'GL Mapping')])[2]")
    WebElement GLMapping;

   @FindBy(xpath = "(//a[contains(.,'Dispatch')])[1]")
    WebElement Dispatch_Gl;

   @FindBy(xpath = "//a[contains(.,'Add Billing Code Mappings')]")
    WebElement BillingCodeMapping;

   @FindBy(xpath = "//label[contains(.,'Location:')]")
    WebElement Location;

   @FindBy(xpath = "(//label[contains(.,'Location:')]/following::td[1])[1]")
    WebElement LocationValue;

   @FindBy(xpath = "//label[contains(.,'Billing Code:')]/preceding-sibling::span")
    WebElement BillingCode;

   @FindBy(xpath = "//label[contains(.,'Billing Code:')]")
    WebElement BillingCode_Gl;

   @FindBy(xpath = "//select[contains(@id,':soc1::content')]")
    WebElement Billing_code;

  @FindBy(xpath = "//label[contains(.,'Division:')]/preceding-sibling::span")
  WebElement Requird_Division;

  @FindBy(xpath = "//label[contains(.,'Division:')]")
  WebElement   Division;

  @FindBy(xpath = "//select[contains(@id,':soc4::content')]")
  WebElement Division_Select;

  @FindBy(xpath = "//label[contains(.,'Account Number:')]/preceding-sibling::span")
  WebElement Required_AccountNumber;

  @FindBy(xpath = "//label[contains(.,'Account Number:')]")
  WebElement AccountNumber;

  @FindBy(xpath = "//select[contains(@id,':soc3::content')]")
  WebElement Account_Number;

  @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
  WebElement SaveExit;

  @FindBy(xpath = "//span[contains(.,'WIDE')]/parent::td/parent::tr")
  WebElement Wide;

  @FindBy(xpath = "(//h1[contains(.,'Mappings for location: 905 Truck and Trailer Repair')])[1]")
  WebElement MappingForLocaton;
  @FindBy(xpath = "(//img[contains(@id,':cil2::icon')])[7]")
  WebElement close_Icon;

  @FindBy(xpath = "//img[contains(@id,':cil1::icon')]")
  WebElement trashDelete;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**go to  Standard Codes */
  public void  gotoStandardCodes () throws FileNotFoundException, InterruptedException {
      ReusableActions.getActions().clickParentMenu("Administration");
      ReusableActions.getActions().clickChildMenu("Standard Codes");

  }
  /**click On Dispatch*/
  public void clickOnDispatch () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Dispatch);
      WebElementActions.getActions().clickElement(Dispatch);
      WaitActions.getWaits().loadingWait(loder);

  }

   /**click On Billing Codes*/
   public void clickOnBillingCodes () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(BillingCodes);
       WebElementActions.getActions().clickElement(BillingCodes);
       WaitActions.getWaits().loadingWait(loder);

   }
   /**click On Cross TESTCode*/
   public void clickOnDeleteGenratedTestCode () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CrossIcon);
       WebElementActions.getActions().clickElement(CrossIcon);
       WaitActions.getWaits().loadingWait(loder);

   }
   /**click On Delete*/
   public void clickOnDelete () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Trash_Delete);
       WebElementActions.getActions().clickElement(Trash_Delete);
       WaitActions.getWaits().loadingWait(loder);
   }
   /**click On Add Billing Code*/
   public void clickOnAddBillingCode () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddBillingCode);
       WebElementActions.getActions().clickElement(AddBillingCode);
       WaitActions.getWaits().loadingWait(loder);

   }
   /**varify Add Billing Code Tital */
   public void varifyOnAddBilling () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AddBillingCode_Tital);
       Assert.assertTrue(AddBillingCode_Tital.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Code);
       Assert.assertTrue(Required_Code.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Code);
       Assert.assertTrue(label_Code.isDisplayed());

       WaitActions.getWaits().loadingWait(loder);

   }
   /**Enter The Code */
   public void enterTheCode () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Code_TextArea);
       WebElementActions.getActions().clickUsingJS(Code_TextArea);
       Random randomGenerator = new Random();
       int randomInt = randomGenerator.nextInt(1000);
       Code_TextArea.sendKeys("TEST" + randomInt );


//       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Code_TextArea);
//       WebElementActions.getActions().inputText(Code_TextArea,appProp.getProperty("TESTCODE"));
   }
   /**varify Required Description ,description*/
   public void varifyOnRequiredDescription () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_Description);
       Assert.assertTrue(Required_Description.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description);
       Assert.assertTrue(Description.isDisplayed());

       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description_TextArea);
       Assert.assertTrue(Description_TextArea.isDisplayed());
   }
   /**enter the Description TextArea*/
   public void enterTheDescriptionTextArea () throws InterruptedException {

       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Description_TextArea);
       WebElementActions.getActions().clickUsingJS(Description_TextArea);
       Random randomGenerator = new Random();
       int randomInt = randomGenerator.nextInt(1000);
       Description_TextArea.sendKeys("TEST" + randomInt );

//       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description_TextArea);
//       WebElementActions.getActions().inputText(Description_TextArea,appProp.getProperty("TESTCODE"));
   }
  /**click On Save /Exit */
  public void clickOnSaveExit () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveExit);
      WebElementActions.getActions().clickElement(btn_SaveExit);
      WaitActions.getWaits().loadingWait(loder);
  }
  /**varify on Code */
  public void varifyOnCode () throws InterruptedException {

      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(TestCode);
      Assert.assertTrue(TestCode.isDisplayed());

      WaitActions.getWaits().loadingWait(loder);
  }
  /**go to Finincancial Manager*/
  public void gotoOnFinincialManager () throws FileNotFoundException, InterruptedException {
      WaitActions.getWaits().loadingWait(loder);
      Thread.sleep(3000);
      ReusableActions.getActions().clickParentMenu("Financials");
      ReusableActions.getActions().clickChildMenu("Financial Manager");


  }
  /**click On GL Mapping */
  public void clickOnGLMapping () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GLMapping);
      WebElementActions.getActions().clickElement(GLMapping);
      WaitActions.getWaits().loadingWait(loder);

  }
  /**click On Dispatch */
  public void clickOnDispatchGL () throws InterruptedException {

      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Dispatch_Gl);
      WebElementActions.getActions().clickElement(Dispatch_Gl);
      WaitActions.getWaits().loadingWait(loder);

  }
  /**click On Add Billing Code Mappings */
  public void clickOnAddBillingCodeMappings () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(BillingCodeMapping);
      WebElementActions.getActions().clickElement(BillingCodeMapping);
      WaitActions.getWaits().loadingWait(loder);


  }
  /**varify On Location, Location value*/
  public void varifyOnLocation () throws InterruptedException {

      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location);
      Assert.assertTrue(Location.isDisplayed());

      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(LocationValue);
      Assert.assertTrue(LocationValue.isDisplayed());
      WaitActions.getWaits().loadingWait(loder);

  }
  /**varify Required Billing Code ,Billing Code*/
  public void varifyOnBillingCode () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(BillingCode);
      Assert.assertTrue(BillingCode.isDisplayed());

      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(BillingCode_Gl);
      Assert.assertTrue(BillingCode_Gl.isDisplayed());
      WaitActions.getWaits().loadingWait(loder);

  }
  /**select To Billing Code Value */
  public void  selectTestCode () throws InterruptedException {

      Select obj =new Select(Billing_code);
      obj.selectByVisibleText("TEST143");
      WaitActions.getWaits().loadingWait(loder);
  }
  /**varify Required Descrition and Description */
  public void varifyOnDescription () throws InterruptedException {

      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Requird_Division);
      Assert.assertTrue(Requird_Division.isDisplayed());

      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Division);
      Assert.assertTrue(Division.isDisplayed());
  }
    /**select Division */
    public void selectDivision () throws InterruptedException {

        Select src = new Select(Division_Select);
        src.selectByVisibleText("ADMIN");
        WaitActions.getWaits().loadingWait(loder);

    }
    /**varify Required Account Number */
    public void varifyAccountNumber () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_AccountNumber);
        Assert.assertTrue(Required_AccountNumber.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AccountNumber);
        Assert.assertTrue(AccountNumber.isDisplayed());


    }
    /**select Account Number*/
    public void selectAccountNumber () throws InterruptedException {
        Select str =new Select(Account_Number);
        str.selectByVisibleText("7   Labour Revenue - Toronto");
        WaitActions.getWaits().loadingWait(loder);

    }
    /*click On Select/Exit **/
    public void clickOnSaveExitTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveExit);
        WebElementActions.getActions().clickElement(SaveExit);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**select DELIVERY*/
    public void SelectDELIVERYGL () throws InterruptedException {
    Select obj= new Select(Billing_code);
    obj.selectByVisibleText("DELIVERY");
    WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(2000);


    }
    /**select Division*/
    public void selectDivsionGL () throws InterruptedException {
        Select src=new Select (Division_Select);
        src.selectByVisibleText("PARTS");
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(3000);

    }
    /**select Parts*/
    public void selectPartsGL () throws InterruptedException {
        Select src =new Select(Account_Number);
        src.selectByVisibleText("40001   Parts");
        WaitActions.getWaits().loadingWait(loder);
        Thread.sleep(4000);

    }
  /**varify on Billing Code  */
  public void varifyForBillingCode () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Wide);
      Assert.assertTrue(Wide.isDisplayed());
      WaitActions.getWaits().loadingWait(loder);

  }
  /** varify mapping for Location*/
  public void varifymappingforLocation () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(MappingForLocaton);
      Assert.assertTrue(MappingForLocaton.isDisplayed());
      WaitActions.getWaits().loadingWait(loder);

  }
  /**click On Cross Icon */
  public void clickOnCrossIcon () throws InterruptedException {

      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(close_Icon);
      WebElementActions.getActions().clickElement(close_Icon);
      WaitActions.getWaits().loadingWait(loder);

  }
   /**click On Delete */
   public void clickOnDeleteIcon () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(trashDelete);
       WebElementActions.getActions().clickElement(trashDelete);
       WaitActions.getWaits().loadingWait(loder);
   }
    /*click On Sign Out **/
    public void clickOnSignOut () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_SignOut);
        WebElementActions.getActions().clickElement(label_SignOut);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_UserName);
        WebElementActions.getActions().clickElement(label_UserName);

    }


}
