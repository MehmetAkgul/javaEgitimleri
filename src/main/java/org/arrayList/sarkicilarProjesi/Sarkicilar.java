package org.arrayList.sarkicilarProjesi;

import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkiciListesi = new ArrayList<String>();

    public void sarkicilariBastir() {
        System.out.println("Sarkici listesinde " + sarkiciListesi.size() + " kadar sarkici vardir.");
        for (int i = 0; i < sarkiciListesi.size(); i++) {
            System.out.println((i + 1) + ". Sarkici :" + sarkiciListesi.get(i));
        }
    }

    public void sarkicilariEkle(String isim) {
        sarkiciListesi.add(isim);
        System.out.println("Sarkici listesine " + isim + " eklendi");
    }

    public void sarkicilariGuncelle(String yeniIsim, int pozisyon) {
        sarkiciListesi.set(pozisyon, yeniIsim);
        System.out.println("Sarkici listesi guncellendi ");
    }


    public void sarkicilariSil(int pozisyon) {
        String isim = sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);
        System.out.println(isim + " isimli sarkici sarkici listesinden silindi ");
    }

    public void sarkicilariAra(String isim) {
        int pozisyon = sarkiciListesi.indexOf(isim);
        if (pozisyon >= 0) {
            System.out.println("Sarkici bulundu. ");
            System.out.println(isim + " isimli sarkici " + pozisyon + " pozisyonda bulundu.");
        } else {
            System.out.println(isim + " isimli sarkici bulunamadi.");
        }
    }
}
