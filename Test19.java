package JavaTests;
import java.util.*;
public class Test19 {
	public static ArrayList<String> subSeq(String str){
		ArrayList<String> al=new ArrayList<>();
		if(str.length()==0) {
			al.add("");
			return al;
		}
		char c=str.charAt(0);
		String substr=str.substring(1);
		ArrayList<String> smallal=subSeq(substr);
		for(String s:smallal) {
			al.add(s);
			al.add(c+s);
		}
		return al;
	}
	
	//gcd of n and m
	public static int gcd(int n,int m) {
		int smallest=n;
		if(m<n) {
			smallest=m;
		}
		while(n>0 && m>0) {
			if(n%smallest==0 && m%smallest==0) {
				return smallest;
			}
			smallest--;
		}
		return 0;
		
	}
	//lcm of n and m
	public static int lcm(int n,int m) {
		int greatest=n;
		if(m>n) {
			greatest=m;
		}
		while(n>0 && m>0) {
			if(greatest%n==0 && greatest%m==0) {
				return greatest;
			}
			greatest++;
		}
		return 0;
	}
	//factor of n
	public static ArrayList<Integer> fac(int n) {
		ArrayList<Integer> arr=new ArrayList<>();
		if(n==1) {
			arr.add(n);
			return arr;
		}else if(n<1) {
			System.out.println("enter valid no!");
			return new ArrayList<>();
		}
		
		int div=2;
		while(n>1) {
			while(n%div==0) {
				arr.add(div);
				n/=div;
			}
			div++;
		}
		return arr;
	}
	//decimal to binary
	public static String decToBin(int n) {
		String ans="";
		while(n>0) {
			int rem=n%2;
			ans=rem+ans;
			n/=2;
		}
		return ans;
		
	}
	//fibonacci
	public static void fibb(int n) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(0);
		arr.add(1);
		for(int i=2;i<n;i++) {
			int nth=arr.get(i-2)+arr.get(i-1);
			arr.add(nth);
			String result=arr.toString().replace("[", "");
			System.out.println(result.replace("]", ""));
			
		}
		
	}
	//pattern
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=subSeq("abc");
		arr.remove(0);
		System.out.println(arr);
		
		int gcd=gcd(24,36);
		System.out.println(gcd);
		
		System.out.println(lcm(24,36));
		
		System.out.println(fac(18));
		
		System.out.println(decToBin(9));
		
		fibb(10);
		
		int n=5;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==0 || i==n-1) {
					System.out.print("*");
					
					
				}
				else {
					System.out.print(" ");
				}
				
				
				
			}
			System.out.println();
			
		}
		
		int num=6;
		
		for(int i=0;i<num;i++) {
			for(int j=num-i-2;j>=0;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<num;j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		int n2=5;
		for(int i=1;i<=n2;i++) {
			for(int j=n2-i-1;j>=0;j--) {
				System.out.print(" ");
			}

			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n2;i>=1;i--) {
			for(int j=1;j<=n2-i;j++) {
				System.out.print("  "); 
				
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
		
		int row = 5;
		int col = 5;
				
    	for (int i = 1; i <= row; i++) {
			for (int j = 1 ; j <= col; j++) { 
				if((i==1 || i==col) || (j==1 || j==col))
				   System.out.print("*");
				else
			       System.out.print(" ");
			}
			System.out.println();
		}
    	
    	
    	int n3=5;
		for(int i=1;i<=n3;i++) {
			for(int j=n3-i-1;j>=0;j--) {
				System.out.print(" ");
			}

			for(int j=1;j<=(2*i-1);j++) {
				if(i==1 || i==n3 || j==1 || j==(2*i-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		 int n4=5;
		 for (int i=0; i<n4; i++) 
	        { 
	            for (int j=n4-i; j>1; j--) 
	                System.out.print(" "); 
	            for (int j=0; j<=i; j++ ) 
	                System.out.print(" *"); 
	            System.out.println(); 
	        } 
		
		//new pattern
		 int n5=5;
		 for (int i=0; i<n5; i++){ 
             for (int j=n5; j>i+1; j--) 
               System.out.print(" "); 
             for (int j=0; j<=i*2; j++ ) 
               System.out.print("*"); 
          System.out.println(); 
      } 
		for(int i=n5;i>0;i--)     
		   {
		      for(int k=n5;k>i;k--)     
		         System.out.print(" ");    
		      for(int j=0;j<i*2-1;j++)     
		         System.out.print("*");    
		      System.out.println();     
		   }

	}

}
