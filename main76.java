package EclipseJavaCodes;
import java.util.*;
import java.lang.*;
public class main76 {

	public static void main(String[] args) {
		int p,c,m,t,mp;
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
		c=s.nextInt();
		m=s.nextInt();
		t=p+c+m;
		mp=m+p;
		if(m>=65 && p>=55 && c>=50 && t>=190) {
			System.out.println("total marks of m,p, and c : "+t);
			System.out.println("total marks of m and p : "+mp);
			System.out.println("candidate eligible");
				
		}
		else if(mp>=140) {
			System.out.println("total marks of m,p, and c : "+t);
			System.out.println("total marks of m and p : "+mp);
			System.out.println("candidate eligible");
		}
		else {
			System.out.println("total marks of m,p, and c : "+t);
			System.out.println("total marks of m and p : "+mp);
			System.out.println("candidate not eligible");
		}

	}

}
