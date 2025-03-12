package srikanth;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args)
	{
		String inputu="    SrikanTH   Tirlangi   ";
		
		// convert to lower letters
		System.out.println("Your lower converted string: -> "+inputu.toLowerCase());
		
		// convert to cap letters
		System.out.println("Your upper converted string: -> "+inputu.toUpperCase());
		
		//by using scanner
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter your string value while run time: -> ");
		String RuntimeInput=s1.next();
		
		int lengthOfString=RuntimeInput.length();
		System.out.println("Your string length is -> "+lengthOfString);
		
		//CharAt(Index) --> String - given index char
		
		char ForuthIndexValue=RuntimeInput.charAt(4);
		System.out.println("Your forth Index value is -> "+ForuthIndexValue);
		
		// Trim function will remove the spaces from the first and last.
		String TrimValue=inputu.trim();
		System.out.println("Trim value is -> "+TrimValue);
		s1.close();
		
	}

}
