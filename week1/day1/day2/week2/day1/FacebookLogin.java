package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.facebook.com");
    driver.manage().window().maximize();
    WebElement usernameField = driver.findElement(By.id("email"));
    usernameField.sendKeys("testleaf.2023@gmail.com");
    WebElement passwordField = driver.findElement(By.name("pass"));
    passwordField.sendKeys("Tuna@321");
    WebElement loginButton = driver.findElement(By.name("login"));
    loginButton.click();
    driver.findElement(By.linkText("Find your account and log in.")).click();
    String title= driver.getTitle();
    System.out.println("title");
    driver.close();    
	}
	

}
