package abstractclasses.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    protected final WebDriver driver;
    protected String pageUrl;

    public AbstractPage(WebDriver driver, String pageUrl) {
        this.driver = driver;
        this.pageUrl = pageUrl;

        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void open() {
        this.driver.get(this.pageUrl);
    }
}
