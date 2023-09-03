package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static webdriver.WebdriverInstance.webDriver;

public class LoginPage {

    public void isOnLandingPage(){
        System.out.println("masuk 2");
        By locator = By.xpath("(//img[@alt='Gramedia Logo'])[1]");
        boolean t = webDriver.findElement(By.xpath("(//img[@alt='Gramedia Logo'])[1]")).isDisplayed();
        System.out.println(t);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//        FluentWait<WebDriver> wait = new FluentWait<>(webDriver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofMillis(500))
//                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void clickButtonMasuk(){
        By locator = By.xpath("//button[normalize-space()='Masuk']");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void inputEmail(String email){
        By locator = By.name("email");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(email);
    }

    public void inputPassword(String password){
        By locator = By.name("password");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(password);
    }

    public void clickSubmit(){
        By locator = By.className("submit");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void isOnGramediaHomepage(){
        By locator = By.className("icon ion-person");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void search(String name){
        By locator = By.name("search");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(name);
        element.sendKeys(Keys.ENTER);
    }

    public void inSearchResult(String name){
        By locator = By.xpath("(//h2[normalize-space()='Filter'])");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
