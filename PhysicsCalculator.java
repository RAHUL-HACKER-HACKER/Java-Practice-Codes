package EclipseJavaCodes.AdvancedJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhysicsCalculator extends JFrame implements ActionListener {
   JLabel label1, label2, label3, label4;
   JTextField tf1, tf2, tf3;
   JButton btnCalculate, btnReset;

   PhysicsCalculator() {
      setTitle("Physics Calculator");
      setSize(400, 300);
      setLayout(null);

      label1 = new JLabel("Enter Voltage: ");
      label1.setBounds(20, 20, 120, 20);
      add(label1);

      tf1 = new JTextField();
      tf1.setBounds(150, 20, 100, 20);
      add(tf1);

      label2 = new JLabel("Enter Resistance: ");
      label2.setBounds(20, 50, 120, 20);
      add(label2);

      tf2 = new JTextField();
      tf2.setBounds(150, 50, 100, 20);
      add(tf2);

      label3 = new JLabel("Enter Current: ");
      label3.setBounds(20, 80, 120, 20);
      add(label3);

      tf3 = new JTextField();
      tf3.setBounds(150, 80, 100, 20);
      add(tf3);

      btnCalculate = new JButton("Calculate");
      btnCalculate.setBounds(20, 120, 100, 20);
      add(btnCalculate);
      btnCalculate.addActionListener(this);

      btnReset = new JButton("Reset");
      btnReset.setBounds(150, 120, 100, 20);
      add(btnReset);
      btnReset.addActionListener(this);

      label4 = new JLabel("");
      label4.setBounds(20, 150, 300, 20);
      add(label4);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btnCalculate) {
         try {
            double voltage = Double.parseDouble(tf1.getText());
            double resistance = Double.parseDouble(tf2.getText());
            double current = Double.parseDouble(tf3.getText());
            if (voltage > 0 && resistance > 0 && current > 0) {
               label4.setText("Please provide only two values");
               label4.setForeground(Color.RED);
            } else if (voltage > 0 && resistance > 0) {
               double currentResult = voltage / resistance;
               label4.setText("Current: " + currentResult);
               label4.setForeground(Color.BLACK);
            } else if (voltage > 0 && current > 0) {
               double resistanceResult = voltage / current;
               label4.setText("Resistance: " + resistanceResult);
               label4.setForeground(Color.BLACK);
            } else if (resistance > 0 && current > 0) {
               double voltageResult = resistance * current;
               label4.setText("Voltage: " + voltageResult);
               label4.setForeground(Color.BLACK);
            } else {
               label4.setText("Please provide two values");
               label4.setForeground(Color.RED);
            }
            if (voltage > 0 && resistance > 0 && current > 0) {
               double validCurrent = voltage / resistance;
               if (validCurrent == current) {
                   getContentPane().setBackground(Color.GREEN);
                   label4.setText("Current is valid.");
                   label4.setForeground(Color.BLACK);
                } else {
                   getContentPane().setBackground(Color.RED);
                   label4.setText("Current is not valid.");
                   label4.setForeground(Color.WHITE);
                }
             }
         }catch (NumberFormatException ex) {
                label4.setText("Please provide valid numeric values");
                label4.setForeground(Color.RED);
             }
          } else if (e.getSource() == btnReset) {
             tf1.setText("");
             tf2.setText("");
             tf3.setText("");
             label4.setText("");
             getContentPane().setBackground(null);
          }
       }

       public static void main(String[] args) {
          new PhysicsCalculator();
       }
    }


