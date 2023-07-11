package org.innerClasslar.basitMatematikveFizikProblemleri;

import java.util.Scanner;

public class Main {
    /**
     * Basit Matematik ve Fizik Problemleri
     * Daire Alan - Matematik
     * Ucgen Cevresi - Matematik
     * 3 Boyutlu Vektorlerin Ic Carpimi - Fizik
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik ve Fizik Problemleri Programina Hosgeldiniz...");


        String islemler = "Islemler...\n" +
                "1. Daire alani Hesaplama\n" +
                "2. Ucgen Alani Hesaplama\n" +
                "3. 2 Vektorun Ic Carpimini Hesaplama\n" +
                "Cikis : q";

        while (true) {
            System.out.println(islemler);
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor....");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Dairenin Yaricapi :");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlanHesapla(yaricap);
            } else if (islem.equals("2")) {
                System.out.print("Ucgenin birinci kenarini giriniz :");
                int kenar1 = scanner.nextInt();
                System.out.print("Ucgenin Ikinci kenarini giriniz :");
                int kenar2 = scanner.nextInt();
                System.out.print("Ucgenin Ucuncu kenarini giriniz :");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresiHesapla(kenar1, kenar2, kenar3);
            } else if (islem.equals("3")) {
                System.out.print("Birinci Vektorun Ismini Giriniz :");
                Vec vec1 = new Vec(scanner.nextLine());

                System.out.print("Ikinci Vektorun Ismini Giriniz :");
                Vec vec2 = new Vec(scanner.nextLine());


                Problem.Fizik.icCarpim(vec1, vec2);

            }
        }
    }
}
