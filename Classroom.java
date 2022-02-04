package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select dd = new Select(source);
		dd.selectByVisibleText("Employee");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select(industry);
		dd1.selectByVisibleText("Finance");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(ownership);
		dd2.selectByVisibleText("Partnership");

	}

}
