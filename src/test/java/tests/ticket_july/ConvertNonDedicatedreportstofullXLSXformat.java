package tests.ticket_july;

//FXGRequest: Convert Non-Dedicated reports to full .XLSX format reports for AP Invoices and GL Account History Exports (from I1766)---[E3-I1809]
// Url -https://konatest.brightorder.com/fedexqa/faces/signin/signin.jsf

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class ConvertNonDedicatedreportstofullXLSXformat extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Report SetUp Screen ", enabled = true)
    @Description("Test Description : Login the page and go to Report SetUp Screen")
    public void T_001_gotoReportSetUp() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        convertnondeticatedreports.gotoReportSetUp();
        convertnondeticatedreports.entertheSearch();

    }

    @Test(priority = 1, description = "T_002_go to GLAccount", enabled = true)
    @Description("Test Description :go to GLAccount ")
    public void T_002_gotoGLAccount()throws FileNotFoundException, InterruptedException {
        convertnondeticatedreports.gotoGLAccount();
        convertnondeticatedreports.clickOnDownArrow();
        convertnondeticatedreports.clickOnGLAccountHistory();
        convertnondeticatedreports.varifyGlAccountHistory ();
        convertnondeticatedreports.varifyYear ();
        convertnondeticatedreports.selectYear();
        convertnondeticatedreports.varifyFromPeriod ();
        convertnondeticatedreports.selectFromPeriod();
        convertnondeticatedreports.varifyToPeriod ();
        convertnondeticatedreports.Toperiod();
        convertnondeticatedreports.clickOnRefresh();
        convertnondeticatedreports.clickOnExport();
    }

    @Test(priority = 2, description = "T_003_go to Report", enabled = true)
    @Description("Test Description :go to Report")
    public void T_003_gotoReport() throws FileNotFoundException, InterruptedException {
        convertnondeticatedreports.gotoReport();
        convertnondeticatedreports.clickOnReportHistory ();
        convertnondeticatedreports.clickOnSignOut();
    }
}