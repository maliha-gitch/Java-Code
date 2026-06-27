package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLocation(100,200);
        jFrame.setTitle("MY first GUI");

        jFrame.setLayout(null);

        JLabel jname = new JLabel("Name:");
        JTextArea jnametext = new JTextArea();
        JButton savebutton = new JButton("Save");

        jFrame.setSize(350,200);
        jname.setBounds(20,20,100,30);
        jnametext.setBounds(90,20,120,30);
        savebutton.setBounds(105,70,80,30);
        jFrame.setSize(350,200);

        savebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jnametext.getText();
                System.out.println(name);

            }
        });
        jFrame.add(jname);
        jFrame.add(jnametext);
        jFrame.add(savebutton);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
