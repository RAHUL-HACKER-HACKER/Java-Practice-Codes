package EclipseJavaCodes;
import java.util.*;
import java.lang.*;

public class main18 {
	public static void crt(int a1,int a2,int a3,int m1,int m2,int m3) {
		int iM1 =0;
		int iM2=0;
		int iM3=0;
		int sol;
		int M=m1*m2*m3;
		int M1=M/m1;
		
		int M2=M/m2;
		int M3=M/m3;
		
		
		for(int i=1;i<10;i++) {
			
			if(((M1*i)% m1)==1) {
				
				iM1=i;
				
				break;
				
			}
		}
        for(int i=1;i<10;i++) {
			
			if(((M2*i)% m2)==1) {
				
				iM2=i;
				
				break;
			}
		}
        for(int i=1;i<10;i++) {
			
			if(((M3*i)% m3)==1) {
				
				iM3=i;
				
				break;
			}
			
		
		}
       sol=((a1*M1*iM1)+(a2*M2*iM2)+(a3*M3*iM3))%M;
       System.out.println(sol);
        
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scr=new Scanner(System.in);
//		System.out.println("enter size of x:");
//		int n=scr.nextInt();
		int a1=2,a2=3,a3=2;
		int m1=3,m2=5,m3=7;
		crt(a1,a2,a3,m1,m2,m3);
		
		
		
		

	}

}
