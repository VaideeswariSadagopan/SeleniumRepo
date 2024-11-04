package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	
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
	String title = driver.getTitle();
    System.out.println(title);
	driver.findElement(By.id("accountName")).sendKeys("Vaideeswari Sadagopan");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("numberEmployees")).sendKeys("100");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	driver.findElement(By.className("smallSubmit")).click();
	driver.close();
        
}	

}
