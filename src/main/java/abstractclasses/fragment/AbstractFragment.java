package abstractclasses.fragment;

import org.openqa.selenium.WebElement;

public abstract class AbstractFragment {
    private WebElement rootElement;

    protected AbstractFragment()
    {
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getRootElement() {
        return rootElement;
    }
}
