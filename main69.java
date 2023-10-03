package EclipseJavaCodes;
import java.util.*;
import java.lang.*;
import java.io.*;
public class main69 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Attributes obj[]=new Attributes[n];
		
		for(int i=0;i<n;i++) {
			obj[i]=new Attributes();
			obj[i].get();
		}
		for(int i=0;i<n;i++) {
			int sum=obj[i].mark1+obj[i].mark2+obj[i].mark3;
			System.out.println(sum);
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(obj[i].mark1>=obj[j].mark1) {
					count++;
				}
				
			}
			if(count==n) {
				System.out.println((i+1)+" "+obj[i].mark1);
				break;
			}
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(obj[i].mark2>=obj[j].mark2) {
					count++;
				}
			}
			if(count==n) {
				System.out.println((i+1)+" "+obj[i].mark2);
				break;
			}
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(obj[i].mark3>=obj[j].mark3) {
					count++;
				}
			}
			if(count==n) {
				System.out.println((i+1)+" "+obj[i].mark3);
				break;
			}
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if((obj[i].mark1+obj[i].mark2+obj[i].mark3)>=(obj[j].mark1+obj[j].mark2+obj[j].mark3)) {
					count++;
				}
			}
			if(count==n) {
				System.out.println((i+1)+" "+(obj[i].mark1+obj[i].mark2+obj[i].mark3));
				break;
			}
		}

	}
}
class Attributes{
	int rollno;
	int mark1;
	int mark2;
	int mark3;
	public void get() {
		Scanner sc=new Scanner(System.in);
		rollno=sc.nextInt();
		mark1=sc.nextInt();
		mark2=sc.nextInt();
		mark3=sc.nextInt();
		
	}
}
