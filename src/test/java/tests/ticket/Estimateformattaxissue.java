package tests.ticket;

//Estimate Format Tax Issue - AMERICANBODY -[E3-I1805]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Estimateformattaxissue extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to Service Board  Screen", enabled = true)
    @Description("Test Description : Login the page and go to Service Board  Screen")
    public void T_001_goToServiceBoardScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        estimateformattaxissue.goToServiceBoardScreen();
    }

    @Test(priority = 1, description = "T_002_click On PF User In  American Body", enabled = true)
    @Description("Test Description : click On PF User In  American Body")
    public void T_002_clickPFUserInAmericanBody() throws FileNotFoundException, InterruptedException {
     //   estimateformattaxissue.clickOnCorproId() ;
      //  estimateformattaxissue.selectPFUserInAmericanBody();
       // loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
      //  estimateformattaxissue.goToServiceBoardScreen();

    }

    @Test(priority = 2, description = "T_003_click on Repair Estimates InProgess ", enabled = true)
    @Description("Test Description : click on Repair Estimates InProgess")
    public void T_003_clickonRepairEstimatesInProgess() throws FileNotFoundException, InterruptedException {
        estimateformattaxissue.clickonRepairEstimatesInProgess();
        estimateformattaxissue.verifyOnRepairEstimateInProgess();
        estimateformattaxissue.verifyLocation();
        estimateformattaxissue.clickOnEstimate();
    }

    @Test(priority = 2, description = "T_004_click On Add Labour ", enabled = true)
    @Description("Test Description : click On Add Labour")
    public void T_004_clickOnAddLabour() throws FileNotFoundException, InterruptedException {
        estimateformattaxissue.clickOnAddLabour();
        estimateformattaxissue.clickOnVMRS();
        estimateformattaxissue.entertheSearchTextArea();
        estimateformattaxissue.clickOnBodyWork();
        estimateformattaxissue.clickOnAdd();
        estimateformattaxissue.entertheEstimateHours();
        estimateformattaxissue.clickOnAddButton();
        estimateformattaxissue.clickOncancelIcon ();
        estimateformattaxissue.clickOnDeleteicon ();

    }
    @Test(priority = 3, description = "T_005_click On RepairEstimate  ", enabled = true)
    @Description("Test Description : click On RepairEstimate ")
    public void T_005_clickOnRepairEstimate() throws IOException, InterruptedException {
        estimateformattaxissue.clickOnRepairEstimate();
        estimateformattaxissue.VerifyTaxesonPDF();
        estimateformattaxissue.clickOnSignOut ();
        estimateformattaxissue. clickOnUserNameTextArea ();

    }
}