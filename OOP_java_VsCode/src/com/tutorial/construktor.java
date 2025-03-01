package com.tutorial;
class Mahasiswa {
    String Nama;
    int Umur;
    String NPM;
    Mahasiswa(String Nama,int Umur,String NPM){
        this.Nama = Nama;
        this.Umur = Umur;
        this.NPM = NPM;
        System.out.println(Nama);
        System.out.println(Umur);
        System.out.println(NPM);
    }
}
public class construktor {
    public static void main(String[] args) {
        System.out.println("Testing");
        Mahasiswa mhs = new Mahasiswa("Airin",19,"5520123011");
    }
}
