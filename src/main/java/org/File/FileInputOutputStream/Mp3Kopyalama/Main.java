package org.File.FileInputOutputStream.Mp3Kopyalama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<>();

    public static void dosyaOku() {
        try {
            FileInputStream fis = new FileInputStream("deneme.mp3");

            int oku;
            while ((oku = fis.read()) != -1) {
                icerik.add(oku);
            }

        } catch (FileNotFoundException e) {
            System.out.println("dosya acilamadi");
        } catch (IOException e) {
            System.out.println("dosya okunurken hata olustu");
        }

    }
    public static void kopyala(String dosyaIsmi) {

        try {
            FileOutputStream out =new FileOutputStream(dosyaIsmi);
            for (int deger : icerik) {
                out.write(deger);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Dosya Acilirken hata Oldu");
        } catch (IOException e) {
            System.out.println("Dosya Yazilirken hata Oldu");
        }

    }

    public static void main(String[] args) {

        dosyaOku();
        long baslangic = System.currentTimeMillis();
        kopyala("deneme2.mp3");
        kopyala("deneme3.mp3");
        kopyala("deneme4.mp3");
        long bitis= System.currentTimeMillis();

        System.out.println("3 dosyanin kopyalanmasi "+ (bitis-baslangic)/1000 + " saniye surdu.");
    }
}
