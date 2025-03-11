package assignments51;

public class Assignment75 {
//Find out the average of all the numbers presnet in your array
	
	public static void main(String[] args)
	{
		double [] Salary=new double[3];
		Salary[0]=100.0;
		Salary[1]=200.0;
		Salary[2]=300.0;
		
		double sum=0;
		
		
		for (int i=0;i<Salary.length;i++)
		{
			sum=sum+Salary[i];
		}
		System.out.println("Sum of array values are: --> "+sum);
		System.out.println("Average of array values is --> "+sum/Salary.length);
	}

}
