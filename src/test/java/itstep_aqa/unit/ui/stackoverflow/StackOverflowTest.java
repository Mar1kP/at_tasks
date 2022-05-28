package itstep_aqa.unit.ui.stackoverflow;

import day12.BaseUITest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;


public class StackOverflowTest extends BaseUITest {

    @Test
    void stackOverflowTest() {

        driver.get("https://stackoverflow.com/questions");

        WebElement tagsText = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/nav/ol/li[2]/ol/li[3]/a/div/div"));

        WebElement activeText = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[3]/ul/li/a"));

        WebElement tags = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/div/a"));

        WebElement askQuestionButton = driver.findElement(By.xpath("/html/body/header/div/ol/li/a"));

        Assert.assertTrue(tagsText.isDisplayed());
        Assert.assertTrue(activeText.isDisplayed());
        Assert.assertTrue(tags.isDisplayed());
        Assert.assertTrue(askQuestionButton.isDisplayed());

        Assert.assertEquals(tagsText.getText(), "text");
        Assert.assertEquals(activeText.getText(), "text");
        Assert.assertEquals(tags.getText(), "text");
        Assert.assertEquals(askQuestionButton.getText(), "text");
    }


    @AfterTest
    void CloseDriver(){
        driver.close();
        driver.quit();
    }
}