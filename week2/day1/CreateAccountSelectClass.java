package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("democsr");
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Vaideeswari Sadagopan");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryWE = driver.findElement(By.name("industryEnumId"));
		Select industryDD = new Select(industryWE);
		industryDD.selectByValue("IND_SOFTWARE");
		WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDD = new Select(ownershipWE);
		ownershipDD.selectByVisibleText("S-Corporation");
		WebElement sourceWE = driver.findElement(By.id("dataSourceId"));
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaignWE = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaignDD = new Select(marketingCampaignWE);
		marketingCampaignDD.selectByIndex(6);
		WebElement StateProvinceWE = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select StateProvinceDD = new Select(StateProvinceWE);
		StateProvinceDD.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle();
		System.out.println("The title is:"+driver.getTitle());
		driver.close();
		
		
	}

}
