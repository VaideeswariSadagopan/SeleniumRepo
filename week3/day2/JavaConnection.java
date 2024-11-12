package week3.day2;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
	
	System.out.println("Connecting to the database");	
		
	}

	@Override
	public void disconnect() {
		
	System.out.println("Disconnecting from the database");	
	
	}
		
		

	@Override
	public void executeUpdate(String query) {
		
	System.out.println("Executing update on the database:" +query);	
	}

   public static void main(String[] args) {
	   JavaConnection dbConnection = new JavaConnection();

       dbConnection.connect();         
       dbConnection.executeUpdate("Update the user details");   
       dbConnection.disconnect(); 
	   
}
	}
	
