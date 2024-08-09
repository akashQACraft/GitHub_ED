package tests.ticket_august;
//FXGRequest: GL Account History Screen to include 'Billing Location' column--[E3-I1833]
// Url -https://konatest.brightorder.com/fedexqa/faces/signin/signin.jsf
//Billing location filter is added in Export -not present in kona_QA env.
//Filtered out data based on billing location-not present in kona_QA env.
//subaccount value also not present in konaQA env.
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class GLAccountHistoryScreentoincludeBillingLocation extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Security SetUp Screen ", enabled = true)
    @Description("Test Description : Login the page and go to Security SetUp Screen")
    public void T_001_gotoSecuritySetUp() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        glaccounthistoryscrren.gotoSecuritySetUp();
    }

    @Test(priority = 1, description = "T_002_click On Global System Parameter ", enabled = true)
    @Description("Test Description : click On Global System Parameter ")
    public void T_002_clickOnGlobalSystemParameter() throws FileNotFoundException, InterruptedException {
        glaccounthistoryscrren.clickOnGlobalSystemParameter();
        glaccounthistoryscrren.enterTheSystemParamter();
        glaccounthistoryscrren.varifyCorporationForthisParamter();

    }

    @Test(priority = 2, description = "T_003_go to GL Account ", enabled = true)
    @Description("Test Description : go to GL Account ")
    public void T_003_gotoGLAccount() throws FileNotFoundException, InterruptedException {
        glaccounthistoryscrren.gotoGLAccount();
        glaccounthistoryscrren.clickOnDownArrow();
        glaccounthistoryscrren.clickOnGLAccountHistory();
        glaccounthistoryscrren.varifyGlAccountHistory ();
        glaccounthistoryscrren.varifyYear ();
        glaccounthistoryscrren.selectYear();
        glaccounthistoryscrren.varifyFromPeriod ();
        glaccounthistoryscrren.selectFromPeriod();
        glaccounthistoryscrren.varifyToPeriod ();
        glaccounthistoryscrren.Toperiod();

    }
    @Test(priority = 3, description = "T_004_click On Refresh and click On export ", enabled = true)
    @Description("Test Description : click On Refresh and click On export ")
    public void T_004_clickOnRefresh() throws FileNotFoundException, InterruptedException {
        glaccounthistoryscrren.clickOnRefresh();
        glaccounthistoryscrren.clickOnExport();
        glaccounthistoryscrren.clickOnSignOut();
    }
}