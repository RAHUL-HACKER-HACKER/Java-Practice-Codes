package EclipseJavaCodes.AdvancedJava;
import java.awt.*;

import javax.swing.JFrame;
public class Testawt {
	Testawt(){
		Frame fm=new Frame();
		Button btn=new Button("hello word");
		Label lb=new Label("welcome to java graphic");
		fm.add(btn);
		fm.add(lb);
		fm.setSize(300,300);
		fm.setLayout(new FlowLayout());
		fm.setVisible(true);
		fm.setBackground(Color.red);
		//fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testawt obj=new Testawt();

	}

}
