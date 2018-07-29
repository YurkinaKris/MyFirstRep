package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class CompMarketPage {
 public CompMarketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
       this.driver = driver;
    }

    public WebDriver driver;

    public void scroll() {
        WebElement element = (WebElement) driver.findElements(By.cssSelector("[role='listbox']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    @FindBy(css = "локатор - кнопка-сортировка по цене")
    private static WebElement pricetLink;

    public void priceClick(){
        pricetLink.click();
     }

}

