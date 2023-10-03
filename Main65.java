package EclipseJavaCodes;
import java.util.*;
public class Main65 {
	public void disp(double a, double b,String str) {
		System.out.println("value: ");
		if(str=="add") {
			System.out.println(a+b);
		}
		else if(str=="sub") {
			
			System.out.println(a-b);
			
		}else if(str=="mul") {
			
			System.out.println(a*b);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main65 obj=new Main65();
		System.out.println("enter math operation:");
		Scanner scr=new Scanner(System.in);
		String st="";
		st=scr.nextLine();
		double x=scr.nextDouble();
		double y=scr.nextDouble();
		scr.close();
	
		obj.disp(x,y,st);
		

	}
	

}
