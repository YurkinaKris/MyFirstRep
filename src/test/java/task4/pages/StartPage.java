package task4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {

        public StartPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }
        public WebDriver driver;

        @FindBy(css = ".geolink__reg")
        private static WebElement geoLink;

        @FindBy(css = "[data-statlog = 'tabs.more']")
        private WebElement moreLink;




    public void startClickMore() {
        moreLink.click();
    }

    public void startClickGeo() {
        geoLink.click()   ;
    }
}
