package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	String[] companies = {"HCL","Wipro","AspireSystems","CTS"};	
	List<String> companyList = new ArrayList<String>();
	List<String> RevcompanyList = new ArrayList<String>();
	for(String company : companies) {
		companyList.add(company);
	}
	Collections.sort(companyList);
	for(int i=companyList.size()-1; i>-1; i-- ) {
	RevcompanyList.add(companyList.get(i));
	}
	System.out.println("Company in acsending order List :" +companyList);
	System.out.println("Company in Reversed List :"+RevcompanyList);
	}	
		
}
	
    
          
