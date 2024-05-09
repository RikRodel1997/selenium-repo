import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        
        WebElement nestedFramesLink = driver.findElement(By.cssSelector("a[href='/nested_frames']"));
        nestedFramesLink.click();
        
        driver
            .switchTo().frame("frame-top")
            .switchTo().frame("frame-middle");
            
        String frameText = driver.findElement(By.id("content")).getText();
        
        System.out.println(frameText);
    }
}
