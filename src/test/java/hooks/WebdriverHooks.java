package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import webdriver.WebdriverInstance;

public class WebdriverHooks {

    @Before
    public static void initializeWebdriver(){
        WebdriverInstance.initialize();
    }

    @After
    public static void quitWebdriver(){
        WebdriverInstance.quit();
    }
}
