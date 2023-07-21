package org.serialization.TransientAnahtarKelimesi;

import java.io.Serializable;

public class Ogrenci implements Serializable {


    // transient anahtar kelimesi ile belirli bir ozelligi serilestirme isleminin disinda tutariz

    private transient String isim;
    private transient int id;
    private String bolum;

    private static int ogrenci_sayisi = 0;

    public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }

    @Override
    public String toString() {

        String bilgiler = "Ogrenci ismi : " + isim +
                " Ogrenci id : " + id +
                " Ogrenci bolum : " + bolum;
        return bilgiler;
    }

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }
}
