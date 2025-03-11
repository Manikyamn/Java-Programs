package assignments51;

import java.util.Scanner;

public class Assignment68 {
	//Wap on String Function using concat and contains concept
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter Your First Stirng value here ");
		String YourString1=s1.next();
		
		System.out.println("Enter Your Second Stirng value here ");
		String YourString2=s1.next();
		
		
		// Concat
		String CancatValue=YourString1.concat(YourString2);
		System.out.println("Cancat value is --> "+CancatValue);
		
		//Contains
		if(CancatValue.contains("Mani"))
		{
			System.out.println("String contains the Mani word in it");
		}
		else
		{
			System.out.println("String doesn't contains the Mani word in it");
		}
		s1.close();
	}

}
