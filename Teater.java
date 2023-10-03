package EclipseJavaCodes.AdvancedJava;
import java.util.*;
//Association,Aggregation and composition
class Car{
	String speed;
	String color;
	public void setSpeed(String speed) {
		this.speed=speed;
		
	}
	public void setColor(String color) {
		
		this.color=color;
	}
	public void getCarDetails() {
		System.out.println("CarSpeed:"+speed+"\nCarColor:"+color);
	}
}
class CarEngine{
	private int noOfCy1inders;
	private int horsepower;
	CarEngine(int noOfCy1inders,int horsepower){
		this.noOfCy1inders=noOfCy1inders;
		this.horsepower=horsepower;
	}
	public void startEngine() {
		System.out.println("Car Engine Started.");
	}
}
class DzireCar extends Car{
	private CarEngine dzireEngine;
	DzireCar(){
		dzireEngine=new CarEngine(5,200);
		dzireEngine.startEngine();
	}
	
}
class BreezaCar extends Car{
	private CarEngine BreezaEngine;
	BreezaCar(){
		BreezaEngine=new CarEngine(3,300);
		BreezaEngine.startEngine();
	}
	
}


class Teater {

	public static void main(String[] args) {

		DzireCar dzire=new DzireCar();
		dzire.setSpeed("200km/h");
		dzire.setColor("red");
		dzire.getCarDetails();
		
		BreezaCar Breeza=new BreezaCar();
		Breeza.setSpeed("300km/h");
		Breeza.setColor("blue");
		Breeza.getCarDetails();
		

	}

}
