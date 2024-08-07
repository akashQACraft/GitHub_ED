package tests.ticket;

//FedEx Request: The GL Account History export caps at 65,526 lines of data, and does not provide additional data in further Excel sheets---[E3-I1766]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TheGLAccountHistoryexportcaps extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to History Screen ", enabled = true)
    @Description("Test Description : Login the page and go to History Screen")
    public void T_001_goToHistory()  throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        theglaccounthistory.goToHistory();


    }

    @Test(priority = 1, description = "T_002_varify RO History ", enabled = true)
    @Description("Test Description : varify RO History ")
    public void T_002_varifyROHistory() throws FileNotFoundException, InterruptedException {
        theglaccounthistory.clickOnDownArrow ();
        theglaccounthistory.clickOnHistory ();
       theglaccounthistory.clickOnRepairOrder();
        theglaccounthistory.varifyROHistory();
        theglaccounthistory.varifyFromRODate();
        theglaccounthistory.enterTheROfromDate();

    }

    @Test(priority = 2, description = "T_003_click On Refresh ", enabled = true)
    @Description("Test Description : click On Refresh")
    public void T_003_clickOnRefresh() throws IOException, InterruptedException {
        theglaccounthistory.clickOnRefresh();
        theglaccounthistory.clickOnExport();
        theglaccounthistory.goToHistory();
        theglaccounthistory.clickOnDownArrow ();
        theglaccounthistory.clickOnHistory ();
        theglaccounthistory.clickOnLobur();
        theglaccounthistory.enterTheFromRODateTwo();
       theglaccounthistory.clickOnRefresh();
        theglaccounthistory.clickOnExport();

    }
    @Test(priority = 3, description = "T_004_click On Parts ", enabled = true)
    @Description("Test Description : click On Parts")
    public void T_004_clickOnParts() throws IOException, InterruptedException {
        theglaccounthistory.goToHistory();
        theglaccounthistory.clickOnDownArrow();
        theglaccounthistory.clickOnHistory();
        theglaccounthistory.clickOnParts();
        theglaccounthistory.enterTheFromROdate();
        theglaccounthistory.clickOnRefresh();
        theglaccounthistory.clickOnExport2 ();

    }
    @Test(priority = 4, description = "T_005_click On Parts ", enabled = true)
    @Description("Test Description : click On Parts")
    public void T_005_clickOnParts() throws IOException, InterruptedException {
        theglaccounthistory.goToHistory();
        theglaccounthistory.clickOnDownArrow ();
        theglaccounthistory.clickOnHistory ();
        theglaccounthistory.clickOnRepairEstimate();
        theglaccounthistory.enterTheFromRODate();
        theglaccounthistory.SelectRepairEstimate();
        theglaccounthistory.clickOnSearchButton ();
        theglaccounthistory.clickOnExport ();
        theglaccounthistory.clickOnsignOut();
        theglaccounthistory.clickOnUserName();

    }

}