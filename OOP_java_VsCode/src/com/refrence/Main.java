package com.refrence;

public class Main {
    public static void main(String[] args) {
        Buku book1 = new Buku("This how to make Ai","Airin");
        book1.show_book_info();
        String addreasBook1 = Integer.toHexString(System.identityHashCode(book1));
  
        Buku buku2 = book1;
        String addreasBook2 = Integer.toHexString(System.identityHashCode(buku2));
        
        book1.Judul_buku="Cara Membangun AI";
        book1.Nama_penulis ="Alpin";
        book1.show_book_info();
        System.out.println("Alamat Memori poda Objek book1"+addreasBook1);
        buku2.show_book_info();
        System.out.println("alamat pada objek book1 yang di ambil oleh objek buku2 "+addreasBook2);
        fungsi(book1);
        // jadi apapun yang kita ubah selama alamat memori refrence tetap pada alamat 
        //itu akan berdampak pada objek lainnya dengan alamat yang sama
        //cara mengatasinya adalah dengan membuat objek baru saja ini dia 
        System.out.println("\n\nObjek baru dengan parameter baru");
        Buku book2 = new Buku("How to make Ai","Airin");
        book2.show_book_info();
        String addreasBook3 = Integer.toHexString(System.identityHashCode(book2));
        System.out.println("alamat pada objek yang baru dibuat  " + addreasBook3);
    }
    public static void fungsi(Buku databuku){
        String addreasBook2 = Integer.toHexString(System.identityHashCode(databuku));
        databuku.show_book_info();
        System.out.println("Bahkan jika kita membangun fungsi untuk menampung  \n objeknya akan memiliki alamat memori yang sama yaitu " + addreasBook2);
    }
}
