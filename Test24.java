package JavaTests;
import java.util.*;
public class Test24 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=sc.nextInt();
		String str=""+num;
		String sub1=str.substring(0,k);
		String sub2=str.substring(k,str.length());
		String result=sub2+sub1;
		System.out.println(result);
		
		

	}

}
