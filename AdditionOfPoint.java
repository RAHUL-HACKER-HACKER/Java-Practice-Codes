package EclipseJavaCodes;

import java.util.Scanner;

class Point{
	
    private int x;
	private int y;
	public void getvalues() {
		
		Scanner scr=new Scanner(System.in) ;
		System.out.println("enter value of x : ");
		x=scr.nextInt();
		System.out.println("enter value of y : ");
		y=scr.nextInt();
		//scr.close();
	}
	public void display() {
		
		System.out.println("point("+x+","+y+")");
		
	}
	public static Point add(Point p1,Point p2) {
		Point p3=new Point();
		p3.x=p1.x+p2.x;
		p3.y=p1.y+p2.y;
		return p3;
		
	}
	
	
}






public class AdditionOfPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value of point1 ");
		Point p1=new Point();
		p1.getvalues();
		p1.display();
		
		System.out.println("enter value of point2 ");
		Point p2=new Point();
		p2.getvalues();
		p2.display();
		
		System.out.println("sum of point1 and point2 ");
		Point p3=Point.add(p1,p2);
		p3.display();
		
		
		

	}

}
