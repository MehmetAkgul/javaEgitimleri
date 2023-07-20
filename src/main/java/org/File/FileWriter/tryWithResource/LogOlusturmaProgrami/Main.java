package org.File.FileWriter.tryWithResource.LogOlusturmaProgrami;

import java.io.FileWriter;
import java.io.IOException;
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


        int i = 1;
        try (FileWriter log = new FileWriter("log.txt", true)) {


            log.write("Idman Programi \n");
            log.write("Burpee sayisi:" + idman.getBurpee_sayisi() + " \n");
            log.write("Pushup sayisi:" + idman.getPushup_sayisi() + " \n");
            log.write("Situp sayisi:" + idman.getSitup_sayisi() + " \n");
            log.write("Squat sayisi:" + idman.getSquat_sayisi() + " \n");


            while (idman.idmanBittiMi() == false) {
                System.out.print("Haraket Turu (Burpee,Pushup,Situp.Squat) Seciniz");
                String haraketTuru = scanner.nextLine();
                System.out.print("Bu hareket turunden kac adet yapmak istersiniz?");
                int sayisi = scanner.nextInt();
                scanner.nextLine();
                idman.haraketYap(haraketTuru, sayisi);

                log.write(i + ". islem --->" + haraketTuru + " Sayi : " + sayisi + " \n");

            }
            System.out.println("Tum hareketleri bitirdiniz ve Idmaninizi Basariyla Tamamladiniz ....");


        } catch (IOException e) {
            System.out.println("Log kaydi icin dosya olusturulamadi ");
        }
    }
}
