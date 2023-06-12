package org.methodlar;

public class ParametleriMethodlar {


    public static void selamlama(String isim) {
        System.out.println("Selamlar "+ isim);

    }


    public static void toplama(int a, int b ,int c ) {
        System.out.println("toplami "+ (a+b+c));
    }


    public static void main(String[] args) {
        toplama(6,7,8);
        selamlama("Murat");
    }
}
