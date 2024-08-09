package tests.ticket_august;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class BackOrderLoadingTime extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to CounterSale Manager Screen ", enabled = true)
    @Description("Test Description : Login the page and go to CounterSale Manager Screen")
    public void T_001_gotoCounterSaleManagerScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        backorderloadingtime.gotoCounterSaleManagerScreen();
    }
    @Test(priority = 1, description = "T_002_varify Counter Sale Manager ", enabled = true)
    @Description("Test Description : varify Counter Sale Manager ")
    public void T_002_varifyCounterSaleManager() throws FileNotFoundException, InterruptedException {
        backorderloadingtime.varifyCounterSaleManager();
        backorderloadingtime.clickOnBackOrder ();
        backorderloadingtime.varifyBackOrderNotYetFufilled ();
    }
    @Test(priority = 2, description = "T_003_varify Counter Sale Manager ", enabled = true)
    @Description("Test Description : varify Counter Sale Manager ")
    public void T_003_varifyCounterSaleManager() throws FileNotFoundException, InterruptedException {
        backorderloadingtime.enterTheOriginalDateFrom ();
        backorderloadingtime.showPartsWithOnhandsOnly ();
        backorderloadingtime.clickOnSignOut();

    }
}