package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreate {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Vaideeswari");
	    driver.findElement(By.name("lastname")).sendKeys("Sadagopan");
	    driver.findElement(By.name("reg_email__")).sendKeys("svaideeswari@gmail.com");
	    driver.findElement(By.id("password_step_input")).sendKeys("Dhuruvan@3");
	    WebElement dateDOB = driver.findElement(By.id("day"));
		Select dateOfBirth = new Select(dateDOB);
		dateOfBirth.selectByValue("21");
		WebElement monthOB = driver.findElement(By.id("month"));
		Select monthOfBirth = new Select(monthOB);
		monthOfBirth.selectByValue("1");
		WebElement yearOB = driver.findElement(By.id("year"));
		Select yearOfBirth = new Select(yearOB);
		yearOfBirth.selectByValue("1992");
		driver.findElement(By.id("sex")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		WebElement signupButton = driver.findElement(By.name("websubmit"));
        signupButton.click();
        driver.close();         
	}

}
