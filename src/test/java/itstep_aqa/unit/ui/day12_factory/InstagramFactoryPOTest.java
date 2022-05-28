package itstep_aqa.unit.ui.day12_factory;

import day12.BaseUITest;
import day12.InstagramFactoryBO;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class InstagramFactoryPOTest extends BaseUITest {

    @Test()
    void InstagramPOTest() {
        InstagramFactoryBO instagramBo = new InstagramFactoryBO(driver);

        instagramBo.goToSite();
        try {
            Thread.sleep(7000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        instagramBo.signIn();
        try {
            Thread.sleep(7000);
        }
        catch (InterruptedException e) {
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