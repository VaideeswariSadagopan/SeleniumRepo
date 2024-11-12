package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {
	
public static void main(String[] args) {
	
	int[] num  = {1,2,3,4,10,6,8};
	List<Integer> number = new ArrayList<Integer>();
	for(Integer value : num) {
		number.add(value);
	}
	Collections.sort(number);
	System.out.println("Missing elements are");
	for (int i=0; i< number.size() - 1; i++) {
        int current = number.get(i);
        int next = number.get(i+1);
        
        if (current + 1 != next) {
            
        for (int j = current + 1; j < next; j++) {
                System.out.print(j + " ");   
        }	
        }
        }
}
}