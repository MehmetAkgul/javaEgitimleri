package org.arraylar;

import java.util.Arrays;
import java.util.Scanner;

public class SiralamKarsilastirma {
    public static int[] arrayDoldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }

    public static void arrayBastir(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ":" + array[i]);
        }
    }

    public static void arraySiralamk(int[] array) {
        // Array sinifi icinde methodlardan yararlanacagiz
        Arrays.sort(array);
        arrayBastir(array);
    }

    public static void main(String[] args) {
        // int[] a = arrayDoldur(5);
        //arraySiralamk(a);

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};


        // Array karsilatirma
        if (Arrays.equals(a1, a2)) {
            System.out.println("Esitler");
        } else {
            System.out.println("Esit degiller ");
        }

    }
}
