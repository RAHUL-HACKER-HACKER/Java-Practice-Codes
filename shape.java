package EclipseJavaCodes.AdvancedJava;
import java.util.*;
import java.lang.*;
import java.io.*;
class shape1{
	int  radius;
	float area1;
    public void area1(int radius) {
    	this.radius=radius;
    	System.out.println("area1");
    	area1=(float) (radius*radius*3.14);
    	System.out.println(area1);
    	
		
	}
    public float area2(float area2) {
    	System.out.println("area2:");
    	area2=(float) (radius*radius*3.14);
    	
    	return area2;
	}
	
}
public class shape {
	

	public static void main(String[] args) {
		int radius=20;
		shape1 obj=new shape1();
		obj.area1(radius);
		float area2=obj.area2(radius);
		System.out.println(area2);
		

	}

}
