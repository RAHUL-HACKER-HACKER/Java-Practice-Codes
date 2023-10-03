package EclipseJavaCodes;
import java.util.*;
public class main83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,t=9;
		int sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++) {
			sum+=t;
			System.out.println(t);
			t=t*10+9;
		}
		System.out.println(sum);

	}

}
