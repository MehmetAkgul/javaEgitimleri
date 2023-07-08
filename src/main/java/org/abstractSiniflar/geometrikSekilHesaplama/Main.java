package org.abstractSiniflar.geometrikSekilHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = " Islemler ...\n" +
                "1. Kare Alan Hesapla\n" +
                "2. Ucgen Alan Hesapla\n" +
                "3. Daire Alan Hesapla\n" +
                "Cikis : q";

        while (true) {
            System.out.println(islemler);
            String islem = scanner.nextLine();


            Sekil sekil = null;
            String isim = null;
            if (islem.equals("1")) {
                System.out.println("Karenin ismini giriniz : ");
                isim = scanner.nextLine();
                System.out.println("Karenin bir kenarinin uzunlugunu giriniz : ");
                int kare_kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare(isim, kare_kenar);
                sekil.alanHesapla();

            }
            if (islem.equals("2")) {
                System.out.println("Ucgenin ismini giriniz : ");
                isim = scanner.nextLine();
                System.out.println("Ucgenin a kenarinin uzunlugunu giriniz : ");
                int a = scanner.nextInt();
                System.out.println("Ucgenin b kenarinin uzunlugunu giriniz : ");
                int b = scanner.nextInt();
                System.out.println("Ucgenin c kenarinin uzunlugunu giriniz : ");
                int c = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen(isim, a, b, c);
                sekil.alanHesapla();
            }
            if (islem.equals("3")) {
                System.out.println("Dairenin ismini giriniz : ");
                isim = scanner.nextLine();
                System.out.println("Dairenin Yaricap uzunlugunu giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire(isim, yaricap);
                sekil.alanHesapla();
            }

            if (islem.equals("q")) {
                break;
            }
        }
    }
}
