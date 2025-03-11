package assignments51;

public class Assignment74
{

	public static void main(String[] args) 
	{
        int[] EmployeeId=new int[3];
		try {
		EmployeeId[0]=100;
		EmployeeId[1]=101;
		EmployeeId[2]=102;
		EmployeeId[3]=103;
		
			for (int i=0;i<EmployeeId.length;i++)
			      {
				
				      System.out.println((i+1)+" Employee Id is ->"+EmployeeId[i]);
			       }
		    }
		  catch(ArrayIndexOutOfBoundsException a1)
				{
					  System.out.println("You size is not match with the id's plz check once");
				}

		}		
}

