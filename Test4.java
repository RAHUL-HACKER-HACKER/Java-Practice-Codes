package EclipseJavaCodes;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter lower value:");
		int n=scr.nextInt();
		System.out.println("enter higher value:");
		int m=scr.nextInt();
		for(int i=n+1;i<m;i++) {
			
			boolean temp=true;
			
			for(int j=2;j<m;j++) {
				if(i%j==0) {
					
					temp=false;
					
					
					
				}
			}
            if(temp==true) {
				
				System.out.println(i+",");
			}
			
			
		}

	}
}
