package EclipseJavaCodes.AdvancedJava;
import java.util.*;
import java.io.*;

public class test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter your name:");
//		String name=sc.next();
//		System.out.println("welcome "+name);
		
		//another way to take input
		//InputStreamReader is =new InputStreamReader(System.in);
		
		//another way to take input
		//commandLine args
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader reader =new BufferedReader(is);
		String name = reader.readLine();
		 
        System.out.println(name);

	}

}
