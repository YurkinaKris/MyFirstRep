package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import superTest.tests.BaseTest;


public class Test5 {
    public class TestLondon extends BaseTest {
        private static OpenMarketPage openMarketPage;
        private static MarketPage marketPage;
       private static CompMarketPage compMarketPage;

       @BeforeClass
       public void beforeTest() {
           openMarketPage = PageFactory.initElements(BaseTest.driver, OpenMarketPage.class);
           marketPage = PageFactory.initElements(BaseTest.driver, MarketPage.class);
           compMarketPage = PageFactory.initElements(BaseTest.driver, CompMarketPage.class);
        }

        @Test
        public void Lon() {
            driver.get("https://yandex.ru");
            openMarketPage.marketClick();
            marketPage.tabletClick();
            compMarketPage.scroll();
            Select numberDropDown  = new Select(driver.findElement(By.cssSelector(".select__option")));
            numberDropDown.selectByValue ("12");
            // тут вставить проверку - количество элементов = 12 - как посчитать элементы?
            compMarketPage.scroll();
            Select numberDropDown1  = new Select(driver.findElement(By.cssSelector(".select__option")));
            numberDropDown1.selectByValue ("48");
            // тут вставить проверку - количество элементов = 48 - как посчитать элементы?
            compMarketPage.priceClick();
            // проверка сортировки - какая команда?
            // проверка кнопки - в коде нет соответствующего локатора этой картинки
            
        }
   }
}
