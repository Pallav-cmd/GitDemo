package Intro;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object
		
		// In the below case, only one object will be created. These are string literals.
		String s1="Rahul Shetty Academy";
		String s2="Rahul Shetty Academy";
		
		//Declaring Arrays using new Keyword
		
		// 2 objects will be created in the below case.
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		
		//Splitting the String and storing into an array
		String arr[]=s1.split(" ");
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		String arr1[]=s1.split("Shetty");
		for(String i:arr1)
		{
			System.out.println(i);
		}
		
	// Trim function is used to remove whitespace
		System.out.println(arr1[1].trim());
		

	}

}
