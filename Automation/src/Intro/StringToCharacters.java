package Intro;

public class StringToCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Rahul Shetty Academy";
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("******************************");
		for(int i=s.length()-1;i>=0;i--) 
		{
			System.out.println(s.charAt(i));
		}

	}

}
