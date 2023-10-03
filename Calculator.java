package EclipseJavaCodes.AdvancedJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;

    Calculator() {
        l1 = new JLabel("Voltage");
        l2 = new JLabel("Resistance");
        l3 = new JLabel("Current");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        b1 = new JButton("Calculate");
        b2 = new JButton("Clear");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l3);
        add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 200);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if (s1.isEmpty() || s2.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both values");
            } else {
                double v = Double.parseDouble(s1);
                double r = Double.parseDouble(s2);

                double i = v / r;

                t3.setText(String.valueOf(i));
            }
        } else if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
