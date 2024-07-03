package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EstimateFormatMissingLaborNotesDescription extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Corporate Set Up Manager", enabled = true)
    @Description("Test Description : Login the page and go to  Corporate Set Up Manager Screen")
    public void T_001_gotoCorporateSetUpManager() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        estimateformatmissinglabor.gotoCorporateSetUpManager();

    }

    @Test(priority = 1, description = "T_002_click On Invoice Set Up", enabled = true)
    @Description("Test Description : click On Invoice Set Up")
    public void T_002_clickOnInvoiceSetup() throws FileNotFoundException, InterruptedException {
        estimateformatmissinglabor.clickOnInvoiceSetup();
        estimateformatmissinglabor.clickOnAdd();
        estimateformatmissinglabor.verifyWorkOrderEstimation();
        estimateformatmissinglabor.selectAmericanBody();
        estimateformatmissinglabor.clickonOkButton();
        estimateformatmissinglabor.clickonRepairLocation();
        estimateformatmissinglabor.clickOnRepairLocation();
        estimateformatmissinglabor.verifyOnRequiredCode();
        estimateformatmissinglabor.enterCodeTextArea();

    }

    @Test(priority = 2, description = "T_003_verify Required Name", enabled = true)
    @Description("Test Description : verify Required Name")
    public void T_003_verifyRequiredName() throws FileNotFoundException, InterruptedException {
        estimateformatmissinglabor.verifyRequiredName();
        estimateformatmissinglabor.enterTextArea();
        estimateformatmissinglabor.verifyPositionCoordinates();
        estimateformatmissinglabor.clickOnCreate();
    }

    @Test(priority = 3, description = "T_004_go to service board", enabled = true)
    @Description("Test Description : go to service board")
    public void T_004_gotoserviceboard() throws FileNotFoundException, InterruptedException {
        estimateformatmissinglabor.gotoserviceboard();
        estimateformatmissinglabor.clickOnRepairEstimatesInprogress();
        estimateformatmissinglabor.verifyLocation1 ();
        estimateformatmissinglabor.clickOnSearchIncon ();
        estimateformatmissinglabor.entetSearchTextArea();
        estimateformatmissinglabor.clickOnSearch();
        estimateformatmissinglabor.clickOnSelectButton2 ();
        estimateformatmissinglabor.clickOnRefreshButton ();
        estimateformatmissinglabor.clickOnQuickEstimate();
        estimateformatmissinglabor.verifyOnNewRepairEstimate();
        estimateformatmissinglabor.clickOnSelectButton();
      //  estimateformatmissinglabor.clickOnSelect();
      //  estimateformatmissinglabor.clickOnSelectTwo();
       // estimateformatmissinglabor.verifyLocation();

    }

    @Test(priority = 4, description = "T_005_click On Add Labour", enabled = true)
    @Description("Test Description : click On Add Labour")
    public void T_005_clickOnAddLabour() throws IOException, InterruptedException {
        estimateformatmissinglabor.clickOnAddLabour();
        estimateformatmissinglabor.searchBody();
        estimateformatmissinglabor.clickOnAddLabour();
        estimateformatmissinglabor.searchDoor();
        estimateformatmissinglabor.clickOnBody();
        estimateformatmissinglabor.verifyCancelButton();
        estimateformatmissinglabor.clickonOk();
        estimateformatmissinglabor.clickOnDoor();
        estimateformatmissinglabor.verifyCancelButton();
        estimateformatmissinglabor.clickonOk();
        estimateformatmissinglabor.clickOnRepairEstimate();
        estimateformatmissinglabor.VerifyTaxesonPDF();
        estimateformatmissinglabor.clickonSignOut();
        estimateformatmissinglabor.clickonUsername();

    }

}