package EclipseJavaCodes;
import java.util.*;

public class main70 {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static boolean isStrong(int n) {
		int orignal=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum+=factorial(digit);
			n/=10;
		}
		return(sum==orignal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(isStrong(i)) {
				System.out.print(i+" ");
			}
		}
		

	}

}
