package tests.ticket;

 //12 Month Actual Count on RESTOCK/REORDER REPORT, in Excel format - Superstition --[E3-I1658]

import io.qameta.allure.Description;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Twelvemonthactualcountonrestockeorderreportinexcelformat extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to CompleteRO Screen ", enabled = true)
    @Description("Test Description : Login the page and go to CompleteRO Screen")
    public void T_001_goToCompleteROScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        Superstition.gotoOrderParts();
    }
    @Test(priority = 1, description = "T_002_click on Suggested Order", enabled = true)
    @Description("Test Description : click on Suggested Order ")
    public void T_002_clickonSuggestedOrder() throws FileNotFoundException, InterruptedException {
        Superstition.clickonSuggestedOrder();
        Superstition.verifySuggestedOrders();
        Superstition.verifyGenerateOrders();
        Superstition.verifyVendor();
        Superstition.verifyReturns();
    }
    @Test(priority = 2, description = "T_003_click on Export List", enabled = true)
    @Description("Test Description : click on  Export List ")
    public void T_003_clickOnExportList() throws IOException, InterruptedException {
        Superstition.clickOnExportList ();
        Superstition.readExcel();
        Superstition.clickOnReport ();
        Superstition.clickOnEmployee ();
        Superstition.clickOnEmployeeTimeSheetExport  ();
        Superstition.clickOnRunReport ();
        Superstition.readExcel();
        Superstition.clickOnSignOut ();
    }

}