package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SuggestedOrderReporttrucatePartNumber extends TestDriverActions {

    @Test(priority=0,description="T_001_Login the page and go to OrderPart Screen",enabled=true)
    @Description("Test Description : Login the page and go to OrderPart Screen")
    public void T_001_gotoOrderPartsScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        reportrestockorreorder.gotoOrderPartsScreen();

    }
    @Test(priority=1,description="T_002_click on Suggested Orders ",enabled=true)
    @Description("Test Description : click on Suggested Orders")
    public void T_002_clickOnSuggestedOrders () throws FileNotFoundException, InterruptedException {
        reportrestockorreorder.clickOnSuggestedOrders();
        reportrestockorreorder.verifyRestocks ();
        reportrestockorreorder.clickOnGenrateOrder ();
        reportrestockorreorder.enterVendorTextArea ();
        reportrestockorreorder.clickOnGenerate ();

    }
    @Test(priority=2,description="T_003_click on Vendor Name ",enabled=true)
    @Description("Test Description : click on Vendor Name ")
    public void T_003_clickonVendorName ()  throws FileNotFoundException, InterruptedException {
        reportrestockorreorder.clickonVendorName ();
        reportrestockorreorder.veifypartHash ();
        reportrestockorreorder.verifyDescription ();
        reportrestockorreorder.verifyUOM ();
     //   reportrestockorreorder.verifyStockUOM ();
      //  reportrestockorreorder.verifyUnitCost ();
        reportrestockorreorder.verifysubmitPO ();
        reportrestockorreorder.verifySaveExit ();

    }
    @Test(priority=3,description="T_004_click On Print List",enabled=true)
    @Description("Test Description : click On Print List ")
    public void T_004_clickOnPrintList () throws IOException, InterruptedException {
        reportrestockorreorder.clickOnPrintList();
        reportrestockorreorder.VerifyTaxesonPDF();
        reportrestockorreorder.clickOnCancel();


    }
    @Test(priority=4,description="T_005_ go to part Master ",enabled=true)
    @Description("Test Description : go to part Master ")
    public void T_005_gotoPartMaster() throws IOException, InterruptedException {
        reportrestockorreorder.gotoPartMaster();
        reportrestockorreorder.verifyPartLsit ();
        reportrestockorreorder.enterPartNumber ();
        reportrestockorreorder.clickOnRefresh ();
        reportrestockorreorder.verifyPartName ();
    }
    @Test(priority=5,description="T_006_click on sign out ",enabled=true)
    @Description("Test Description : click on sign out")
    public void T_006_clickOnSignOut () throws IOException, InterruptedException {
        reportrestockorreorder.clickOnSignOut();
        reportrestockorreorder. clickOnUserName();


    }
}
