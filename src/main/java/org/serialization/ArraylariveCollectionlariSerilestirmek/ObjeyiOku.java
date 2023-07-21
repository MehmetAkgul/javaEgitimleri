package org.serialization.ArraylariveCollectionlariSerilestirmek;

import java.io.*;
import java.util.ArrayList;

public class ObjeyiOku implements Serializable {

    public static void main(String[] args) {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))
        ) {
            Ogrenci[] ogrenci_array = (Ogrenci[]) in.readObject();
            ArrayList<Ogrenci> ogrenciArrayList = (ArrayList<Ogrenci>) in.readObject();


            System.out.println("************* Array Okuyalim  ************");
            for (Ogrenci o : ogrenci_array) {
                System.out.println(o);
                System.out.println("*************************");
            }
            System.out.println("************* ArrayList Okuyalim  ************");
            for (Ogrenci o : ogrenciArrayList) {
                System.out.println(o);
                System.out.println("*************************");
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");

        } catch (ClassNotFoundException e) {
            System.out.println("Sinif Bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosya Okunurken Hata Olustu");
        }
    }
}
