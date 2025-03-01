package com.refrence;

public class Buku {
    String Nama_penulis ;
    String Judul_buku;
    Buku(String Nama,String buku){
        this.Nama_penulis = Nama;
        this.Judul_buku = buku;
    }
    void show_book_info (){
        System.out.println(" \n Judul Buku \t :" + this.Judul_buku);
        System.out.println("Nama Penulis \t :" + this.Nama_penulis);
    }
}
