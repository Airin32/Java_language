/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.airin.calculus;

/**
 *
 * @author ASUS
 */
public class Calculus {

    public static void main(String[] args) {
        Turunan BackPropogation = new Turunan(10,0.001);
        System.out.println("Backpropogation general : " +  BackPropogation.Hitung_Turunan_umum());
        System.out.println("Kecepatan sesaat : " +  BackPropogation.kecepatan_sesaat(16,3));
    }
}
