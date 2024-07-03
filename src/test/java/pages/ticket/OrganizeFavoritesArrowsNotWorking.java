package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class OrganizeFavoritesArrowsNotWorking extends TestDriverActions {


    @FindBy(xpath = "//a[contains(text(),'Favorites')]/parent::td/following-sibling::td/child::div")
    WebElement Favorites;

    @FindBy(xpath = "//td[contains(text(),' on sign in')]")
    WebElement signIn;

    @FindBy(xpath = "(//td[contains(text(),'Favorites')])[2]")
    WebElement OrganizeFavorites;


    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement Signin;

    @FindBy(xpath = "(//a[contains(text(),'Favorites')])[2]")
    WebElement Favorite;

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement SignIn;

    @FindBy(xpath = "//span[text()='Order']")
    WebElement Order;

    @FindBy(xpath = "//span[text()='Screens']")
    WebElement Screens;

    @FindBy(xpath = "//span[text()='Move']")
    WebElement Move;

    @FindBy(xpath = "//span[text()='Move']/parent::div/parent::th/following::div/following::tr/following::div/table/tbody/tr[2]/td[3]/child::span/a/img")
    WebElement UpArrow;

    @FindBy(xpath = "//span[text()='Move']/parent::div/parent::th/following::div/following::tr/following::div/table/tbody/tr[1]/td[4]/child::span/a/img")
    WebElement DownArrow;

    @FindBy(xpath = "//span[text()='Move']/parent::div/parent::th/following::div/following::tr/following::div/table/tbody/tr[2]/td[5]/child::span/a/img")
    WebElement closeone;

    @FindBy(xpath = "//span[text()='Move']/parent::div/parent::th/following::div/following::tr/following::div/table/tbody/tr[1]/td[5]/child::span/a/img")
    WebElement CloseTwo;


    @FindBy(xpath = "(//a[contains(.,'OK')])[1]")
    WebElement OKButton;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    @FindBy(xpath = "//a[contains(.,'Sign Out')]")
    WebElement btn_signOut;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputbox_Username;

    /**
     * go to Part Master
     */
    public void gotoPartMaster() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Part Master");
    }
    /**
     * click on Favorites
     */
    public void clickonFavorite() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Favorites);
        WebElementActions.getActions().clickElement(Favorites);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * click on Show License Admin on sign in
     */
    public void clickonSignIn() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(signIn);
        WebElementActions.getActions().clickElement(signIn);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /**
     * go to Part Master
     */
    public void gotoLicenseAdmin() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Perfit");
        ReusableActions.getActions().clickChildMenu("License Admin");
    }

    /**
     * click on Organize Favorites
     */
    public void clickonOranizeFaovrites() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(OrganizeFavorites);
        WebElementActions.getActions().clickElement(OrganizeFavorites);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }



      /*click on Sign in **/
      public void clickonSignIn2 () throws InterruptedException {
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Signin);
          WebElementActions.getActions().clickElement(Signin);
          WaitActions.getWaits().loadingWait(loder);

      }
    /**
     * verify Feavorite and sign in
     */
    public void verifyfeavorite() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Favorite);
        Assert.assertTrue(Favorite.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SignIn);
        Assert.assertTrue(SignIn.isDisplayed());
    }

    /**
     * verify Order ,seens ,Move
     */
    public void verifyOrder() throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Order);
        Assert.assertTrue(Order.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Screens);
        Assert.assertTrue(Screens.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Move);
        Assert.assertTrue(Move.isDisplayed());

    }

    /**
     * click on  up Arrow
     */
    public void clickonUpArrow() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(UpArrow);
        WebElementActions.getActions().clickElement(UpArrow);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }

    /**
     * click on Down Arrow
     */
    public void clickOnDownArrow() throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(DownArrow);
        WebElementActions.getActions().clickElement(DownArrow);

        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);
    }

    /*click on Feavorite**/
    public void clickOnFeavorite () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Favorite);
        WebElementActions.getActions().clickElement(Favorite);
        WaitActions.getWaits().loadingWait(loder);
    }

        /**click on Cancel Button */
        public void clickOnCacelButton () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(closeone);
            WebElementActions.getActions().clickElement(closeone);

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CloseTwo);
            WebElementActions.getActions().clickElement(CloseTwo);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);


        }
        /**click on Ok Button */
        public void clickonOkButton () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(OKButton);
            WebElementActions.getActions().clickElement(OKButton);

            WaitActions.getWaits().loadingWait(loder);
            TestListener.saveScreenshotPNG(driver);

        }
        /**click on Sign out */
        public void clickonSignOut () throws InterruptedException {

            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_signOut);
            WebElementActions.getActions().clickUsingJS(btn_signOut);
        }
        /**click on UserName */
        public void clickonUsername  () throws InterruptedException {
            WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(inputbox_Username);
            WebElementActions.getActions().clickElement(inputbox_Username);
        }

}