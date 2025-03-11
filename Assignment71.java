package assignments51;

import java.util.Scanner;

public class Assignment71 {
//WAP to check if the given string is a Palindrome?
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter Your String value to check it is Polidrome or not -> ");
		String Reverse="";
		
		String Input=s1.next();
		int L=Input.length();
		System.out.println("Your String length is --> "+L);
		
		for (int i=L-1;i>=0;i--)
		{
			char c1=Input.charAt(i);
			Reverse=Reverse+c1;
		}
		System.out.println("Revers of your String Value is --> "+Reverse);
		String Str1=Input.toUpperCase();
		String Str2=Reverse.toUpperCase();
		boolean Check=Str1.equals(Str2);
		if(Check)
		{
			System.out.println(" Entered String value is polidrome ");
		}
		else 
		{
			System.out.println(" Entered String value is not a polidrome ");

		}
		s1.close();
		
	}

}
