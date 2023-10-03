package EclipseJavaCodes;
import java.util.*;
//write a program to find the area of the wall;
public class main77 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double l1=sc.nextDouble();
		double b1=sc.nextDouble();
		double l2=sc.nextDouble();
		double b2=sc.nextDouble();
		Wall obj1=new Wall(l1,b1);
		Wall obj2=new Wall(l2,b2);
		System.out.println("Area of Wall 1: "+obj1.calculateArea());
		System.out.println("Area of Wall 2: "+String.format("%.2f", obj2.calculateArea()));
	}
}
class Wall{
	double length;
	double height;
	Wall(double length,double height) {
		this.length=length;
		this.height=height;	
	}
	public double calculateArea() {
		double area=length*height;
		return area;
	}
}
