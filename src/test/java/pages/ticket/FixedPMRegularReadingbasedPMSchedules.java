package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class FixedPMRegularReadingbasedPMSchedules extends TestDriverActions {
    @FindBy(xpath = "(//span[contains(.,'Search Unit:')]//parent::span//following::span//child::input)[1]")
    WebElement searchTextArea;

    @FindBy(xpath = "//a[contains(.,'U1128')]")
    WebElement UnitHash;

    @FindBy(xpath = "(//a[contains(.,'PM Schedule Setup')])[2]")
    WebElement PmScheduleSetup;

    @FindBy(xpath = "(//a[contains(.,'Add')])[1]")
    WebElement Add;

    @FindBy(xpath = "(//td[contains(.,'Select Customer & Maintenance Group')])[3]")
    WebElement SelectCustomerTital;

    @FindBy(xpath = "//input[contains(@id,':itSearchCustomerSelect::content')]")
    WebElement SerachCustomerSelect;

    @FindBy(xpath = "//label[contains(.,'Search Customer:')]")
    WebElement SearchCustomer;

    @FindBy(xpath = "//input[contains(@id,':it1::content')]")
    WebElement SearchCutomerTextArea;


    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_Refresh;

    @FindBy(xpath = "//h1[contains(.,'PM Schedule Setup')]")
    WebElement PMScheduleSetup;

    @FindBy(xpath = "//h2[contains(.,'Customers with PM Schedules')]")
    WebElement CustomerWithPMSchedules;

    @FindBy(xpath = "(//span[text()='Code'])[1]")
    WebElement Code;

    @FindBy(xpath = "//span[text()='Name']")
    WebElement Name;

    @FindBy(xpath = "//span[text()='905 SERVICE']")
    WebElement SERVICE;

    @FindBy(xpath = "//span[text()='REPAIR']")
    WebElement Repair;

    @FindBy(xpath = "(//span[text()='Code'])[2]")
    WebElement Code2;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement Description;

    @FindBy(xpath = "(//span[text()='Red'])[1]")
    WebElement MaintanceGroup;

    @FindBy(xpath = "//h2[contains(text(),'Maintenance Schedules')]")
    WebElement MaintenanceSchedules;

    @FindBy(xpath = "(//input[contains(@id,'sbc2::content')])[1]")
    WebElement PMA;

    @FindBy(xpath = "(//input[contains(@id,'sbc2::content')])[2]")
    WebElement PMB;

    @FindBy(xpath = "(//input[contains(@id,'sbc2::content')])[3]")
    WebElement PMC;


    @FindBy(xpath = "//h2[contains(.,'Reading Schedules')]")
    WebElement ReadingSchedules;

    @FindBy(xpath = "//h2[contains(.,'Included Services')]")
    WebElement IncludedService;

    @FindBy(xpath = "(//a[contains(.,'Fixed PM')])[2]")
    WebElement FixedPM;

    //@FindBy(xpath = "(//span[contains(.,'U1128')])[1]")
    @FindBy(xpath = "(//span[contains(@id,':0:tfpmu:3:lEqNum::text')])[1]")
    WebElement UnitNumber;

    @FindBy(xpath = "(//label[contains(.,'PM Group:')]/parent::span/parent::div/following-sibling::div)[1]")
    WebElement PMGoup2;

    @FindBy(xpath = "//select[contains(@id,':socpmg::content')]")
    WebElement PmGroupdropdown;

    @FindBy(xpath = "//label[contains(text(),'In Service Date:')]")
    WebElement ServiceDate;

    @FindBy(xpath = "//a[contains(@id,':1:cl4')]")
    WebElement serviceDAteValue;

    @FindBy(xpath = "(//span[contains(.,'RED')])[1]")
    WebElement MaintanceGroupRed;

    @FindBy(xpath = "(//a[contains(.,'Specifications')]/parent::div/following::div[4]/child::a)[1]")
    WebElement PM;

    @FindBy(xpath = "//td[contains(@id,':0:cVMRS')]")
    WebElement VMRSPMB;

    @FindBy(xpath = "//td[contains(@id,':1:cVMRS')]")
    WebElement VMRSPMA;


    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement btn_SaveAndExit;

    @FindBy(xpath = "(//a[contains(.,'Generate Schedule')])[4]")
    WebElement GenerateSchedule;

    @FindBy(xpath = "//a[contains(.,'Generate Fix PM Schedule')]")
    WebElement btn_GenerateFixPMSchedule;

    @FindBy(xpath = "(//span[contains(.,'A')]/parent::td)[4]")
    WebElement ASMA;

    @FindBy(xpath = " (//span[contains(.,'B')]/parent::td)[1]")
    WebElement ASMB;

    @FindBy(xpath = "//input[contains(@id,':itSearch::content')]")
    WebElement SearchTextArea;

    @FindBy(xpath = "//a[contains(.,'Refresh')]")
    WebElement Refresh;

    @FindBy(xpath = "(//a[contains(text(),'O0')])[1]")
    public WebElement label_ReferenceNumber;

    @FindBy(xpath = "//input[contains(@id,':0:idReadingDate::content')]")
    WebElement RODate;

    @FindBy(xpath = "//label[contains(.,'Odometer:')]/parent::td/following-sibling::td/child::table")
    WebElement Odometer;

    @FindBy(xpath = "(//span[contains(.,'905 Truck and Trailer Repair')])[2]")
    WebElement Unit_Owner;

    @FindBy(xpath = "//label[text()='Unit #:']")
    WebElement Unit;

    @FindBy(xpath = "(//label[text()='Unit #:']//following::div//a//span)[1]")
    WebElement UnitValue;


    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;


    /*go to Unit Master screen  **/
    public void gotoUnitMasterScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("Unit Master");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*search Unit Number **/
    public void enterUnitNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(searchTextArea);
        WebElementActions.getActions().inputText(searchTextArea,appProp.getProperty("UnitMaster"));
    }

    /*verify Unit Hash**/
    public void verifyUnitHash() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitHash);
        Assert.assertTrue(UnitHash.isDisplayed());


    }

    /*go to PM Inspection Manager screen**/
    public void gotoPMInspectionManagerScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Fleet");
        ReusableActions.getActions().clickChildMenu("PM Inspection Manager");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*click on PmScheduleSetup**/
    public void clickOnPMScheduleSetup() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PmScheduleSetup);
        WebElementActions.getActions().clickElement(PmScheduleSetup);

    }

    /*verify Cutomer with PM Schedule SetUp**/
    public void verifyCutomerWithPMScheduleSetup() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CustomerWithPMSchedules);
        WebElementActions.getActions().clickElement(CustomerWithPMSchedules);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchCustomer);
        WebElementActions.getActions().clickElement(SearchCustomer);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*enter the owner Name **/
    public void entertheOwnerName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchCutomerTextArea);
        WebElementActions.getActions().inputText(SearchCutomerTextArea, appProp.getProperty("OwnerName"));

    }

    /*click On Refresh **/
    public void clickOnRefresh() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Refresh);
        WebElementActions.getActions().clickElement(btn_Refresh);

    }

    /*verify the  Customer with PM Schedule tital **/
    public void verifyCustomerPMscheduleTital() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Code);
        Assert.assertTrue(Code.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Name);
        Assert.assertTrue(Name.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SERVICE);
        Assert.assertTrue(SERVICE.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Repair);
        Assert.assertTrue(Repair.isDisplayed());

    }

    /*verify MaintanceGroup **/
    public void verifyMaintanceGroup() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(MaintanceGroup);
        Assert.assertTrue(MaintanceGroup.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Code2);
        Assert.assertTrue(Code2.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description);
        Assert.assertTrue(Description.isDisplayed());

    }

    /*verify MaintenanceSchedules **/
    public void verifyMaintenanceSchedules() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(MaintenanceSchedules);
        Assert.assertTrue(MaintenanceSchedules.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReadingSchedules);
        Assert.assertTrue(ReadingSchedules.isDisplayed());

    }

    /*click On Maintance Group Red**/
    public void clickOnMaintanceGroupRed() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(MaintanceGroupRed);
        WebElementActions.getActions().clickElement(MaintanceGroupRed);

    }

    /*click On Fix PM**/
    public void clickOnFixPM() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FixedPM);
        WebElementActions.getActions().clickElement(FixedPM);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*verify Unit # **/
    public void clickUnitHash() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UnitNumber);
        WebElementActions.getActions().clickElement(UnitNumber);
        WaitActions.getWaits().loadingWait(loder);



    }

    /*verify PM Group **/
    public void verifyOnPMGroup() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PMGoup2);
        Assert.assertTrue(PMGoup2.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ServiceDate);
        Assert.assertTrue(ServiceDate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(serviceDAteValue);
        Assert.assertTrue(serviceDAteValue.isDisplayed());

    }

    /*click On PM **/
    public void clickOnPM() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PM);
        WebElementActions.getActions().clickElement(PM);

    }
    /** verify Maintenece Due*/
    public void verifyMaintenceDue() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(VMRSPMB);
        Assert.assertTrue(VMRSPMB.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(VMRSPMA);
        Assert.assertTrue(VMRSPMA.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);
    }

    /*click on save /Exit **/
    public void clickOnSaveAndExit() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_SaveAndExit);
        WebElementActions.getActions().clickElement(btn_SaveAndExit);
        WaitActions.getWaits().loadingWait(loder);
    }
    /*click On Generate Schedule **/
    public void clickOnGenerateSchedule () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(GenerateSchedule);
        WebElementActions.getActions().clickElement(GenerateSchedule);
        WaitActions.getWaits().loadingWait(loder);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_GenerateFixPMSchedule);
        WebElementActions.getActions().clickElement(btn_GenerateFixPMSchedule);

    }
    /*verify RO Dates**/
    public void verifyRODates () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ASMA);
        Assert.assertTrue(ASMA.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ASMB);
        Assert.assertTrue(ASMB.isDisplayed());

    }

    /**
     * go to  CompleteRO Screen
     */
    public void gotoCompleteROScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);


    }

    /*enter the Referance Number **/
    public void entertheRefranceNumber() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions().inputText(SearchTextArea, appProp.getProperty("Referance"));

    }

    /*click on Refresh**/
    public void clickOnRefersh() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Refresh);
        WebElementActions.getActions().clickElement(Refresh);

    }

    /*click On Referance **/
    public void clickOnReferance() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_ReferenceNumber);
        WebElementActions.getActions().clickElement(label_ReferenceNumber);

    }

    /*verify Ro Date,**/
    public void verifyRoDate() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RODate);
        Assert.assertTrue(RODate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Odometer);
        Assert.assertTrue(Odometer.isDisplayed());
    }

    /*verify Unit UnitVale **/
    public void verifyOnUnit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Unit);
        Assert.assertTrue(Unit.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(UnitValue);
        Assert.assertTrue(UnitValue.isDisplayed());
    }

    /**click On Sign Out */

    public void clickOnSignOut () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_signOut);
        WebElementActions.getActions().clickUsingJS(btn_signOut);
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on UserName */
    public void clickOnUsername () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);

    }
}




