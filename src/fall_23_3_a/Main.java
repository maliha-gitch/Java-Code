package fall_23_3_a;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    static int count = 1;     // Static variable

    public static void main(String[] args) {

        JFrame frame = new JFrame("Add Button Example");

        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());   // Buttons automatically arrange
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton add = new JButton("ADD");

        frame.add(add);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JButton b = new JButton("b" + count);

                frame.add(b);

                count++;

                frame.revalidate();   // Recalculate layout
                frame.repaint();      // Refresh GUI
            }
        });

        frame.setVisible(true);
    }
}