package day11;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Instagram {
    private WebDriver driver;

    Home home;
    SignIn signIn;

    public Instagram(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSite() {
        signIn = new SignIn(this.driver);
        signIn.goToSite();
    }

    public void signIn() {
        home = signIn.clickSignIn();
    }

    public void verifyHomePageIsOpen() {
        Assert.assertTrue(home.isOpen());
    }

}


