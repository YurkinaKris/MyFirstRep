import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import superTest.pages.SearchPage;
import superTest.tests.BaseTest;


public class SecondHandTest extends BaseTest {

    private static SearchPage searchPage;


    @BeforeClass
    public void beforeTest() throws InterruptedException {
        searchPage = PageFactory.initElements(BaseTest.driver, SearchPage.class);
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

