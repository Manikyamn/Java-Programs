package assignments51;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment76 
{

	//WAP to accept the values of your array at run time
	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter your array size here -->  ");
		
		int n=s1.nextInt();
		int [] EmployeeId=new int[n];
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Please Enter your "+i+" index value here:-> ");
			EmployeeId[i]=s1.nextInt();
			
		}
		System.out.println("Your Array is -->  "+ Arrays.toString(EmployeeId) );
		s1.close();
	}

}
