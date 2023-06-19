package org.donguYapilari;

public class WhileDongusu {

    public static void main(String[] args) {
        int i = 10;
        while (i <=100){
            System.out.println("i=" + i);
            i+=3;
        }
        //Faktoriyel olusturma


        int sayi = 5;
        int faktoriyel = 1;
        while (sayi >0){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println("Faktoriyel=" + faktoriyel);
    }
}
