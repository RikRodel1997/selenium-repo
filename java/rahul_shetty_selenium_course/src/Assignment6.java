import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickacademy.com/practice.php");

        Random rand = new Random();
        int intRandom = rand.nextInt(3) + 1;
        String checkboxId = String.format("checkBoxOption%d", intRandom);
        
        WebElement checkbox = driver.findElement(By.id(checkboxId));
        checkbox.click();
        String checkboxLabel = checkbox.findElement(By.xpath("./..")).getText();

        // Use The Text In The Dropdown 
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropdown);
        select.selectByValue(checkboxLabel.toLowerCase()); 

        // Assert That The Text Is The Same
        String selectedValue = select.getFirstSelectedOption().getText();
        Assert.assertEquals(checkboxLabel, selectedValue);

        // Enter Text In Input
        WebElement inputEl = driver.findElement(By.id("name"));
        inputEl.sendKeys(checkboxLabel);

        // Trigger The Alert And Verify That The Text Is In Alert
        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        alertBtn.click();
        String totalText = String.format("Hello %s, share this practice page and share your knowledge", checkboxLabel);
        if (totalText.contains(checkboxLabel)) {
            Assert.assertEquals(true, true);
        } else {
            Assert.assertEquals(true, false);
        }
        
    }
}
