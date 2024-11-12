package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
    int[] numx  = {3, 2, 11, 4, 6, 7};
    int[] numy = {1, 2, 8, 4, 9, 7};
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    for (Integer num : numx) {
        list1.add(num);
    }
    for (Integer num : numy) {
        list2.add(num);
    }
    System.out.println("Intersection of the two arrays:");
    for (Integer num : list1) {
        if (list2.contains(num)) {
            System.out.print(num + " ");
        }
    
	}
	}
}
