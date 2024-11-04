package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown {
   
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
	    String title = driver.getTitle();
   	 	System.out.println(title);	
   	 	driver.findElement(By.linkText("Leads")).click();
   	 	driver.findElement(By.linkText("Create Lead")).click();
   	 	driver.findElement(By.id("createLeadform_companyName")).sendKeys("TestLeaf");
   		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
   		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");		
    		}




}
