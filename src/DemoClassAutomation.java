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

		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		// Thread.sleep(3000);
		driver.navigate().refresh();

		WebElement forget = driver.findElement(By.cssSelector("button[jsname='Cuz2Ue']"));
		forget.click();
		System.out.println("forget clicked.");
		// Thread.sleep(3000);

		driver.navigate().back();
		System.out.println("back Press clicked.");
		// Thread.sleep(3000);

		WebElement createAccountButton = driver.findElement(By.xpath("//button[.//span[text()='Create account']]"));

		// Click the button
		createAccountButton.click();
		System.out.println("create Account clicked.");

		// Thread.sleep(3000);

		WebElement personalUseOption = driver.findElement(By.xpath("//li[@jsname='RZzeR']"));
		personalUseOption.click();
		System.out.println("Account clicked.");

		// WebElement enterfname = driver.findElement(By.id("firstName"));
		WebElement enterfname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		enterfname.sendKeys("Test");
		// Thread.sleep(3000);
		System.out.println("Name Clicked");

		WebElement enterlname = driver.findElement(By.id("lastName"));
		enterlname.sendKeys("Kumar");
		// Thread.sleep(3000);
		System.out.println("LName Clicked");

		WebElement next = driver.findElement(By.cssSelector("span[jsname='V67aGc']"));
		next.click();
		System.out.println("next button Clicked");
		// driver.close();

		WebDriverWait wait_month = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement monthDropdown = wait_month.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
		System.out.println("Month Clicked");

		// Select an option from dropdown
		Select select = new Select(monthDropdown);
		select.selectByVisibleText("August"); // Select "March"

		WebDriverWait wait_day = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement days = wait_day.until(ExpectedConditions.elementToBeClickable(By.id("day")));
		days.sendKeys("29");
		System.out.println("Days Clicked");

		WebDriverWait wait_year = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement year = wait_year.until(ExpectedConditions.elementToBeClickable(By.id("year")));
		year.sendKeys("1996");
		System.out.println("Years Clicked");

		WebDriverWait wait_gen = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement gender = wait_gen.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender")));
		System.out.println("Gender Clicked");

		// Select use for option form dropdown
		Select oselect = new Select(gender);
		oselect.selectByIndex(2);

		WebElement next_b = driver.findElement(By.cssSelector(("span[jsname='V67aGc']")));
		next_b.click();
		System.out.println("next_B Clicked");

		WebDriverWait coustom_radio = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cus_rad = coustom_radio.until(ExpectedConditions.elementToBeClickable(By.id("selectionc3")));
		cus_rad.click();

		WebElement custom_id = driver.findElement(By.xpath("//input[@aria-label='Create a Gmail address']"));
		custom_id.sendKeys("Enter_your_id");
		System.out.println("Email Clicked");

		WebElement next_bt = driver.findElement(By.className("VfPpkd-vQzf8d"));
		next_bt.click();
		System.out.println("next_bt Clicked");

		WebDriverWait wait_pass = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement custom_pass = wait_pass
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Password']")));
		custom_pass.sendKeys("Enter_your_pass");
		System.out.println("Pass Clicked");

		WebDriverWait wait_cpass = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement custom_confirm_pass = wait_cpass
				.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@aria-label='Confirm']"))));
		custom_confirm_pass.sendKeys("Enter_your_confirm_pass");
		System.out.println("Confirm_pass Clicked");

		WebDriverWait wait_next = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement nextBut = wait_next
				.until(ExpectedConditions.elementToBeClickable((By.xpath("//span[text()='Next']"))));
		nextBut.click();
		System.out.println("NextBut Clicked");

		WebDriverWait wait_no = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement num = wait_no.until(ExpectedConditions.elementToBeClickable(By.id("phoneNumberId")));
		num.sendKeys("xxxxxxxx");
		System.out.println("Num Entered Clicked");

		WebDriverWait wait_next1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement nextBut1 = wait_next
				.until(ExpectedConditions.elementToBeClickable((By.xpath("//span[text()='Next']"))));
		nextBut1.click();
		System.out.println("NextBut Clicked");

	}

}
