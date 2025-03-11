package assignments51;

public class Assignment84 {

	public static void main(String[] args) 
	{
		String StringValue ="My Name is Manikyam";
		int StringValueLength=StringValue.length();
		System.out.println("Your String length is -> "+StringValueLength);
		
		// subString with single index
		String SingleIndex=StringValue.substring(5);
		System.out.println("Your single index substring is -> "+SingleIndex);
		
		//Double Index substring
		String DoubleIndex=StringValue.substring(2, StringValueLength);
		System.out.println("Your single index substring is -> "+DoubleIndex);
		
		//Replace
		String Replace1=StringValue.replace('a', 'A');
		System.out.println("Replaced a with A in "+ " -- "+StringValue+" <--Then Reuls is -> "+Replace1);
		
		//Replace substring
		String Replace2=StringValue.replace("Manikyam", "Manikyam Nakka");
		System.out.println("Replaced Name with Full Name in "+ " -- "+StringValue+" <--Then Reuls is -> "+Replace2);
		
		String OriginalStringValue="My Name is Manikyam and Age is 29";
		
		//Remmove all small letters
		String RemoveSmallLetters=OriginalStringValue.replaceAll("[a-z]", "");
		System.out.println("Removed small letters from the string value -> "+RemoveSmallLetters);
		
		//Remove all capital letters
		String RemoveCapLetters=OriginalStringValue.replaceAll("[A-Z]", "");
		System.out.println("Removed Cap letters from the string value -> "+RemoveCapLetters);
		
		//Remove all the numbers
		String RemoveNumbers=OriginalStringValue.replaceAll("[1-9]", "");
		System.out.println("Removed Numbers from the string: -> "+RemoveNumbers);
		
		//Removed small and cap letters
		String RemoveSmallAndCapLetters=OriginalStringValue.replaceAll("[A-z]", "");
		System.out.println("Removed Small and Cap letters from the String -> "+RemoveSmallAndCapLetters);
		
		String Name="Manik";
		 boolean b1=Name.matches(".....");
		 System.out.println("matches is->"+b1);
		
		 //String is ends with ??
		 boolean b2=Name.matches("(.)*k");
		 System.out.println("Ending with K?? ->"+b2); //(.)* represent multi char
		 
		 //Starting with
		 boolean b3=Name.matches("M(.)*");
		 System.out.println("starting with m ->"+b3); //(.)* represent multi char
		 
		 //check if the given string have man in it
		 String Name2="Spinderman";
		 boolean b4=Name2.matches("(.)*man(.)*");
		 System.out.println("man is present in the give string.? -> "+b4);
		
		
	}

}
