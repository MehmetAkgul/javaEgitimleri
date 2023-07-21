package org.serialization.ObjeleriSerilestirmek;

import java.io.Serializable;

public class Ogrenci implements Serializable {


    private static final long serialVersionUID = 2000;

    private String isim;
    private int id;
    private String bolum;

    private int newId;

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
