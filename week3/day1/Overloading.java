package week3.day1;

public class Overloading {
	
public void reportStep(int age) {
System.out.println(age);

}

public void reportStep(int age, String msg) {
	
System.out.println( age + "" + msg);

}

public static void main(String[] args) {
	Overloading Obj = new Overloading();
	Obj.reportStep(32);
	Obj.reportStep(5,"Dhuruvan");
}

}
