package EclipseJavaCodes.AdvancedJava;
//class modeling and aggregation;
import java.util.*;
class Book{
	String title;
	String author;
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	public void readB() {
		System.out.println("readB");
	}
	public void displayB() {
		System.out.println("title:"+title+"\nauthor:"+author);
	}
}
class Student extends Book{
	String name;
	String email;
	Student(String name, String email) {
		super("abc","xyz");
		
	}
	
	public void readData() {
		System.out.println("readData");
	}
	public void display() {
		System.out.println("name:"+name+"\nauthor:"+email);
	}
	
}

class EnggStudent extends Student{
	String branch;
	EnggStudent(String branch) {
		super("rahul","xyz@gmail.com");
		this.branch=branch;
		
	}

	public void displayBranch() {
		System.out.println("branch:"+branch);
	}
}
class ArtsStudent extends Student{
	String subject;
	ArtsStudent(String subject) {
		super("Shiddharth","xyz@gmail.com");
		this.subject=subject;
		
	}
	public void displayBranch() {
		System.out.println("subject:"+subject);
	}

	
	
}
public class Main2 {

	public static void main(String[] args) {
		EnggStudent obj=new EnggStudent("cse");
		obj.displayB();
		obj.display();
		obj.displayBranch();
		

	}

}
