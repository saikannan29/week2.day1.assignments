package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		//Thread.sleep(5000);
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[3]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		driver.close();
		
	}      

}
