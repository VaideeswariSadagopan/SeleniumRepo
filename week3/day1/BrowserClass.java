package week3.day1;


public class BrowserClass {
	
	String browserName = "InternetExplorer";
	float browserVersion = 10.3f;
	
public void openURL() {
	System.out.println("open the URL...");}
	
public void closeBrowser(){
	System.out.println("close the broswer....");}

public void navigateBack() {
	System.out.println("navigate back....");
	
}
	
public static void main(String[] args) {
	
		BrowserClass browser=new BrowserClass();
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBack();
		
		
}		
				
}
	
