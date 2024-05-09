import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

    public static void main(String[] args) {
        String[] testdata = new String[] {
                "rahulshettyacademy",
                "learning",
                "consult"
        };

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        Select select = new Select(driver.findElement(By.cssSelector("select[class='form-control']")));

        driver.findElement(By.id("username")).sendKeys(testdata[0]);
        driver.findElement(By.id("password")).sendKeys(testdata[1]);
        select.selectByValue(testdata[2]);
        radioButtons.get(1).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

        driver.findElement(By.id("okayBtn")).click();
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("terms")).isSelected();
        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));

        List<WebElement> addBtns = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
        for (WebElement addBtn : addBtns) {
            System.err.println(addBtn.getText());
            addBtn.click();
        }

        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-success']")));
        driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
    }
}
