package org.serialization.TransientAnahtarKelimesi;


import java.io.*;

public class ObjeyiOku implements Serializable {

    public static void main(String[] args) throws IOException {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))
        ) {

            Ogrenci ogrenci1 = (Ogrenci) in.readObject();
            Ogrenci ogrenci2 = (Ogrenci) in.readObject();

            System.out.println(ogrenci1);
            System.out.println(ogrenci2);

            System.out.println("Ogrenci sayisi : " + Ogrenci.getOgrenci_sayisi());


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");

        } catch (ClassNotFoundException e) {
            System.out.println("Sinif Bulunamadi");
        }
    }
}
