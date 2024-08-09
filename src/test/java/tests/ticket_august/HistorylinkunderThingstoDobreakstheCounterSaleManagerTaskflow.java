package tests.ticket_august;

//#2941909896 (Post JUNE24 Update) - 'History' link under Things to Do breaks the Counter Sale Manager Taskflow---[E3-I1968]

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class HistorylinkunderThingstoDobreakstheCounterSaleManagerTaskflow extends TestDriverActions {
    @Test(priority = 0, description = "T_001_Login the page and go to CounterSale Manager Screen ", enabled = true)
    @Description("Test Description : Login the page and go to CounterSale Manager Screen")
    public void T_001_gotoCounterSaleManagerScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        historylinksunderthings.gotoCounterSaleManagerScreen();

    }

    @Test(priority = 1, description = "T_001_varify On CounterSale Manager ", enabled = true)
    @Description("Test Description : varify On CounterSale Manager")
    public void T_002_varifyOnCounterSaleManager() throws FileNotFoundException, InterruptedException {
        historylinksunderthings.varifyOnCounterSaleManager();
        historylinksunderthings.compareToBeInvoiced();
        historylinksunderthings.comapreOrderRequest();
        historylinksunderthings.comapreOrderRequest();
        historylinksunderthings.compareRetailparts();
        historylinksunderthings.compareBackOrders();
    }

    @Test(priority = 2, description = "T_003_compare LostSale ", enabled = true)
    @Description("Test Description : compare LostSale")
    public void T_003_compareLostSale() throws FileNotFoundException, InterruptedException {
        historylinksunderthings.compareLostSale();
        historylinksunderthings.compareHistory();
        historylinksunderthings.varifyToBeInvoiced();
        historylinksunderthings.comparetitle_ToBeinvoiced();
        historylinksunderthings.clickOnTitleOrderRequest ();
        historylinksunderthings.varifyTitleOrderRequest();
    }

    @Test(priority = 3, description = "T_004_varify Title Parts Catalog", enabled = true)
    @Description("Test Description :varify Title Parts Catalog")
    public void T_004_varifyTitlePartsCatalog() throws FileNotFoundException, InterruptedException {
        historylinksunderthings.compareTitleOrderRequest();
        historylinksunderthings.clickOnRetailparts ();
        historylinksunderthings.varifyTitlePartsCatalog();
        historylinksunderthings.compareTitlePartsCatalog();
        historylinksunderthings.clickOnBackOrders();
        historylinksunderthings.varifyTitleBackOrdersNotYetFulfilled();
        historylinksunderthings.compareTitleBackOrdersNotYetFulFilled();
        historylinksunderthings.clickOnLostsales();
        historylinksunderthings.varifyTitleLostsale();

    }
    @Test(priority = 4, description = "T_005_click On Sign Out", enabled = true)
    @Description("Test Description :click On Sign Out")
    public void T_005_clickOnSignOut() throws FileNotFoundException, InterruptedException {
        historylinksunderthings.compareTitleLostsales();
        historylinksunderthings.clickOnHistory();
        historylinksunderthings.varifyTitleHistory();
        historylinksunderthings.compareTitleHistory();
        historylinksunderthings.clickOnSignOut();

    }
}
