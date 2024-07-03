package tests.parts;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class CounterSaleInvoiceCharacterLimit extends TestDriverActions {

    @Test(priority=0 , description = "Test_001 Login the page and Go to counterSaleManager")
    @Description("Test Description : Login the page and Go to counterSaleManager")
    public void Test_001_goto_countersaleManager_screen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password") );
        countersaleinvoicecharacterlimit.gotoCounterSaleManagerScreen();

    }
    @Test(priority=1 , description = "Test_002 click on History Tab ")
    @Description("Test Description : click on History Tab ")
    public void Test_002_clickonHistory ()throws FileNotFoundException, InterruptedException {
        countersaleinvoicecharacterlimit.clickonHistory();

    }
    @Test(priority=2 , description = "Test_003  verify on invoice  ")
    @Description("Test Description : verify on invoice ")
    public void Test_003_verifyInvoice ()throws FileNotFoundException, InterruptedException {
        countersaleinvoicecharacterlimit. verifyInvoice ();
        countersaleinvoicecharacterlimit.clickonInvoiceNo ();

    }
    @Test(priority=3 , description = "Test_004  verify on invoice  ")
    @Description("Test Description : verify on invoice ")
    public void Test_004_verifyCountersale ()throws FileNotFoundException, InterruptedException {
        countersaleinvoicecharacterlimit.verifyCountersale();
        countersaleinvoicecharacterlimit.verifyRequiredLocation ();
        countersaleinvoicecharacterlimit.verifyonsale ();
        countersaleinvoicecharacterlimit.verifyCustomer ();

    }
    @Test(priority=4 , description = "Test_005 click on Reprint")
    @Description("Test Description : click on Reprint ")
    public void Test_005_clickOnReprint ()throws FileNotFoundException, InterruptedException {
        countersaleinvoicecharacterlimit.clickOnReprint();
        countersaleinvoicecharacterlimit.clcikonSignout();
        countersaleinvoicecharacterlimit.clickonUsername ();

    }

}
