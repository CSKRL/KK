package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		//public static void main(String[] args1) throws Exception {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			//driver.manage().wait(5);
			driver .manage().window().maximize();
			driver.findElement(By.id("username"));
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password"));
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GainWell");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("karthikannan");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anu");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Amudhan");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Rathi");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("For Testing");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthikannanhere@gmail.com");
			WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select stateid = new Select(state);
			stateid.selectByVisibleText("New York");
			//state.sendKeys("New York");
			//state.click();
			driver.findElement(By.className("smallSubmit")).click();
			//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			System.out.println("The title is :" +driver.getTitle());
			
			driver.findElement(By.linkText("Duplicate Lead")).click();
			
			WebElement companyedit =driver.findElement(By.id("createLeadForm_companyName"));
			companyedit.clear();
			companyedit.sendKeys("MyCompany");
			
			WebElement NameEdit= driver.findElement(By.id("createLeadForm_firstName"));
			NameEdit.clear();
			NameEdit.sendKeys("Anukarthikannan");
			driver.findElement(By.className("smallSubmit")).click();
			System.out.println("The title is :" +driver.getTitle());
					
			
		}

		
	}


