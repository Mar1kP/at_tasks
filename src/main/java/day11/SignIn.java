package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

    private WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSite() {

        driver.get("https://www.instagram.com/");


    }

    public Home clickSignIn() {
        this.insertLogin();
        this.insertPassword();
        driver.findElement
                (By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button"))
                .click();
        return new Home(driver);
    }

    public void insertLogin() {
        driver.findElement
                (By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input"))
                .sendKeys("");
    }

    public void insertPassword() {
        driver.findElement
                (By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input"))
                .sendKeys("");
    }

}
