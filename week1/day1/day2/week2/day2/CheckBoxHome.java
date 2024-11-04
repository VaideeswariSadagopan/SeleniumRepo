package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxHome {

	private static Object multiplecheckbox;
	private static Object Selected;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://leafground.com/checkbox.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]")).click();
		String text = driver.findElement(By.className("ui-growl-title")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
		text = driver.findElement(By.xpath("//*[@id=\"j_idt87:id_container\"]/div/div/div[2]/p")).getText();
		System.out.println("State has been changed to " + text);
        driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]")).click();
		Thread.sleep(5000);
		text = driver.findElement(By.xpath("//*[@id=\"j_idt87:msg_container\"]/div/div/div[2]/span")).getText();
		System.out.println(text);
	    text = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]/span")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-multiple ui-selectcheckboxmenu')]")).click();
        driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[3]/div/div[2]")).click();
        Thread.sleep(5000);
        text = driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[3]")).getText();
        System.out.println(text);        
  	    driver.close();		
         
       	  }
	
	}	



           
        
        
        
        
        
        
		
		
	    
	
	    
  

