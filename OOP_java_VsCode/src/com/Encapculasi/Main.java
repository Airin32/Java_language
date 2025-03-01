package com.Encapculasi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Encapsulasi enc = new Encapsulasi();
        enc.Jari_jari(10);
        enc.show_result();
        enc.persegi.set_panjang_lebar(10,5);
        enc.show_luas_persegi_panjang();

    }
}