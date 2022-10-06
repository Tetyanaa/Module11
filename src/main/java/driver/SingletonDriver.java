package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
    private final static SingletonDriver INSTANCE = new SingletonDriver();
    private WebDriver webDriver;

    private SingletonDriver() {
        this.webDriver = new ChromeDriver();
    }

    public WebDriver getWebDriver() {
        return this.webDriver;
    }

    public static SingletonDriver getInstance() {
        return INSTANCE;
    }
}
