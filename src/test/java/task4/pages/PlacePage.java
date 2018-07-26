package task4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlacePage {
    public PlacePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "#city__front-input")
    private static WebElement cityInput;

    @FindBy(css = ".b-autocomplete-item__reg")
    private WebElement cityClick;

    public void placeInput(String text) {
        cityInput.clear();
        cityInput.sendKeys(text);
        cityClick.click();
    }
}