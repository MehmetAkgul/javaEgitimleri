package org.File.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {

            int i = 1;
            while (scanner.hasNextLine()) {
                String ogreci_bilgisi = scanner.nextLine();
                String[] array = ogreci_bilgisi.split(",");
                if (array[1].equals("Bilgisayar Muhendisligi")) {
                    System.out.println(i + ". satirdaki ogrenci Bilgisi : " + ogreci_bilgisi);
                }
                i++;
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        }
    }
}
