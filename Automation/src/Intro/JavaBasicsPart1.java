package Intro;

public class JavaBasicsPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum=5;
		char letter='r';
		boolean myCard=true;
		double dec=5.95;
		String website="Rahul Shetty Academy";
		// Concatenation of variable and string using "+"
		 System.out.println(myNum +" is the value stored in the myNum Variable");
		 
		 // Arrays
		 
		 //int[] arr= new int[5];
		 //     (or)
		 int arr[]=new int[5];
		 
		 arr[0]=5;
		 arr[1]=1;
		 arr[2]=2;
		 arr[3]=4;
		 arr[4]=7;
		 
		 System.out.println(arr[4]);
		 
		 int arr2[]= {5,1,2,4,7};
		 System.out.println(arr2[1]);
		 
		 //To print length of array
		 System.out.println(arr.length);
		 
		 // For loop
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 //Enhanced for loop
		 for(int j:arr)
		 {
			 System.out.println(j+" Enhanced loop");
		 }
		 
		 // String Array
		 String name[]= {"rahul","shetty","academy"};
		 for(int i=0;i<name.length;i++)
		 {
		 System.out.println(name[i]);
		 }
		 
		//Enhanced for loop
		 for(String s:name)
		 {
			 System.out.println(s+" Enhanced loop");
		 }
		 
		

	}

}
