package week2.day2;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	private static WebElement element;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.get(" https://leafground.com/button.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
	    System.out.println("The title is :"+driver.getTitle());
	    if(driver.getTitle().contains("Dashboard")) {
	    System.out.println("I confirm the title has Dashboard");
	    driver.navigate().back();
	    Thread.sleep(5000);
	    String text = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt92\"]")).getText();
	    System.out.println("Confirm button is disabled: Yes "+ text);
	    Point text11 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]")).getLocation();
	    int x = text11.getX();
	    int y = text11.getY();
	    System.out.println("Button position X: " + x + ", Y: " + y);
	    String color = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]")).getCssValue("background-color");
	    System.out.println("Backgroud color of the Button: "+color);
	    Dimension text1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]")).getSize();
	    int width = text1.getWidth();
	    int height = text1.getHeight();
	    System.out.println("Button width: " + width + ", Button Height: " + height);
	    driver.close();
	    }	 
	}
	}


