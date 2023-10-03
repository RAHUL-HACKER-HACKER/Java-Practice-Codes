package EclipseJavaCodes.AdvancedJava;
import java.util.*;
import java.io.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter values of x and y:");
			double x=sc.nextInt();
			double y=sc.nextInt();
			double result=x/y;
			System.out.println("result:"+result);
			
		}
		catch(Exception e) {
			System.out.println(e);
			//throw new Exception("hello"); 
		}
		finally{
			System.out.println("Program ended");
		}
		
		System.out.println("____thanks____");

	}

}
