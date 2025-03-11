package assignments51;

import java.util.Scanner;

public class Assignment67 {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter you string ");
		String YourString = s1.next();
		
		//ToUpperCase
		
		String UpperString =YourString.toUpperCase();
		System.out.println("Your string converted to Upper case --> "+UpperString);
		
		//ToLowerCase
		String LowerString =YourString.toLowerCase();
		System.out.println("Your string converted to Upper case --> "+LowerString);
		
		//Length
		System.out.println("Length of you String is -> "+YourString.length());
		
		//CharAt(Index);
		System.out.println("Char at index of 3 in your string is -> "+YourString.charAt(3));
		
		String TrimWord="  Manikyam Nakka  ";
		System.out.println("Trimmed word of it is -> "+TrimWord.trim());
		
		s1.close();
	}

}
