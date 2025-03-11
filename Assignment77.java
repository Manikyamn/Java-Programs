package assignments51;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment77 
{
//WAP to check if 2 arrays are equals to each other at run time
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
	System.out.println("Please Enter your size of First array here: --> ");
	int FirstArraySize=s1.nextInt();
	
	System.out.println("Please Enter your size of Second array here: --> ");
	int SecondArraySize=s1.nextInt();
	
	int[] FirstArray=new int[FirstArraySize];
	int[] SecondArray=new int[SecondArraySize];
	
	if(FirstArraySize==SecondArraySize)
	{
		for(int i=0;i<FirstArraySize;i++)
		{
			System.out.println("Please Enter your First Array "+i+" index value here");
			FirstArray[i]=s1.nextInt();		
		}
		for (int j=0;j<FirstArraySize;j++)
		{
			System.out.println("Please Enter your Second Array "+j+" index value here");
			SecondArray[j]=s1.nextInt();
		}
		System.out.println("Your First Array is --> "+Arrays.toString(FirstArray));
		System.out.println("Your Second Array is --> "+Arrays.toString(SecondArray));
		boolean Result=Arrays.equals(FirstArray, SecondArray);
		if(Result)
		{
			System.out.println("Your Arrays are Equal");
		}
		else
		{
			System.out.println("Your Arrays are not Equal");
		}
	}
	else
	{
		System.out.println("Your Arrays are not Equal");
	}
	s1.close();
	}

}
