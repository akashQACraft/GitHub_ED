package pages.ticket_august;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class FinanceLeaseInvoicesarenotshowingthecorrectinvoicedateBENLEA extends TestDriverActions {

    public String UnitName = WebElementActions.getActions().randomAlphaNumeric(10);
    @FindBy(xpath = "//a[contains(.,'New Unit')]/span")
    WebElement New_Unit;

    @FindBy(xpath = "//label[contains(text(),'Search and Select Unit Owner')]/parent::td/following-sibling::td/child::input")
    WebElement SearchAndSelectUnitOwner;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement btn_Select;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement label_UnitHash;

    @FindBy(xpath = "//input[contains(@id,':itEQN::content')]")
    WebElement Unit_TextArea;

    @FindBy(xpath = "//label[text()='Description:']")
    WebElement label_Description;

    @FindBy(xpath = "//input[contains(@id,':itEQD::content')]")
    WebElement description_TextArea;

    @FindBy(xpath = "//label[contains(.,'VIN #:')]")
    WebElement VIN;

    @FindBy(xpath = "//input[contains(@id,':it1::content')]")
    WebElement VIN_TextArea;

    @FindBy(xpath = "//label[text()='Year:']")
    WebElement Year;

    @FindBy(xpath = "//input[contains(@id,':it3::content')]")
    WebElement Year_TextArea;

    @FindBy(xpath = "(//img[contains(@id,':0:cilH::icon')])[1]")
    WebElement Truck_Trailer;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement btn_SelectTwo;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]/span")
    WebElement btn_SaveExit;

    @FindBy(xpath = "(//a[contains(@id,':clEquN')])[1]")
    WebElement UnitNo;

    @FindBy(xpath = "//a[contains(.,'More Info')]/span")
    WebElement MoreInfo;

    @FindBy(xpath = "(//a[contains(.,'Domicile Locations')])[1]")
    WebElement DomicileLocations;

    @FindBy(xpath = "//a[contains(.,'Add Domicile Location')]/span")
    WebElement AddDomicileLocation;

    @FindBy(xpath = "(//label[text()='Location:'])[1]")
    WebElement Location;

    @FindBy(xpath = "//span[contains(@id,':itSearchFacilitySelect')]")
    WebElement Location_Name;

    @FindBy(xpath = "(//a[contains(.,'Add')]/span)[2]")
    WebElement label_Add;
    @FindBy(xpath = "//input[contains(@id,':id12::content')]")
    WebElement EffectiveDate_TextAreaOne;

    @FindBy(xpath = "//label[contains(.,'Effective Date:')]")
    WebElement EffectiveDate;

    @FindBy(xpath = "//label[contains(.,'Effective Date:')]/parent::td/following-sibling::td/child::input")
    WebElement EffectiveDate_Textarea;


    @FindBy(xpath = "//input[contains(@id,':id12::content')]")
    WebElement EffectiveDate_TextArea;

    @FindBy(xpath = "(//a[contains(.,'Corporate Divisions')])[1]")
    WebElement CorporateDivision;

    @FindBy(xpath = "//a[contains(.,'Add')]/span")
    WebElement Add;

    @FindBy(xpath = "//label[contains(.,'Division:')]")
    WebElement label_Division;

    @FindBy(xpath = "//select[contains(@id,':soc25::content')]")
    WebElement Devision;

    @FindBy(xpath = "//label[contains(.,'Rental/Lease Type')]")
    WebElement RentalAndLeaseType;


    @FindBy(xpath = "//select[contains(@id,':soc26::content')]")
    WebElement RentalandLeaseType;


    @FindBy(xpath = "(//a[contains(.,'Save / Exit')]/span)[3]")
    WebElement btn_SaveAndExit;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')])[3]")
    WebElement Btn_SaveAndExitTwo;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]/span")
    WebElement btn_SaveAndExitFour;

    @FindBy(xpath = "(//a[contains(.,'Agreements')])[2]")
    WebElement Agreements;

    @FindBy(xpath = "(//a[contains(.,'Finance Lease')])[1]")
    WebElement FinanceLease;

    @FindBy(xpath = "//span[contains(.,'Create Finance Agreement')]")
    WebElement CreateFinanceAgreement;

    @FindBy(xpath = "//img[contains(@id,':cilV::icon')]")
    WebElement Search_Icon;

    @FindBy(xpath = "(//a[contains(.,'Select')])[1]")
    WebElement Select;

    @FindBy(xpath = "(//label[contains(.,'Finance Amount:')])[2]")
    WebElement FinanceAmout;

    @FindBy(xpath = "//label[contains(.,'Finance Amount:')]/parent::td/following-sibling::td/child::input")
    WebElement FinanceAccount_TextArea;

    @FindBy(xpath = "(//label[contains(.,'Months:')])[2]")
    WebElement Months;

    @FindBy(xpath = "//input[contains(@id,':it9::content')]")
    WebElement Month_TextArea;

    @FindBy(xpath = "(//label[contains(.,'Interest Rate:')])[2]")
    WebElement InterestRate;

    @FindBy(xpath = "//input[contains(@id,':it7::content')]")
    WebElement InterestRate_Textarea;

    @FindBy(xpath = "//span[contains(.,'Ne')]")
    WebElement Next;

    @FindBy(xpath = "//a[contains(.,'Add')]/span")
    WebElement btn_Add;

    @FindBy(xpath = "//label[contains(.,'Finance Unit:')]/preceding-sibling::span")
    WebElement Required_FinanceUnit;

    @FindBy(xpath = "//label[contains(.,'Finance Unit:')]")
    WebElement FinanceUnit;

    @FindBy(xpath = "(//a[contains(.,'Save / Exit')]/span)[2]")
    WebElement SaveAndExit;

    @FindBy(xpath = "//input[contains(@id,':it10::content')]")
    WebElement FinanceAccout_TextArea;

    @FindBy(xpath = "(//td[contains(.,'Finance Lease Agreement')])[3]")
    WebElement FinanceLeaseAgreement;

    @FindBy(xpath = "//label[contains(.,'Deferred Revenue:')]/preceding-sibling::span")
    WebElement Required_deferredRevenue;

    @FindBy(xpath = "//label[contains(.,'Deferred Revenue:')]")
    WebElement DeferredRevenue;

    @FindBy(xpath = "//select[contains(@id,':soc0::content')]")
    WebElement Defferred_Revenue;

    @FindBy(xpath = "//label[contains(.,'Interest Revenue:')]/preceding-sibling::span")
    WebElement Required_InterestRevenue;

    @FindBy(xpath = "//label[contains(.,'Interest Revenue:')]")
    WebElement interestRevenue;

    @FindBy(xpath = "//select [contains(@id,':soc1::content')]")
    WebElement InterestRevenue;

    @FindBy(xpath = "//label[contains(.,'Finance Lease Receivable:')]/preceding-sibling::span")
    WebElement Required_FinanceLeaseReceivable;

    @FindBy(xpath = "//label[contains(.,'Finance Lease Receivable:')]")
    WebElement FinanceLeaseReceivable;

    @FindBy(xpath = "//select[contains(@id,':soc5::content')]")
    WebElement FinanceLeaseReceviable_TextArea;

    @FindBy(xpath = "//label[contains(.,'Receipt Account:')]")
    WebElement ReceiptAccont;

    @FindBy(xpath = "//select[contains(@id,':soc4::content')]")
    WebElement select_ReceiptAccount;

    @FindBy(xpath = "(//a[contains(.,'Finalize')]/span)[2]")
    WebElement btn_Finalize;

    @FindBy(xpath = "(//a[contains(.,'To Be Invoiced')])[2]")
    WebElement  ToBeInvoiced;

    @FindBy(xpath = "(//a[contains(.,'Finance Lease')])[1]")
    WebElement Tab_FinanceLease;

    @FindBy(xpath = "//input[contains(@id,':idCOD::content')]")
    WebElement CuttOffDate;

    @FindBy(xpath = "//input[contains(@id,':it4::content')]")
    WebElement label_Agreements;

    @FindBy(xpath = "(//span[contains(.,'Calculate')])[1]")
    WebElement Calculate;

    @FindBy(xpath = "(//a[contains(.,'Generate Invoices')]/span)[1]")
    WebElement GenerateInvoices;

    @FindBy(xpath = "(//a[contains(.,'Generate Invoices')]/span)[2]")
    WebElement btn_GenerateInvoice;

    @FindBy(xpath = "(//a[contains(.,'Print')])[1]")
    WebElement Print;

    @FindBy(xpath = "//a[contains(.,'Close')]/span")
    WebElement Close;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;




    /**
     * go to Unit Master
     */
    public void gotoUnitMasterScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("Unit Master");
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click On New Unit
     */
    public void clickOnNewUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(New_Unit);
        WebElementActions.getActions().clickElement(New_Unit);


    }

    /**
     * enter the Owner Name
     */
    public void enterTheOwnerName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchAndSelectUnitOwner);
        WebElementActions.getActions().inputText(SearchAndSelectUnitOwner,appProp.getProperty("905"));
        SearchAndSelectUnitOwner.sendKeys(Keys.ENTER);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click On Select Button
     */
    public void clickOnSelectButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Select);
        WebElementActions.getActions().clickElement(btn_Select);

    }

    /**
     * varify Unit Name
     */
    public void varifyUnitName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_UnitHash);
        Assert.assertTrue(label_UnitHash.isDisplayed());
    }

    /**
     * enter the random Unit Nnumber
     */
    public void enterTheRandomUnitNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Unit_TextArea);
        WebElementActions.getActions().inputText(Unit_TextArea, UnitName);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify Descrition
     */
    public void varifyDescription() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Description);
        Assert.assertTrue(label_Description.isDisplayed());

    }

    /**
     * enter the random Description name
     */
    public void enterTheRandomDescription() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(description_TextArea);
        WebElementActions.getActions().inputText(description_TextArea, UnitName);


    }

    /**
     * varify VIN hash
     */
    public void varifyVIN() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(VIN);
        Assert.assertTrue(VIN.isDisplayed());
    }

    /**
     * enter The VIN Number
     */
    public void varifyVINNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(VIN_TextArea);
        WebElementActions.getActions().inputText(VIN_TextArea, appProp.getProperty("VIN"));
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify year
     */
    public void varifyYear() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Year);
        Assert.assertTrue(Year.isDisplayed());

    }

    /**
     * enter The Year
     */
    public void enterTheYear() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Year_TextArea);
        WebElementActions.getActions().inputText(Year_TextArea, appProp.getProperty("Year"));
    }

    /**
     * click On Tack and Trailer
     */
    public void TrackandTrailer() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Truck_Trailer);
        WebElementActions.getActions().clickElement(Truck_Trailer);

    }

    /**
     * click On Select
     */
    public void clickOnSelect() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SelectTwo);
        WebElementActions.getActions().clickElement(btn_SelectTwo);

    }

    /**
     * click And save /Exit
     */
    public void clickOnSaveAndExit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveExit);
        WebElementActions.getActions().clickElement(btn_SaveExit);


    }

    /**
     * click On Unit Number
     */
    public void clickOnUnitNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitNo);
        WebElementActions.getActions().clickElement(UnitNo);
        //  WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * click On More info
     */
    public void clickOnMoreInfo() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MoreInfo);
        WebElementActions.getActions().clickElement(MoreInfo);

    }

    /**
     * click On domicile Location
     */
    public void clickOnDomicileLocation() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(DomicileLocations);
        WebElementActions.getActions().clickElement(DomicileLocations);

    }

    /**
     * click On Add DomicileLocation
     */
    public void clickOnAddDomicileLocation() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(AddDomicileLocation);
        WebElementActions.getActions().clickElement(AddDomicileLocation);

    }

    /**
     * varify Location
     */
    public void varifyLocation() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());
    }

    /**
     * enter the Location Value
     */
    public void enterTheLocationValue() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Location_Name);
        WebElementActions.getActions().inputText(Location_Name, appProp.getProperty("905"));
        Location_Name.sendKeys(Keys.ENTER);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify Effective Date  Text
     */
    public void varifyeffectiveDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(EffectiveDate);
        Assert.assertTrue(EffectiveDate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);


    }
    /**enter The EffectiveDate */
    public  void enterTheEffective () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(EffectiveDate_Textarea);
        WebElementActions.getActions().inputText(EffectiveDate_Textarea, appProp.getProperty("EffectiveDate"));
        Location_Name.sendKeys(Keys.ENTER);

    }

    /**
     * click On Add
     */
    public void clickOnAdd() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions().clickElement(label_Add);

    }

    /**
     * click On corporate Devision
     */
    public void clickOnCorporateDevision() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CorporateDivision);
        WebElementActions.getActions().clickElement(CorporateDivision);


    }


    /**
     * click On Add
     */
    public void clickOnAddCorporateDevision() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Add);
        WebElementActions.getActions().clickElement(Add);
    }

    /**
     * enter The Effective Date
     */
    public void enterTheEffectiveDate() throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(EffectiveDate_TextArea);
       WebElementActions.getActions().inputText(EffectiveDate_TextArea, appProp.getProperty("EffectiveDate"));


    }

    /**
     * varify Devision
     */
    public void varifyDevision() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Division);
        Assert.assertTrue(label_Division.isDisplayed());

    }

    /**
     * select Devision
     */
    public void selectDevision() {
        Select src = new Select(Devision);
        src.selectByVisibleText("LEASE");

    }

    /**
     * varify Rental /lease Type
     */
    public void varifyRentalandLeaseType() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RentalAndLeaseType);
        Assert.assertTrue(RentalAndLeaseType.isDisplayed());
    }

    /**
     * select Rental /Lease Type
     */
    public void selectRentalLeaseType() {
        Select str = new Select(RentalandLeaseType);
        str.selectByVisibleText("Finance Lease");

    }

    /**
     * click On Save And Exit
     */
    public void clickOnSaveAndExitTwo() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveAndExit);
        WebElementActions.getActions().clickElement(btn_SaveAndExit);

    }

    /**
     * click On Save /Exit
     */
    public void clickOnSaveAndExitThree() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Btn_SaveAndExitTwo);
        WebElementActions.getActions().clickElement(Btn_SaveAndExitTwo);
    }

    /**
     * click On Save And Exit
     */
    public void clickOnSaveAndExitFour() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveAndExitFour);
        WebElementActions.getActions().clickElement(btn_SaveAndExitFour);

    }

    /**
     * go to Rental Manager
     */
    public void gotoRentalManager() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("Rental Manager");

    }

    /**
     * click On Agreement Tab
     */
    public void clickOnAgreement() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Agreements);
        WebElementActions.getActions().clickElement(Agreements);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * Finance Lease
     */
    public void clickOnFinanceLease() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FinanceLease);
        WebElementActions.getActions().clickElement(FinanceLease);
        TestListener.saveScreenshotPNG(driver);


    }

    /**
     * click On Create Finance Agreement
     */
    public void clickOnCreateFinanceAgrement() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CreateFinanceAgreement);
        WebElementActions.getActions().clickElement(CreateFinanceAgreement);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Customer
     */
    public void clickOnCusromerIcon() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Search_Icon);
        WebElementActions.getActions().clickElement(Search_Icon);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click On Select
     */
    public void clickOnSelectCustomer() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Select);
        WebElementActions.getActions().clickElement(Select);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify Finance Account
     */
    public void varifyFinanceAccount() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FinanceAmout);
        Assert.assertTrue(FinanceAmout.isDisplayed());


    }

    /**
     * enter The Finance Account
     */
    public void enterFinanceAccount() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FinanceAccount_TextArea);
        WebElementActions.getActions().inputText(FinanceAccount_TextArea, appProp.getProperty("FinanceAccount"));
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify Month Text
     */
    public void varifyMonthText() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Months);
        Assert.assertTrue(Months.isDisplayed());


    }

    /**
     * enter The Month
     */
    public void enterTheMonth() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Month_TextArea);
        WebElementActions.getActions().inputText(Month_TextArea, appProp.getProperty("Months"));
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * varify Interest Rate :
     */
    public void varifyInterestRate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(InterestRate);
        Assert.assertTrue(InterestRate.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * enter The Interest Rate TextArea
     */
    public void enterTheIntrestRateTextArea() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(InterestRate_Textarea);
        WebElementActions.getActions().inputText(InterestRate_Textarea, appProp.getProperty("InterestRate"));
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click On Next Button
     */
    public void clickOnNextButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Next);
        WebElementActions.getActions().clickElement(Next);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click On Add button
     */
    public void clickOnAddButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Add);
        WebElementActions.getActions().clickElement(btn_Add);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify Finance Unit
     */
    public void FinanceUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_FinanceUnit);
        Assert.assertTrue(Required_FinanceUnit.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FinanceUnit);
        Assert.assertTrue(FinanceUnit.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click On Save /Exit
     */
    public void clickOnSaveAndExitfour() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveAndExit);
        WebElementActions.getActions().clickElement(SaveAndExit);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * enter The Finance Amount
     */
    public void enterTheFinanceAmount() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FinanceAccout_TextArea);
        WebElementActions.getActions().inputText(FinanceAccout_TextArea,UnitName);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * varify  Finance Lease Agreement title
     */
    public void varifyFinanceLeaseAgreement() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FinanceLeaseAgreement);
        Assert.assertTrue(FinanceLeaseAgreement.isDisplayed());


    }

    /**
     * varify Required Deferred Revenue*/
    public void RequiredDfferedRevance() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_deferredRevenue);
        Assert.assertTrue(Required_deferredRevenue.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DeferredRevenue);
        Assert.assertTrue(DeferredRevenue.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * select Deferred Revenue
     */
    public void selectDeferredRevenue() {
        Select obj = new Select(Defferred_Revenue);
        obj.selectByVisibleText("6167 - Tax 7%");

    }
    /**varify  Required Intrest Revenue ad Intrest Revenue  */
    public void varifyIntrestRevenue () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_InterestRevenue);
        Assert.assertTrue(Required_InterestRevenue.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(interestRevenue);
        Assert.assertTrue(interestRevenue.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    /** select Intreset Revenue*/
    public void selectIntrestRevenue () {
        Select src = new Select(InterestRevenue);
        src.selectByVisibleText("6167 - Tax 7%");
        TestListener.saveScreenshotPNG(driver);

    }
    /**varify Required FinanceLeaseReceivable */
    public void varifyFinanceLeaseReceivable () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Required_FinanceLeaseReceivable);
        Assert.assertTrue(Required_FinanceLeaseReceivable.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FinanceLeaseReceivable);
        Assert.assertTrue(FinanceLeaseReceivable.isDisplayed());

        TestListener.saveScreenshotPNG(driver);

    }
    /** select FinanceLease Receivable */
    public void selectFinanceLeaseRecceivable () {
        Select str = new Select(FinanceLeaseReceviable_TextArea);
        str.selectByVisibleText("6167 - Tax 7%");
        TestListener.saveScreenshotPNG(driver);


    }
    /** varify Receipt Accont*/
    public void varifyReceiptAccount () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReceiptAccont);
        Assert.assertTrue(ReceiptAccont.isDisplayed());
        TestListener.saveScreenshotPNG(driver);

    }
    /**select Receipt Account */
    public void ReceiptAccount () {
        Select Acc =new Select(select_ReceiptAccount);
        Acc.selectByVisibleText("6167 - Tax 7%");
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Finalize button */
    public void clickOnFinalize  () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Finalize);
        WebElementActions.getActions().clickElement(btn_Finalize);
        TestListener.saveScreenshotPNG(driver);
    }
    /**click On To Be invoiced*/
    public void clickOnTOBeInvoiced () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(ToBeInvoiced);
        WebElementActions.getActions().clickElement(ToBeInvoiced);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click On Tab_FinanceLease*/
    public void clickOnTabFinanceLease () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Tab_FinanceLease);
        WebElementActions.getActions().clickElement(Tab_FinanceLease);
        TestListener.saveScreenshotPNG(driver);

    }
    /**enter cut of date */
    public void  enterCutOfDate () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CuttOffDate);
        WebElementActions.getActions().inputText(CuttOffDate, appProp.getProperty("CuttOffDate"));
        TestListener.saveScreenshotPNG(driver);

    }
   /**enter the Agreement #*/
   public void enterTheAgreement () throws InterruptedException {
//       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Agreements);
//       WebElementActions.getActions().inputText(label_Agreements,appProp.getProperty(""));
//       TestListener.saveScreenshotPNG(driver);
       WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_Agreements);
       System.out.println("Todays date is :"+ReusableActions.todaysdate());
       Assert.assertTrue(label_Agreements.isDisplayed());
       TestListener.saveScreenshotPNG(driver);

   }
   /**click On Calculate*/
   public void clickOnCalulate () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Calculate);
       WebElementActions.getActions().clickElement(Calculate);
       TestListener.saveScreenshotPNG(driver);

   }
   /**click on Generate Invoice */
   public void clickOnGenerateinvoice () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GenerateInvoices);
       WebElementActions.getActions().clickElement(GenerateInvoices);
       TestListener.saveScreenshotPNG(driver);


   }
    /**click On GenerateinvoiceButton */
    public void clickOnGenerateinvoiceButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GenerateInvoice);
        WebElementActions.getActions().clickElement(btn_GenerateInvoice);
        TestListener.saveScreenshotPNG(driver);

    }
   /**click On Print */
   public void clickOnPrint () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Print);
       WebElementActions.getActions().clickElement(Print);
       TestListener.saveScreenshotPNG(driver);

   }
    /**click On close */
    public void clickOnclose () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Close);
        WebElementActions.getActions().clickElement(Close);
        TestListener.saveScreenshotPNG(driver);

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
