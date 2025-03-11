package assignments51;

import java.util.Date;

public class Assignment85 {

	public static void main(String[] args)
	{
		Date d1=new Date();
		
		// Human understandable time
		System.out.println("Human Undestandable Time: -> "+d1);
		
		//Future dates
		Date d3=new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println("Future date + 1 day ->"+d3);
		
		Date d4=new Date(d1.getTime()+(1000*60*60*24*-2));
		System.out.println("Past date - 2 days ->"+d4);
		
	

	}

}
