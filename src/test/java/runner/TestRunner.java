package runner;

import desktop.pages.LoginPage;
import driver.SingletonDriver;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

//@RunWith(JUnitPlatform.class)
//@SelectPackages("put your packages here")

public class TestRunner {

    @AfterAll
    public static void afterAll() {
        SingletonDriver.getInstance().getWebDriver().quit();
    }

    @Test
    public void loginWithCredentials() {
        WebDriver webDriver = SingletonDriver.getInstance().getWebDriver();
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.open();
        loginPage.setEmail("random@mail.com");
        loginPage.setPassword("strong password");
        loginPage.submitLogin();
    }
}
