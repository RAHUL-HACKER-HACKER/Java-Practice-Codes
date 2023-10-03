package EclipseJavaCodes.AdvancedJava;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.*;

import javax.swing.JComponent;
import javax.swing.JFrame;
class CustomComponent extends JComponent{
	int x,y,width,height;
	private Color color;
	public CustomComponent() {
		x=0;
		y=0;
		width=50;
		height=50;
		color=Color.red;
		System.out.println("constructor called");
	} 
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
		repaint();
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
		repaint();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width=width;
		repaint();
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
		repaint();
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color=color;
		repaint();
	}
	public Dimension getPreferredSize() {
		return new Dimension(width,height);
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
}
public class Main11 {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//  JPanel jpanel=new Jpanel()
		CustomComponent  customComponent=new CustomComponent();
		customComponent.setX(100);
		customComponent.setY(100);;
		customComponent.setWidth(200);
		customComponent.setHeight(200);
		frame.add(customComponent);
		frame.setVisible(true);
		

	}

}
