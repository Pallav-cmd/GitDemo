package Intro;

public class MethodsDemoPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accessing Method from same class 
		MethodsDemoPart1 d1=new MethodsDemoPart1();
		String name=d1.getData();
		System.out.println(name);
		
		//Accessing Method from another class 
		MethodDemosPart2 d2=new MethodDemosPart2();
		String s1=d2.getUserData();
		System.out.println(s1);
		
		// No need of creating an object static methods in its own class.
		String s2=getData2();
		System.out.println(s2);
		

	}
	
	public String getData()
	{
		System.out.println("Hello World!");
		return "Rahul Shetty";
	}
	
	public static String getData2()
	{
		System.out.println("Hello.....");
		return "Automation";
	}

}
