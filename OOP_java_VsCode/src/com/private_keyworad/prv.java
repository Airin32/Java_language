package com.private_keyworad;
class Player{
    int health,attack,MP;
    String Nama,Type;
    Player (String Nama,String Type,int health,int attack, int MP){
        this.Nama = Nama;
        this.Type = Type ;
        this.health = health;
        this.attack = attack;
        this.MP = MP;
    }
    void info (){
        System.out.println("Name \t : " + this.Nama);
        System.out.println("Type \t : " + this.Type);
        System.out.println("Health \t : " + this.health);
        System.out.println("Attack \t : " + this.attack);
        System.out.println("MP \t : " + this.MP);
    }
    private void health_stat (){
        this.health += 100;
    }
    private void Attack_pow_stat (){
        this.attack += 20;
    }
    private void MP_stact (){
        this.MP += 15;
    }
    public void Evolution (){
        health_stat();
        Attack_pow_stat();
        MP_stact();
    }
}
public class prv {
    private int health,Attack,MP;
    String Nama,Type;
    private Player player;
    prv (String Nama, String Type, int health,int Attack,int MP){
        this.Nama = Nama;
        this.Type = Type;
        this.health = health;
        this.Attack = Attack;
        this.MP = MP;
        Player player = new Player(Nama,Type,health,Attack,MP);
        this.player = player;
    }
    void info (){
        player.info();
    }
    void Evolution(){
        player.Evolution();
    }
}
