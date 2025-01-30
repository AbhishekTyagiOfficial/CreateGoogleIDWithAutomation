import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoClassAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\kajal\\Documents/chromedriver.exe");

//		create object
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();

		WebElement forget = driver.findElement(By.cssSelector("button[jsname='Cuz2Ue']"));
		forget.click();
		System.out.println("forget clicked.");
		Thread.sleep(3000);

		driver.navigate().back();
		System.out.println("back Press clicked.");
		Thread.sleep(3000);

		WebElement createAccountButton = driver.findElement(By.xpath("//button[.//span[text()='Create account']]"));

		// Click the button
		createAccountButton.click();
		System.out.println("create Account clicked.");

		Thread.sleep(3000);

		WebElement personalUseOption = driver.findElement(By.xpath("//li[@jsname='RZzeR']"));
		personalUseOption.click();
		System.out.println("Account clicked.");

		WebElement enterfname = driver.findElement(By.id("firstName"));
		enterfname.sendKeys("sagar chutiya");
		Thread.sleep(3000);
		System.out.println("Name Clicked");

		WebElement enterlname = driver.findElement(By.id("lastName"));
		enterlname.sendKeys("Paplu");
		Thread.sleep(3000);
		System.out.println("LName Clicked");

		WebElement next = driver.findElement(By.cssSelector("span[jsname='V67aGc']"));
		next.click();
		System.out.println("next button Clicked");
		// driver.close();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
		System.out.print("Month Clicked");

		// Select an option from dropdown
		Select select = new Select(monthDropdown);
		select.selectByVisibleText("August"); // Select "March"
		
		WebElement days = driver.findElement(By.id("day"));
		days.click();
		days.sendKeys("18");
	}

}
