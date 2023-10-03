package EclipseJavaCodes.AdvancedJava;
import java.util.*;
//this(); refer the same class
//super();  refer the parent class 
class Base{
	Base(){
	
		System.out.println("Base class constructor");
	}
	Base(String str){
		//Base obj=new Base(); //or use this()
		this();
		System.out.println("Base class constructor with argument: "+str);
	}
}
class Derived extends Base {
	
	Derived(){
	
		super("Base");
		//Base obj=new Base("Base");
		System.out.println("Derived class constructor");
	}
	Derived(String str){
		this();
		System.out.println("Derived class constructor with argument: "+str);
		
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		//Base obj=new Base();
		Derived obj=new Derived("derived");
		
	}

}
