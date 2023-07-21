package org.serialization.ArraylariveCollectionlariSerilestirmek;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz implements Serializable {

    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Mehmet Akgul ", 1234, "Bilgisayar Ogretmenligi");
        Ogrenci ogrenci2 = new Ogrenci("Turkan Akgul ", 1235, "Bilgisayar Muhendisligi");
        Ogrenci ogrenci3 = new Ogrenci("Mustafa Eymen Akgul ", 1236, "Yazilim Muhendisligi");
        Ogrenci ogrenci4 = new Ogrenci("Ayse Nilda Akgul ", 1237, "Dis Hekimligi");

        Ogrenci[] ogrenci_array = {ogrenci1, ogrenci2, ogrenci3, ogrenci4};
        ArrayList<Ogrenci> ogrenciArrayList = new ArrayList<>(Arrays.asList(ogrenci_array));


        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))
        ) {
            out.writeObject(ogrenci_array);
            out.writeObject(ogrenciArrayList);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya acilirken IO Exception olustu");
        }
    }
}
