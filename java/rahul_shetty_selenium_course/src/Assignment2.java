import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Assignment2Page page = new Assignment2Page(driver);
		page.getNameInput().sendKeys("John Doe");
		page.getEmailInput().sendKeys("joh.doe@example.com");
		page.getPasswordInput().sendKeys("password");
		page.getIceCreamCheckbox().click();
		page.getEmployedEmploymentStatusRadio().click();
		page.getDateOfBirthInput().sendKeys("01/01/2000");
		page.getSubmitButton().click();
		System.out.println(page.getSuccesMessage().getText());
		driver.close();
	}
}
