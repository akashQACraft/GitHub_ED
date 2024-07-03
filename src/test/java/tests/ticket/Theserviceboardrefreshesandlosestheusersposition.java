package tests.ticket;

//#35008 (Turners): The Service Board refreshes and loses the users position when closing the 'Work Required' popup that users select


import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Theserviceboardrefreshesandlosestheusersposition extends TestDriverActions {

    @Test(priority = 0, description = "Test_001_Login the page and Go to service Board Screen")
    @Description("Test Description: Login the page and Go to serviceBoard Screen")
    public void Test_001_gotoserviceBoard() throws InterruptedException, IOException, FileNotFoundException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        workrequiredpopup.gotoserviceBoard();


    }
    @Test(priority = 1, description = "Test_002_verify Unit Number ")
    @Description("Test Description: verify Unit Number ")
    public void Test_002_verifyUnitNumber () throws InterruptedException, IOException, FileNotFoundException {
        workrequiredpopup.verifyUnitNumber ();
        workrequiredpopup.clickOnDIVR ();
        workrequiredpopup.verifyOnWorkRequired();
        workrequiredpopup.clickOnClose ();
        workrequiredpopup.varifyOnArrials ();

    }
    @Test(priority = 2, description = "Test_003_click On Acessories Group")
    @Description("Test Description: click On Acessories Group")
    public void Test_003_clickOnAcessoriesGroup()throws InterruptedException, IOException, FileNotFoundException {
        workrequiredpopup.clickOnDIVR ();
        workrequiredpopup.clickOnMoreWork();
        workrequiredpopup.clickOnVMRS();
        workrequiredpopup.clickOnAcessoriesGroup();
        workrequiredpopup.clickOnPlusIcon();
        workrequiredpopup.clickOnAddbutton();
    }
    @Test(priority = 3, description = "Test_004_click On Arodyanamic Device ")
    @Description("Test Description: click On Arodyanamic Device ")
    public void Test_004_clickOnArodyanamicDevice()throws InterruptedException, IOException, FileNotFoundException {
        workrequiredpopup.clickOnMoreWork();
        workrequiredpopup.clickOnVMRS();
        workrequiredpopup.clickOnArodyanamicDevice();
        workrequiredpopup.clickOnPlusIcon();
        workrequiredpopup.clickOnAddbutton();
    }
    @Test(priority = 4, description = "Test_005_click On Automatic And Manual Chassis ")
    @Description("Test Description: click On Automatic And Manual Chassis")
    public void Test_005_clickOnAutomaticAndManualChassis () throws InterruptedException, IOException, FileNotFoundException {
        workrequiredpopup.clickOnMoreWork();
        workrequiredpopup.clickOnVMRS();
        workrequiredpopup.clickOnAutomaticAndManualChassis ();
        workrequiredpopup.clickOnPlusIcon();
        workrequiredpopup.clickOnAddbutton();
        workrequiredpopup.clickOnClick2 ();


    }
    @Test(priority = 5, description = "Test_006_click on Sign Out  ")
    @Description("Test Description: click on Sign Out ")
    public void Test_006_clickOnSignOut() throws InterruptedException, IOException, FileNotFoundException {
        workrequiredpopup.clickOnDIVR();
        workrequiredpopup.clickOnCloseOne();
        workrequiredpopup.clickOnCloseTwo();
        workrequiredpopup.clickOnCloseThree();
        workrequiredpopup.clickOnDelete();
        workrequiredpopup.clickOnClose();
        workrequiredpopup.clickOnSignOut();
        workrequiredpopup.clickOnUsername();


    }
    }