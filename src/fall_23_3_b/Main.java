package fall_23_3_b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Fall 23 Q3(b)");

        frame.setLayout(null);
        frame.setSize(500,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Num 1");
        JLabel l2 = new JLabel("Num 2");
        JLabel l3 = new JLabel("Num 3");
        JLabel l4 = new JLabel("Result");

        JTextField n1 = new JTextField();
        JTextField n2 = new JTextField();
        JTextField n3 = new JTextField();
        JTextField result = new JTextField();

        JButton max = new JButton("Maximum");
        JButton min = new JButton("Minimum");
        JButton avg = new JButton("Average");
        JButton clr = new JButton("Clear");

        l1.setBounds(20,20,60,30);
        n1.setBounds(80,20,60,30);

        l2.setBounds(160,20,60,30);
        n2.setBounds(220,20,60,30);

        l3.setBounds(300,20,60,30);
        n3.setBounds(360,20,60,30);

        l4.setBounds(20,70,60,30);
        result.setBounds(80,70,100,30);

        max.setBounds(20,130,100,30);
        min.setBounds(130,130,100,30);
        avg.setBounds(240,130,100,30);
        clr.setBounds(350,130,100,30);

        frame.add(l1);
        frame.add(n1);
        frame.add(l2);
        frame.add(n2);
        frame.add(l3);
        frame.add(n3);
        frame.add(l4);
        frame.add(result);

        frame.add(max);
        frame.add(min);
        frame.add(avg);
        frame.add(clr);

        // Maximum
        max.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(n1.getText());
                int b = Integer.parseInt(n2.getText());
                int c = Integer.parseInt(n3.getText());

                int maximum = Math.max(a, Math.max(b, c));

                result.setText(String.valueOf(maximum));
            }
        });

        // Minimum
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(n1.getText());
                int b = Integer.parseInt(n2.getText());
                int c = Integer.parseInt(n3.getText());

                int minimum = Math.min(a, Math.min(b, c));

                result.setText(String.valueOf(minimum));
            }
        });

        // Average
        avg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(n1.getText());
                int b = Integer.parseInt(n2.getText());
                int c = Integer.parseInt(n3.getText());

                double average = (a + b + c) / 3.0;

                result.setText(String.valueOf(average));
            }
        });

        // Clear
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                n1.setText("");
                n2.setText("");
                n3.setText("");
                result.setText("");
            }
        });

        frame.setVisible(true);
    }
}
