package EclipseJavaCodes.AdvancedJava;
import java.util.*;
public class Main10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int jar=10;
		int candiesInJar=8;
		while(true) {
			System.out.println("Enter candies to buy:");
			int n=sc.nextInt();
			if(n<=candiesInJar) {
				System.out.println("buy candies:"+n);
				System.out.println("left candies:"+(candiesInJar-n));
				candiesInJar-=n;
				System.out.println("update candies:"+(jar-n));
				candiesInJar+=(jar-n);
				System.out.println("candies in jar:"+(candiesInJar));
				
			}
			else {
				System.out.println("Invalid input");
				
			}
			
			
			
			
			
		}

	}

}
