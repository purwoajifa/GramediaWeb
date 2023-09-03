package webdriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class WebdriverInstance {

    public static WebDriver webDriver;

    public static void initialize(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--window-size=1644,868", "--disable-dev-shm-usage");
        chromeOptions.addArguments("--window-size=1644,868");

        webDriver = new ChromeDriver(chromeOptions);
        System.out.println(webDriver);
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        webDriver.get("https://www.gramedia.com/");
    }

    public static void quit() {
//        webDriver.close();
        webDriver.quit();
    }

}
