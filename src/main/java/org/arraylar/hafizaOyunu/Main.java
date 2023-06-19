package org.arraylar.hafizaOyunu;

import java.util.Scanner;

public class Main {
    public static Kart[][] kartlar = new Kart[4][4];

    public static void main(String[] args) {


        kartlar[0][0] = new Kart('A');
        kartlar[0][1] = new Kart('B');
        kartlar[0][2] = new Kart('C');
        kartlar[0][3] = new Kart('D');

        kartlar[1][0] = new Kart('A');
        kartlar[1][1] = new Kart('B');
        kartlar[1][2] = new Kart('C');
        kartlar[1][3] = new Kart('D');

        kartlar[2][0] = new Kart('I');
        kartlar[2][1] = new Kart('J');
        kartlar[2][2] = new Kart('K');
        kartlar[2][3] = new Kart('L');

        kartlar[3][0] = new Kart('I');
        kartlar[3][1] = new Kart('J');
        kartlar[3][2] = new Kart('K');
        kartlar[3][3] = new Kart('L');


        while (oyunBittimi()) {
            oyunTahtasi();
            tahminEt();
        }
    }

    public static void tahminEt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Tahmin (i ve j degerlerini bir bosluklu girin...) : ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();

        System.out.print("Ikinci Tahmin (i ve j degerlerini bir bosluklu girin...) : ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
            kartlar[i2][j2].setTahmin(true);
            System.out.println("Dogru Tahmin. Tebrikler....");
        } else {
            kartlar[i1][j1].setTahmin(false);
            kartlar[i2][j2].setTahmin(false);
            System.out.println("Yanlis Tahmin ");

        }
    }

    public static void oyunTahtasi() {
        for (int i = 0; i < 4; i++) {
            System.out.println("____________________");
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin()) {
                    System.out.print(" |" + kartlar[i][j].getDeger() + "| ");
                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");

    }


    public static boolean oyunBittimi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin() == false) {

                    return true;

                }
            }
        }
        oyunTahtasi();
        System.out.println("Tebrikler Oyunu Basariyla Tamamladiniz...");
        return false;
    }

}
