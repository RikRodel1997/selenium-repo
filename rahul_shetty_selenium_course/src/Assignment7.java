import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickacademy.com/practice.php");
        WebElement table = driver.findElement(By.id("product"));

        // Print number of rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println(String.format("The amount of rows is %d", rows.size()));

        // Print number of columns
        List<WebElement> cols = table.findElements(By.tagName("th"));
        System.out.println(String.format("The amount of cols is %d", cols.size()));

        // Print data in second row
        Integer rowCount = 0;
        for (WebElement row: rows) {
            if (rowCount == 2) {
                System.out.println(row.getText());
            }
            rowCount++;
        }

        driver.close();
    }
}
