package week3.day1;

public class Chrome extends BrowserClass {
	
public void openIncognito() {
		System.out.println("open the broswer...");}
		
public void clearCache(){
		System.out.println("clear the cache....");}
	
	public static void main(String[] args) {
	Chrome browser = new Chrome();
	browser.openIncognito();
	browser.clearCache();
	browser.openURL();
	browser.closeBrowser();
	browser.navigateBack();
	
	
	}	





		
	}

