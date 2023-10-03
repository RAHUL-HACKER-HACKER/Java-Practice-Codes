package EclipseJavaCodes;
import java.util.*;
//create a class Overloading with the following private attributes;
public class main82 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name1=sc.next();
		int temp1=sc.nextInt();
		String name2=sc.next();
		String day=sc.next();
		int temp2=sc.nextInt();
		Overloading obj1=new Overloading();
		System.out.println(obj1.name+" Yesterday Temperature: "+obj1.temp+"\u00B0");
		Overloading obj2=new Overloading(name1,temp1);
		System.out.println(obj2.name+" Today Temperature: "+obj2.temp+"\u00B0");
		Overloading obj3=new Overloading(name2,day,temp2);
		System.out.println(obj3.name+" "+obj3.day+" Temperature: "+obj3.temp+"\u00B0");
	}
}
class Overloading{
	String name;
	String day;
	int temp;
	Overloading(){
		name="Argentina";
		temp=29;
	}
	Overloading(String name,int temp){
        this.name=name;
        this.temp=temp;
	}
	Overloading(String name,String day,int temp){
        this.name=name;
        this.day=day;
        this.temp=temp;
	}
	
	
}
