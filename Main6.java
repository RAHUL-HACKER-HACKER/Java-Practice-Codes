package EclipseJavaCodes.AdvancedJava;
import java.util.*;
class Movies{
	String mn;
	int rating;
	public void setter(String mn, int rating) {
		this.mn=mn;
		this.rating=rating;
	}
	public void getter() {
		System.out.println("movie name:"+mn);
		System.out.println("rating"+rating);
	}
}
public class Main6 {

	public static void main(String[] args) {
		Movies m=new Movies();
		m.setter("3-idiots", 5);
		m.getter();

	}

}
