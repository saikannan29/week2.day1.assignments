package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("kannan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("loganathan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select dd = new Select(source);
		dd.selectByVisibleText("Employee");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select(industry);
		dd1.selectByVisibleText("Finance");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(ownership);
		dd2.selectByVisibleText("Partnership");
		WebElement marketingCampaign = driver.findElement(By.name("marketingCampaignId"));
		Select dd3 = new Select(marketingCampaign);
		dd3.selectByVisibleText("Demo Marketing Campaign");
		driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("03/03/85");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("5129998866");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("512");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("5123");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("kannan@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("512897678");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("www.k3.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Kannan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("kannanloganathan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("1021 ct, Texas 4021");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("Austin");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("4021");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("512");
		WebElement selectState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd4 = new Select(selectState);
		dd4.selectByVisibleText("Texas");
	  	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		}

}
