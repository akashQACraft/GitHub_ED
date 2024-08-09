package tests.ticket_august;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class PartUsageExportInvestigationWALLER extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Report Screen ", enabled = true)
    @Description("Test Description : Login the page and go to Report Screen")
    public void T_001_gotoReport() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        partusageexportinvestion.gotoReport();

    }

    @Test(priority = 1, description = "T_002_click On Inventory ", enabled = true)
    @Description("Test Description : click On Inventory ")
    public void T_002_clickOnInventory() throws FileNotFoundException, InterruptedException {
        partusageexportinvestion.verifyReportCategories();
        partusageexportinvestion.clickOnInventory();
        partusageexportinvestion.verifyreportParameters();
        partusageexportinvestion.clickOnPartUsageExport();


    }
    @Test(priority = 2, description = "T_003_verify From Date ", enabled = true)
    @Description("Test Description : verify From Date")
    public void T_003_verifyFromDate() throws FileNotFoundException, InterruptedException {
        partusageexportinvestion.verifyFromDate();
        partusageexportinvestion.enterTheFromDate();
        partusageexportinvestion.varifyTODate();
        partusageexportinvestion.varifyLocation();
        partusageexportinvestion. clickOnSearchIcon();

    }
    @Test(priority = 3, description = "T_004_click On Search Button  ", enabled = true)
    @Description("Test Description : click On Search Button ")
    public void T_004_clickOnSearchButton()  throws FileNotFoundException, InterruptedException {
        partusageexportinvestion.clickOnSearchButton();
        partusageexportinvestion.clickOnSelectButtonTwo ();
        partusageexportinvestion.varifyPreferdVendor();
        partusageexportinvestion.clickOnPrefferdSearchIcon();
        partusageexportinvestion.enterTheName();
        partusageexportinvestion.clickOnSearchButton();
        partusageexportinvestion.clickOnSelectButton();
        partusageexportinvestion.clickOnRunReport();

    }
    @Test(priority = 4, description = "T_005_click On Sign Out  ", enabled = true)
    @Description("Test Description : click On Sign Out")
    public void T_005_clickOnSignOut()  throws FileNotFoundException, InterruptedException {
       // partusageexportinvestion.varifyReporthistoryStratDate ();
        partusageexportinvestion.clickOnSignOut();
    }

}
