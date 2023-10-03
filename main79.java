package EclipseJavaCodes;
import java.util.*;
//create a class box with the following public attributes;
public class main79 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		double d=sc.nextDouble();
		double l=sc.nextDouble();
		Box obj1=new Box();
		System.out.println("Volume of mybox1 is "+0);
		Box obj2=new Box(w,h,d);
		System.out.println("Volume of mybox2 is "+(int)((obj2.w)*(obj2.h)*(obj2.d)));
		Box obj3=new Box(l);
		System.out.println("Volume of mycube is "+(int)(obj3.volume()));
	}
}
class Box{
	double w;
	double h;
	double d;
	double l;
	Box(){	
	}
	Box(double w,double h,double d){
		this.w=w;
		this.h=h;
		this.d=d;
	}
	Box(double l){
		this.l=l;
	}
	public double volume() {
		return l*l*l;
	}
}
