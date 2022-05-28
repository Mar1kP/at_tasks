package day10.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        String driverPath = "C:\\Users\\Mark\\IdeaProjects\\at_task1\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/questions");

        WebElement askQuestionButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/a"));
        System.out.println(askQuestionButton);
        System.out.println(askQuestionButton.getText());
        System.out.println(askQuestionButton.getLocation());
        askQuestionButton.click();

        WebElement tagsText = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[3]/ul/li/a"));
        System.out.println(tagsText);
        System.out.println(tagsText.getText());
        System.out.println(tagsText.getLocation());

        WebElement activeText = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/div/a"));
        System.out.println(activeText);
        System.out.println(activeText.getText());
        System.out.println(activeText.getLocation());

        WebElement tags = driver.findElement(By.xpath("/html/body/header/div/ol/li/a"));
        System.out.println(tags);
        System.out.println(tags.getText());
        System.out.println(tags.getLocation());



        driver.close();
        driver.quit();
    }

}
