package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class Makeanmodelsbecominginactive extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to Ap Manager Screen", enabled = true)
    @Description("Test Description : Login the page and go to Ap ManagerScreen")
    public void T_001_gotoApManager() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        lotsventures.gotoCorporateSetUpManager();


    }
    @Test(priority = 1, description = "T_002_click On Equipment", enabled = true)
    @Description("Test Description : click On Equipment")
    public void T_002_clickOnEquipment() throws FileNotFoundException, InterruptedException {
        lotsventures.clickOnEquipment();
        lotsventures.clickOnMakeAndModel();
        lotsventures.verifyMakes();
        lotsventures.clickOnMakesActiveORDeActive();
        lotsventures.clickOnModeles();

    }
    @Test(priority = 2, description = "T_003_click On FeatureValues", enabled = true)
    @Description("Test Description : click On Feature Values")
    public void T_003_clickOnFeatureValues() throws FileNotFoundException, InterruptedException {
        lotsventures.clickOnFeatureValues();
        lotsventures.selectFeaturesCodeActiveOrDeActive();
        lotsventures. clickOnMaintanceGroup();
        lotsventures. clickOnMaintanceGroup();
        lotsventures.selectMaintanceGroupActiveOrDeActive();
        lotsventures. clickOnParts();


    }
    @Test(priority = 3, description = "T_004_select product Group", enabled = true)
    @Description("Test Description : select product Group")
    public void T_004_selectproductGroup() throws FileNotFoundException, InterruptedException {
        lotsventures.gotoApManager();
        lotsventures.clickOnUnit();
        lotsventures.clickOnMoreinfo();
        lotsventures.clickOnFeatures();

    }
    @Test(priority = 4, description = "T_004_", enabled = true)
    @Description("Test Description : select product Group")
    public void T_005_clickOnFeatures() throws FileNotFoundException, InterruptedException {
        lotsventures.clickOnFeatures();
        lotsventures.clickOnAddFeatures();
        lotsventures.verifyFeatures();
          lotsventures.clickOnOk();
        lotsventures.clickOnSaveOrExit();
        lotsventures.clickOnSaveORExit2();
        lotsventures.clickOnSignOut();


    }

}