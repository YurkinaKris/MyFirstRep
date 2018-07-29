package task4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(css = ".home-tabs__more-link")
    private List<WebElement> elems;

    public ArrayList<String> getTextOfGeo() {
        ArrayList<String> arrayGeo = new ArrayList<String>();
        for (WebElement elem : elems)
            arrayGeo.add(elem.getText());
        return arrayGeo;
    }

    public void placeInput(String text) {
        cityInput.clear();
        cityInput.sendKeys(text);
        cityClick.click();
    }
}