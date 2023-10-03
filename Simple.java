package EclipseJavaCodes;
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
		
		int a=200;
		int b=500;
		float c=23.445f;
		char c2 = 'A'  ;
		double d1 = 12.3d  ;
		System.out.println(a);
		System.out.println("hello sadsadsa dsfddsf word "+c+" " +c2);
		System.out.println(""+a+b);
		String s="rahul";
		
		int min=(a<b)?a:b;
		System.out.println(min);
		System.out.println(s);
	
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
			

	}

}
