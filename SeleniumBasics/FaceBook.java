package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("karthi");
		driver.findElement(By.name("lastname")).sendKeys("kannan");
		driver.findElement(By.name("reg_email__")).sendKeys("9176671966");
		driver.findElement(By.id("password_step_input")).sendKeys("Amudhan@01");
		Select myday= new Select(driver.findElement(By.id("day")));
		myday.selectByIndex(18);
		Select myMonth = new Select (driver.findElement(By.id("month")));
		myMonth.selectByVisibleText("Sep");
		Select myYear= new Select(driver.findElement(By.id("year")));
		myYear.selectByValue("2010");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		for (WebElement mf:gender) {
			if (mf.getAttribute("value").equalsIgnoreCase("2")) {
				mf.click();
			}
		
		}

		
		
		
	}

}
