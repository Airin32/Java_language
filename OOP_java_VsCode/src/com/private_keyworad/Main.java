package com.private_keyworad;
public class Main {
    public static void main(String[] args) {
        prv player = new prv("Airin","Assasin",200,0,90);
        player.info();
        player.Evolution();
        player.info();
        for (int i = 0; i < 10; i++){
            player.Evolution();
        }
        player.info();
    }
}
