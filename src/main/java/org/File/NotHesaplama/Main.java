package org.File.NotHesaplama;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String harfNotuHesapla(String isim, int vize1, int vize2, int final_not) {
        String cikti = "";
        double toplam_not = (vize1 * 3 / 10) + (vize2 * 3 / 10) + (final_not * 4 / 10);
        if (toplam_not >= 90) cikti = isim + " bu dersten AA aldi";
        if (toplam_not >= 85) cikti = isim + " bu dersten BA aldi";
        if (toplam_not >= 80) cikti = isim + " bu dersten BB aldi";
        if (toplam_not >= 75) cikti = isim + " bu dersten CB aldi";
        if (toplam_not >= 70) cikti = isim + " bu dersten CC aldi";
        if (toplam_not >= 65) cikti = isim + " bu dersten DC aldi";
        if (toplam_not >= 60) cikti = isim + " bu dersten DD aldi";
        if (toplam_not >= 55) cikti = isim + " bu dersten FD aldi";
        if (toplam_not <= 54) cikti = isim + " bu dersten FF aldi";
        return cikti;

    }

    public static void main(String[] args) {


        try (
                Scanner scanner = new Scanner(new FileReader("notlar.txt"));
                FileWriter writer = new FileWriter("harfnotlari.txt")
        ) {

            while (scanner.hasNextLine()) {
                String ogrenci_bilgileri = scanner.nextLine();
                String[] ogrenci_array = ogrenci_bilgileri.split(",");
                int vize1 = Integer.parseInt(ogrenci_array[1]);
                int vize2 = Integer.parseInt(ogrenci_array[2]);
                int final_notu = Integer.parseInt(ogrenci_array[3]);
                String isim = ogrenci_array[0];
                String harf_notu= harfNotuHesapla(isim,vize1,vize2,final_notu);
                writer.write(harf_notu+"\n");
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya yazilirken hata oldu");
        }
    }
}
