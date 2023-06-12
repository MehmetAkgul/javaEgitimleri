package org.methodlar;

public class OverloadingKonusu {



    public static void toplam (int a ,int b){
        System.out.println("Toplam :" +(a+b));
    }


    public static void toplam (int a ,int b, int c){
        System.out.println("Toplam :" +(a+b+c));
    }


    public static void main(String[] args) {

        toplam(4,5,6);
        toplam(4,5);
    }
}
