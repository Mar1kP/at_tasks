package day12;

import day12.decorator.FieldDec;
import day12.decorator.*;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInFactoryPO {
    @FindBy(xpath = "/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input")
    Input loginArea;

    @FindBy(xpath = "/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input")
    Input passwordArea;

    @FindBy(xpath = "/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button")
    MouseAction.Button signInButton;

    private WebDriver driver;

    public SignInFactoryPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new FieldDec(driver), this);
    }

    @Step
    public void goToSite() {
        driver.get("https://www.instagram.com/");
    }

    @Step
    public HomeFactoryPO clickSignIn() {
        this.insertLogin();

        this.insertPassword();
        //signInButton.click();
        return new HomeFactoryPO(driver);
    }

    @Step
    public void insertLogin() {
        loginArea.put("");
    }

    @Step
    public void insertPassword() {
        passwordArea.put("");
    }
}
