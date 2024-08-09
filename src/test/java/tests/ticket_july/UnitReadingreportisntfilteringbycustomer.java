package tests.ticket_july;

//2742751407 Unit Reading report isn't filtering by customer - DRISCO  ---[E3-I1918]


import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class UnitReadingreportisntfilteringbycustomer extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go To Report Scrren ", enabled = true)
    @Description("Test Description : Login the page and go To Report Scrren ")
    public void T_001_goToReport() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        unitreadingreport.gotoReport();
    }

    @Test(priority = 1, description = "T_002_verify Report Categories  ", enabled = true)
    @Description("Test Description : verify Report Categories")
    public void T_002_verifyReportCategories() throws FileNotFoundException, InterruptedException {
        unitreadingreport.verifyReportCategories();
        unitreadingreport.clickOnShopManagement ();
        unitreadingreport.clickOnUnitReading();
        unitreadingreport.clickOnScheduleReport ();

    }

    @Test(priority = 2, description = "T_003_click  On Run Report ", enabled = true)
    @Description("Test Description : click  On Run Report")
    public void T_003_clickOnRunReport() throws FileNotFoundException, InterruptedException {
        unitreadingreport.varifyOnCustomer ();
        unitreadingreport.clickOnRunReport ();
        unitreadingreport.clickOnReports ();
        unitreadingreport.varifyOnShopManagement();
        unitreadingreport.clickOnSearchIcon();

    }

    @Test(priority = 3, description = "T_004_enter The Customer Search ", enabled = true)
    @Description("Test Description : enter The Customer Search")
    public void T_004_enterTHeCustomerSearch () throws FileNotFoundException, InterruptedException {
        unitreadingreport.enterTHeCustomerSearch ();
        unitreadingreport.clickOnSearch ();
        unitreadingreport.clickOnSelect ();
        unitreadingreport.clickOnRunReport ();
        unitreadingreport.clickOnSignOut();

    }
}