package tests.ticket;
//#2555607062 The SAGE50_QUANTUM Financial Export is showing a PST value for invoices that have 0% PST--[E3-I1844]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class QuantumFinancialExportIsShowingaPSTvalueForInvoices extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Corporate Set up Manager Screen", enabled = true)
    @Description("Test Description : Login the page and go to  Corporate Set up Manager  Screen")
    public void T_001_goToServiceBoardScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
       financialexport.gotoCorporateSetupManager();
    }

    @Test(priority = 1, description = "T_002_varify On CorPorate Set up Manager", enabled = true)
    @Description("Test Description : varify On CorPorate Set up Manager")
    public void T_002_varifyOnCorPorateSetupManager() throws FileNotFoundException, InterruptedException {
        financialexport.varifyOnCorPorateSetupManager();
        financialexport.varifyAirTaxRegistration();
        financialexport.enterGSTrate();
        financialexport.varifyGSTrate();
       financialexport.enterPSTrate();
        financialexport.varifyPSTrate();
    }

    @Test(priority = 2, description = "T_003_go to Complete Ro ", enabled = true)
    @Description("Test Description : go to Complete Ro ")
    public void T_003_gotoCompleteRo() throws FileNotFoundException, InterruptedException {
        financialexport.gotoCompleteRo();
        financialexport.clickOnNewRo();
        financialexport.enterTheSearchUnit();
        financialexport.clickOnSelect();
        financialexport.clickOnAddLabor();
        financialexport.seachOnLabour();
        financialexport.clickOnimage();
        financialexport.clickOnPlusIcon();
        financialexport.clickOnAdd();
    }

    @Test(priority = 3, description = "T_004_varify Tax and click on Tax value ", enabled = true)
    @Description("Test Description : vrify Tax and click on Tax value ")
    public void T_004_varifyTaxText() throws FileNotFoundException, InterruptedException {
        financialexport.varifyTaxText();
        financialexport.clickOnTaxValue();
        financialexport.varifyOnGST();
        financialexport.varifyOnPST();
      financialexport.compareTwoElement();
        financialexport.clickOnClose();
    }
    @Test(priority = 4, description = "T_005_click On Corporate Set up Manager ", enabled = true)
    @Description("Test Description : click On Corporate Set up Manager")
    public void T_005_clickOnCorporateSetupManager() throws FileNotFoundException, InterruptedException {
        financialexport.gotoCorporateSetupManager();
        financialexport.enterThePSTrateValue();
        financialexport.varifyPSTrateTwo();
        financialexport.varifyPSTrateValue();
        financialexport.gotoCompleteRo();
        financialexport.clickOnAddLabor();
        financialexport.seachOnLabour();
        financialexport.clickOnimage();
        financialexport.clickOnPlusIcon();
        financialexport.enterTheChargeHours();
        financialexport.clickOnAdd();
    }
    @Test(priority = 5, description = "T_006_click On Tax Value And Click On Sign Out  ", enabled = true)
    @Description("Test Description : click On Tax Value  And Click On Sign Out ")
    public void T_006_clickOnTaxValue() throws FileNotFoundException, InterruptedException {
        financialexport.clickOnTaxValue();
        financialexport.varifyOnGST();
        financialexport.varifyOnPST();
        financialexport.compareTwoElement();
        financialexport.clickOnClose ();
        financialexport.clickOnSignOut ();
        financialexport.clickOnUsername ();

    }
}