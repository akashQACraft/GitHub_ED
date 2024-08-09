package tests.ticket;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public class Partresequencing extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to Complete RO  Screen", enabled = true)
    @Description("Test Description : Login the page and go to Complete RO   Screen")
    public void T_001_goToCompleteRoScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        partresequesencing.goToCompleteROScreen();


    }
    @Test(priority = 1, description = "T_002_click On New RO", enabled = true)
    @Description("Test Description :click On New RO")
    public void T_002_clickOnNewRO() throws FileNotFoundException, InterruptedException {
          partresequesencing.clickOnNewRO();
        partresequesencing.clickOnNewUnit();
        partresequesencing.verifySearchAndSelectUnitOwner();
       partresequesencing.enterUnitOwner();
        partresequesencing.clickOnSelect1();

    }

    @Test(priority = 2, description = "T_003_enter The Unit Number ", enabled = true)
    @Description("Test Description :enter The Unit Number ")
    public void T_003_enterTheUnitNumber() throws FileNotFoundException, InterruptedException {
        partresequesencing.verifyUnitHash();
        partresequesencing.enterTheUnitNumber();
        partresequesencing.verifyOnDescription();
        partresequesencing.enterTheDescription();
        partresequesencing.verifyOnVIN();
        partresequesencing.entertheVIN();
        partresequesencing.verifyYear();
        partresequesencing.entertheyear();

    }

    @Test(priority = 3, description = "T_004_verify Truck And Trailer ", enabled = true)
    @Description("Test Description :verify Truck And Trailer  ")
    public void T_004_verifyTruckAndTrailer() throws FileNotFoundException, InterruptedException {
       partresequesencing.verifyTruckAndTrailer();
       partresequesencing.clickOnSearchIcon();
        partresequesencing.clickOnSelect();
        partresequesencing.clickOnSaveAndExit();
       partresequesencing.verifyNewRepairOrder();
        partresequesencing.clickOnSelectButton();
       partresequesencing.verifyRO();
       partresequesencing.clickOnAddLabour();
        partresequesencing.clickOnAddButton ();
        partresequesencing.clickOnAddParts1();
        partresequesencing.clickOnIssuePart();

    }

    @Test(priority = 4, description = "T_005_click On Add  Part ", enabled = true)
    @Description("Test Description :click On Add  Part  ")
    public void T_005_clickOnAddPart2() throws FileNotFoundException, InterruptedException {
        partresequesencing.clickOnAddPart2();
        partresequesencing.clickOnIssuePart();
        partresequesencing.clickOnAddPart3();
       partresequesencing.clickOnIssuePart();
        partresequesencing.clickOnAddPart4();
        partresequesencing.clickOnIssuePart();
        partresequesencing.clickOnAddPart5();
        partresequesencing.clickOnIssuePart();
        partresequesencing .clickOnClose();

    }
    @Test(priority = 5, description = "T_006_verify Part Name() ", enabled = true)
    @Description("Test Description :click On Add  Part  ")
    public void T_006_verifyPartName() throws IOException, InterruptedException {
        partresequesencing.varifyOnAcessoriesGroup ();
        partresequesencing. clickOnReSequence();
        partresequesencing.compareWebElementLists2();
        partresequesencing.clickOnClose2();
        partresequesencing.clickOnCostProof();
        partresequesencing.verifyPDF();
        partresequesencing.clickOnCustomerProof();
        partresequesencing.verifyPDF1();
        partresequesencing.clickOnQuickEstimate();
        partresequesencing.verifyPDF2();
        partresequesencing.clickOnPickList();
        partresequesencing.verifyPDF3();
        partresequesencing.clickOnRepairOrder();
        partresequesencing.verifyPDF4();
        partresequesencing.clickOnSignOut();
        partresequesencing.clickOnUsername();


    }
}