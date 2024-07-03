package tests.ticket;

// #2554576385 AP Manager Outstanding Invoice Totals - SMITHYS --[E3-I1761]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class Apmanageroutstandinginvoicetotal extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Ap Manager Screen", enabled = true)
    @Description("Test Description : Login the page and go to Ap ManagerScreen")
    public void T_001_gotoApManager() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        smithys.gotoApManager();
      //  smithys.clickPFCorproID();
     //   smithys.selectPFUser();


    }

    @Test(priority = 1, description = "T_002_click On New Invoice", enabled = true)
    @Description("Test Description : click On New Invoice")
    public void T_002_clickOnNewInvoice() throws FileNotFoundException, InterruptedException {
   //     loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
    //    smithys.gotoApManager();
        smithys.clickOnNewInvoice();
        smithys.verifySearchAndSelectVendor();
        smithys.verifyName();
        smithys.entervendorName();

    }

    @Test(priority = 2, description = "T_003_click On Search ", enabled = true)
    @Description("Test Description : click On Search ()")
    public void T_003_clickOnSearch() throws FileNotFoundException, InterruptedException {
        smithys.clickOnSearch();
        smithys.clickOnSelectbutton();
        smithys.verifyVendorMiscInvoice();
        smithys.verifyRequiredInvoice();
        smithys.verifyRequiredtype();

    }
    @Test(priority = 3, description = "T_004_enter Invoice Hash  ", enabled = true)
    @Description("Test Description : enter Invoice Hash ")
    public void T_004_enterInvoiceHash() throws FileNotFoundException, InterruptedException {
        smithys.enterInvoiceHash ();
        smithys.selecType();
        smithys.clickOnAddLineItem ();
        smithys.verifyRequiredAccount ();
        smithys.verifyAccountHash ();
        smithys.verifyRequiredDevision ();
        smithys.selectDevision ();

    }
    @Test(priority = 4, description = "T_005_verify Required Description", enabled = true)
    @Description("Test Description : verify Required Description")
    public void T_005_verifyRequiredDescription () throws FileNotFoundException, InterruptedException {
        smithys.verifyRequiredUnitCost ();
        smithys.enterUnitQuantity ();
        smithys.verifyExtend ();
        smithys.verifyCancel ();
        smithys.clickOnSaveExit ();
        smithys.verifyDelete ();

    }
    @Test(priority = 5, description = "T_006_ click OnFinalize ", enabled = true)
    @Description("Test Description : verify Required Description")
    public void T_006_clickOnFinalize () throws FileNotFoundException, InterruptedException {
        smithys.clickOnFinalize ();
        smithys.clickonDisplayTotals ();
        smithys.addingcurrentValue();
        smithys.adding30to60 ();
        smithys.verifyDisplayTotalValues();
        smithys.clickOnlocation ();
        smithys. clickOnSignOut();

    }
}
