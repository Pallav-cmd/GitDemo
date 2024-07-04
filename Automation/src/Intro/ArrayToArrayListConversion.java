package Intro;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"rahul","shetty","Selenium"};
		
		//Conversion of Array to ArrayList
		List<String> namearr=Arrays.asList(arr);
		System.out.println(namearr.contains("Selenium"));

	}

}
