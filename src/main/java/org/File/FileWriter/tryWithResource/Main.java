package org.File.FileWriter.tryWithResource;


import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //bu olaya try with resources deniyor java 7 ile geliyor

        try (
                FileWriter fileWriter = new FileWriter("notlar.txt");
                FileWriter fileWriter2 = new FileWriter("dosya2.txt");
        ) {

            fileWriter.write("deneme");
            fileWriter2.write("deneme2");

        } catch (IOException e) {
            System.out.println("Dosya Olusturulurken hata olustu");
        }

    }
}
