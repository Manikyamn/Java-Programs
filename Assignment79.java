package assignments51;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment79 {
//WAP to copy one array into another array
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Please Enter your size of array here: --> ");
		int OriginalArraySize=s1.nextInt();
		
		int [] OriginalArray=new int[OriginalArraySize];
		
		int [] CopiedArray=new int[OriginalArraySize];
		
		for (int i=0,k=0;i<OriginalArraySize;i++,k++)
		{
			System.out.println("Please Enter the "+i+"  index value here: -> ");
			OriginalArray[i]=s1.nextInt();
			CopiedArray[k]=OriginalArray[i];
		}
		System.out.println(" Your Original Array is --> "+Arrays.toString(OriginalArray));
		System.out.println(" Your Copied Array is --> "+Arrays.toString(CopiedArray));
		s1.close();
	}

}
