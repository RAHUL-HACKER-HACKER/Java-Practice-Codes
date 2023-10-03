package javaPrograms;
import java.util.*;

//Anonymous Classes & Lambda Expressions

@FunctionalInterface
interface Shapes{
	//we have to create only one function/method
	abstract double circle(double r);
	
}

public class LambdaAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can not create an object but can write like this no need to implement class for object creation;
		Shapes area=(double r)->{
			double result=Math.PI*Math.pow(r, 2);
			return result;
			
		};
		
		System.out.println(area.circle(7));

	}

}
