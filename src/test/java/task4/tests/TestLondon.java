package task4.tests;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import superTest.tests.BaseTest;
import task4.pages.PlacePage;
import task4.pages.StartPage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


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
        placePage.place("Лондон");
        startPage.startClickMore();
        List<WebElement> elems = driver.findElements(By.cssSelector("[data-statlog = 'tabs.more']"));
        ArrayList<String> elemsText = new ArrayList<String>();
        for (WebElement elem : elems) {
            elemsText.add(elem.getText());
        }

        startPage.startClickGeo();
        placePage.place("Париж");
        startPage.startClickMore();
        List<WebElement> elems1 = driver.findElements(By.cssSelector("[data-statlog = 'tabs.more']"));
        ArrayList<String> elemsText1 = new ArrayList<String>();
        for (WebElement elem : elems1) {
            elemsText1.add(elem.getText());
        }
        elemsText.equals(elemsText1);


    }
}















            // String[] Rez = SearchLink2.getText();
            //WebElement FirstResultSearch = driver.findElement(By.cssSelector("[accesskey= '1']"));
            //String Result = FirstResultSearch.getText();
           // Assert.assertTrue(Result.contains("Погода"));
           // Assert.assertTrue(Result.contains("Пенз"));





