package EclipseJavaCodes;
import java.util.*;

public class main80 {
	public static void main(String[] args) {
		System.out.println("Please enter Hexadecimal number : ");
        Scanner scanner = new Scanner(System.in);
     
        String hexadecimal = scanner.next();
     
        //Converting Hexa decimal number to Decimal in Java
        int decimal = Integer.parseInt(hexadecimal, 16);
     
        System.out.println("Converted Decimal number is : " + decimal);
   
        //Converting hexadecimal number to binary in Java      
        String binary = Integer.toBinaryString(decimal);
        System.out.printf("Hexadecimal to Binary conversion of %s is %s %n", hexadecimal, binary );
     
        // Converting Hex String to Octal in Java
        String octal = Integer.toOctalString(decimal);
        System.out.printf("Hexadecimal to Octal conversion of %s is %s %n", hexadecimal, octal );

	}

}
