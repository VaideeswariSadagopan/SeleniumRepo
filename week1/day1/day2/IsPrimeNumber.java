package week1.day2;

public class IsPrimeNumber {

   public static void main(String[] args) {
	
   System.out.println(".....Check the number is primenumber or not..... ");	
   int n = 13;
   boolean isprime = true;
   for(int i=2; i<=n-1; i++) 
	   {
	if (n%i==0) 
	{   
	   isprime = false;
	   System.out.println( "Given number '"+n+"' is not a prime number");
	   break;
	      }
}
   if (isprime==true)
   {
	   System.out.println("Given number '"+n+"' is a prime number");
   }
}
}
