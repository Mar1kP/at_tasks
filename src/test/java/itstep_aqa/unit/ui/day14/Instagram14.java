package itstep_aqa.unit.ui.day14;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import day12.BaseUITest;
import day12.InstagramFactoryBO;
import day13.CustomSuiteListener;
import day13.CustomTestListener;
import day14.AllureTestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({
        CustomTestListener.class,
        CustomSuiteListener.class,
        UniversalVideoListener.class,
        AllureTestListener.class
})
public class Instagram14 extends BaseUITest {

    @Test()
    @Video
    void InstagramPOAnotherTest() {
        InstagramFactoryBO instagramBo = new InstagramFactoryBO(driver);

        instagramBo.goToSite();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        instagramBo.verifyHomePageIsOpen();
    }
    @Test()
    @Video
    void InstagramPOTest() {

        InstagramFactoryBO instagramBo = new InstagramFactoryBO(driver);

        instagramBo.goToSite();
        try {
            Thread.sleep(5000);

        }
        catch (InterruptedException e) {
            e.printStackTrace();

        }

        instagramBo.signIn();
        try {
            Thread.sleep(5000);

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