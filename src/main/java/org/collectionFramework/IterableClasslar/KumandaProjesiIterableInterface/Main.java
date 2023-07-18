package org.collectionFramework.IterableClasslar.KumandaProjesiIterableInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Kumanda Programina Hosgeldiniz ");

        Scanner scanner = new Scanner(System.in);

        String islemler = "\n\n\n\nIslemler ...\n" +
                "1. Kanallari Goster\n" +
                "2. Kanal Ekle\n" +
                "3. Kanal Sil\n" +
                "4. Kanal Sayisi Ogren\n" +
                "Cikis icin q'a basin\n";

        Kumanda kumanda = new Kumanda();

        while (true) {

            System.out.println(islemler);
            System.out.print("Islemi giriniz...:");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Cikis yapiliyor");
                break;
            }
            if (islem.equals("1")) {
                kanallariGoster(kumanda);
                System.out.println("Anasayfaya Donmek icin bir entara basin");
                scanner.nextLine();
            }

            if (islem.equals("2")) {
                System.out.print("Yeni kanal adi giriniz");
                kumanda.kanalEkle(scanner.nextLine());
            }
            if (islem.equals("3")) {
                System.out.print("Silmek istediginiz kanali yazin ");
                kumanda.kanalSil(scanner.nextLine());
            }
            if (islem.equals("4")) {
                System.out.println("Toplam kanal sayisi :" + kumanda.kanalSayisi());
            }
        }
    }

    public static void kanallariGoster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) System.out.println("Kanal listnize henuz kanal eklemediniz...");
        for (String kanal : kumanda) {
            System.out.println(kanal);


        }
    }
}
