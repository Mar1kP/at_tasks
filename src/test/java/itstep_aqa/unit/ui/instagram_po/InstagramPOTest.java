package itstep_aqa.unit.ui.instagram_po;

import day11.Instagram;
import day12.BaseUITest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class InstagramPOTest extends BaseUITest {

    @Test()
    void InstagramTest() {
        Instagram instagramBo = new Instagram(driver);

        instagramBo.goToSite();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        instagramBo.signIn();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        instagramBo.verifyHomePageIsOpen();
    }


    @AfterTest
    void CloseDriver(){
        driver.close();
        driver.quit();
    }
}