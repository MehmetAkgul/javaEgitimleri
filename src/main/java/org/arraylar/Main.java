package org.arraylar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] a;
        //double[] b;
        System.out.println("------------ Arraylari olusturmak --------------");
        int[] c = new int[10]; // 10 deger alan bir array olusturduk
        // ----------------- Arraylara Deger Atamak ----------------------
        c[5] = 45;
        c[9] = 50;
        int[] d = {30, 40, 50, 60, 70}; // 5 elemanli aray baslattik


        // ----------------- Arraylari yazdirmak  ----------------------
        System.out.println(d[2]);
        System.out.println("------------ Arraylari yazdirmak --------------");

        //ArrayIndexOutOfBoundsExceptionSystem.out.println(d[6]);//ArrayIndexOutOfBoundsException

        int[] e = new int[5];
        System.out.println("------------ Arraylari for ile atayip, yazdirmak --------------");
        for (int i = 0; i < 5; i++) {
            e[i] = i * 4 + 2;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(e[i]);
        }
        System.out.println("------------ Arraylari Scanner ile atayip, yazdirmak --------------");
        int[] f = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            f[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(f[i]);
        }

        System.out.println("------------ Arraylarin uzunlugunu ogrenmek  --------------");

        int[] g = {10, 20, 30, 40, 50, 60};
        System.out.println("Arayimizin Uzunlugu : " + g.length);

        System.out.println("------------ Arraylari method ile bastirmak  --------------");
        arrayBastir(g);
        ortalamaBul(g);

    }

    public static void arrayBastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " : " + array[i]);
            ;
        }
    }

    public static void ortalamaBul(int[] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        System.out.println("Ortalama = " + ((double)toplam / array.length));
    }
    public static void ortalamaBul2(int[] array) {
        int toplam = 0;
        for (int j : array) {
            toplam += j;
        }
        System.out.println("Ortalama = " + ((double)toplam / array.length));
    }
}
