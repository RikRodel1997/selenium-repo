import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	// Declare the WebDriver as a class variable
	private static WebDriver driver;

	public static void main(String[] args) {
		if (driver == null) {
			driver = new ChromeDriver();
		}

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement firstCheckbox = driver.findElement(By.id("checkBoxOption1"));
		firstCheckbox.click();
		if (firstCheckbox.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}

		List<WebElement> allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("There are " + allCheckBoxes.size() + " checkboxes on the page");

		driver.close();
	}
}
