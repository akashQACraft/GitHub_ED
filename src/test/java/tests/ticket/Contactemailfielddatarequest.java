package tests.ticket;

//#35198 Contact Email field data request TRIPLELT --[E3-I1732]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Contactemailfielddatarequest extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go To Custome Scrren ", enabled = true)
    @Description("Test Description : Login the page and go To Custome Scrren ")
    public void T_001_goToCustomer() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        datarequest.goToCustomer();

    }
    @Test(priority = 1, description = "T_002_verify On Customer List ", enabled = true)
    @Description("Test Description : verify On Customer List")
    public void T_002_verifyOnCustomerList() throws FileNotFoundException, InterruptedException {
      datarequest.verifyOnCustomerList();
       datarequest.clickOnAddCustomer();
        datarequest.verifyRequiredName();
       datarequest.verifyOnContact();
    }
    @Test(priority = 2, description = "T_003_enter the Code  ", enabled = true)
    @Description("Test Description : enter the Code")
    public void T_003_entertheCode() throws FileNotFoundException, InterruptedException {
       datarequest.inputPartTextArea ();
       datarequest.entertheNameTextArea();
      datarequest.enterContact();
       datarequest.enterCity();
        datarequest.selectcountry();
       datarequest.verifyRequiredCountry();
        datarequest.selectState();

    }
    @Test(priority = 3, description = "T_004_enter the Address ", enabled = true)
    @Description("Test Description : enter the Address")
    public void T_004_entertheAddress() throws FileNotFoundException, InterruptedException {
       datarequest.entertheAddress();
       datarequest.clickOnOk() ;
       datarequest.verifyOnCutomersList();
       datarequest.clickOnCustomer() ;
         datarequest.verifyCodeAndName();
        datarequest.verifyTabs();
       datarequest.clickOnContactTab();
       datarequest.clickOnAddContact();
    }
    @Test(priority = 4, description = "T_005_verify On First Name ", enabled = true)
    @Description("Test Description : verify On First Name")
    public void T_005_verifyOnFirstName() throws FileNotFoundException, InterruptedException {
        datarequest.verifyOnFirstName();
       datarequest.entertheFirsName();
        datarequest.verifyOnLastName();
       datarequest.enterTheLastName();
       datarequest.enterThePrimaryEmail();
        datarequest.clickOnEmailInvoiceAtt();
        datarequest.clickOnSaveAndExit();
        datarequest.clickOnAddContact();
       datarequest.entertheFirstName1();
        datarequest.enterTheLastName1();
       datarequest.enterThePrimaryEmail1();
       datarequest.clickOnActive ();
        datarequest.clickOnSaveAndExit();

    }
    @Test(priority = 5, description = "T_006_enter the First Name ", enabled = true)
    @Description("Test Description : enter the First Name")
    public void T_006_entertheFirstName3()  throws FileNotFoundException, InterruptedException {
       datarequest.clickOnAddContact();
        datarequest.entertheFirstName3();
        datarequest.enterTheLastName3();
       datarequest.enterThePrimaryEmail4();
       datarequest.clickOnSaveAndExit();
       datarequest.clickOnAddContact();
       datarequest.entertheFirstName2();
      datarequest.enterTheLastName2();
       datarequest.clickOnSaveAndExit();

    }
    @Test(priority = 6, description = "T_006_click On Report Screen ", enabled = true)
    @Description("Test Description : click On Report Screen")
    public void T_006_clickOnReport() throws IOException, InterruptedException {
       datarequest.clickOnOkButton();
        datarequest.clickOnReport();
        datarequest.verifyReportCategories();
        datarequest.clickOnChargeOutRepairs();
        datarequest.clickOnCustomerwithEmailInvoiceSet();
        datarequest.clickOnRunReport();
        datarequest.VerifyTaxesonPDF();

    }
    @Test(priority = 7, description = "T_006_click On No Email Address Set ", enabled = true)
    @Description("Test Description : click On No Email Address Set")
    public void T_006_clickOnNoEmailAddressSet ()  throws IOException, InterruptedException {
        datarequest.clickOnNoEmailAddressSet ();
        datarequest.clickOnRunReport();
        datarequest.VerifyTaxesonPDF2();
        datarequest.clickOnNoEmailAddressSet ();
        datarequest.clickOnInActiveContacts ();
        datarequest.clickOnRunReport();
        datarequest.VerifyTaxesonPDF3();
        datarequest.clickOnNoEmailAddressSet ();
        datarequest.clickOnRunReport();
        datarequest.VerifyTaxesonPDF4();
        datarequest. clickOnSignOut ();

    }
}
