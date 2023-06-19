package org.donguYapilari;

public class DoWhile {

    public static void main(String[] args) {

        int i = 0;


        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

// BIR SAYININ RAKAMLARI TOPLAMI NASIL BULUNUR
        int sayi = 15943;
        int toplam = 0;

        do {
            toplam +=  sayi % 10;
            sayi /= 10;
        } while (sayi>0);

        System.out.println(toplam);
    }
}
