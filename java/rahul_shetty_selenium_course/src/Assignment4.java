import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        
        String originalWindowId = driver.getWindowHandle();

        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (window != originalWindowId) {
                driver.switchTo().window(window);
            }
        }
        driver.switchTo().window(originalWindowId);
        String openingANewWindowText = driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
        assert openingANewWindowText.equals("Opening a new window");
        System.out.println(openingANewWindowText);

        driver.quit();
    }
}
