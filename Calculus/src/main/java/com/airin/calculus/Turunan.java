package com.airin.calculus;

public class Turunan {
    double x,h;
    Turunan (double x ){
        this.x = x;
        this.h = 0.001;        
    }
    Turunan (double x,double h){
        this.x = x;
        this.h = h;
    }
    private void f(){
        this.x = (Math.pow(x, 2));
    }
    public double Hitung_Turunan_umum (){
        this.f();
        System.out.println(this.x);
        return ((this.x + this.h) - this.x) / this.h;
    }
    public double kecepatan_sesaat (double range,double time){
        double pos_awal_dengan_delta_t,pos_awal_t;
        pos_awal_dengan_delta_t = range*(time + this.h);
        pos_awal_t = range * time;
        double result = pos_awal_dengan_delta_t - pos_awal_t;
        return result / this.h;
    }
}
