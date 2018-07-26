package task5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMarketPage {
    public OpenMarketPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "[data-id='market']")
    private static WebElement marketLink;

    public void marketClick() {
        marketLink.click();
    }

}
