package EclipseJavaCodes;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
public class main84 {

	public static void main(String[] args) {
		
		//default rounding half-up.
		System.out.println("String.format: " + String.format("%.2f", 2.425));
		//or
		System.out.printf("%.2f", 2.425);
		
		DecimalFormat decfor = new DecimalFormat("0.00");
		
		System.out.println("DecimalFormat default RoundingMode.HALF_EVEN: " + decfor.format(2.425));
		
		
		decfor.setRoundingMode(RoundingMode.UP);
		System.out.println("DecimalFormat RoundingMode.UP: " + decfor.format(2.424));
		
		decfor.setRoundingMode(RoundingMode.DOWN);
		System.out.println("DecimalFormat RoundingMode.DOWN: " + decfor.format(2.426));
		
		decfor.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println("DecimalFormat RoundingMode.HALF_UP: " + decfor.format(2.425));
		
		decfor.setRoundingMode(RoundingMode.HALF_DOWN);
		System.out.println("DecimalFormat RoundingMode.HALF_DOWN: " + decfor.format(2.425));
		
		decfor.setRoundingMode(RoundingMode.HALF_EVEN);
		System.out.println("DecimalFormat RoundingMode.HALF_EVEN: " + decfor.format(2.425));
		
		decfor.setRoundingMode(RoundingMode.CEILING);
		System.out.println("DecimalFormat RoundingMode.CEILING: " + decfor.format(2.425));
		
		decfor.setRoundingMode(RoundingMode.FLOOR);
		System.out.println("DecimalFormat RoundingMode.FLOOR: " + decfor.format(2.425));

	}

}
