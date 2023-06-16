package org.ornekler.calisanlarProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calisanlar programina hosgeldiniz...");
        String islemler = "Islemler ...\n" +
                "1. Yazilimci Islemleri \n" +
                "2. Yonetici Islemleri \n" +
                "Cikis icin q'ya basin";

        System.out.println("*****************************************************");
        System.out.println(islemler);
        System.out.println("*****************************************************");


        while (true) {
            System.out.println("Islem seciniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Mehmet", "Akgul", 2, "Php ,Java");
                String yazilimci_islemleri = "Yazilimci Islemleri ...\n" +
                        "1. Bilgileri Goster \n" +
                        "2. Format At \n" +
                        "Ust Menuye gecmek icin q'ya basin";
                System.out.println("*****************************************************");
                System.out.println(yazilimci_islemleri);
                System.out.println("*****************************************************");

                while (true) {
                    System.out.println("Islem Seciniz....");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Ust Menuye Geciliyor");
                        break;
                    } else if (y_islem.equals("1")) {
                        yazilimci.bilgileriGoster();
                    } else if (y_islem.equals("2")) {
                        System.out.println("Isletim Sistemi : ");
                        String islemtim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(islemtim_sistemi);
                    } else {
                        System.out.println("Yanlis secim yaptiniz...!");
                        System.out.println("*****************************************************");
                        System.out.println(yazilimci_islemleri);
                        System.out.println("*****************************************************");
                    }
                }

            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Mustafa", "Akgul ", 123, 10);
                String yonetici_islemleri = "Yazilimci Islemleri ...\n" +
                        "1. Bilgileri Goster \n" +
                        "2. Zam Yap \n" +
                        "Ust Menuye gecmek icin q'ya basin";
                System.out.println("*****************************************************");
                System.out.println(yonetici_islemleri);
                System.out.println("*****************************************************");
                while (true) {
                    System.out.println("Islem Seciniz....");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Ust Menuye Geciliyor");
                        break;
                    } else if (y_islem.equals("1")) {
                        yonetici.bilgileriGoster();
                    } else if (y_islem.equals("2")) {
                        System.out.println("Zam miktari : ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(miktar);
                    } else {
                        System.out.println("Yanlis secim yaptiniz...!");
                        System.out.println("*****************************************************");
                        System.out.println(yonetici_islemleri);
                        System.out.println("*****************************************************");
                    }
                }
            } else {
                System.out.println("Yanlis secim yaptiniz...!");
                System.out.println("*****************************************************");
                System.out.println(islemler);
                System.out.println("*****************************************************");
            }
        }
    }
}
