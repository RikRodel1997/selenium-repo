import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment2Page {

    private WebDriver driver;

    public Assignment2Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNameInput() {
        return driver.findElement(By.cssSelector("input[name='name']"));
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.cssSelector("input[name='email']"));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.id("exampleInputPassword1"));
    }

    public WebElement getIceCreamCheckbox() {
        return driver.findElement(By.id("exampleCheck1"));
    }

    public WebElement getGenderDropdown() {
        return driver.findElement(By.id("exampleFormControlSelect1"));
    }

    public WebElement getEmployedEmploymentStatusRadio() {
        return driver.findElement(By.id("inlineRadio2"));
    }

    public WebElement getDateOfBirthInput() {
        return driver.findElement(By.name("bday"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.cssSelector("input[type='submit']"));
    }

    public WebElement getSuccesMessage() {
        return driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
    }
}