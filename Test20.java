package JavaTests;
import java.util.*;
public class Test20 {
	public static String comPrefix(String[] arr) {
		String comStr=arr[0];
		String result="";
		for(int i=0;i<comStr.length();i++) {
			boolean flag=true;
			for(int j=0;j<arr.length;j++) {
				if(arr[j].length()<=i || arr[0].charAt(i)!=arr[j].charAt(i)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				result+=arr[0].charAt(i);
			}else {
				break;
			}
		}
		return result;
	}
	
	//pattern1
	public static void pattern1(int n,int m) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0||i==n||j==0||j==m) {
					System.out.print(n);
				}else {
					System.out.print(i);
				}
				
			}
			System.out.println();
			
		}
	}
	//pattern2
	public static void pattern2(int n) {
		int count=1;
		String str="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int deffer=(i-1)-(2*(j-1));
				if(j==i) {
					System.out.print(count+deffer);
				}else {
				System.out.print(count+deffer+"*");
				}
				count++;
			}
			System.out.println();
			
		}
		
	}
	//pattern3
		public static void pattern3(int n) {
			int count=1;
			String str="";
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					int deffer=(i-1)-(2*(j-1));
				    if(j%2==0) {
				    	System.out.print("*");
				    }else {
				    	System.out.print(count+deffer);
				    }
					
				
					count++;
				}
				System.out.println();
				
			}
			
		}
		//pattern4
		public static void pattern4(int n) {
			int mid=(n+1)/2;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i==mid||j==mid||(j==1&&i<=mid)||(i==1&&j>=mid)||(j==n&&i>=mid)||(i==n&&j<=mid)) {
						System.out.print(" *");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr= {"coding","cgdezen","codening","coders"};
        System.out.println(comPrefix(arr));
        pattern1(3,2);
        pattern2(4);
        pattern4(7);
	}

}
