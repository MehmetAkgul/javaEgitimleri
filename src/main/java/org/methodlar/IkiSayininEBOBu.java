package org.methodlar;

import java.util.Scanner;

public class IkiSayininEBOBu {

    public static int ebobBulma(int sayi1, int sayi2) {
        int ebob = 1;
        for (int i = 2; i <= sayi1 && i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) ebob = i;
        }
        return ebob;


    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayi :");
        int sayi1 = scanner.nextInt();
        System.out.print("Ikinci sayi :");
        int sayi2 = scanner.nextInt();


       int ebob= ebobBulma(sayi1, sayi2);

        System.out.println(sayi1+" ve " +sayi2 + "'nin ebob'u : "+ ebob );
    }
}
