package tests.ticket_august;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkinProgressReportLocationParameterGIST extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Report Screen ", enabled = true)
    @Description("Test Description : Login the page and go to Report Screen")
    public void T_001_gotoReport() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        workinprogressreportlocation.gotoReport();

    }
    @Test(priority = 1, description = "T_002_click On Work In Progress  ", enabled = true)
    @Description("Test Description : click On Work In Progress ")
    public void T_002_clickOnWorkInProgress () throws FileNotFoundException, InterruptedException {
        workinprogressreportlocation.varifyReportCategories ();
        workinprogressreportlocation.clickOnWorkInProgress ();
        workinprogressreportlocation.varifyAvalableReportForWorkInProgressReport ();
        workinprogressreportlocation.clickOnWorkInProgressTwo ();
        workinprogressreportlocation.varifyReportsParameter ();
        workinprogressreportlocation.clearTheLocationValue ();
        workinprogressreportlocation.clickOnRunReport ();
    }
    @Test(priority = 2, description = "T_003_Login the page and go to Unit Master ", enabled = true)
    @Description("Test Description : Login the page and go to Unit Master")
    public void T_003_gotoUnitMaster ()  throws FileNotFoundException, InterruptedException {
        workinprogressreportlocation.gotoUnitMaster();
        workinprogressreportlocation.varifyUnitMaster();
        workinprogressreportlocation.clickOnReportTwo ();
        workinprogressreportlocation.varifyReportCategories();
        workinprogressreportlocation.clickOnWorkInProgress();
        workinprogressreportlocation.varifyAvalableReportForWorkInProgressReport();
        workinprogressreportlocation.clickOnWorkInProgressTwo();
        workinprogressreportlocation.varifyReportsParameter();

    }
    @Test(priority = 3, description = "T_004_click On Sign Out ", enabled = true)
    @Description("Test Description : _click On Sign Out")
    public void T_004_clickOnSignOut() throws IOException, InterruptedException {
        workinprogressreportlocation.clickOnRunReport ();
        workinprogressreportlocation.TaxesonPDF();
        workinprogressreportlocation.clickOnSignOut();

    }
}
