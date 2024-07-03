package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class MakeandModelsbecominginactive extends TestDriverActions {

  @FindBy(xpath = "(//a[contains(text(),'Equipment')])[3]")
  WebElement Equipment;

  @FindBy(xpath = "(//a[contains(text(),'Make & Model')])[1]")
  WebElement MakeandModel;

  @FindBy(xpath = "//h1[text()='Makes']")
  WebElement Makes;

  @FindBy(xpath = "//h1[contains(.,'Models:')]")
  WebElement ModelsValue;

  @FindBy(xpath = "//input[contains(@id,':sbc8::content')]")
  WebElement ActiveOrInactive;

  @FindBy(xpath = "//input[contains(@id,':sbc11::content')]")
  WebElement clickOrUnclick;

  @FindBy(xpath = "(//a[contains(text(),'Features & Values')])[1]")
  WebElement FeaturesandValues;

  @FindBy(xpath = "//input[contains(@id,':sbc9::content')]")
  WebElement crane;

  @FindBy(xpath = "(//a[contains(text(),'Maintenance Groups')])[1]")
  WebElement MaintenanceGroup;

  @FindBy(xpath = "//input[contains(@id,':sbc5::content')]")
  WebElement MaintenceGroupclick;

  @FindBy(xpath = "(//a[contains(text(),'Parts')])[2]")
  WebElement Part;

  @FindBy(xpath = "//input[contains(@id,':sbc1::content')]")
  WebElement PartsClick;

  @FindBy(xpath = "(//a[contains(@id,':clEquN')])[1]")
  WebElement UnitNo;

  @FindBy(xpath = "//span[text()='More Info']")
  WebElement MoreInfo;

  @FindBy(xpath = "(//a[contains(text(),'Features')])[1]")
  WebElement Features;

  @FindBy(xpath = "//span[text()='Add Features']")
  WebElement AddFeatures;

  @FindBy(xpath = "(//span[contains(@id,'sbc1::content')]/child::span/child::img)[1]")
  WebElement Features_Status;

  @FindBy(xpath = "//td[contains(@id,':t2:0:c5')]")
  WebElement FeaturesValueStaus;

  @FindBy(xpath = "(//a[contains(.,'OK')])[2]")
  WebElement Ok;

  @FindBy(xpath = "(//span[text()='Save / Exit'])[2]")
  WebElement SaveExit;

  @FindBy(xpath = "(//span[text()='Save / Exit'])[1]")
  WebElement SaveExit1;


  @FindBy(xpath = "//a[contains(.,'Sign Out')]")
  WebElement btn_signOut;

  @FindBy(xpath = "//input[@name='username']")
  public WebElement inputbox_Username;

  @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
  List<WebElement> loder;


  /*go to Corporate Setup Manager **/
  public void gotoCorporateSetUpManager() throws FileNotFoundException, InterruptedException {
    ReusableActions.getActions().clickParentMenu("Administration");
    ReusableActions.getActions().clickChildMenu("Standard Codes");

  }

  /*click on Equipment **/
  public void clickOnEquipment() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Equipment);
    WebElementActions.getActions().clickElement(Equipment);


  }

  /*click On MakeAndModel **/
  public void clickOnMakeAndModel() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MakeandModel);
    WebElementActions.getActions().clickElement(MakeandModel);

  }

  /*verify Makes and verify makes values Active or DeActive  **/
  public void verifyMakes() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Makes);
    Assert.assertTrue(Makes.isDisplayed());

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ModelsValue);
    Assert.assertTrue(ModelsValue.isDisplayed());

  }

  /*click on MakesActiveORDeActive **/
  public void clickOnMakesActiveORDeActive() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ActiveOrInactive);
    WebElementActions.getActions().clickElement(ActiveOrInactive);
    WaitActions.getWaits().loadingWait(loder);

  }

  /*click on ModelesValues **/
  public void clickOnModeles() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(clickOrUnclick);
    WebElementActions.getActions().clickElement(clickOrUnclick);

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(clickOrUnclick);
    Assert.assertTrue(clickOrUnclick.isDisplayed());

  }

  /*click On Features Value **/
  public void clickOnFeatureValues() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FeaturesandValues);
    WebElementActions.getActions().clickElement(FeaturesandValues);


  }

  /*select & verify Features Code ActiveOrDeActive **/
  public void selectFeaturesCodeActiveOrDeActive() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(crane);
    WebElementActions.getActions().clickElement(crane);

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(crane);
    Assert.assertTrue(crane.isDisplayed());


  }

  /*click On Maintance Group **/
  public void clickOnMaintanceGroup() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MaintenanceGroup);
    WebElementActions.getActions().clickElement(MaintenanceGroup);
    WaitActions.getWaits().loadingWait(loder);

  }

  /*select Maintance Group active/deactive**/
  public void selectMaintanceGroupActiveOrDeActive() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MaintenceGroupclick);
    WebElementActions.getActions().clickElement(MaintenceGroupclick);
    WaitActions.getWaits().loadingWait(loder);
  }

  /*click On Parts **/
  public void clickOnParts() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Part);
    WebElementActions.getActions().clickElement(Part);

  }

  /*select Product Group  Active/DeActive  **/
  public void selectproductGroup() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PartsClick);
    WebElementActions.getActions().clickElement(PartsClick);

  }

  /*click On Unit Master **/
  public void gotoApManager() throws FileNotFoundException, InterruptedException {
    ReusableActions.getActions().clickParentMenu("Fleet");
    ReusableActions.getActions().clickChildMenu("Unit Master");

  }

  /*click on Unit **/
  public void clickOnUnit() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitNo);
    WebElementActions.getActions().clickElement(UnitNo);
    WaitActions.getWaits().loadingWait(loder);

  }

  /*click On moreInfo **/
  public void clickOnMoreinfo() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MoreInfo);
    WebElementActions.getActions().clickElement(MoreInfo);

  }

  /*click On Features **/
  public void clickOnFeatures() throws InterruptedException {

    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Features);
    WebElementActions.getActions().clickElement(Features);

  }

  /*click On Add Features **/
  public void clickOnAddFeatures() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddFeatures);
    WebElementActions.getActions().clickElement(AddFeatures);


  }

  /*verify On Features **/
  public void verifyFeatures() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Features_Status);
    Assert.assertTrue(Features_Status.isDisplayed());

    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FeaturesValueStaus);
    Assert.assertTrue(FeaturesValueStaus.isDisplayed());


  }

  /*click On Ok **/
  public void clickOnOk() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Ok);
    WebElementActions.getActions().clickElement(Ok);
  }

  /*click on Save/Exit **/
  public void clickOnSaveOrExit() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveExit);
    WebElementActions.getActions().clickElement(SaveExit);

  }

  /*click On Save Exit **/
  public void clickOnSaveORExit2() throws InterruptedException {
    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveExit1);
    WebElementActions.getActions().clickElement(SaveExit1);

  }

  /**click on sign out button
   verify username
   */
  public void clickOnSignOut() throws InterruptedException {

    WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
   // Thread.sleep(3000);
    WebElementActions.getActions().clickElement(btn_signOut);


    WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
    Assert.assertTrue(inputbox_Username.isDisplayed());

    TestListener.saveScreenshotPNG(driver);
  }

}
