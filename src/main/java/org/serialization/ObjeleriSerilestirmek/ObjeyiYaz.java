package org.serialization.ObjeleriSerilestirmek;

import java.io.*;

public class ObjeyiYaz implements Serializable {

    public static void main(String[] args) {
        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))
        ) {

            Ogrenci ogrenci1 = new Ogrenci("Mehmet Akgul ", 1234, "Bilgisayar Ogretmenligi");
            Ogrenci ogrenci2 = new Ogrenci("Turkan Akgul ", 1235, "Bilgisayar Muhendisligi");

            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya acilirken IO Exception olustu");
        }
    }
}
