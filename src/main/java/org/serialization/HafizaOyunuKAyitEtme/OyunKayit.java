package org.serialization.HafizaOyunuKAyitEtme;

import java.io.*;

public class OyunKayit {

    public static void oyunuKaydet(Kart[][] kartlar) {


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))) {
            System.out.println("Oyun Kaydediliyor");

            out.writeObject(kartlar);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Kart[][] kayittanAl() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))) {
            System.out.println("Oyun Kaydediliyor");

            return (Kart[][]) in.readObject();

        } catch (ClassNotFoundException | FileNotFoundException e) {
            System.out.println("Dosya Bulunmadi");
        } catch (IOException e) {
            System.out.println("Dosya Acilamadi");

        }

        return null;
    }

}
