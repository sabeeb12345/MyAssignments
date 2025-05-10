package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learndropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver = new EdgeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");

		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(sourceDD);
		select.selectByIndex(4);

		WebElement corporationOwner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select1 = new Select(corporationOwner);
		select1.selectByValue("OWN_CCORP");

		WebElement maerketingCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select2 = new Select(maerketingCamp);
		select2.selectByVisibleText("Automobile");
		driver.findElement(By.className("smallSubmit")).click();

	}

}
