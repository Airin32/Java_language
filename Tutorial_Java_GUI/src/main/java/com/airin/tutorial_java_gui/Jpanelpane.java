package com.airin.tutorial_java_gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class Jpanelpane {
    public static void main(String[] args) {
        // Membuat JLayeredPane
        JLayeredPane Lpane = new JLayeredPane();
        Lpane.setBounds(0, 0, 500, 500); // Mengatur ukuran LayeredPane

        // Membuat label pertama (label merah)
        JLabel label1 = new JLabel();
        label1.setBackground(Color.RED);
        label1.setOpaque(true);
        label1.setBounds(50, 50, 100, 100); // Mengatur posisi dan ukuran label

        // Membuat label kedua (label hijau)
        JLabel label2 = new JLabel();
        label2.setBackground(Color.GREEN);
        label2.setOpaque(true);
        label2.setBounds(100, 100, 100, 100); // Mengatur posisi dan ukuran label

        // Menambahkan label ke LayeredPane dengan layer yang berbeda
        Lpane.add(label1, Integer.valueOf(1)); // Layer 1
        Lpane.add(label2, Integer.valueOf(2)); // Layer 2 (di atas Layer 1)

        // Membuat JFrame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Menggunakan layout null
        frame.add(Lpane); // Menambahkan LayeredPane ke JFrame
        frame.setVisible(true);
    }
}
