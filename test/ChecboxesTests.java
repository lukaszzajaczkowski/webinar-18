import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.testuj.pages.CheckboxesPage;

public class ChecboxesTests extends BaseTest {
    CheckboxesPage checkboxesPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        checkboxesPage = new CheckboxesPage(driver);
    }


    @Test
    public void ifHeadingIsDisplayed() {
        Assert.assertTrue(checkboxesPage.ifHeadingTextIsDisplayed());

    }


    @Test
    public void clickCheckbox1() {
        checkboxesPage.selectCheckBox1();
    }

    @Test
    public void clickCheckbox2() {
        checkboxesPage.selectCheckBox2();
    }

    @Test
    public void checkboxesAssert() {

    }

    @Test
    public void secondAssertCheckboxes() {
        Assert.assertTrue(checkboxesPage.ifCheckbox1IsSelected());
        Assert.assertFalse(checkboxesPage.ifCheckbox2IsSelected());
    }

}
