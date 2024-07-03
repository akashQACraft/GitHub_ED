package tests.ticket;

//InternalRequest: Fixed PM / Regular Reading based PM Schedules (Fix ticket for I1636) ---[E3-I1813]
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class Fixedpmregularreadingbasedpmschedules extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Unit Master Screen", enabled = true)
    @Description("Test Description : Login the page and go to Unit Master Screen")
    public void T_001_gotoUnitMasterScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"),appProp.getProperty("password"));
        fixedpm.gotoUnitMasterScreen();
        fixedpm.enterUnitNumber();
        fixedpm.verifyUnitHash();

    }

    @Test(priority = 1, description = "T_002_go to PM Inspection Manager Screen", enabled = true)
    @Description("Test Description : go to PM Inspection Manager Screen")
    public void T_002_gotoPMInspectionManagerScreen() throws FileNotFoundException, InterruptedException {
       fixedpm.gotoPMInspectionManagerScreen();
       fixedpm.clickOnPMScheduleSetup();
        fixedpm.verifyCutomerWithPMScheduleSetup();
       fixedpm.entertheOwnerName();
        fixedpm.clickOnRefresh();
        fixedpm.verifyCustomerPMscheduleTital();
        fixedpm.verifyMaintanceGroup();
        fixedpm.verifyMaintenanceSchedules();
      fixedpm.clickOnMaintanceGroupRed();

    }
    @Test(priority = 2, description = "T_003_click On Fix PM", enabled = true)
    @Description("Test Description : click On Fix PM")
    public void T_003_clickOnFixPM() throws FileNotFoundException, InterruptedException {
        fixedpm.clickOnFixPM();
        fixedpm.clickUnitHash();
        fixedpm.verifyOnPMGroup();
        fixedpm. clickOnPM();
        fixedpm.verifyMaintenceDue();
        fixedpm.clickOnSaveAndExit();
        fixedpm.clickOnGenerateSchedule ();
        fixedpm.verifyRODates ();

    }
    @Test(priority = 3, description = "T_004_go to Complete RO Screen", enabled = true)
    @Description("Test Description : go to Complete RO Screen")
    public void T_004_gotoCompleteROScreen() throws FileNotFoundException, InterruptedException {
       fixedpm.gotoCompleteROScreen();
        fixedpm.entertheRefranceNumber();
        fixedpm.clickOnRefersh();
        fixedpm.clickOnReferance();
        fixedpm.verifyRoDate();
        fixedpm.verifyOnUnit();
        fixedpm.clickOnSignOut ();
        fixedpm.clickOnUsername ();


    }

}