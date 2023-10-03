package EclipseJavaCodes.AdvancedJava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SwingDetails {

	public static void main(String[] args) {
		JFrame f=new JFrame("User From");
		//f.setTitle("My JFrame Title");
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.getContentPane().setBackground(Color.GRAY);
		
		JLabel l1=new JLabel("UserName:");
		f.add(l1);
		JTextField t1=new JTextField(20);
		f.add(t1);
		
		JLabel l2=new JLabel("Password:");
		f.add(l2);
		JTextField t2=new JTextField(20);
		f.add(t2);
		
		JButton b=new JButton("Submit");
		b.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            JOptionPane.showMessageDialog(f, "Submit Successfuly");
	            String textFieldValue1 = t1.getText();
	            String textFieldValue2 = t2.getText();
	            JLabel l3=new JLabel("UserName"+textFieldValue1+"\nPassword:"+textFieldValue2);
	            f.add(l3);
	         }
	      });
		f.add(b);
		
		

	}

}
