package org.collectionFramework.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        sonaEklemeZamaniHesapla("LinkedList", linkedList);
        sonaEklemeZamaniHesapla("ArrayList", arrayList);
        basaEklemeZamaniHesapla("LinkedList", linkedList);
        basaEklemeZamaniHesapla("ArrayList", arrayList);

    }

    public static void sonaEklemeZamaniHesapla(String veri_tipi, List<Integer> list) {


        long baslangis;
        long bitis;

        baslangis = System.currentTimeMillis();
        // listin sonuna deger ekleyerek karislastirma
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        bitis = System.currentTimeMillis();

        System.out.println(veri_tipi + " sona ekleme suresi " + (bitis - baslangis) + " ms");

    }

    public static void basaEklemeZamaniHesapla(String veri_tipi, List<Integer> list) {


        long baslangis;
        long bitis;

        baslangis = System.currentTimeMillis();
        // listin sonuna deger ekleyerek karislastirma
        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
        bitis = System.currentTimeMillis();

        System.out.println(veri_tipi + " basa ekleme suresi " + (bitis - baslangis) + " ms");

    }
}
