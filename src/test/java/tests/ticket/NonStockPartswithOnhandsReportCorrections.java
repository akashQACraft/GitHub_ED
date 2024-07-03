package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class NonStockPartswithOnhandsReportCorrections extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page and go to Report Screen",enabled=true)
    @Description("Test Description : Login the page and go to complete Ro Screen")
    public void T_001_goToReport() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        nonstockparts. gotoReport();
      //  nonstockparts.verifyReportCategories();


    }
    @Test(priority=1,description="T_002_click On Inventory",enabled=true)
    @Description("Test Description :click On Inventory")
    public void T_002_clickOnInventory() throws FileNotFoundException, InterruptedException {
        nonstockparts.clickOnInventory();
        nonstockparts.clickOnNonStockPartsWithOnHands();
    // nonstockparts.verifyreportParameters();
        nonstockparts.enterfromdate();
        nonstockparts.clickOnRunReport();

    }
    @Test(priority=2,description="T_003_Verify Taxes on pdf ",enabled=true)
    @Description("Test Description :Verify Taxes on pdf")
    public void T_003_VerifyTaxesonPDF() throws IOException, InterruptedException {
        nonstockparts.VerifyTaxesonPDF();
        nonstockparts.clickOnInventory();
        nonstockparts.clickOnNonStockPartsWithOnHands();



    }
    @Test(priority=3,description="T_004_enter from date two ",enabled=true)
    @Description("Test Description :enter from date two")
    public void T_004_enterfromdateTwo ()  throws IOException, InterruptedException {
        nonstockparts.enterfromdateTwo ();
        nonstockparts.clickOnRunReport();
        nonstockparts.VerifyTaxesonPDFtwo();

    }
    @Test(priority=4,description="T_004_enter from date two ",enabled=true)
    @Description("Test Description :enter from date two")
    public void T_005_verifyExcludeCore()  throws IOException, InterruptedException {
        nonstockparts.gotoPartMaster ();
        nonstockparts.verifyPartList ();
        nonstockparts.enterSearchTextArea ();
        nonstockparts.verifyPartHash ();
        nonstockparts. gotoReport();
        nonstockparts.verifyOnInventory ();
        nonstockparts.verifyExcludeCore();
        nonstockparts.clickOnRunReport();
        nonstockparts.VerifyTaxesonPDFthree();
        nonstockparts.verifyreportParameters();
        nonstockparts.clickOnSignOut();

    }






}
