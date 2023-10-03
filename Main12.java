package EclipseJavaCodes.AdvancedJava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main12 extends JFrame {
	static String str="";
	public static void main(String[] args) {
		JFrame f=new JFrame("User From");
		f.setSize(800,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.getContentPane().setBackground(Color.yellow);
		
		JLabel l1=new JLabel("UserName:");
		f.add(l1);
		JTextField t1=new JTextField(20);
		f.add(t1);
		JButton b=new JButton("Submit");
		f.add(b);
		
		b.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            
	            String textFieldValue1 = t1.getText();
	            JOptionPane.showMessageDialog(f, "Submited:"+textFieldValue1);
	            str+=textFieldValue1;
	            JLabel l3=new JLabel("UserName:"+str);
	            f.add(l3);
	            f.pack();
	         }
	      });
		
		f.setVisible(true);
		f.pack();
		
		

	}

}
