package week3.day2;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	
public static void main(String[] args) {
	
	int[] num = {3, 2, 11, 4, 6, 7};
	List<Integer> number = new ArrayList<>();
	for(Integer value : num) {
		number.add(value);
	}
	for(int j=0;j<number.size()-1;j++) {
	for(int i=0; i<number.size()-1; i++) {
		if (number.get(i)>number.get(i+1)) {
			int test = number.get(i);
			number.set(i, number.get(i+1));
			number.set(i+1, test);
		}
	}
		//System.out.println(number);}
	//System.out.println("loop complete");
	}
	System.out.println("List in Ascending Order: "+number);
	//Collections.sort(number);
    int secondLargest = number.get(number.size()-2);
	System.out.println("The second largest number is: " + secondLargest);
	
	
	
	
}	

}
