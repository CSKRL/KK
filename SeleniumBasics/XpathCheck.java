package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCheck {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// Enter UserName
		WebElement userNameElement = driver.findElement(By.xpath("//input[@id='username']"));
		userNameElement.sendKeys("Demosalesmanager");
		//Enter Password
		WebElement passwordElement = driver.findElement(By.xpath("//label[text()='Password']"));
		passwordElement.sendKeys("crmsfa");
				
	}

}
