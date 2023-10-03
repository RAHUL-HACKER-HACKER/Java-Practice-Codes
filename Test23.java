package JavaTests;
import java.util.*;
public class Test23 {
	public static void disc(int bill) {
		int newbill=bill;
		int oddsum=0;
		while(bill>0) {
			int digit=bill%10;
			if(digit%2!=0) {
				oddsum+=digit;
			}
			bill/=10;
		}
		System.out.println(newbill-oddsum);
		
	}
	public static void nonRepeated(String str) {
		char[] cha=str.toCharArray();
		int result=0;
		for(char c:cha) {
			int count=0;
			for(char value:cha) {
				if((""+c).equalsIgnoreCase((""+value))) {
					count+=1;
				}
			}
			if(count==1) {
				result+=1;
			}
		}
		System.out.println(result);
	}
	public static void binary(int n) {
		String result="";
		while(n>0) {
			int digit=n%2;
			result=digit+result;
			n/=2;
		}
		System.out.println(result);
	}
	public static void winGame(long n) {
		long fac=1;
		
		for(long i=1;i<=n;i++) {
			fac*=i;
		}
		
		long result=fac;
		long count=0;
		while(fac>0) {
			long digit=fac%10;
			if(digit==0) {
				count++;
			}else {
				break;
			}
			fac/=10;
			
		}
		System.out.println(result);
		System.out.println(count);
	}
	public static void product(int n) {
		int result=1;
		String str=String.valueOf(n);
		for(int i=0;i<str.length();i++) {
			result*=Integer.valueOf(""+str.charAt(i));
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disc(2345);
		nonRepeated("Alphaadida");
		binary(0);
		
		winGame(10);
		product(2342);
		
		int[][] arr= {{2,4,1,0,4,5},{20,40,10,0,4,5}};
		Arrays.sort(arr[1]);
		System.out.println(Arrays.deepToString(arr));

	}

}
