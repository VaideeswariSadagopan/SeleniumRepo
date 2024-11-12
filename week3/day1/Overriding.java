package week3.day1;

public class Overriding extends Overloading{
	
public void reportStep(int age) {
	System.out.println(age);
	super.reportStep(5,"Dhuruvan");
}
 
public static void main(String[] args) {
	Overriding over = new Overriding();
	over.reportStep(6,"Dheeran");
	over.reportStep(7);
}
}
