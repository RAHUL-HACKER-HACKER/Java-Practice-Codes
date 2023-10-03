package EclipseJavaCodes;
import java.util.*;
public class main121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n+1-i;j++){
				System.out.print(" ");
				
			}
			for(int j=0;j<i;j++) {
				
				System.out.print(" *");
			}
			System.out.println();
			
			
		}

	}

}
