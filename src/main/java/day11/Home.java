package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private WebDriver driver;

    public Home(WebDriver driver) {

        this.driver = driver;

    }

    public boolean isOpen() {
        return driver
                .findElement
                        (By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[1]/div/a"))
                .isDisplayed();
    }
}
