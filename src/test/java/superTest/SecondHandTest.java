import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import superTest.pages.SearchPage;


public class SecondHandTest extends pages.BaseTest {

    private static SearchPage searchPage;


    @BeforeClass
    public void beforeTest() throws InterruptedException {
        searchPage = PageFactory.initElements(pages.BaseTest.driver, SearchPage.class);
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.get("https://ya.ru");
        searchPage.search("погода пенза");
        String Result = SearchPage.getResult();
        Assert.assertTrue(Result.contains("Погода"));
        Assert.assertTrue(Result.contains("Пенз"));

    }
}

