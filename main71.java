package EclipseJavaCodes;
import java.util.*;
public class main71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,start,end,k;
		Scanner sc=new Scanner(System.in);
		start=sc.nextInt();
		end=sc.nextInt();
		k=sc.nextInt();
		for(i=start;i<=end;i++) {
			if(i%k==0) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\nThe sum : "+sum);
         
	}

}
