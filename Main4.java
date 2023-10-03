package EclipseJavaCodes.AdvancedJava;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task implements Runnable{
	String name;
	Task(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println("Task:"+name+" is runnig on thread "+Thread.currentThread().getName());
		
	}
}
public class Main4 {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		Runnable task1=new Task("of locking");
		Runnable task2=new Task("of checking");
		System.out.println("Starting execution");
		executor.submit(task1);
		executor.submit(task2);
		executor.shutdown();

	}

}
