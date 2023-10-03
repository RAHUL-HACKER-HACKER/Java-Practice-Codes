package javaPrograms;
import java.util.*;
import java.io.*;
public class InputOutputJava {

	public static void main(String[] args) throws Exception {
		// first way
				System.out.println("Enter value1:");
				InputStreamReader in=new InputStreamReader(System.in);
				BufferedReader br1=new BufferedReader(in);
				int value1=Integer.parseInt(br1.readLine());
				System.out.println(value1);
				
				//second way
				System.out.println("Enter value2:");
				BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
				int value2=Integer.parseInt(br2.readLine());
				System.out.println(value2);
				
				//third way
				System.out.println("Enter value3:");
				Scanner sc=new Scanner(System.in);
				int value3=sc.nextInt();
				System.out.println(value3);
		
		
		//important
		
		
		System.out.println("Enter intValue:");
		int intValue=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter strValue:");
		String strValue=sc.nextLine();
		
		System.out.println(intValue);
		System.out.println(strValue);


	}

}
