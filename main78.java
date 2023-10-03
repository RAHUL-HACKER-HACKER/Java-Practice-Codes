package EclipseJavaCodes;
import java.util.*;
//write a program to welcome a person using default constructor;
public class main78 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Welcome obj1=new Welcome(name);
		Hello obj2=new Hello(name);

	}

}
class Welcome{
	Welcome(String name){
		System.out.println("Welcome "+name);
	}
}
class Hello{
	Hello(String name){
		System.out.println("Hello "+name);
	}
}
