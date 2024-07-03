package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class PMInspectionReading extends TestDriverActions {


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

    @FindBy(xpath = "//a[contains(.,'Ne')]/child::span")
    WebElement Next;

    @FindBy(xpath = "//a[contains(.,'Add New Section')]/span")
    WebElement  AddNewSection;

    @FindBy(xpath = " //td[contains(@id,':AddInsAreaDialog::tb')]/div")
    WebElement InspectionReportSection;





    /**
     * go to completeRO
     */
    public void gotoCompleteRO() throws FileNotFoundException, InterruptedException {
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
        WebElementActions.getActions().inputText(Code_TextArea, appProp.getProperty("Unit"));

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
        WebElementActions.getActions().inputText(TitalTextArea,appProp.getProperty("Tital"));

    }
    /**click On Next Button*/
    public void clickOnNext () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Next);
        WebElementActions.getActions().clickElement(Next);


    }
    /*click On Add New Section**/
    public void clickOnAddNewSection () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddNewSection);
        WebElementActions.getActions().clickElement(AddNewSection);

    }

}