package org.File.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // FileReader herseferide 1 karakter okur
        // Buffered Reader ise \n gorene kadar dosyayi okuyor onu bir buffer a koyuyor ve bize gosteriyor
        // total de daha dosya erisimi oluyor
        // File Reader harf harf
        // Buffered Reader satir satir okuyor

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ogrenciler.txt", true))) {


            bufferedWriter.write("Sukriye Akgul,Sinif Ogretmenligi");

        } catch (FileNotFoundException e) {
            System.out.println("Dosya Acilirken Hata olustu");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
