package org.DonguYapilari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //---------- FOR DONGUSU --------------------
        int i;

        // 1. VERSIYON
        for (i = 0; i < 5; i++) {
            System.out.println("i=" + i);
        }
        // 2. VERSIYON
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        // 3. VERSIYON
        int k = 0;
        for (; k < 5; k++) {
            System.out.println(k);
        }

        // 4. VERSIYON
        int m = 0;
        int n = 10;
        for (; m < 10 && n > 0; m++, n--) {
            System.out.println("m =" + m);
            System.out.println("n =" + n);
        }


        // 5. VERSIYON
        for (int x = 2; x < 100; x *= 2) {
            System.out.println("x =" + x);
        }

        // FAKTORIYEL ISLEMI
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        long faktoriyel = 1;
        //int sayi = scanner.nextInt();
        for (int t = 1; t < 100; t++) {
            for (int z = 1; z <= t; z++) {
                faktoriyel *= z;
            }
            System.out.println(t+" Sayininin Faktoriyeli = "+faktoriyel );
            faktoriyel=1;
        }


    }
}
