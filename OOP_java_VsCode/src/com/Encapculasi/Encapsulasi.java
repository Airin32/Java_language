package com.Encapculasi;

class Luas_Lingkaran {
    private final double PI = 3.14;
    private double jari2; 
    Luas_Lingkaran (double jari2) {
        this.jari2 = jari2;
    }
    //getter 
    public double get_PI (){
        return this.PI;
    }
    //setter 
    public void set_jari (double jari){
        this.jari2 = jari;
    }
    double Luas (){
        return (Math.pow(this.jari2, 2)) * this.PI;
    }
}
class Persegi_Panjang {
    private double panjang, lebar;
    Persegi_Panjang (double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //getter 
    public void info_input (){
        System.out.println("Panjang : " + this.panjang);
        System.out.println("Lebar : "+  this.lebar);
    }
    //setter 
    public void set_panjang_lebar (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitung_luas (){
        return this.panjang * this.lebar;
    }
}
public class Encapsulasi {
    private Luas_Lingkaran luas;
    public Persegi_Panjang persegi;
    Encapsulasi (){
        this.luas = new Luas_Lingkaran(0);
        this.persegi = new Persegi_Panjang(0, 0);
    }
    public void show_result (){
        System.out.println("Luas Lingkaran : " + this.luas.Luas());
    }
    public void Jari_jari (double jari){
        this.luas.set_jari(jari);
    }
    void show_luas_persegi_panjang (){
        System.out.println("Luas Persegi Panjang : " + this.persegi.hitung_luas());
    }
}
