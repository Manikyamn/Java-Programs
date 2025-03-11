package assignments51;

import java.util.Scanner;

public class Assignment70 {
//WAP to reverse a string
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter your String Value to Reverse it -> ");
		String Input=s1.next();
		String Reverse="";
		
		System.out.println("Your String length is ->  "+Input.length());
		
		for (int i=Input.length()-1;i>=0;i--)
		{
			char c=Input.charAt(i);
			Reverse=Reverse+c;
		}
		System.out.println("Your String Reverse value is --> "+Reverse);
		s1.close();
	}

}
