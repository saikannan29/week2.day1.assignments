package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		//Thread.sleep(5000);
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(1000);
		//driver.findElement(By.className("selected")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kannan3");
		driver.findElement(By.id("lastNameField")).sendKeys("Loganathan");
		driver.findElement(By.name("submitButton")).click();
		WebElement firstName = driver.findElement(By.xpath("(//span[text()])[12]"));
		String value = firstName.getText();
		System.out.println(value);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}      

}
