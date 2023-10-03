package EclipseJavaCodes.AdvancedJava;

//superclass
class Animal {
public void eat() {
   System.out.println("I am eating");
}
}

//subclass
class Dog extends Animal {
public void bark() {
   System.out.println("Woof!");
  }
}

//subclass
class Cow extends Animal {
public void Ooo() {
 System.out.println("Ooo!");
 }
}

//main method
public class InheritanceExample {
public static void main(String[] args) {
   System.out.println("---Dog---");
   Dog myDog = new Dog();
   myDog.eat();  // inherited method
   myDog.bark(); // subclass method
   
   System.out.println("---Cow---");
   Cow myCow = new Cow();
   myCow.eat(); 
   myCow.Ooo();
   
   
}
}
