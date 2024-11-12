package week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter the username");}
		
public void enterPassword(){
		System.out.println("Enter the password");}	

public static void main(String[] args) {
	LoginTestData login = new LoginTestData();
	login.enterUsername();
	login.enterPassword();
	login.enterCredentials();
    login.navigateToHomepage();
}


}
