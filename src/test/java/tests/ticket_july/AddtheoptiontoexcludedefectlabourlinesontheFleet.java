package tests.ticket_july;

//FXGRequest: Add the option to exclude defect labour lines on the Fleet -> History -> Labour screen / export--[E3-I1832]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class AddtheoptiontoexcludedefectlabourlinesontheFleet extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to complete RO Screen ", enabled = true)
    @Description("Test Description : Login the page and go to complete RO Screen")
    public void T_001_gotocompleteRO() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        addtheoptiontoexcludedefectlabourlines.gotocompleteRO();
        addtheoptiontoexcludedefectlabourlines.varifyunit();

    }

    @Test(priority = 1, description = "T_002_Login the page and go to History Screen ", enabled = true)
    @Description("Test Description : Login the page and go to History Screen")
    public void T_002_goToHistory() throws FileNotFoundException, InterruptedException {
        addtheoptiontoexcludedefectlabourlines.goToHistory();
        addtheoptiontoexcludedefectlabourlines.clickOnDownArrow ();
        addtheoptiontoexcludedefectlabourlines.clickOnHistory ();
        addtheoptiontoexcludedefectlabourlines.clickOnLobur ();
        addtheoptiontoexcludedefectlabourlines.clickOnShowInAdvanceSearch ();
    }
    @Test(priority = 2, description = "T_003_varify On UnitType ", enabled = true)
    @Description("Test Description : varify On UnitType")
    public void T_003_varifyOnUnitType() throws FileNotFoundException, InterruptedException {
        addtheoptiontoexcludedefectlabourlines.varifyOnUnitType();
        addtheoptiontoexcludedefectlabourlines.clickOnRefresh();
        addtheoptiontoexcludedefectlabourlines.varifyexternalandinternal();
        addtheoptiontoexcludedefectlabourlines.clickOninternal();
        addtheoptiontoexcludedefectlabourlines.clickOnRefresh();
        addtheoptiontoexcludedefectlabourlines.varifyOnInternalUnit();
        addtheoptiontoexcludedefectlabourlines.clickOnExternalradio();
        addtheoptiontoexcludedefectlabourlines.clickOnRefresh();
        addtheoptiontoexcludedefectlabourlines.clickOnBothradio();
    }
    @Test(priority = 3, description = "T_004_click On internal button ", enabled = true)
    @Description("Test Description : click On internal button")
    public void T_004_clickOninternalbutton () throws FileNotFoundException, InterruptedException {
        addtheoptiontoexcludedefectlabourlines.clickOnRefresh();
        addtheoptiontoexcludedefectlabourlines.clickOninternalbutton();
        addtheoptiontoexcludedefectlabourlines.clickOnRefresh();
        addtheoptiontoexcludedefectlabourlines.clickOnSublet();
        addtheoptiontoexcludedefectlabourlines.clickOnRefresh();
        addtheoptiontoexcludedefectlabourlines.clickOnBoth();
        addtheoptiontoexcludedefectlabourlines.clickOnRefreshAndExport();
    }
    @Test(priority = 4, description = "T_004_go to Report Set Up ", enabled = true)
    @Description("Test Description : go to Report SetUp")
    public void T_004_gotoReportSetUp ()  throws FileNotFoundException, InterruptedException {
        addtheoptiontoexcludedefectlabourlines.gotoReportSetUp ();
        addtheoptiontoexcludedefectlabourlines.entertheSearch ();
        addtheoptiontoexcludedefectlabourlines.clickOnSignOut ();


    }
}