package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RentalEquipmentUtilizationParameternotworking extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Reports Screen ", enabled = true)
    @Description("Test Description : Login the page and go to Reports  Screen")
    public void T_001_gotoReports() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        triton.gotoReports();

    }
    @Test(priority = 1, description = "T_002_verify Report Categories ", enabled = true)
    @Description("Test Description : verify Report Categories ")
    public void T_002_verifyReportCategories() throws FileNotFoundException, InterruptedException {
        triton.verifyReportCategories();
        triton.clickOnRentalAndLease ();

    }
    @Test(priority = 2, description = "T_003_click On Rental Equipment Utilization  ", enabled = true)
    @Description("Test Description : click On Rental Equipment Utilization ")
    public void T_003_clickOnRentalEquipmentUtilization () throws IOException, InterruptedException {
        triton.clickOnRentalEquipmentUtilization ();
        triton.varifyOnShedulReport ();
        triton.clickOnRunReport ();
        triton. VerifyTaxesonPDF();


    }
    @Test(priority = 3, description = "T_004_click On Available Units Only   ", enabled = true)
    @Description("Test Description : click On Available Units Only ")
    public void T_004_clickOnAvailableUnitsOnly () throws IOException, InterruptedException {
        triton.varifyAvailableUnitsOnly();
        triton.clickOnAvailableUnitsOnly();
        triton.clickOnRunReport ();
        triton.VerifyTaxesonPDFOne();
        triton.clickOnAvailableUnitsOnly();
        triton.varifyOnNotRentedOnly();
    }
    @Test(priority = 4, description = "T_005_click On Not Rented Only   ", enabled = true)
    @Description("Test Description : click On Not Rented Only ")
    public void T_005_clickOnNotRentedOnly () throws IOException, InterruptedException {
        triton.clickOnNotRentedOnly ();
        triton.VerifyTaxesonPDFThree();
        triton. clickOnSignOut();

    }
}