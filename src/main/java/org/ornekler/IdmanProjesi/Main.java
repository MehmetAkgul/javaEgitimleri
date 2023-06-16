package org.ornekler.IdmanProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idman Programina Hosgeldiniz...");

        String idmanlar = "************************\n" +
                "Gecerli Haraketler....\n" +
                "Burpee\n" +
                "Pushup(Sinav)\n" +
                "Situp(Mekik)\n" +
                "Squat" +
                "************************\n";
        System.out.println(idmanlar);
        System.out.println("Bir idman olusturun...");

        System.out.print("Burpee Sayisi : ");
        int burpee = scanner.nextInt();

        System.out.print("Pushup Sayisi : ");
        int pushup = scanner.nextInt();

        System.out.print("Situp Sayisi : ");
        int situp = scanner.nextInt();

        System.out.print("Squat Sayisi : ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("Idmaniniz basladi....");

        while (idman.idmanBittiMi() == false) {
            System.out.print("Haraket Turu (Burpee,Pushup,Situp.Squat) Seciniz");
            String haraketTuru = scanner.nextLine();
            System.out.print("Bu hareket turunden kac adet yapmak istersiniz?");
            int sayisi = scanner.nextInt();
            scanner.nextLine();
            idman.haraketYap(haraketTuru, sayisi);
        }
        System.out.println("Tum hareketleri bitirdiniz ve Idmaninizi Basariyla Tamamladiniz ....");
    }
}
