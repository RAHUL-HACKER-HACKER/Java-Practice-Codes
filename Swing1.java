package EclipseJavaCodes.AdvancedJava;
//import java.swing.*;

import javax.swing.JOptionPane;
public class Swing1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum;
		String s1=JOptionPane.showInputDialog("enter 1st value:");
		a=Integer.parseInt(s1);
		String s2=JOptionPane.showInputDialog("enter 2st value:");
		
		b=Integer.parseInt(s2);
		sum=a+b;
		//JOptionPane.showInputDialog(null,"the sum of 2 values entered:"+sum);
		JOptionPane.showMessageDialog(null,"Sum:"+sum);

	}

}
