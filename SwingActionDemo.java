package EclipseJavaCodes.AdvancedJava;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

class MyFrame1 extends JFrame implements ActionListener{
	Container c;
	JButton btn1,btn2,btn3;
	boolean ofset=true;
	MyFrame1(){
		c=this.getContentPane();
		c.setLayout(null);
		
		btn1=new JButton("RED");
		btn1.setBounds(100, 100, 100, 50);
		c.add(btn1);
		btn1.addActionListener(this);
		
		btn2=new JButton("GREEN");
		btn2.setBounds(200, 100, 100, 50);
		c.add(btn2);
		btn2.addActionListener(this);
		
		btn3=new JButton("BLUE");
		btn3.setBounds(300, 100, 100, 50);
		c.add(btn3);
		btn3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1) {
			if(ofset==true) {
				c.setBackground(Color.red);
				ofset=false;
			}else {
				c.setBackground(Color.white);
				ofset=true;
			}
		}
		
		if(e.getSource()==btn2) {
			if(ofset==true) {
				c.setBackground(Color.green);
				ofset=false;
			}else {
				c.setBackground(Color.white);
				ofset=true;
			}
		}
		
		if(e.getSource()==btn3) {
			if(ofset==true) {
				c.setBackground(Color.blue);
				ofset=false;
			}else {
				c.setBackground(Color.white);
				ofset=true;
			}
		}
		
		
	}
	
}
public class SwingActionDemo {

	public static void main(String[] args) {
		MyFrame1 f=new MyFrame1();
		f.setTitle("Action Demo");
		f.setSize(700, 500);
		f.setLocation(100, 100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
	}

}
