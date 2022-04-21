package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(FtoC(67.8));
        System.out.println(CtoF(24));
    }

    public static double FtoC(double f) {
        return (f - 32) / 1.8 ;
    }


    public static double CtoF(double c){
        return (c * 9/5) + 32 ;
    }
}
