package tests.ticket_july;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteBackordersUNITED extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to History Screen ", enabled = true)
    @Description("Test Description : Login the page and go to History Screen")
    public void T_001_goToHistory() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        deletebackorders.gotoCounterSaleManaer();

    }
    @Test(priority = 1, description = "T_002_click On Add New Counter sale ", enabled = true)
    @Description("Test Description : click On Add New Counter sale")
    public void T_002_clickOnAddNewCountersale() throws FileNotFoundException, InterruptedException {
        deletebackorders.clickOnAddNewCountersale();
        deletebackorders.varifyOnRequiredLocation();
        deletebackorders.varifyOnRequiredCustomer();
        deletebackorders.enterTheCustomerName();
    }
    @Test(priority = 2, description = "T_003_varify On Cancel ", enabled = true)
    @Description("Test Description : varify On Cancel ")
    public void T_003_varifyOnCancel() throws FileNotFoundException, InterruptedException {
        deletebackorders.varifyOnCancel();
        deletebackorders.clickOnOK();
        deletebackorders.varifyOnLocation();
        deletebackorders.varifyOnCustomer();
        deletebackorders.varifyOnPart();
    }
    @Test(priority = 3, description = "T_004_enter The Part # ", enabled = true)
    @Description("Test Description : enter The Part #")
    public void T_004_enterThePart() throws FileNotFoundException, InterruptedException {

        deletebackorders.enterThePart();
        deletebackorders.clickOnAddButton();
        deletebackorders.varifyPartIteam();
    }
    @Test(priority = 4, description = "T_005_click On Save And Exit", enabled = true)
    @Description("Test Description : click On Save And Exit ")
    public void T_005_clickOnSaveAndExit() throws FileNotFoundException, InterruptedException {

        deletebackorders.clickOnSaveAndExit();
        deletebackorders.varifyOnIteam();
        deletebackorders.clickOnBackOrders();
        deletebackorders.clickOnsearchIcon ();
        deletebackorders.enterTheSearchCustomer ();
        deletebackorders.clickOnSearch ();
        deletebackorders.clickOnSelect ();

    }
    @Test(priority = 5, description = "T_006_click On sign Out", enabled = true)
    @Description("Test Description : click On sign Out ")
    public void T_006_clickOnsignOut() throws IOException, InterruptedException {
        deletebackorders. clickOnCreated_Cs ();
        deletebackorders.clickOnOrderParts ();
        deletebackorders.enterTheOrderQty ();
        deletebackorders.selectThePartandDscriptRadio ();
        deletebackorders.clickOnSearchIcon ();
        deletebackorders.enterVendorName ();
        deletebackorders.clickOnSearch ();
        deletebackorders.clickOnSelectButton();
        deletebackorders.clickOnSubmitAndPO ();
        deletebackorders.VerifyTaxesonPDF();
        deletebackorders.clickOnSaveANdExit ();
        deletebackorders.clickOnsignOut();
        deletebackorders.clickOnUserName();


    }
}