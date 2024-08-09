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
import java.util.ArrayList;
import java.util.List;

public class QuantumFinancialExportIsShowingaPSTvalueForInvoices extends TestDriverActions {

    public static String firstValue;
    @FindBy(xpath = "//span[contains(.,'Corporate Setup Manager')]")
    WebElement label_CorporateSetUpManaer;

    @FindBy(xpath = "//label[contains(.,'Name:')]/preceding-sibling::span")
    WebElement RequiredName;

    @FindBy(xpath = "(//label[contains(.,'Name:')])[1]")
    WebElement label_Name;

    @FindBy(xpath = "//input[contains(@id,'it2::content')]")
    WebElement Name_TextArea;

    @FindBy(xpath = "//h2[contains(.,'AR Tax Registration')]")
    WebElement AirTaxRegistration;

    @FindBy(xpath = "(//input[contains(@id,':it21::content')])[1]")
    WebElement GST_rate;

    @FindBy(xpath = "(//label[text()='TaxRate (Required)']/preceding-sibling::input)[2]")
//   @FindBy(xpath = "//input[contains(@id,':1:it21::content')]")
    WebElement PST_rate;

    @FindBy(xpath = "//input[contains(@id,':1:it21::content')]/parent::span/parent::span/parent::td")
    WebElement Rate_Past;

    @FindBy(xpath = "//a[contains(.,'New RO')]/child::span")
    WebElement NewRO;

    @FindBy(xpath = "//a[contains(.,'WO002598')]")
    WebElement Referance;

    @FindBy(xpath = "//label[contains(.,'Search Unit:')]/preceding-sibling::input")
    WebElement SearchUnit_TextArea;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement Select;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    WebElement label_VMRS;

    @FindBy(xpath = "//label[contains(.,'Search:')]/parent::td/following-sibling::td/child::input")
    WebElement Search_TextArea;

    @FindBy(xpath = "//img[@title='Clutch']")
    WebElement img_Clutch;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    WebElement label_Add;

    @FindBy(xpath = "//input[contains(@id,':ittActChargeHours::content')]")
    WebElement ChargeHours;

    @FindBy(xpath = "//span[text()='Add']")
    WebElement label_AddButton;

    @FindBy(xpath = "//label[text()='Tax:']")
    WebElement label_Tax;

    @FindBy(xpath = "//a[contains(@id,':clWoTax')]/child::span/span")
    WebElement Tax_Value;

    @FindBy(xpath = "//span[contains(text(),'GST')]")
    WebElement label_GST;

    @FindBy(xpath = "//a[contains(@id,':0:cl3')]")
    WebElement GST_value;

    @FindBy(xpath = "//span[text()='PST']")
    WebElement label_PST;

    @FindBy(xpath = "//a[contains(@id,':ttax:3:cl3')]")
    WebElement PST;

    @FindBy(xpath = "(//div[contains(@id,':pgl18')])[4]")
    WebElement Rate_PST;

    @FindBy(xpath = "(//span[text()='Close'])[2]")
    WebElement CLose;

    @FindBy(xpath = "(//a[contains(text(),'Corporate Setup Manager')])[1]")
    WebElement label_CorporateSetUpManager;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**
     * go to Corporate Set Up Manager
     */
    public void gotoCorporateSetupManager() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Administration");
        ReusableActions.getActions().clickChildMenu("Corporate Setup Manager");
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * varify On Corporate Set Up Manaer
     */
    public void varifyOnCorPorateSetupManager() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_CorporateSetUpManaer);
        Assert.assertTrue(label_CorporateSetUpManaer.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredName);
        Assert.assertTrue(RequiredName.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Name);
        Assert.assertTrue(label_Name.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Name_TextArea);
        Assert.assertTrue(Name_TextArea.isDisplayed());

        WaitActions.getWaits().loadingWait(loder);


    }

    /**
     * varify Air Tax Registration
     */
    public void varifyAirTaxRegistration() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AirTaxRegistration);
        Assert.assertTrue(AirTaxRegistration.isDisplayed());


    }

    /**
     * Enter GST Rate 0.000
     **/
    public void enterGSTrate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GST_rate);
        WebElementActions.getActions().inputText(GST_rate, appProp.getProperty("GST"));

    }

    /**
     * varify GST rate
     */
    public void varifyGSTrate() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(GST_rate);
        Assert.assertTrue(GST_rate.isDisplayed());

    }

    /**
     * enter PST Rate 0.000
     */
    public void enterPSTrate() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PST_rate);
        WebElementActions.getActions().inputText(PST_rate,appProp.getProperty("PST"));

        System.out.println("enter the imput value"+PST_rate.getText());

    }

    /**
     * varify PST rate
     */
    public void varifyPSTrate() throws InterruptedException {
          Thread.sleep(3000);
        firstValue = String.valueOf(0.0000);
        PST_rate.sendKeys(firstValue);

        System.out.println("String value : " + firstValue);




    }

    /**
     * go to complete ro screen
     */
    public void gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
    }

    /**
     * click on New Ro
     */
    public void clickOnNewRo() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NewRO);
        WebElementActions.getActions().clickElement(NewRO);


        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * enter the Search Unit
     */
    public void enterTheSearchUnit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchUnit_TextArea);
        WebElementActions.getActions().inputText(SearchUnit_TextArea, appProp.getProperty("Unit"));

    }

    /**
     * click On Select Button
     */
    public void clickOnSelect() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Select);
        WebElementActions.getActions().clickElement(Select);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Add Labour
     */
    public void clickOnAddLabor() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddLabor);
        WebElementActions.getActions().clickElement(label_AddLabor);


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_VMRS);
        WebElementActions.getActions().clickElement(label_VMRS);

    }

    /**
     * Search Labour
     */
    public void seachOnLabour() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Search_TextArea);
        WebElementActions.getActions().inputText(Search_TextArea, appProp.getProperty("Clutch"));

    }

    /**
     * click on clutch image
     */
    public void clickOnimage() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(img_Clutch);
        WebElementActions.getActions().clickElement(img_Clutch);
    }

    /**
     * clickOn plusIcon
     */
    public void clickOnPlusIcon() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Add);
        WebElementActions.getActions().clickElement(label_Add);
    }

    /**
     * click On Add Button
     */
    public void clickOnAdd() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_AddButton);
        WebElementActions.getActions().clickElement(label_AddButton);

    }

    /**
     * varify Tax Text
     */
    public void varifyTaxText() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Tax);
        Assert.assertTrue(label_Tax.isDisplayed());

    }

    /**
     * click on Tax value
     */
    public void clickOnTaxValue() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Tax_Value);
        WebElementActions.getActions().clickElement(Tax_Value);

    }

    /**
     * varify GST
     */
    public void varifyOnGST() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_GST);
        Assert.assertTrue(label_GST.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(GST_value);
        Assert.assertTrue(GST_value.isDisplayed());

    }

    /**
     * varify On PST
     */
    public void varifyOnPST() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_PST);
        Assert.assertTrue(label_PST.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Rate_PST);
        Assert.assertTrue(Rate_PST.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PST);
        Assert.assertTrue(PST.isDisplayed());
        System.out.println("PST rate value after Add labour");

        WaitActions.getWaits().loadingWait(loder);
    }




    /**
     * Compare TWo element
     */
    public void compareTwoElement() throws InterruptedException {
        String secondValue = Rate_PST.getText();
        System.out.println("Enter the Second value :"+Rate_PST.getText());

        if (firstValue.equals(secondValue)) {

        }else {
            System.out.println("The values are the same ");
        }



    }
          /**click On Close */
          public void clickOnClose () throws InterruptedException {
              WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CLose);
              WebElementActions.getActions().clickElement(CLose);
              WaitActions.getWaits().loadingWait(loder);

          }

    /**click On Corporate SetUP Manager*/
    public void clickOnCorporateSetupManager () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_CorporateSetUpManager);
        WebElementActions.getActions().clickElement(label_CorporateSetUpManager);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**enter the PST rate Value*/
    public void enterThePSTrateValue () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PST_rate);
        WebElementActions.getActions().inputText(PST_rate,appProp.getProperty("PSTrateValue"));
        WaitActions.getWaits().loadingWait(loder);

    }
    /**varify PST Rate Value */
    public void varifyPSTrateValue () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PST_rate);
        Assert.assertTrue(PST_rate.isDisplayed());

    }
    /**
     * varify PST rate
     */
    public void varifyPSTrateTwo() throws InterruptedException {
        Thread.sleep(3000);
        firstValue = String.valueOf(7.0000);
        PST_rate.sendKeys(firstValue);

        System.out.println("String value : " + firstValue);




    }



    /**enter Charge Hours*/
    public void enterTheChargeHours () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ChargeHours);
        WebElementActions.getActions().inputText(ChargeHours,appProp.getProperty("ChargeHoursValue"));
        ChargeHours.sendKeys(Keys.ENTER);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Sign Out */

    public void clickOnSignOut () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_SignOut);
        WebElementActions.getActions().clickUsingJS(label_SignOut);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on UserName */
    public void clickOnUsername () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UserName);
        WebElementActions.getActions().clickElement(label_UserName);

    }


}
