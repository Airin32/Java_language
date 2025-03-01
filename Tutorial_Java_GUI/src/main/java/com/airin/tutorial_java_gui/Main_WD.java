package com.airin.tutorial_java_gui;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Main_WD implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton();
    Main_WD(){
        button.setBounds(200, 200, 200, 70);
        button.setName("Second Windows");
        button.setText("Second Windows");
        button.addActionListener(this);
        frame.add(button);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            frame.dispose();
            new second_wd();
        }
    }
}
