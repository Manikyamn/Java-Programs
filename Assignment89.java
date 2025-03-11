package assignments51;

import java.util.ArrayList;

public class Assignment89 {

	public static void main(String[] args) {
//WAP on collection concept with the help of Upcating on Different Data types (Int, Char, Double, string etc.) with different methods like Add, Remove, Contains.
	
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(96);
		a1.add(76);
		a1.add(74);
		a1.add(744);
		a1.add(90);
		System.out.println("Your First Integer Array List is -> "+a1);
		a1.remove(1);
		System.out.println("Your First Integer Array list after removing 1 Index ->"+a1);
		boolean b1=a1.contains(90);
		if (b1)
		{
			System.out.println("Array list contains the your searching value in it ");
		}
		else
		{
			System.out.println("Array List doesn't contains the value that you are saerching ");
		}
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(21);
		a2.add(22);
		a2.add(23);
		System.out.println("Your Second Integer Array List is -> "+a2);
		a2.addAll(a1);
		System.out.println("Your Second Integer array list after adding first array list -> "+a2);
		a2.removeAll(a1);
		System.out.println("After Removing first array list from the Included Array List is -> "+a2);
		
		//
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("India");
		a3.add("Canada");
		a3.add("Australia");
		a3.add("England");
		a3.add("NewZiland");
		System.out.println("Your First String Array List is -> "+a3);
		a3.remove(1);
		System.out.println("Your First String Array list after removing 1 Index ->"+a3);
		boolean b2=a3.contains("India");
		if (b2)
		{
			System.out.println("Array list contains the your searching value in it ");
		}
		else
		{
			System.out.println("Array List doesn't contains the value that you are saerching ");
		}
		ArrayList<String> a4=new ArrayList<String>();
		a4.add("Pakisthan");
		a4.add("Afganisthan");
		a4.add("China");
		System.out.println("Your Second String Array List is -> "+a4);
		a4.addAll(a3);
		System.out.println("Your Second String array list after adding first array list -> "+a4);
		a2.removeAll(a1);
		System.out.println("After Removing first array list from the Included Array List is -> "+a4);
		
		//
		ArrayList<Double> a5=new ArrayList<Double>();
		a5.add(1.1);
		a5.add(2.2);
		a5.add(3.3);
		a5.add(4.4);
		a5.add(5.5);
		System.out.println("Your First Double Array List is -> "+a5);
		a5.remove(1);
		System.out.println("Your First String Array list after removing 1 Index ->"+a5);
		boolean b3=a5.contains(4.4);
		if (b3)
		{
			System.out.println("Array list contains the your searching value in it ");
		}
		else
		{
			System.out.println("Array List doesn't contains the value that you are saerching ");
		}
		ArrayList<Double> a6=new ArrayList<Double>();
		a6.add(6.6);
		a6.add(7.7);
		a6.add(8.8);
		System.out.println("Your Second String Array List is -> "+a6);
		a6.addAll(a5);
		System.out.println("Your Second String array list after adding first array list -> "+a6);
		a6.removeAll(a5);
		System.out.println("After Removing first array list from the Included Array List is -> "+a6);
	}

}
