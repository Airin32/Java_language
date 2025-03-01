package com.tutorial;

import java.util.*;

class Nama{
    String Nama,NPM;
    int umur;
    Nama (String nama,String Npm,int Umur){
        Nama = nama;
        NPM = Npm;
        umur = Umur;
    }
    void show (){
        System.out.println("Nama : "+Nama);
        System.out.println("NPM : "+NPM);
        System.out.println("Umur : " + umur);
    }
    void ubah_nama (String Nama){
        this.Nama = Nama;
    }
    String get_back_Name (){
        return this.Nama;
    }
    String perubahnama (){
        String Nama;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");
        Nama = input.next();
        return Nama;
    }
}
public class Method {
    public static void main(String[] args) {
        Nama name = new Nama("Airin","5520123011",19);.
        name.show();
        name.ubah_nama("Alpin");
        name.show();
        String data = name.get_back_Name();
        System.out.println(data);
        data = name.perubahnama();
        name.ubah_nama(data);
        name.show();
    }
}
