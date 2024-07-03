package tests.ticket;

//#2747350950 Label Exception Error - CALEDON-[E3-I1839]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class Labelexceptionerror extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to PysicalCount Screen ", enabled = true)
    @Description("Test Description : Login the page and go to PysicalCount  Screen")
    public void T_001_gotoPysicalCount() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        caledon.gotoPysicalCount();


    }

    @Test(priority = 1, description = "T_002_click On Add New Count  ", enabled = true)
    @Description("Test Description : click On Add New Count ")
    public void T_002_clickOnAddNewCount () throws FileNotFoundException, InterruptedException {
        caledon.clickOnAddNewCount();
        caledon.verifyOnSelectWarehouse();
        caledon.verifyOnContentTYpe();
        caledon.verifyOnOk();
        caledon.clickOnok();
    }
    @Test(priority = 2, description = "T_003_verify On physical Count   ", enabled = true)
    @Description("Test Description : verify On physical Count ")
    public void T_003_verifyOnphysicalCount () throws FileNotFoundException, InterruptedException {
        caledon.verifyOnphysicalCount();
        caledon.verifyOnLocation();
        caledon. enterthePartTextArea ();
        caledon.clickOnCountButton ();
        caledon. clickOnWarehouse ();
        caledon.verifyOnMatchCount();
    }
    @Test(priority = 3, description = "T_004_click On Printer Icon    ", enabled = true)
    @Description("Test Description : click On  Printer  Icon   ")
    public void T_004_clickOnPrinterIcon ()  throws FileNotFoundException, InterruptedException {
        caledon.verifyOnAddUPCBarCode ();
        caledon.clickOnPrinterIcon ();
        caledon.clickOnSaveAndExit ();
        caledon.clickOnSignOut ();
        caledon.clickOnUserName ();

    }
}