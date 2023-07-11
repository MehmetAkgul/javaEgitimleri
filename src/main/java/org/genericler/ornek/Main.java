package org.genericler.ornek;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("YGS LYS Brinici Bulma Programi");
        Scanner scanner = new Scanner(System.in);
        String islemler = "Islemler...\n" +
                "1. Esit Agirlik Ogrencileri Birincisi\n" +
                "2. Sayisal Ogrencileri Birincisi\n" +
                "Cikis : q";

        while (true) {
            System.out.println(islemler);
            String islem = scanner.nextLine();
            //Birinci Ogrenci
            System.out.println("Birinci Ogrenci Ismi");
            String isim1 = scanner.nextLine();
            System.out.println("Netler (Turkce Matematik Edebiyet Fizik) : ");
            int trk1 = scanner.nextInt();
            int mat1 = scanner.nextInt();
            int ed1 = scanner.nextInt();
            int fiz1 = scanner.nextInt();
            scanner.nextLine();
            //Ikici Ogrenci
            System.out.println("Ikici Ogrenci Ismi");
            String isim2 = scanner.nextLine();
            System.out.println("Netler (Turkce Matematik Edebiyet Fizik) : ");
            int trk2 = scanner.nextInt();
            int mat2 = scanner.nextInt();
            int ed2 = scanner.nextInt();
            int fiz2 = scanner.nextInt();
            scanner.nextLine();
            //Ucuncu Ogrenci
            System.out.println("Ucuncu Ogrenci Ismi");
            String isim3 = scanner.nextLine();
            System.out.println("Netler (Turkce Matematik Edebiyet Fizik) : ");
            int trk3 = scanner.nextInt();
            int mat3 = scanner.nextInt();
            int ed3 = scanner.nextInt();
            int fiz3 = scanner.nextInt();


            if (islem.equals("q")) {


            } else if (islem.equals("1")) {
                EsitAgirlik esitAgirlik1 = new EsitAgirlik(trk1, mat1, ed1, fiz1, isim1);
                EsitAgirlik esitAgirlik2 = new EsitAgirlik(trk2, mat2, ed2, fiz2, isim2);
                EsitAgirlik esitAgirlik3 = new EsitAgirlik(trk3, mat3, ed3, fiz3, isim3);
                EsitAgirlik esitAgirlikBirinci = birinciHesapla(esitAgirlik1, esitAgirlik2, esitAgirlik3);
                System.out.println("Esit Agirlik Birincisi Ogrencinin Adi :" + esitAgirlikBirinci.getIsim());
                System.out.println("Esit Agirlik Birincisi Ogrencinin Puani :" + esitAgirlikBirinci.puanHesapla());
            } else if (islem.equals("2")) {
                Sayisal sayisal1 = new Sayisal(trk1, mat1, ed1, fiz1, isim1);
                Sayisal sayisal2 = new Sayisal(trk2, mat2, ed2, fiz2, isim2);
                Sayisal sayisal3 = new Sayisal(trk3, mat3, ed3, fiz3, isim3);
                Sayisal sayisal_birincisi = birinciHesapla(sayisal1, sayisal2, sayisal3);
                System.out.println("Sayisal Birincisi Ogrencinin Adi :" + sayisal_birincisi.getIsim());
                System.out.println("Sayisal Birincisi Ogrencinin Puani :" + sayisal_birincisi.puanHesapla());

            } else {
                System.out.println("Gecersiz Islem");
            }
        }

    }

    public static <E extends Aday> E birinciHesapla(E e1, E e2, E e3) {
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla())
            return e1;
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla())
            return e2;
        else if (e3.puanHesapla() > e1.puanHesapla() && e3.puanHesapla() > e2.puanHesapla())
            return e3;
        else
            return e3;
    }

}
