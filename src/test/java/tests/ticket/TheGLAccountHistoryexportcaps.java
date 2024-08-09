package tests.ticket;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.TestDriverActions;

import java.io.FileNotFoundException;

public class TheGLAccountHistoryexportcaps extends TestDriverActions {

    @Test(priority = 0, description = "T_001_Login the page and go to CompleteRO Screen ", enabled = true)
    @Description("Test Description : Login the page and go to CompleteRO Screen")
    public void T_001_goToCompleteROScreen() throws FileNotFoundException, InterruptedException {
        loginPage.loginWithValidCredentials(appProp.getProperty("username"), appProp.getProperty("password"));

        
    }
}
