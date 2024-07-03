package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class TheServiceBoardrefreshesandlosestheusersposition extends TestDriverActions {

    @FindBy(xpath = "//a[contains(@id,':4:clEquN')]/span")
    WebElement UnitNumber;

    @FindBy(xpath = "//a[contains(@id,':4:clWRQ01')]/span")
    WebElement DVIR;

   @FindBy(xpath = "//h1[contains(text(),'Work Required')]")
    WebElement WorkRequired;

   @FindBy(xpath = "//a[contains(., 'More Work ...')]")
    WebElement MoreWork;

   @FindBy(xpath = "//span[contains(text(),'Air Disc Brakes')]")
   WebElement AirDiscBreak;

   @FindBy(xpath = "//span[text()='Close']")
    WebElement  Close;

   @FindBy(xpath = "//h1[contains(.,'Arrivals')]")
   WebElement Arrials;


    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement label_VMRS;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    WebElement label_AccessoriesGroup;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
   WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement label_AddButton;

    @FindBy(xpath = "//a[@title='Aerodynamic Devices']/img")
    WebElement AerodynamicDevices;


    @FindBy(xpath = "//a[@title='Automatic/Manual Chassis Lubricator']/img")
    WebElement AutomaticAndManualChassis;

    @FindBy(xpath = "//a[contains(@id,':1:citWRD1')]")
    WebElement img_CloseOne;


    @FindBy(xpath = "//a[contains(@id,':2:citWRD1')]")
    WebElement img_CloseTwo;

    @FindBy(xpath = "//a[contains(@id,':3:citWRD1')]")
    WebElement img_CloseThree;

    @FindBy(xpath = "//img[contains(@id,':trashButtonVmrserreq:dc_cil1::icon')]")
    WebElement img_Trash;


    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;



    /*go to service Board **/
    public void gotoserviceBoard () throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Service Board");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }
     /*verify Unit Number and Wrok Required **/
      public void verifyUnitNumber () throws InterruptedException {
          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitNumber);
          Assert.assertTrue(UnitNumber.isDisplayed());

          WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DVIR);
          Assert.assertTrue(DVIR.isDisplayed());

      }
      /*click on Work Required**/
    public void clickOnDIVR () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(DVIR);
        WebElementActions.getActions().clickElement(DVIR);

    }
    /*verify Work Required **/
    public void verifyOnWorkRequired() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(WorkRequired);
        Assert.assertTrue(WorkRequired.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(MoreWork);
        Assert.assertTrue(MoreWork.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AirDiscBreak);
        Assert.assertTrue(AirDiscBreak.isDisplayed());
    }
     /*click On Clse Button**/
    public void clickOnClose () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Close);
        WebElementActions.getActions().clickElement(Close);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*varify Arrials**/
    public void varifyOnArrials () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Arrials);
        Assert.assertTrue(Arrials.isDisplayed());

    }
    /*click On More Work **/
    public void clickOnMoreWork () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MoreWork);
        WebElementActions.getActions().clickElement(MoreWork);
    }
    /*click On VMRS **/
    public void clickOnVMRS () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_VMRS);
        WebElementActions.getActions().clickElement(label_VMRS);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*click On Acessories Group **/
    public void  clickOnAcessoriesGroup () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AccessoriesGroup);
        WebElementActions.getActions().clickElement(label_AccessoriesGroup);

    }
    /*click on Plus Icon**/
    public void  clickOnPlusIcon () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions().clickElement(label_Add);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*click On Add button **/
    public void clickOnAddbutton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddButton);
        WebElementActions.getActions().clickElement(label_AddButton);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*click On Arodyanamic Device**/
    public void clickOnArodyanamicDevice () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AerodynamicDevices);
        WebElementActions.getActions().clickElement(AerodynamicDevices);
        WaitActions.getWaits().loadingWait(loder);


    }
   /*click Automatic and Manual Chassis**/
    public void clickOnAutomaticAndManualChassis () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AutomaticAndManualChassis);
        WebElementActions.getActions().clickElement(AutomaticAndManualChassis);

    }
   /*click On Close_One **/
    public  void  clickOnCloseOne() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_CloseOne);
        WebElementActions.getActions().clickElement(img_CloseOne);

    }
    /*click On close_Two**/
    public void clickOnCloseTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_CloseTwo);
        WebElementActions.getActions().clickElement(img_CloseTwo);

    }
    /*click On close_Three**/
    public void clickOnCloseThree () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_CloseThree);
        WebElementActions.getActions().clickElement(img_CloseThree);
      //  Thread.sleep(3000);
        WaitActions.getWaits().loadingWait(loder);

    }
  /*click On Delete **/
    public void clickOnDelete () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(img_Trash);
        WebElementActions.getActions().clickElement(img_Trash);

    }
   /**click On Close*/
   public void clickOnClick2 () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Close);
       WebElementActions.getActions().clickElement(Close);
      // Close.sendKeys(Keys.ENTER);
       WaitActions.getWaits().loadingWait(loder);

   }
    public void clickOnSignOut() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_signOut);
        WebElementActions.getActions().clickUsingJS(btn_signOut);
        TestListener.saveScreenshotPNG(driver);

    }

    /**click on UserName*/
    public void clickOnUsername() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);

    }



}
