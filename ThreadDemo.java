package EclipseJavaCodes.AdvancedJava;
import java.util.*;
//Runnable interface
class ThreadInterface implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread  Interface");
	}
	
}
//Runnable class
class ThreadClass extends Thread{
	public void run() {
		System.out.println("Thread class");
	}
}

public class ThreadDemo  {
	public static void main(String[] args) {
		ThreadClass t1=new ThreadClass();
		t1.run();
		
		
	           
	}

}
