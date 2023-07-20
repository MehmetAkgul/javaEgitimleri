package org.File.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // FileReader herseferide 1 karakter okur
        // Buffered Reader ise \n gorene kadar dosyayi okuyor onu bir buffer a koyuyor ve bize gosteriyor
        // total de daha dosya erisimi oluyor
        // File Reader harf harf
        // Buffered Reader satir satir okuyor

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))) {

            int i = 1;
            while (scanner.hasNextLine()) {
                System.out.println(i + ".satir : " + scanner.nextLine());
                i++;
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        }


    }
}
