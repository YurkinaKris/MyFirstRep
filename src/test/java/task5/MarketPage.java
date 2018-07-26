package task5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPage {
    public MarketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(css = "a[href='https//market.yandex.ru/catalog/54545/list?hid=6427100&track=menuleaf']")
    private static WebElement tabletLink;

    public void tabletClick() {
        tabletLink.click();
    }
}
