package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class OrganizeFavoritesArrowsNotWorking extends TestDriverActions {
    @Test(priority=0,description="T_001_Login the page and go to LicenseAdmin",enabled=true)
    @Description("Test Description : Login the page and go to LicenseAdmin Screen")
    public void T_001_gotoLicenseAdmin() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));
        americanbody.gotoPartMaster();

    }
    @Test(priority=1,description="T_002_click on Favorite ",enabled=true)
    @Description("Test Description : click on Favorite")
    public void T_002_clickonFavorite() throws FileNotFoundException, InterruptedException {
        americanbody.clickonFavorite();
        americanbody.clickonSignIn() ;
        americanbody.gotoLicenseAdmin();
        americanbody.clickonFavorite();
        americanbody.clickonSignIn() ;


    }
    @Test(priority=2,description="T_003_click on OranizeFavorites  ",enabled=true)
    @Description("Test Description : click on OranizeFavorites")
    public void T_003_clickonOranizeFavorites()  throws FileNotFoundException, InterruptedException {
        americanbody.clickonFavorite();
        americanbody.clickonOranizeFaovrites();
        americanbody.verifyfeavorite();
        americanbody.verifyOrder();
        americanbody.clickonSignIn2 ();
        americanbody.clickonUpArrow();
        americanbody.clickOnDownArrow();
        americanbody.clickOnFeavorite ();
        americanbody.clickOnCacelButton ();
        americanbody.clickonOkButton ();
    }
    @Test(priority=3,description="T_004_click on OranizeFavorites  ",enabled=true)
    @Description("Test Description : click on OranizeFavorites")
    public void T_004_clickonOranizeFavorites()  throws FileNotFoundException, InterruptedException {
        americanbody.clickonSignOut();
        americanbody. clickonUsername();

    }


}
