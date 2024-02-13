import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


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

        
        // Assert That The Text Is The Same


        // Enter Text In Input
        
        
        // Trigger The Alert And Verify That The Text Is In Alert
    }
}
