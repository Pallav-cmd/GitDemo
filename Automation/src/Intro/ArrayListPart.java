package Intro;

import java.util.ArrayList;

public class ArrayListPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		
		// We can add any no. of values to an arrayList
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("automation");
		a.add("testing");
		
		//To remove an element at index
		a.remove(4);
		
		
		// To get an element at index 
		System.out.println(a.get(0));
		
		//To get the size of an Array List
		System.out.println(a.size());
		
		//For Loop
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		
		}
		System.out.println("**************************************");
		
		//Enhanced For Loop
		for(String val:a)
		{
			System.out.println(val);
		}
		
		//Returns boolean Value and check for whether the value is present in list or not
		System.out.println(a.contains("shetty"));

	}

}
