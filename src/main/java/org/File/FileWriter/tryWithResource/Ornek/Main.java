package org.File.FileWriter.tryWithResource.Ornek;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //bu olaya try with resources deniyor java 7 ile geliyor
        //boylece bir cok catch blogundan ve dosyayi kapatma isinden kurtuluyoruz

        try (
                FileWriter fileWriter = new FileWriter("diller.txt");

        ) {
            Scanner scanner = new Scanner(System.in);
            String dil;

            while (true) {
                System.out.println("Bir Dil giriniz");
                dil = scanner.nextLine();
                if (dil.equals("-1")) {
                    System.out.println("Programdan cikiliyor");
                    System.out.println("Dosyayi kontrol edin");
                    break;
                }
                fileWriter.write(dil + "\n");
            }


        } catch (IOException e) {
            System.out.println("Dosya Olusturulurken hata olustu");
        }

    }
}
