package pl.testuj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckboxesPage extends BasePage {

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "checkboxes")
    private WebElement headingText;

    @FindBy(css = ("input:nth-of-type(1)"))
    private WebElement checkBox1;

    @FindBy(css = ("input:nth-of-type(2)"))
    private WebElement checkBox2;

    public boolean ifHeadingTextIsDisplayed() { return headingText.isDisplayed(); }

    public boolean ifCheckbox2IsSelected() { return checkBox2.isSelected(); }

    public boolean ifCheckbox1IsSelected() { return checkBox1.isSelected(); }

    public void selectCheckBox1() {
        checkBox1.click();
    }

    public void selectCheckBox2() {
        checkBox2.click();
    }





}
