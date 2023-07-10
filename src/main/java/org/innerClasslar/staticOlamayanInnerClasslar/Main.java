package org.innerClasslar.staticOlamayanInnerClasslar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Matematik.Faktoriyel faktoriyel = new Matematik().new Faktoriyel();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi giriniz ");

        int sayi = scanner.nextInt();
        if (asal.asalMi(sayi))
            System.out.println("Bu sayi asaldir");

        else
            System.out.println("Bu sayi asal degildir");
        faktoriyel.faktoriyel();
        // alan.daireAlan(sayi);
        Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();
        daireAlan.daireAlan(sayi);
    }
}
