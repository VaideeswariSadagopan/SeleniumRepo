package week3.day2;

public class Amazon extends CanaraBank{
	
public static void main(String[] args) {
	
Amazon amaz = new Amazon();
amaz.cardPayment();
amaz.cashOnDelivery();
amaz.upiPayments();
amaz.internetBanking();
amaz.RecordPaymentDetails();
	
}

@Override
public void cashOnDelivery() {
	// TODO Auto-generated method stub
	System.out.println("cash on delivery");
	
}

@Override
public void upiPayments() {
	// TODO Auto-generated method stub
System.out.println("upi payments");

}

@Override
public void cardPayment() {
	// TODO Auto-generated method stub
System.out.println("card payment");


}

@Override
public void internetBanking() {
	// TODO Auto-generated method stub
System.out.println("online payment");	
}	

}
