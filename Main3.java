package EclipseJavaCodes.AdvancedJava;
import java.util.*;
//Association,Aggregation and composition
class Engine{
	public void work() {
		System.out.println("Engine Started");
	}
}
class Car1{
	Engine engine;
	
	Car1(Engine engine) {
		this.engine=engine;
		
	}
	
	public void  move() {
		engine.work();
		System.out.println("Car is Moving");
	}
}
class Main3 {

	public static void main(String[] args) {
	     Engine gamma=new Engine();
	     Car1 maruti=new Car1(gamma);
	     maruti.move();

	}

}
