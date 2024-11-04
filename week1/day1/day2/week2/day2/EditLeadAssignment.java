package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("democsr");
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vaideeswari");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sadagopan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sadagopan");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.name("description")).sendKeys("Selenium Software Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("svaideeswari@gmail.com");
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        state.click();
        Select myState1 = new Select(state);
        myState1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
	  	driver.findElement(By.linkText("Edit")).click();
	  	driver.findElement(By.id("updateLeadForm_description")).clear();
	  	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automation Testing");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("The title is:"+driver.getTitle());
		driver.close();
	  	
        
	}

}
