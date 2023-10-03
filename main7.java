package EclipseJavaCodes.AdvancedJava;
import java.util.*;
public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the no: ");  
		int n = sc.nextInt();
		if(n>=0) {
			int digit;
			int sum=0;
		   while(n>0)  
		   {  
			    
			digit =n%10;  
			sum=sum+digit;  
			n=n/10;  
		   }  
			 
			System.out.println("Sum of All Digits of no: "+sum); 
			
		}
		else {
			n=-n;
			int digit;
			int sum=0;
		   while(n>0)  
		   {  
			    
			digit =n%10;  
			sum=sum+digit;  
			n=n/10;  
		   }  
			 
			System.out.println("Sum of All Digits: "+(-sum)); 
			
		}
		 

 }
}