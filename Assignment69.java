package assignments51;

import java.util.Scanner;

public class Assignment69 {
//WAP on String Function using equals and equalsIgnoreCase concept
	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		//First string value 
		System.out.println("Enter your first string value here --> ");
		String FirstWord=s1.next();
		
		// Second String value
		System.out.println("Enter your Second string value here --> ");
		String SecondWord=s1.next();
		
		//Equals method
		boolean OneTwo=FirstWord.equals(SecondWord);
		if(OneTwo)
		{
			System.out.println("Two Strings are equal including case senstive");
		}
		else
		{
			System.out.println("Two strings are not equal when compared with case senstive");
		}
		//CaseIgnore
		boolean CaseIgnore=FirstWord.equalsIgnoreCase(SecondWord);
		if(CaseIgnore)
		{
			System.out.println("Two Strings are equal when ignoring case senstive");
		}
		else
		{
			System.out.println("Two Strings are not equal when ignoring case senstive as well");
		}
		s1.close();
	}

}
