package org.arrayList.sarkicilarProjesi;

import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Sarkici uygulamasina hosgeldiniz ");

        boolean cikis = false;
        int islem;


        while (!cikis) {
            islemleriBastir();
            System.out.println("Bir islem Seciniz... ");
            islem = scanner.nextInt();
            scanner.nextLine();
            switch (islem) {

                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sarkiciSil();
                    break;
                case 5:
                    sarkiciAra();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor....");
                    break;
            }
        }
    }

    private static void sarkiciAra() {
        System.out.println("Aramak istediginiz sarkicinin ismini giriniz...");
        String isim = scanner.nextLine();
        sarkicilar.sarkicilariAra(isim);
    }

    private static void sarkiciSil() {
        System.out.println("Silmek istediginiz sarkicinin pozisyonunu giriniz...");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        sarkicilar.sarkicilariSil(pozisyon - 1);
    }

    private static void sarkiciGuncelle() {
        System.out.println("Guncellemek istediginiz sarkicinin pozisyonunu giriniz...");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Guncellemek istediginiz sarkicinin ismini giriniz...");

        String isim = scanner.nextLine();
        sarkicilar.sarkicilariGuncelle(isim, pozisyon - 1);
    }

    private static void sarkiciEkle() {
        System.out.println("Eklemek istediginiz sarkicinin ismini giriniz...");
        String isim = scanner.nextLine();
        sarkicilar.sarkicilariEkle(isim);
    }

    private static void goruntule() {
        sarkicilar.sarkicilariBastir();
    }

    private static void islemleriBastir() {
        System.out.println("\t 1 - Sarkicilari Listele");
        System.out.println("\t 2 - Sarkicilari Ekle");
        System.out.println("\t 3 - Sarkicilari Guncelle");
        System.out.println("\t 4 - Sarkicilari Sil");
        System.out.println("\t 5 - Sarkicilari Ara");
        System.out.println("\t 6 - Uygulamadan Cik");
    }
}
