package superTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    @FindBy(css = "[accesskey= '1']")
    private static WebElement firstResultSearch;

    @FindBy(css = "#text")
    private WebElement searchInput;

    @FindBy(css = "[type='submit']")
    private WebElement searchButton;

    public void init(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void search(String text) {
        searchInput.sendKeys(text);
        searchButton.click();
    }

    public static String getResult() {
        return firstResultSearch.getText();
    }
}


