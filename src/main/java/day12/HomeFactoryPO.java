package day12;

import day12.decorator.FieldDec;
import day12.decorator.Button;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class HomeFactoryPO {
    @FindBy(xpath = "/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[1]/div/a")
    Button home;

    private WebDriver driver;

    public HomeFactoryPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new FieldDec(driver), this);
    }

    @Step
    public boolean isOpen() {
        return home.isOnScreen();
    }
}
