import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.testuj.pages.DynamicLoadingPage;

import static pl.testuj.pages.DynamicLoadingPage.EXPECTED_CONFIRMATION_TEXT;

/*
Zadanie domowe:
1. Rozbudować checkConfirmationText() o sprawdzenieczy loadingBar jest widoczny i następnie czy zniknął
2. Dorobić podstronę (dowolną) dla http://the-internet.herokuapp.com/ i napisać testy
 */
public class DynamicLoadingPageTests extends BaseTest {
    DynamicLoadingPage dynamicLoadingPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        dynamicLoadingPage = new DynamicLoadingPage(driver);
    }

    @Test
    public void checkConfirmationText() {
        dynamicLoadingPage.clickStartButton();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("finish")));

        String actualConfirmationText = dynamicLoadingPage.finishLoadingConfirmation();

        Assert.assertEquals(actualConfirmationText, EXPECTED_CONFIRMATION_TEXT);
    }
}
