package EclipseJavaCodes;
import java.util.*;
import java.lang.*;
//write the program to find out the sum of an AP series;
public class main75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,df,n2,i,ln;
		int s1=0;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		df=s.nextInt();
		ln=0;//remove ln
		for(i=1;i<=n2;i++) {
			ln=n1+(i-1)*df;
			s1+=ln;
			if(i==n2) {//remove loop
				break;
			}
			System.out.print(ln+" + ");
		}
		System.out.println(ln+" = "+s1);//remove ln and = here

	}

}
