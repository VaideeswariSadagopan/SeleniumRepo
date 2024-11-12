package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextHyperLinks {
	
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
    List<String> allLinkText = new ArrayList<String>();
    for(WebElement element: allLinks) {
    String text = element.getText()	;
    allLinkText.add(text);
    }
    System.out.println(allLinkText);
    }
}	

