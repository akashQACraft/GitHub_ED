package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.logging.XMLFormatter;

public class ContactEmailfielddatarequest extends TestDriverActions {

    @FindBy(xpath = "//h2[contains(text() ,'Customers List')]")
    WebElement CustomerList;

    @FindBy(xpath = "//span[text()='Add Customer']")
    WebElement AddCustomer;

    @FindBy(xpath = "//h1[contains(.,'Contact')]")
    WebElement contact;

    @FindBy(xpath = "//label[contains(text(),'Code:')]/preceding-sibling::span")
    WebElement RequiredCode;

    @FindBy(xpath = "(//label[contains(text(),'Code:')])[1]")
    WebElement Code;

    @FindBy(xpath = "//input[contains(@id,':it3::content')]")
    WebElement CodeTextArea;

    @FindBy(xpath = "//label[contains(text(),'Name:')]/preceding-sibling::span")
    WebElement ReqiredName;

    @FindBy(xpath = "//label[contains(text(),'Name:')]")
    WebElement Name;

    @FindBy(xpath = "//input[contains(@id,':it4::content')]")
    WebElement NameTextArea;

    @FindBy(xpath = "//label[contains(text(),'Active:')]")
    WebElement Active;

    @FindBy(xpath = "//input[contains(@id,':sbc1::content')]")
    WebElement ActiveTextArea;

    @FindBy(xpath = "//label[contains(text(),'Contact:')]")
    WebElement Contact;

    @FindBy(xpath = "//input[contains(@id,':it5::content')]")
    WebElement contactTextArea;

    @FindBy(xpath = "//label[contains(text(),'City:')]")
    WebElement city;

    @FindBy(xpath = "//label[contains(text(),'City:')]/parent::td/following-sibling::td/child::input")
    WebElement cityTextArea;

    @FindBy(xpath = "//label[contains(text(),'Country:')]/preceding-sibling::span")
    WebElement ReqiredCountry;

    @FindBy(xpath = "//label[contains(text(),'Country:')]")
    WebElement Country;

    @FindBy(xpath = "//select[contains(@id,'0:soc1::content')]")
    WebElement countryTextArea;

    @FindBy(xpath = "//label[contains(text(),'State:')]")
    WebElement State;

    @FindBy(xpath = "//select[contains(@id,':soc2::content')]")
    WebElement stateTextArea;

    @FindBy(xpath = "//label[contains(.,'Address:')]/parent::td/following-sibling::td/child::input")
    WebElement Address;

    @FindBy(xpath = "//label[contains(text(),'ZIP Code:')]]")
    WebElement zipcode;

    @FindBy(xpath = "//label[contains(text(),'ZIP Code:')]/parent::td/following-sibling::td/child::input")
    WebElement zipcodetextarea;

    @FindBy(xpath = "(//a[contains(.,'OK')])[1]")
    WebElement Ok;

    @FindBy(xpath = "//label[contains(.,'Address:')]/parent::td/following-sibling::td/child::input")
    WebElement AddressTextArea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement cancelButton;



    @FindBy(xpath = "//div[contains(@id,':t1::scroller')]")
    WebElement ScrollDown;

    @FindBy(xpath = "(//a[contains(text(),'COMPLETE FLEET SERVICE')])[1]")
    WebElement label_CompleteFleetServices;


    @FindBy(xpath = "//input[contains(@id,':it2::content')]")
   WebElement NameTextArea1;

 //   @FindBy(xpath = "//div[contains(.,'Details')]/following-sibling::div/child::div/div[contains(.,'Contacts')]")
 //  WebElement contacts;
 @FindBy(xpath = "//label[text()='Code:']")
 WebElement txt_code;
    @FindBy(xpath = "//label[text()='Code:']/following::input[1]")
    WebElement txtbox_code;
    @FindBy(xpath = "//label[text()='Name:']")
    WebElement txt_Name;
    @FindBy(xpath = "//label[text()='Name:']/following::input[1]")
    WebElement txtbox_Name;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi1::disAcr')])[1]")
    WebElement details;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi3::disAcr')])[1]")
    WebElement contacts;
    @FindBy(xpath = "(//div[contains(@id,'customer:sdi14::ti::_afrTabCnt')])[1]")
    WebElement Locations;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi4::disAcr')])[1]")
    WebElement Taxes;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi5::disAcr')])[1]")
    WebElement Types;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi2::disAcr')])[1]")
    WebElement Alerts;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi6::disAcr')])[1]")
    WebElement InvoiceFormats;
   // @FindBy(xpath = "(//a[contains(@id,'customer:sdi3::disAcr')])[1]")
   @FindBy(xpath = "(//a[contains(.,'Contacts')])[1]")
    WebElement Contacts;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi10::disAcr')])[1]")
    WebElement StandingPOs;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi7::disAcr')])[1]")
    WebElement Tenders;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi8::disAcr')])[1]")
    WebElement Billing_Cycle;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi9::disAcr')])[1]")
    WebElement Insurance;
    @FindBy(xpath = "(//a[contains(@id,'customer:sdi11::disAcr')])[1]")
    WebElement FuelSurchargeRates;
    @FindBy(xpath = "//label[contains(@id,'sbc8::Label0')]")
    WebElement txt_IncludeVoided;
    @FindBy(xpath = "//label[contains(@id,'sbc8::Label0')]/preceding::input[1]")
    WebElement checkbox_IncludeVoided;
    @FindBy(xpath = "//div[contains(@id,'cmdToolbarbutton25')]/descendant::span")
    WebElement btn_Add;
    @FindBy(xpath = "//th[contains(@id,'table1:column1')]/descendant::span")
    WebElement col_EffectiveDate;
    @FindBy(xpath = "//th[contains(@id,'table1:column2')]/descendant::span")
    WebElement col_InvoiceToCustomer;

   //  @FindBy(xpath = "(//a[contains(.,'Contacts')])[1]")
   // WebElement contacts;


    @FindBy(xpath = "(//a[contains(.,'Add Contact')])[1]")
    WebElement Add_Contacts;

    @FindBy(xpath = "//label[contains(text(),'First Name')]/preceding-sibling::span")
    WebElement RequiredFirstName;

    @FindBy(xpath = "//label[contains(text(),'First Name')]")
    WebElement FirstName;

    @FindBy(xpath = "(//input[contains(@id,':it2::content')])[2]")
    WebElement FirstNameTextArea;

    @FindBy(xpath = "//label[contains(.,'Last Name')]/preceding-sibling::span")
    WebElement RequiredLastName;

    @FindBy(xpath = "//label[contains(.,'Last Name')]")
    WebElement LastName;

    @FindBy(xpath = "//input[contains(@id,':it1::content')]")
    WebElement LastNameTextArea;

    @FindBy(xpath = "//label[contains(text(),'Primary Email')]")
    WebElement primaryEmail;

    @FindBy(xpath = "//input[contains(@id,':it3::content')]")
    WebElement PrimaryEmailTextArea;

    @FindBy(xpath = "//label[contains(text(),'Notify PM Overdue')]/preceding-sibling::input")
    WebElement RadioOverdue;

    @FindBy(xpath = "//label[contains(text(),'Notify PM Overdue')]")
    WebElement Overdue;

    @FindBy(xpath = "//label[contains(text(),'Notify PM Reminder')]/preceding-sibling::input")
    WebElement RadioReminder;

    @FindBy(xpath = "//label[contains(text(),'Notify PM Reminder')]")
    WebElement Reminder;

    @FindBy(xpath = "//label[contains(text(),'Notify Equ Transfer')]/preceding-sibling::input")
    WebElement RadioTransfer;

    @FindBy(xpath = "//label[contains(text(),'Notify Equ Transfer')]")
    WebElement Transfer;

    @FindBy(xpath = "//label[contains(text(),'Email Invoice Att')]/preceding-sibling::input")
    WebElement readioAtt;

    @FindBy(xpath = "(//label[contains(.,'Active')]/preceding-sibling::input)[2]")
    WebElement RadioButton;

    @FindBy(xpath = "//label[contains(text(),'Email Invoice Att')]")
    WebElement Att;

    @FindBy(xpath = "(//a[contains(.,'Cancel')]//following::a/child::span)[1]")
    WebElement btn_OK;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveExit;

    @FindBy(xpath = "(//a[contains(text(),'Reports')])[2]")
    WebElement Reports;

    @FindBy(xpath = "//h1[text()='Report Categories']")
    WebElement reportCategories;

    @FindBy(xpath = "//h1[text()='Available Reports For Inventory']")
    WebElement availableReportsForInventory;

    @FindBy(xpath = "//h1[text()='Report Parameters']")
    WebElement reportParameters;


    @FindBy(xpath = "//span[text()='Charge Out Repairs']")
    WebElement ChargeOutRepairs;

    @FindBy(xpath = "//span[contains(text(),'Customer with Email Invoice Set')]")
    WebElement CustomerwithEmailInvoiceSet;

    @FindBy(xpath = "//span[text()='Schedule Report']")
    WebElement scheduleReport;

    @FindBy(xpath = "//span[text()='Run Report']")
    WebElement runReport;

    @FindBy(xpath = "//label[contains(.,'Include contacts with no email address set')]/preceding-sibling::input")
    WebElement RadioNoEmailaddressSet;

    @FindBy(xpath = "//label[contains(.,'Include contacts with no email address set')]")
    WebElement NoEmailaddressSet;

    @FindBy(xpath = "//label[contains(text(),'Include Inactive Contacts')]/preceding-sibling::input")
    WebElement RadioInActiveContacts;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    /**
     * go to Customer Screen
     */
    public void goToCustomer() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Administration");
        ReusableActions.getActions().clickChildMenu("Customer");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify CustomerList **/
    public void verifyOnCustomerList() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CustomerList);
        Assert.assertTrue(CustomerList.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AddCustomer);
        Assert.assertTrue(AddCustomer.isDisplayed());

    }
    /*verify RequiredName, Name ,NameTextArea**/
    public void verifyRequiredName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReqiredName);
        Assert.assertTrue(ReqiredName.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Name);
        Assert.assertTrue(Name.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NameTextArea);
        Assert.assertTrue(NameTextArea.isDisplayed());

    }

    /*click Customer List **/
    public void clickOnAddCustomer() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(AddCustomer);
        WebElementActions.getActions().clickElement(AddCustomer);
        WaitActions.getWaits().loadingWait(loder);


    }

    /*verify contact**/
    public void verifyOnContact() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(contact);
        Assert.assertTrue(contact.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredCode);
        Assert.assertTrue(RequiredCode.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Code);
        Assert.assertTrue(Code.isDisplayed());

    }


    /**enter Part  and Description Text Area */
    public void inputPartTextArea () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CodeTextArea);
        WebElementActions.getActions().clickUsingJS(CodeTextArea);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        CodeTextArea.sendKeys("905Truck" + randomInt );

    }

    /*enter the NameTextArea **/
    public void entertheNameTextArea() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NameTextArea);
        WebElementActions.getActions().inputText(NameTextArea, appProp.getProperty("Name"));
        TestListener.saveScreenshotPNG(driver);

    }

    /*enter Contact **/
    public void enterContact() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(contactTextArea);
        WebElementActions.getActions().inputText(contactTextArea, appProp.getProperty("contact"));
        TestListener.saveScreenshotPNG(driver);

    }

    /*enter the city **/
    public void enterCity() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(cityTextArea);
        WebElementActions.getActions().inputText(cityTextArea, appProp.getProperty("city"));
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify RequiredCountry ,Country **/
    public void verifyRequiredCountry() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ReqiredCountry);
        Assert.assertTrue(ReqiredCountry.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Country);
        Assert.assertTrue(Country.isDisplayed());

    }

    /*select country US**/
    public void selectcountry() throws InterruptedException {
        Select obj = new Select(countryTextArea);
        obj.selectByVisibleText("United States");
        WaitActions.getWaits().loadingWait(loder);

    }

    /*select State **/
    public void selectState() throws InterruptedException {
        Select state = new Select(stateTextArea);
        state.selectByVisibleText("Illinois");
        WaitActions.getWaits().loadingWait(loder);
    }

    /*enter the Address**/
    public void entertheAddress() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Address);
        WebElementActions.getActions().inputText(Address,appProp.getProperty("Address"));
        TestListener.saveScreenshotPNG(driver);

    }


    /*click On Ok Button **/
    public void clickOnOk() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Ok);
        WebElementActions.getActions().clickElement(Ok);

    }

    /* verify the Customers List **/
    public void verifyOnCutomersList() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(label_CompleteFleetServices);
        Assert.assertTrue(label_CompleteFleetServices.isDisplayed());
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Customer **/
    public void clickOnCustomer() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_CompleteFleetServices);
        WebElementActions.getActions().clickElement(label_CompleteFleetServices);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*
       verify code and name of customer name
     */
    public void verifyCodeAndName() throws InterruptedException {
        Thread.sleep(7000);
        driver.switchTo().frame(2);

       WaitActions.waitForElementToBeRefreshedAndIsVisible(txt_code);
        Assert.assertTrue(txt_code.isDisplayed());
        Assert.assertTrue(txtbox_code.isDisplayed());
        Assert.assertTrue(txt_Name.isDisplayed());
        Assert.assertTrue(txtbox_Name.isDisplayed());
    }
    /*
       verify the tabs present
     */
    public void verifyTabs() throws InterruptedException {
       WaitActions.waitForElementToBeRefreshedAndIsVisible(details);
        Assert.assertTrue(details.isDisplayed());
        Assert.assertTrue(contacts.isDisplayed());
        Assert.assertTrue(Locations.isDisplayed());
        Assert.assertTrue(Taxes.isDisplayed());
        Assert.assertTrue(Types.isDisplayed());
        Assert.assertTrue(Alerts.isDisplayed());
        Assert.assertTrue(InvoiceFormats.isDisplayed());
        Assert.assertTrue(Contacts.isDisplayed());
        Assert.assertTrue(StandingPOs.isDisplayed());
        Assert.assertTrue(Tenders.isDisplayed());
        Assert.assertTrue(Billing_Cycle.isDisplayed());
        Assert.assertTrue(Insurance.isDisplayed());
        Assert.assertTrue(FuelSurchargeRates.isDisplayed());
    }
    /*
        click on Invoice to Customer Tab
     */
    public void clickOnContactTab() throws InterruptedException {
       WaitActions.waitForElementToBeRefreshedAndClickable(Contacts);
        WebElementActions.getActions().clickElement(Contacts);

         WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }
    /*click on Add Contact **/
    public void clickOnAddContact() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Add_Contacts);
        WebElementActions.getActions().clickElement(Add_Contacts);

    }

    /*verify First Name ,TextArea**/
    public void verifyOnFirstName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FirstName);
        Assert.assertTrue(FirstName.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(FirstNameTextArea);
        Assert.assertTrue(FirstNameTextArea.isDisplayed());
    }

    /*enter the FirstTextArea **/
    public void entertheFirsName() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FirstNameTextArea);
        WebElementActions.getActions().inputText(FirstNameTextArea, appProp.getProperty("FirstName"));
        TestListener.saveScreenshotPNG(driver);

    }

    /*verify LastName ,TextArea**/
    public void verifyOnLastName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(LastName);
        Assert.assertTrue(LastName.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(LastNameTextArea);
        Assert.assertTrue(LastNameTextArea.isDisplayed());

    }

    /*enter the LastNameTextArea **/
    public void enterTheLastName() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(LastNameTextArea);
        WebElementActions.getActions().inputText(LastNameTextArea, appProp.getProperty("LastName"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter the Primary Email **/
    public void enterThePrimaryEmail() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PrimaryEmailTextArea);
        WebElementActions.getActions().inputText(PrimaryEmailTextArea, appProp.getProperty("PrimaryEmail"));
        TestListener.saveScreenshotPNG(driver);

    }

    /*enter the FirstTextArea **/
    public void entertheFirstName1() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FirstNameTextArea);
        WebElementActions.getActions().inputText(FirstNameTextArea, appProp.getProperty("FirstName1"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter the LastNameTextArea **/
    public void enterTheLastName1() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(LastNameTextArea);
        WebElementActions.getActions().inputText(LastNameTextArea, appProp.getProperty("LastName1"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter the Primary Email **/
    public void enterThePrimaryEmail1() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PrimaryEmailTextArea);
        WebElementActions.getActions().inputText(PrimaryEmailTextArea, appProp.getProperty("PrimaryEmail1"));
        TestListener.saveScreenshotPNG(driver);

    }

    /*enter the FirstTextArea **/
    public void entertheFirstName3() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FirstNameTextArea);
        WebElementActions.getActions().inputText(FirstNameTextArea, appProp.getProperty("FirstName1"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter the LastNameTextArea **/
    public void enterTheLastName3() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(LastNameTextArea);
        WebElementActions.getActions().inputText(LastNameTextArea, appProp.getProperty("LastName1"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter the Primary Email **/
    public void enterThePrimaryEmail4() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PrimaryEmailTextArea);
        WebElementActions.getActions().inputText(PrimaryEmailTextArea, appProp.getProperty("PrimaryEmail1"));
        TestListener.saveScreenshotPNG(driver);

    }
    /*enter the FirstTextArea **/
    public void entertheFirstName2() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(FirstNameTextArea);
        WebElementActions.getActions().inputText(FirstNameTextArea, appProp.getProperty("FirstName2"));
        TestListener.saveScreenshotPNG(driver);
    }

    /*enter the LastNameTextArea **/
    public void enterTheLastName2() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(LastNameTextArea);
        WebElementActions.getActions().inputText(LastNameTextArea, appProp.getProperty("LastName2"));
        TestListener.saveScreenshotPNG(driver);
    }


    /*verify the Notify PM Overdue**/
    public void verifyOnNotifyPMOverdue() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Overdue);
        Assert.assertTrue(Overdue.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Reminder);
        Assert.assertTrue(Reminder.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Transfer);
        Assert.assertTrue(Transfer.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Att);
        Assert.assertTrue(Att.isDisplayed());
    }

    /*click On Radio Buuton **/
    public void clickOnEmailInvoiceAtt() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(readioAtt);
        WebElementActions.getActions().clickElement(readioAtt);

    }
   /*click on Active**/
    public void clickOnActive () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RadioButton);
        WebElementActions.getActions().clickElement(RadioButton);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Save/Exit **/
    public void clickOnSaveAndExit() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SaveExit);
        WebElementActions.getActions().clickElement(SaveExit);

    }

    /*click On Ok Button **/
    public void clickOnOkButton() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_OK);
        WebElementActions.getActions().clickElement(btn_OK);
        driver.switchTo().defaultContent();
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Report**/
    public void clickOnReport() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Reports);
        WebElementActions.getActions().clickElement(Reports);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*verify Report Categories , **/
    public void verifyReportCategories() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportCategories);
        Assert.assertTrue(reportCategories.isDisplayed());


        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(reportParameters);
        Assert.assertTrue(reportParameters.isDisplayed());

    }

    /*Charge Out Repairs **/
    public void clickOnChargeOutRepairs() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(ChargeOutRepairs);
        WebElementActions.getActions().clickElement(ChargeOutRepairs);
        WaitActions.getWaits().loadingWait(loder);


    }

    /*click On Custome rwith Email InvoiceSet**/
    public void clickOnCustomerwithEmailInvoiceSet() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(CustomerwithEmailInvoiceSet);
        WebElementActions.getActions().clickElement(CustomerwithEmailInvoiceSet);
        WaitActions.getWaits().loadingWait(loder);

    }

    /*click On Run Report**/
    public void clickOnRunReport() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(runReport);
        Thread.sleep(3000);
        WebElementActions.getActions().clickElement(runReport);
        WaitActions.getWaits().loadingWait(loder);

    }

    /**
     * verify taxes on PDF
     */
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

            if (pdfFullText.contains("COMPLETE FLEET SERVICE")) {
                System.out.println(" Active Customer");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);

        }
    }
        /*click On NoEmaiAddressSet  **/
       public void clickOnNoEmailAddressSet () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible( RadioNoEmailaddressSet);
            WebElementActions.getActions().clickElement(RadioNoEmailaddressSet);
            WaitActions.getWaits().loadingWait(loder);


        }
    /**
     * verify taxes on PDF
     */
    public void VerifyTaxesonPDF2() throws InterruptedException, IOException {

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

            if (pdfFullText.contains("COMPLETE FLEET SERVICE")) {
                System.out.println("No Email address Set ");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);

        }
    }
    /*click On Radio InActive Contacts**/
    public void clickOnInActiveContacts () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RadioInActiveContacts);
        WebElementActions.getActions().clickElement(RadioInActiveContacts);
        WaitActions.getWaits().loadingWait(loder);

    }
    /**
     * verify taxes on PDF
     */
    public void VerifyTaxesonPDF3() throws InterruptedException, IOException {

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

            if (pdfFullText.contains("COMPLETE FLEET SERVICE")) {
                System.out.println("In Active Contacts");

            }

            fis.close();
            WaitActions.getWaits().loadingWait(loder);

        }
    }
    /**
     * verify taxes on PDF
     */
    public void VerifyTaxesonPDF4() throws InterruptedException, IOException {

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

            if (pdfFullText.contains("COMPLETE FLEET SERVICE")) {
                System.out.println("click On Both Radio Button");

            }

            fis.close();
            Thread.sleep(3000);
            WaitActions.getWaits().loadingWait(loder);

        }
    }
    /*click On Sign Out **/
    public void clickOnSignOut () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
        WebElementActions.getActions().clickElement(btn_signOut);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
        WebElementActions.getActions().clickElement(inputbox_Username);



}

}

