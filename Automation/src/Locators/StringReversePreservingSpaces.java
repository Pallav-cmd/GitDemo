package Locators;

import java.util.Scanner;

public class StringReversePreservingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=input.next();
		char ch1[]=s1.toCharArray();
		char ch2[]=new char[ch1.length];
		for(int i=0;i<=ch1.length-1;i++)
		{
		    if(ch1[i]==' ')
		    {
		    	ch2[i]=ch1[i];
		    }
		}
		int j= ch1.length-1;
		for(int i=0;i<=ch1.length-1;i++)
		{
		    if(ch1[i]!=' ')
		    {
		    	if(ch2[j]==' ')
		    	{
		    		j--;
		    	}
		        ch2[i]=ch1[ch1.length-1-i];
		    }
		}
	
		 
			
		String s2= new String(ch2);
		System.out.println(s2);
	}

}
