package org.ornekler.OOPileATMProjesi;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamiza Hosgeldiniz...");
        System.out.println("************************");
        System.out.println("Kullanici Girisi ");
        System.out.println("************************");

        int giris_hakki = 3;

        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giris Basarili...");
                break;
            } else {
                System.out.println("Giris Basarisiz...");
                giris_hakki -= 1;
                System.out.println("Kalan Giris Hakkiniz : " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giris Hakkiniz bitti");
                return;
            }
        }
        System.out.println("******************************************************");
        String islemler = "1. Bakiye Goruntule\n" +
                "2. Para Cek\n" +
                "3. Para Yatir\n" +
                "Cikis icin q'ya basin\n";
        System.out.println(islemler);
        System.out.println("******************************************************");
        while (true) {
            System.out.println("Islem Seciniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Islem sonlandirildi");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Yatirmak istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Cekmek istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            } else {
                System.out.println("Gecersiz Islem Secildi");
            }
        }

    }
}
