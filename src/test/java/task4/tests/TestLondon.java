package task4.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import superTest.tests.BaseTest;
import task4.pages.PlacePage;
import task4.pages.StartPage;
import java.util.ArrayList;
import java.util.List;

public class TestLondon extends BaseTest {
    private static StartPage startPage;
    private static PlacePage placePage;

    @BeforeClass
    public void beforeTest() {
        startPage = PageFactory.initElements(BaseTest.driver, StartPage.class);
        placePage = PageFactory.initElements(BaseTest.driver, PlacePage.class);
    }

    @Test
    public void Lon() {
        driver.get("https://yandex.ru");
        startPage.startClickGeo();
        placePage.placeInput("Лондон");
        startPage.startClickMore();
        List<WebElement> elems = driver.findElements(By.cssSelector(".popup__content"));
        ArrayList<String> arrayLondon = new ArrayList<String>();
        for (WebElement elem : elems) {
            arrayLondon.add(elem.getText());
        }
        startPage.startClickGeo();
        placePage.placeInput("Париж");
        startPage.startClickMore();
        List<WebElement> elems1 = driver.findElements(By.cssSelector(".popup__content"));
        ArrayList<String> arrayParis = new ArrayList<String>();
        for (WebElement elem : elems1) {
            arrayParis.add(elem.getText());
        }
        Assert.assertEquals(arrayLondon,arrayParis);
    }
}