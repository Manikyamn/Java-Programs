package assignments51;

public class Assignment87 {

	public static void main(String[] args) 
	{
		StringBuilder input1=new StringBuilder("ChandraShekar");
		
		//Append
		input1.append("Kurva");
		System.out.println("Appended Method value is -> "+input1);
		
		//Insert
		input1.insert(7, " - ");
		System.out.println("Inserted Method Ouput -> "+input1);
		
		//Delete
		input1.delete(8, 10);
		System.out.println("Delete Method Output -> "+input1);
		
		//Substring
		
		System.out.println("Substring with single index -> "+input1.substring(7));
		System.out.println("Substring with Double index -> "+input1.substring(4,11));
		
		//Reverse 
		input1.reverse();
		System.out.println("After Reverse method Output -> "+input1);
		
		//Capacity
		System.out.println("Capacity is ->"+input1.capacity());
		
		//Replace
		input1.replace(5, 6, "- * -");
		System.out.println("Replace Method output -> "+input1);
		
		//Remove
		input1.replace(5, 9, "");
		System.err.println("After remove -> "+input1);
	

	}

}
